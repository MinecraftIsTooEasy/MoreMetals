package com.moddedmite.mitemod.MoreMetals.mixins.item;

import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.minecraft.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.List;

@Mixin(ItemArmor.class)
public abstract class ItemArmorMixin extends Item implements IDamageableItem {

    @Inject(method = "addInformation", at = @At("TAIL"))
    private void inject(ItemStack item_stack, EntityPlayer player, List info, boolean extended_info, Slot slot, CallbackInfo ci) {
        if (extended_info) {
            if (item_stack != null && (item_stack.getMaterialForRepairs() == Materials.bronze || item_stack.getMaterialForRepairs() == Materials.steel || item_stack.getMaterialForRepairs() == Materials.celestium))
                info.add(EnumChatFormatting.LIGHT_GRAY + Translator.getFormatted("itemarmor.tooltip.slimeresistance", new Object[0]));
        }
    }
}