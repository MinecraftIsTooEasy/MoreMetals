package com.moddedmite.mitemod.MoreMetals.compat;

import moddedmite.rustedironcore.api.event.events.CraftingRecipeRegisterEvent;
import net.moddedmite.mitemod.bex.register.BEXItems;
import net.xiaoyu233.mitemod.miteite.item.MITEITEItemRegistryInit;

public final class MMRecipeCompat {

    private MMRecipeCompat() {}

    public static void registerCompatRecipes(CraftingRecipeRegisterEvent event) {
        registerBexCompat(event);
        registerMiteiteCompat(event);
    }

    private static void registerBexCompat(CraftingRecipeRegisterEvent event) {

        if (!ModChecker.HAS_BEX) return;

        if (BEXItems.enchantIngot != null) {
        }
    }

    private static void registerMiteiteCompat(CraftingRecipeRegisterEvent event) {

        if (!ModChecker.HAS_ITE) return;

        if (MITEITEItemRegistryInit.VIBRANIUM_INGOT != null) {

        }
    }
}