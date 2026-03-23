package com.moddedmite.mitemod.MoreMetals.recipe;

import net.minecraft.ItemStack;

import java.util.ArrayList;
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
        // Keep smithing table available without extra upgrade recipes.
    }
}
