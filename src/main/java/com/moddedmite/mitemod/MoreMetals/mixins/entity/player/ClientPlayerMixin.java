package com.moddedmite.mitemod.MoreMetals.mixins.entity.player;

import com.moddedmite.mitemod.MoreMetals.gui.SmithingTableGUI;
import com.moddedmite.mitemod.MoreMetals.mixin.interfaces.MMEntityPlayer;
import com.moddedmite.mitemod.MoreMetals.tileentity.SmithingTableTileEntity;
import net.minecraft.ClientPlayer;
import net.minecraft.Minecraft;
import net.xiaoyu233.fml.util.ReflectHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;

@Mixin(ClientPlayer.class)
public class ClientPlayerMixin implements MMEntityPlayer {
    @Shadow
    protected Minecraft mc;

    @Unique
    @Override
    public void moremetals$displayGUISmithing(SmithingTableTileEntity tileEntity) {
        this.mc.displayGuiScreen(new SmithingTableGUI(ReflectHelper.dyCast(this), tileEntity));
    }
}
