package com.moddedmite.mitemod.MoreMetals.mixins.network;

import com.moddedmite.mitemod.MoreMetals.mixin.interfaces.MMEntityPlayer;
import com.moddedmite.mitemod.MoreMetals.tileentity.SmithingTableTileEntity;
import net.minecraft.EntityClientPlayerMP;
import net.minecraft.Packet100OpenWindow;
import net.minecraft.TileEntity;
import net.minecraft.WorldClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Packet100OpenWindow.class)
public class Packet100OpenWindowMixin {
    @Unique
    private static final int TYPE_SMITHING_TABLE = 100;

    @Shadow
    public int inventoryType;
    @Shadow
    public int windowId;
    @Shadow
    public int x;
    @Shadow
    public int y;
    @Shadow
    public int z;

    @Inject(method = "hasCoords", at = @At("RETURN"), cancellable = true)
    public void injectInventory(CallbackInfoReturnable<Boolean> cir) {
        if (this.inventoryType == TYPE_SMITHING_TABLE) {
            cir.setReturnValue(true);
        }
    }

    @Inject(method = "handleOpenWindow", at = @At("HEAD"), cancellable = true)
    public void handleOpenWindow(EntityClientPlayerMP player, CallbackInfo ci) {
        if (this.inventoryType != TYPE_SMITHING_TABLE) {
            return;
        }

        WorldClient world = player.worldObj.getAsWorldClient();
        TileEntity tileEntity = world.getBlockTileEntity(this.x, this.y, this.z);
        if (tileEntity instanceof SmithingTableTileEntity smithingTableTileEntity) {
            MMEntityPlayer.cast(player).moremetals$displayGUISmithing(smithingTableTileEntity);
            player.openContainer.windowId = this.windowId;
            ci.cancel();
        }
    }
}
