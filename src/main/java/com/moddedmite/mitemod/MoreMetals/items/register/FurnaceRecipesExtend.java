package com.moddedmite.mitemod.MoreMetals.items.register;
import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import net.minecraft.ItemStack;
import moddedmite.rustedironcore.api.event.events.SmeltingRecipeRegisterEvent;

import static com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks.*;

public class FurnaceRecipesExtend extends MMItems {

    public static void registerFurnaceRecipes(SmeltingRecipeRegisterEvent event) {
        event.register(oreManganese, new ItemStack(manganese_ingot));
        event.register(oreTin, new ItemStack(tin_ingot));
        event.register(oreMidas_Gold, new ItemStack(midas_gold_ingot));
        event.register(oreNetherite, new ItemStack(netherite_scrap));
        event.register(orePlatinum, new ItemStack(platinum_ingot));
        event.register(oreAdamantium, new ItemStack(adamantium_ingot));
        event.register(oreAluminium, new ItemStack(aluminium_ingot));
        event.register(oreTitanium, new ItemStack(titanium_ingot));
    }
}
