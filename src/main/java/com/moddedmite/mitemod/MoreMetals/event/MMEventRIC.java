package com.moddedmite.mitemod.MoreMetals.event;

import com.moddedmite.mitemod.MoreMetals.event.listener.*;
import com.moddedmite.mitemod.MoreMetals.items.register.RecipeRegister;
import com.moddedmite.mitemod.MoreMetals.items.register.SmeltingRegistry;
import moddedmite.rustedironcore.api.event.Handlers;



public class MMEventRIC extends Handlers {
    public static void register() {
        ArmorModel.register(new ArmorModelListener());
        Enchanting.register(new EnchantingListener());
        OreGeneration.register(new OreGenerationRegistry());
        Crafting.register(RecipeRegister::registerCompatRecipes);
        Smelting.register(new SmeltingRegistry());
        PropertiesRegistry.register(new PropertyRegistry());
        WorldLoad.register(new WorldLoadListener());
        Tick.register(new TickListener());
    }
}
