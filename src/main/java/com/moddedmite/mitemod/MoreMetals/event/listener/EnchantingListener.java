package com.moddedmite.mitemod.MoreMetals.event.listener;

import com.moddedmite.mitemod.MoreMetals.material.Materials;
import moddedmite.rustedironcore.api.event.listener.IEnchantingListener;
import net.minecraft.ItemStack;

import java.util.Random;

public class EnchantingListener implements IEnchantingListener {
    @Override
    public int onMaxEnchantNumModify(Random random, ItemStack item_stack, int enchantment_levels, int original) {
        return item_stack.getItem().getHardestMetalMaterial() == Materials.midas_gold ? original + 1 : original;
    }
}
