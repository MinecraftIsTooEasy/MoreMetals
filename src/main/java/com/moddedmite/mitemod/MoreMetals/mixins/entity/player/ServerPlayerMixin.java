package com.moddedmite.mitemod.MoreMetals.mixins.entity.player;

import com.moddedmite.mitemod.MoreMetals.inventory.container.SmithingTableContainer;
import com.moddedmite.mitemod.MoreMetals.mixin.interfaces.MMEntityPlayer;
import com.moddedmite.mitemod.MoreMetals.tileentity.SmithingTableTileEntity;
import net.minecraft.ChatMessageComponent;
import net.minecraft.ChunkCoordinates;
import net.minecraft.EntityPlayer;
import net.minecraft.INetworkManager;
import net.minecraft.NetServerHandler;
import net.minecraft.Packet100OpenWindow;
import net.minecraft.ServerPlayer;
import net.minecraft.World;
import net.xiaoyu233.fml.util.ReflectHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(ServerPlayer.class)
public abstract class ServerPlayerMixin extends EntityPlayer implements MMEntityPlayer {
    @Shadow
    public NetServerHandler playerNetServerHandler;
    @Shadow
    private int currentWindowId;

    public ServerPlayerMixin(World par1World, String par2Str) {
        super(par1World, par2Str);
    }

    @Unique
    @Override
    public void moremetals$displayGUISmithing(SmithingTableTileEntity tileEntity) {
        this.incrementWindowID();
        this.playerNetServerHandler.sendPacketToPlayer((new Packet100OpenWindow(
                this.currentWindowId,
                100,
                tileEntity.getCustomNameOrUnlocalized(),
                tileEntity.getSizeInventory(),
                tileEntity.hasCustomName()
        )).setCoords(tileEntity));
        this.openContainer = new SmithingTableContainer(this, tileEntity);
        this.openContainer.windowId = this.currentWindowId;
        this.openContainer.addCraftingToCrafters(ReflectHelper.dyCast(ServerPlayer.class, this));
    }

    @Shadow
    protected abstract void incrementWindowID();

    @Shadow
    public abstract INetworkManager getNetManager();

    @Shadow
    public abstract void sendChatToPlayer(ChatMessageComponent chatMessageComponent);

    @Shadow
    public abstract boolean canCommandSenderUseCommand(int i, String string);

    @Shadow
    public abstract ChunkCoordinates getPlayerCoordinates();
}
