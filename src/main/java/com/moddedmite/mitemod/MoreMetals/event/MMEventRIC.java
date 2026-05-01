package com.moddedmite.mitemod.MoreMetals.event;

import com.moddedmite.mitemod.MoreMetals.event.listener.*;
import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import com.moddedmite.mitemod.MoreMetals.items.register.RecipeRegister;
import com.moddedmite.mitemod.MoreMetals.items.register.SmeltingRegistry;
import moddedmite.rustedironcore.api.event.Handlers;
import moddedmite.rustedironcore.api.event.handler.GravelDropHandler;


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

        GravelDrop.registerGravelLootEntry(new GravelDropHandler.GravelLootEntry(GravelDropHandler.GoldEntry.weight(), info -> MMItems.tin_nugget.itemID));
        GravelDrop.registerGravelLootEntry(new GravelDropHandler.GravelLootEntry(GravelDropHandler.ObsidianEntry.weight() , info -> MMItems.manganese_nugget.itemID));
        GravelDrop.registerGravelLootEntry(new GravelDropHandler.GravelLootEntry(GravelDropHandler.ObsidianEntry.weight() , info -> MMItems.aluminium_nugget.itemID));
        GravelDrop.registerGravelLootEntry(new GravelDropHandler.GravelLootEntry(GravelDropHandler.AdamantiumEntry.weight() , info -> MMItems.titanium_nugget.itemID));
        GravelDrop.registerGravelLootEntry(new GravelDropHandler.GravelLootEntry(GravelDropHandler.AdamantiumEntry.weight() , info -> MMItems.adamantium_nugget.itemID));
        GravelDrop.registerGravelLootEntry(new GravelDropHandler.GravelLootEntry(GravelDropHandler.MithrilEntry.weight() , info -> MMItems.platinum_nugget.itemID));
        GravelDrop.registerGravelLootEntry(new GravelDropHandler.GravelLootEntry(GravelDropHandler.AdamantiumEntry.weight() , info -> MMItems.midas_gold_nugget.itemID));

    }
}
