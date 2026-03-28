package com.moddedmite.mitemod.MoreMetals.event;

import com.moddedmite.mitemod.MoreMetals.event.listener.ArmorModelListener;
import com.moddedmite.mitemod.MoreMetals.items.register.FurnaceRecipesExtend;
import com.moddedmite.mitemod.MoreMetals.items.register.RecipeRegister;
import moddedmite.rustedironcore.api.event.Handlers;

public class MMEventRIC extends Handlers {
    public static void register() {
        ArmorModel.register(new ArmorModelListener());
        OreGeneration.register(new OreGenerationRegistry());
        Crafting.register(RecipeRegister::registerCompatRecipes);
        Smelting.register(FurnaceRecipesExtend::registerFurnaceRecipes);
    }
}
