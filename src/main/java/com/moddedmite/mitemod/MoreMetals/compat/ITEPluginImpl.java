package com.moddedmite.mitemod.MoreMetals.compat;


import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.xiaoyu233.mitemod.miteite.api.ITEPlugin;
import net.xiaoyu233.mitemod.miteite.api.ITERegistry;
import net.xiaoyu233.mitemod.miteite.item.recipe.ForgingTableLevel;

public class ITEPluginImpl implements ITEPlugin {
    @Override
    public void register(ITERegistry registry) {

        registry.registerForgingRecipe(Materials.bronze, ForgingTableLevel.IRON, 2);
        registry.registerForgingRecipe(Materials.steel, ForgingTableLevel.ADAMANTIUM, 5);
        registry.registerForgingRecipe(Materials.titanium_alloy, ForgingTableLevel.VIBRANIUM, 8);
        registry.registerForgingRecipe(Materials.rose_gold, ForgingTableLevel.IRON, 2);
        registry.registerForgingRecipe(Materials.platinum, ForgingTableLevel.MITHRIL, 5);
        registry.registerForgingRecipe(Materials.midas_gold, ForgingTableLevel.VIBRANIUM, 8);
        registry.registerForgingRecipe(Materials.adamantium_mm, ForgingTableLevel.ADAMANTIUM, 5);


        registry.registerExpForLevel(Materials.bronze, 150, 75);
        registry.registerExpForLevel(Materials.steel, 200, 110);
        registry.registerExpForLevel(Materials.titanium_alloy, 200, 130);
        registry.registerExpForLevel(Materials.rose_gold, 150, 75);
        registry.registerExpForLevel(Materials.platinum, 200, 110);
        registry.registerExpForLevel(Materials.midas_gold, 200, 130);
        registry.registerExpForLevel(Materials.adamantium_mm, 200, 130);

    }
}
