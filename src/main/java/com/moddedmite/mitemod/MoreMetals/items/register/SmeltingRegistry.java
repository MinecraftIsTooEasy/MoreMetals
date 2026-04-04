package com.moddedmite.mitemod.MoreMetals.items.register;

import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import moddedmite.rustedironcore.api.event.events.SmeltingRecipeRegisterEvent;
import net.minecraft.ItemStack;


import java.util.function.Consumer;

import static com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks.*;

public class SmeltingRegistry implements Consumer<SmeltingRecipeRegisterEvent> {
    @Override
    public void accept(SmeltingRecipeRegisterEvent event) {
        event.register(oreManganese.blockID, new ItemStack(MMItems.manganese_ingot));
        event.register(oreTin.blockID, new ItemStack(MMItems.tin_ingot));
        event.register(oreMidas_Gold.blockID, new ItemStack(MMItems.midas_gold_ingot));
        event.register(orePlatinum.blockID, new ItemStack(MMItems.platinum_ingot));
        event.register(oreAdamantium.blockID, new ItemStack(MMItems.adamantium_ingot));
        event.register(oreAluminium.blockID, new ItemStack(MMItems.aluminium_ingot));
        event.register(oreTitanium.blockID, new ItemStack(MMItems.titanium_ingot));
    }
}
