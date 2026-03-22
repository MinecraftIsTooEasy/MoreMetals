package com.moddedmite.mitemod.MoreMetals.items.register;

import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import moddedmite.rustedironcore.api.event.events.CraftingRecipeRegisterEvent;
import net.minecraft.*;
import org.jetbrains.annotations.UnknownNullability;


public class RecipeRegister extends MMItems {

    public static void registerCompatRecipes(CraftingRecipeRegisterEvent register) {
        registerIngotRecipes(register);
        registerNuggetRecipes(register);
        registerItemRecipes(register);
        registerArmorRecipes(register);
        registerToolRecipes(register);
        registerWeaponRecipes(register);
        registerBlockRecipes(register);
    }

    private static void registerIngotRecipes(CraftingRecipeRegisterEvent register) {
        register.registerShapelessRecipe(new ItemStack(netherite_ingot, 1), true, new ItemStack(netherite_scrap, 4),new ItemStack(ingotGold,4));
        register.registerShapelessRecipe(new ItemStack(platinum_ingot, 1), true, new ItemStack(platinum_nugget, 9));
        register.registerShapelessRecipe(new ItemStack(adamantium_ingot, 1), true, new ItemStack(adamantium_nugget, 9));
        register.registerShapelessRecipe(new ItemStack(titanium_alloy_ingot, 1), true, new ItemStack(titanium_alloy_nugget, 9));
        register.registerShapelessRecipe(new ItemStack(titanium_alloy_ingot, 3), true, titanium_ingot, titanium_ingot, aluminium_ingot);

        register.registerShapelessRecipe(new ItemStack(rose_gold_ingot, 1), true, ingotGold, ingotCopper);

        register.registerShapelessRecipe(new ItemStack(bronze_ingot, 3), true, tin_ingot, new ItemStack(ingotCopper, 2));
        

        register.registerShapelessRecipe(new ItemStack(steel_ingot, 3), true, manganese_ingot, new ItemStack(ingotIron, 2));
    }

