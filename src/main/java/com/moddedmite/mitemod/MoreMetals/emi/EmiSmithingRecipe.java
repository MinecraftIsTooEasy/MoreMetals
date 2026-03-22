package com.moddedmite.mitemod.MoreMetals.emi;

import com.moddedmite.mitemod.MoreMetals.init.EMIInit;
import dev.emi.emi.EmiPort;
import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.WidgetHolder;
import net.minecraft.ItemStack;
import net.minecraft.ResourceLocation;
import shims.java.com.unascribed.retroemi.RetroEMI;
import shims.java.net.minecraft.client.gui.tooltip.TooltipComponent;

import java.util.List;
import java.util.stream.Collectors;

public class EmiSmithingRecipe implements EmiRecipe {
    private final ResourceLocation id;
    private final List<EmiIngredient> input;
    private final EmiStack output;

    public EmiSmithingRecipe(ResourceLocation id, List<ItemStack> input, ItemStack output) {
        this.id = id;
        this.input = input.stream().map(RetroEMI::wildcardIngredient).collect(Collectors.toList());
        this.output = EmiStack.of(output);
    }

    @Override
    public EmiRecipeCategory getCategory() {
        return EMIInit.SMITHING;
    }

    @Override
    public ResourceLocation getId() {
        return this.id;
    }

    @Override
    public List<EmiIngredient> getInputs() {
        return this.input;
    }

    @Override
    public List<EmiStack> getOutputs() {
        return List.of(this.output);
    }

    @Override
    public int getDisplayWidth() {
        return 120;
    }

    @Override
    public int getDisplayHeight() {
        return 30;
    }

    @Override
    public void addWidgets(WidgetHolder widgets) {
        int x = 10;
        for (EmiIngredient ingredient : this.input) {
            widgets.addSlot(ingredient, x, 5).recipeContext(this);
            x += 20;
        }

        widgets.addFillingArrow(72, 6, 50).tooltip((mx, my) ->
                List.of(TooltipComponent.of(EmiPort.ordered(EmiPort.translatable("emi.smithing.time", 0)))));
        widgets.addSlot(this.output, 100, 5).recipeContext(this);
    }
}
