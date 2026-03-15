package com.moddedmite.mitemod.MoreMetals.mixins.item;

import com.llamalad7.mixinextras.sugar.Local;
import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.minecraft.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import java.util.ArrayList;
import java.util.List;

@Mixin(ItemStack.class)
public abstract class ItemStackMixin {

    @Shadow
    public int itemID;

    @Inject(method = "getTooltip", at = @At(value = "INVOKE", target = "Lnet/minecraft/ItemTool;getToolMaterial()Lnet/minecraft/Material;"))
    private void bronzeInfo(EntityPlayer par1EntityPlayer, boolean par2, Slot slot, CallbackInfoReturnable<List> cir, @Local ArrayList<String> var3) {
        Item var4 = Item.itemsList[this.itemID];
        if (((ItemTool) var4).getToolMaterial() == Materials.bronze || ((ItemTool) var4).getToolMaterial() == Materials.steel || ((ItemTool) var4).getToolMaterial() == Materials.celestium) {
            var3.add(EnumChatFormatting.LIGHT_GRAY + Translator.getFormatted("itemtool.tooltip.slimeresistance", new Object[0]));
        }
    }
}