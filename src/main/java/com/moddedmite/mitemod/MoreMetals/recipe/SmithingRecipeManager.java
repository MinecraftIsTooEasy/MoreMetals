package com.moddedmite.mitemod.MoreMetals.recipe;

import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import net.minecraft.ItemStack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SmithingRecipeManager {
    public static final SmithingRecipeManager instance = new SmithingRecipeManager();

    public final List<SmithingRecipe> smithingRecipes = new ArrayList<>();

    private SmithingRecipeManager() {
        this.registerDefaults();
    }

    public SmithingRecipe findRecipe(ItemStack[] inputSlots) {
        for (SmithingRecipe smithingRecipe : this.smithingRecipes) {
            if (smithingRecipe.matches(inputSlots)) {
                return smithingRecipe;
            }
        }
        return null;
    }

    public void register(SmithingRecipe recipe) {
        this.smithingRecipes.add(recipe);
    }

    public boolean isItemValidForSlot(int slotIndex, ItemStack itemStack) {
        if (slotIndex < 0 || slotIndex >= 3 || itemStack == null) {
            return false;
        }

        for (SmithingRecipe smithingRecipe : this.smithingRecipes) {
            if (smithingRecipe.matchesInput(slotIndex, itemStack)) {
                return true;
            }
        }

        return false;
    }

    private void registerDefaults() {
        this.registerUpgrade(new ItemStack(MMItems.steel_helmet), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_helmet));
        this.registerUpgrade(new ItemStack(MMItems.steel_chestplate), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_chestplate));
        this.registerUpgrade(new ItemStack(MMItems.steel_leggings), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_leggings));
        this.registerUpgrade(new ItemStack(MMItems.steel_boots), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_boots));

        this.registerUpgrade(new ItemStack(MMItems.steel_sword), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_sword));
        this.registerUpgrade(new ItemStack(MMItems.steel_pickaxe), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_pickaxe));
        this.registerUpgrade(new ItemStack(MMItems.steel_axe), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_axe));
        this.registerUpgrade(new ItemStack(MMItems.steel_shovel), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_shovel));
        this.registerUpgrade(new ItemStack(MMItems.steel_hoe), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_hoe));

        this.registerUpgrade(new ItemStack(MMItems.steel_battle_axe), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_battle_axe));
        this.registerUpgrade(new ItemStack(MMItems.steel_war_hammer), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_war_hammer));
        this.registerUpgrade(new ItemStack(MMItems.steel_mattock), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_mattock));
        this.registerUpgrade(new ItemStack(MMItems.steel_scythe), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_scythe));
        this.registerUpgrade(new ItemStack(MMItems.steel_dagger), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_dagger));
        this.registerUpgrade(new ItemStack(MMItems.steel_hatchet), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_hatchet));
        this.registerUpgrade(new ItemStack(MMItems.steel_shears), new ItemStack(MMItems.netherite_ingot), new ItemStack(MMItems.netherite_shears));
    }

    private void registerUpgrade(ItemStack base, ItemStack ingredient, ItemStack output) {
        this.register(new SmithingRecipe(
                Arrays.asList(new ItemStack(MMItems.netherite_upgrade_smithing_template), base, ingredient),
                output,
                1
        ));
    }
}
