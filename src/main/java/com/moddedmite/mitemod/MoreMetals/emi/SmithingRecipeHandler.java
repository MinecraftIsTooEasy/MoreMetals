package com.moddedmite.mitemod.MoreMetals.emi;

import com.google.common.collect.Lists;
import com.moddedmite.mitemod.MoreMetals.init.EMIInit;
import com.moddedmite.mitemod.MoreMetals.inventory.container.SmithingTableContainer;
import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.handler.StandardRecipeHandler;
import net.minecraft.Slot;

import java.util.List;

public class SmithingRecipeHandler implements StandardRecipeHandler<SmithingTableContainer> {
    @Override
    public List<Slot> getInputSources(SmithingTableContainer handler) {
        List<Slot> list = Lists.newArrayList();
        for (int i = 0; i < 3; ++i) {
            list.add(handler.getSlot(i));
        }
        for (int i = 4; i < 40; ++i) {
            list.add(handler.getSlot(i));
        }
        return list;
    }

    @Override
    public List<Slot> getCraftingSlots(SmithingTableContainer handler) {
        List<Slot> list = Lists.newArrayList();
        for (int i = 0; i < 3; ++i) {
            list.add(handler.getSlot(i));
        }
        return list;
    }

    @Override
    public boolean supportsRecipe(EmiRecipe emiRecipe) {
        return emiRecipe.getCategory() == EMIInit.SMITHING && emiRecipe.supportsRecipeTree();
    }
}