    private static void registerNuggetRecipes(@UnknownNullability CraftingRecipeRegisterEvent register) {

        register.registerShapelessRecipe(new ItemStack(netherite_nugget, 9), true, netherite_ingot);
        register.registerShapelessRecipe(new ItemStack(platinum_nugget, 9), true, platinum_ingot);
        register.registerShapelessRecipe(new ItemStack(adamantium_nugget, 9), true, adamantium_ingot);

        register.registerShapelessRecipe(new ItemStack(rose_gold_nugget, 9), true, rose_gold_ingot);
        register.registerShapelessRecipe(new ItemStack(titanium_alloy_nugget, 9), true, titanium_alloy_ingot);

        register.registerShapelessRecipe(new ItemStack(bronze_nugget, 9), true, bronze_ingot);
        

        register.registerShapelessRecipe(new ItemStack(steel_nugget, 9), true, steel_ingot);
        

        register.registerShapelessRecipe(new ItemStack(midas_gold_nugget, 9), true, midas_gold_ingot);

        register.registerShapedRecipe(new ItemStack(netherite_ingot, 1), true, "NNN", "NNN", "NNN",
            'N', netherite_nugget);
        register.registerShapedRecipe(new ItemStack(platinum_ingot, 1), true, "NNN", "NNN", "NNN",
            'N', platinum_nugget);
        register.registerShapedRecipe(new ItemStack(adamantium_ingot, 1), true, "NNN", "NNN", "NNN",
            'N', adamantium_nugget);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_ingot, 1), true, "NNN", "NNN", "NNN",
            'N', titanium_alloy_nugget);

        register.registerShapedRecipe(new ItemStack(rose_gold_ingot, 1), true, "NNN", "NNN", "NNN",
            'N', rose_gold_nugget);

        register.registerShapedRecipe(new ItemStack(bronze_ingot, 1), true, "NNN", "NNN", "NNN", 
            'N', bronze_nugget);
        

        register.registerShapedRecipe(new ItemStack(steel_ingot, 1), true, "NNN", "NNN", "NNN", 
            'N', steel_nugget);

        register.registerShapedRecipe(new ItemStack(midas_gold_ingot, 1), true, "NNN", "NNN", "NNN", 
            'N', midas_gold_nugget);
    }

    private static void registerItemRecipes(@UnknownNullability CraftingRecipeRegisterEvent register) {
        register.registerShapedRecipe(new ItemStack(netherite_upgrade_smithing_template, 2), true, "DTD", "DND", "DDD",
            'D', Item.diamond, 'T', netherite_upgrade_smithing_template, 'N', Block.netherrack);
    }

    private static void registerArmorRecipes(@UnknownNullability CraftingRecipeRegisterEvent register) {
        register.registerShapedRecipe(new ItemStack(bronze_helmet, 1), true, "BBB", "B B", 
            'B', bronze_ingot);
        register.registerShapedRecipe(new ItemStack(bronze_chestplate, 1), true, "B B", "BBB", "BBB",
            'B', bronze_ingot);
        register.registerShapedRecipe(new ItemStack(bronze_leggings, 1), true, "BBB", "B B", "B B", 
            'B', bronze_ingot);
        register.registerShapedRecipe(new ItemStack(bronze_boots, 1), true, "B B", "B B", 
            'B', bronze_ingot);

        register.registerShapedRecipe(new ItemStack(steel_helmet, 1), true, "SSS", "S S", 
            'S', steel_ingot);
        register.registerShapedRecipe(new ItemStack(steel_chestplate, 1), true, "S S", "SSS", "SSS",
            'S', steel_ingot);
        register.registerShapedRecipe(new ItemStack(steel_leggings, 1), true, "SSS", "S S", "S S", 
            'S', steel_ingot);
        register.registerShapedRecipe(new ItemStack(steel_boots, 1), true, "S S", "S S", 
            'S', steel_ingot);

        register.registerShapedRecipe(new ItemStack(midas_gold_helmet, 1), true, "GGG", "G G",
            'G', midas_gold_ingot);
        register.registerShapedRecipe(new ItemStack(midas_gold_chestplate, 1), true, "G G", "GGG", "GGG",
            'G', midas_gold_ingot);
        register.registerShapedRecipe(new ItemStack(midas_gold_leggings, 1), true, "GGG", "G G", "G G", 
            'G', midas_gold_ingot);
        register.registerShapedRecipe(new ItemStack(midas_gold_boots, 1), true, "G G", "G G", 
            'G', midas_gold_ingot);

        register.registerShapedRecipe(new ItemStack(rose_gold_helmet, 1), true, "RRR", "R R",
            'R', rose_gold_ingot);
        register.registerShapedRecipe(new ItemStack(rose_gold_chestplate, 1), true, "R R", "RRR", "RRR",
            'R', rose_gold_ingot);
        register.registerShapedRecipe(new ItemStack(rose_gold_leggings, 1), true, "RRR", "R R", "R R",
            'R', rose_gold_ingot);
        register.registerShapedRecipe(new ItemStack(rose_gold_boots, 1), true, "R R", "R R",
            'R', rose_gold_ingot);

        register.registerShapedRecipe(new ItemStack(platinum_helmet, 1), true, "PPP", "P P",
            'P', platinum_ingot);
        register.registerShapedRecipe(new ItemStack(platinum_chestplate, 1), true, "P P", "PPP", "PPP",
            'P', platinum_ingot);
        register.registerShapedRecipe(new ItemStack(platinum_leggings, 1), true, "PPP", "P P", "P P",
            'P', platinum_ingot);
        register.registerShapedRecipe(new ItemStack(platinum_boots, 1), true, "P P", "P P",
            'P', platinum_ingot);
        register.registerShapedRecipe(new ItemStack(adamantium_helmet, 1), true, "AAA", "A A",
            'A', adamantium_ingot);
        register.registerShapedRecipe(new ItemStack(adamantium_chestplate, 1), true, "A A", "AAA", "AAA",
            'A', adamantium_ingot);
        register.registerShapedRecipe(new ItemStack(adamantium_leggings, 1), true, "AAA", "A A", "A A",
            'A', adamantium_ingot);
        register.registerShapedRecipe(new ItemStack(adamantium_boots, 1), true, "A A", "A A",
            'A', adamantium_ingot);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_helmet, 1), true, "TTT", "T T",
            'T', titanium_alloy_ingot);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_chestplate, 1), true, "T T", "TTT", "TTT",
            'T', titanium_alloy_ingot);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_leggings, 1), true, "TTT", "T T", "T T",
            'T', titanium_alloy_ingot);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_boots, 1), true, "T T", "T T",
            'T', titanium_alloy_ingot);
        

    }

    private static void registerToolRecipes(@UnknownNullability CraftingRecipeRegisterEvent register) {
        register.registerShapedRecipe(new ItemStack(bronze_sword, 1), true, "B", "B", "S", 
            'B', bronze_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(bronze_pickaxe, 1), true, "BBB", " S ", " S ", 
            'B', bronze_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(bronze_axe, 1), true, "BB", "BS", " S", 
            'B', bronze_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(bronze_shovel, 1), true, "B", "S", "S", 
            'B', bronze_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(bronze_hoe, 1), true, "BB", " S", " S", 
            'B', bronze_ingot, 'S', Item.stick);

        register.registerShapedRecipe(new ItemStack(steel_sword, 1), true, "S", "S", "W", 
            'S', steel_ingot, 'W', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_pickaxe, 1), true, "SSS", " W ", " W ", 
            'S', steel_ingot, 'W', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_axe, 1), true, "SS", "SW", " W", 
            'S', steel_ingot, 'W', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_shovel, 1), true, "S", "W", "W", 
            'S', steel_ingot, 'W', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_hoe, 1), true, "SS", " W", " W", 
            'S', steel_ingot, 'W', Item.stick);

        register.registerShapedRecipe(new ItemStack(midas_gold_sword, 1), true, "G", "G", "S",
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_pickaxe, 1), true, "GGG", " S ", " S ",
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_axe, 1), true, "GG", "GS", " S", 
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_shovel, 1), true, "G", "S", "S", 
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_hoe, 1), true, "GG", " S", " S", 
            'G', midas_gold_ingot, 'S', Item.stick);

        register.registerShapedRecipe(new ItemStack(rose_gold_sword, 1), true, "R", "R", "S",
            'R', rose_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(rose_gold_pickaxe, 1), true, "RRR", " S ", " S ",
            'R', rose_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(rose_gold_axe, 1), true, "RR", "RS", " S",
            'R', rose_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(rose_gold_shovel, 1), true, "R", "S", "S",
            'R', rose_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(rose_gold_hoe, 1), true, "RR", " S", " S",
            'R', rose_gold_ingot, 'S', Item.stick);

        register.registerShapedRecipe(new ItemStack(platinum_sword, 1), true, "P", "P", "S",
            'P', platinum_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(platinum_pickaxe, 1), true, "PPP", " S ", " S ",
            'P', platinum_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(platinum_axe, 1), true, "PP", "PS", " S",
            'P', platinum_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(platinum_shovel, 1), true, "P", "S", "S",
            'P', platinum_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(platinum_hoe, 1), true, "PP", " S", " S",
            'P', platinum_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(adamantium_sword, 1), true, "A", "A", "S",
            'A', adamantium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(adamantium_pickaxe, 1), true, "AAA", " S ", " S ",
            'A', adamantium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(adamantium_axe, 1), true, "AA", "AS", " S",
            'A', adamantium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(adamantium_shovel, 1), true, "A", "S", "S",
            'A', adamantium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(adamantium_hoe, 1), true, "AA", " S", " S",
            'A', adamantium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_sword, 1), true, "T", "T", "S",
            'T', titanium_alloy_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_pickaxe, 1), true, "TTT", " S ", " S ",
            'T', titanium_alloy_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_axe, 1), true, "TT", "TS", " S",
            'T', titanium_alloy_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_shovel, 1), true, "T", "S", "S",
            'T', titanium_alloy_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_hoe, 1), true, "TT", " S", " S",
            'T', titanium_alloy_ingot, 'S', Item.stick);
        

    }

    private static void registerWeaponRecipes(@UnknownNullability CraftingRecipeRegisterEvent register) {
        register.registerShapedRecipe(new ItemStack(bronze_battle_axe, 1), true, "B B", "BSB", " S ",
            'B', bronze_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(bronze_war_hammer, 1), true, "BBB", "BSB", " S ", 
            'B', bronze_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(bronze_mattock, 1), true, "BBB", "BS ", " S ",
            'B', bronze_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(bronze_scythe, 1), true, " BS", "B S", "  S",
            'B', bronze_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(bronze_dagger, 1), true, "B", "S", 
            'B', bronze_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(bronze_hatchet, 1), true,  "BS", " S",
            'B', bronze_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(bronze_shears, 1), true, "B ", " B", 
            'B', bronze_ingot);

        register.registerShapedRecipe(new ItemStack(steel_battle_axe, 1), true, "T T", "TST", " S ", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_war_hammer, 1), true, "TTT", "TST", " S ", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_mattock, 1), true, "TTT", "TS ", " S ", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_scythe, 1), true, " TS", "T S", "  S", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_dagger, 1), true, "T", "S", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_hatchet, 1), true,  "TS", " S", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_shears, 1), true, " T", "T ", 'T', steel_ingot);

        register.registerShapedRecipe(new ItemStack(midas_gold_battle_axe, 1), true, "G G", "GSG", " S ",
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_war_hammer, 1), true, "GGG", "GSG", " S ", 
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_mattock, 1), true, "GGG", "GS ", " S ",
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_scythe, 1), true, " GS", "G S", "  S",
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_dagger, 1), true, "G", "S", 
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_hatchet, 1), true,  "GS", " S",
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_shears, 1), true, "G ", " G", 
            'G', midas_gold_ingot);

        register.registerShapedRecipe(new ItemStack(rose_gold_battle_axe, 1), true, "R R", "RSR", " S ",
            'R', rose_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(rose_gold_war_hammer, 1), true, "RRR", "RSR", " S ",
            'R', rose_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(rose_gold_mattock, 1), true, "RRR", "RS ", " S ",
            'R', rose_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(rose_gold_scythe, 1), true, " RS", "R S", "  S",
            'R', rose_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(rose_gold_dagger, 1), true, "R", "S",
            'R', rose_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(rose_gold_hatchet, 1), true,  "RS", " S",
            'R', rose_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(rose_gold_shears, 1), true, "R ", " R",
            'R', rose_gold_ingot);

        register.registerShapedRecipe(new ItemStack(platinum_battle_axe, 1), true, "P P", "PSP", " S ",
            'P', platinum_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(platinum_war_hammer, 1), true, "PPP", "PSP", " S ",
            'P', platinum_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(platinum_mattock, 1), true, "PPP", "PS ", " S ",
            'P', platinum_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(platinum_scythe, 1), true, " PS", "P S", "  S",
            'P', platinum_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(platinum_dagger, 1), true, "P", "S",
            'P', platinum_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(platinum_hatchet, 1), true, "PS", " S",
            'P', platinum_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(platinum_shears, 1), true, "P ", " P",
            'P', platinum_ingot);
        register.registerShapedRecipe(new ItemStack(adamantium_battle_axe, 1), true, "A A", "ASA", " S ",
            'A', adamantium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(adamantium_war_hammer, 1), true, "AAA", "ASA", " S ",
            'A', adamantium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(adamantium_mattock, 1), true, "AAA", "AS ", " S ",
            'A', adamantium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(adamantium_scythe, 1), true, " AS", "A S", "  S",
            'A', adamantium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(adamantium_dagger, 1), true, "A", "S",
            'A', adamantium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(adamantium_hatchet, 1), true, "AS", " S",
            'A', adamantium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(adamantium_shears, 1), true, "A ", " A",
            'A', adamantium_ingot);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_battle_axe, 1), true, "T T", "TST", " S ",
            'T', titanium_alloy_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_war_hammer, 1), true, "TTT", "TST", " S ",
            'T', titanium_alloy_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_mattock, 1), true, "TTT", "TS ", " S ",
            'T', titanium_alloy_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_scythe, 1), true, " TS", "T S", "  S",
            'T', titanium_alloy_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_dagger, 1), true, "T", "S",
            'T', titanium_alloy_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_hatchet, 1), true, "TS", " S",
            'T', titanium_alloy_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(titanium_alloy_shears, 1), true, "T ", " T",
            'T', titanium_alloy_ingot);
    }
    
    private static void registerBlockRecipes(@UnknownNullability CraftingRecipeRegisterEvent register) {
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockBronze, 1), true, "III", "III", "III", 
            'I', bronze_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockSteel, 1), true, "III", "III", "III", 
            'I', steel_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockMidas_Gold, 1), true, "III", "III", "III",
            'I', midas_gold_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockRose_Gold, 1), true, "III", "III", "III",
            'I', rose_gold_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockNetherite, 1), true, "III", "III", "III",
            'I', netherite_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockPlatinum, 1), true, "III", "III", "III",
            'I', platinum_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockAdamantium, 1), true, "III", "III", "III",
            'I', adamantium_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockAluminium, 1), true, "III", "III", "III",
            'I', aluminium_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockTitanium, 1), true, "III", "III", "III",
            'I', titanium_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockTitaniumAlloy, 1), true, "III", "III", "III",
            'I', titanium_alloy_ingot);

        register.registerShapelessRecipe(new ItemStack(netherite_ingot, 9), true, MMBlocks.blockNetherite);
        register.registerShapelessRecipe(new ItemStack(platinum_ingot, 9), true, MMBlocks.blockPlatinum);
        register.registerShapelessRecipe(new ItemStack(adamantium_ingot, 9), true, MMBlocks.blockAdamantium);
        register.registerShapelessRecipe(new ItemStack(aluminium_ingot, 9), true, MMBlocks.blockAluminium);
        register.registerShapelessRecipe(new ItemStack(titanium_ingot, 9), true, MMBlocks.blockTitanium);
        register.registerShapelessRecipe(new ItemStack(titanium_alloy_ingot, 9), true, MMBlocks.blockTitaniumAlloy);
        register.registerShapelessRecipe(new ItemStack(bronze_ingot, 9), true, MMBlocks.blockBronze);
        register.registerShapelessRecipe(new ItemStack(steel_ingot, 9), true, MMBlocks.blockSteel);
        register.registerShapelessRecipe(new ItemStack(midas_gold_ingot, 9), true, MMBlocks.blockMidas_Gold);
        register.registerShapelessRecipe(new ItemStack(rose_gold_ingot, 9), true, MMBlocks.blockRose_Gold);
    }
}
