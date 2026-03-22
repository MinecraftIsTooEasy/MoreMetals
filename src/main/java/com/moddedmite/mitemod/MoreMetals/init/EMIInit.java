package com.moddedmite.mitemod.MoreMetals.init;

import com.moddedmite.mitemod.MoreMetals.MoreMetalsInit;
import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import com.moddedmite.mitemod.MoreMetals.emi.EmiSmithingRecipe;
import com.moddedmite.mitemod.MoreMetals.emi.SmithingRecipeHandler;
import com.moddedmite.mitemod.MoreMetals.inventory.container.SmithingTableContainer;
import com.moddedmite.mitemod.MoreMetals.recipe.SmithingRecipe;
import com.moddedmite.mitemod.MoreMetals.recipe.SmithingRecipeManager;
import dev.emi.emi.EmiRenderHelper;
import dev.emi.emi.api.EmiEntrypoint;
import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.recipe.EmiRecipeSorting;
import dev.emi.emi.api.render.EmiRenderable;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.runtime.EmiDrawContext;
import dev.emi.emi.runtime.EmiReloadLog;
import net.minecraft.IRecipe;
import net.minecraft.ResourceLocation;

import java.util.function.Supplier;

@EmiEntrypoint
public class EMIInit implements EmiPlugin {
    public static final EmiRecipeCategory SMITHING = new EmiRecipeCategory(
            new ResourceLocation(MoreMetalsInit.ResourceDomain, "smithing"),
            EmiStack.of(MMBlocks.smithingTable),
            simplifiedRenderer(240, 240),
            EmiRecipeSorting.compareOutputThenInput()
    );

    @Override
    public void register(EmiRegistry registry) {
        registry.addCategory(SMITHING);
        registry.addWorkstation(SMITHING, EmiStack.of(MMBlocks.smithingTable));
        registry.addRecipeHandler(SmithingTableContainer.class, new SmithingRecipeHandler());

        for (SmithingRecipe smithingRecipe : SmithingRecipeManager.instance.smithingRecipes) {
            addRecipeSafe(registry, () -> new EmiSmithingRecipe(
                    new ResourceLocation(MoreMetalsInit.ResourceDomain, "smithing/" + smithingRecipe.getRecipeOutput().itemID),
                    smithingRecipe.getRecipeInput(),
                    smithingRecipe.getRecipeOutput()
            ));
        }
    }

    private static void addRecipeSafe(EmiRegistry registry, Supplier<EmiRecipe> supplier) {
        try {
            registry.addRecipe(supplier.get());
        } catch (Throwable e) {
            EmiReloadLog.warn("Exception when parsing EMI recipe (no ID available)");
            EmiReloadLog.error(e);
        }
    }

    private static void addRecipeSafe(EmiRegistry registry, Supplier<EmiRecipe> supplier, IRecipe recipe) {
        try {
            registry.addRecipe(supplier.get());
        } catch (Throwable e) {
            EmiReloadLog.warn("Exception when parsing vanilla recipe " + recipe);
            EmiReloadLog.error(e);
        }
    }

    private static EmiRenderable simplifiedRenderer(int u, int v) {
        return (raw, x, y, delta) -> {
            EmiDrawContext context = EmiDrawContext.wrap(raw);
            context.drawTexture(EmiRenderHelper.WIDGETS, x, y, u, v, 16, 16);
        };
    }
}
