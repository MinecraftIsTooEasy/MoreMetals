package com.moddedmite.mitemod.MoreMetals.items.register;
import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import net.minecraft.FurnaceRecipes;
import net.minecraft.ItemStack;

import static com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks.*;

public class FurnaceRecipesExtend extends MMItems {

    public static void registerFurnaceRecipes() {
        FurnaceRecipes.smelting().addSmelting(oreStormyx.blockID, new ItemStack(stormyx_ingot));
        FurnaceRecipes.smelting().addSmelting(oreManganese.blockID, new ItemStack(manganese_ingot));
        FurnaceRecipes.smelting().addSmelting(oreTin.blockID, new ItemStack(tin_ingot));
        FurnaceRecipes.smelting().addSmelting(oreMidas_Gold.blockID, new ItemStack(midas_gold_ingot));
    }
}