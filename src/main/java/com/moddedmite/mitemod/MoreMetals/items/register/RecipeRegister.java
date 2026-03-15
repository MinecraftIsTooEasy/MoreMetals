package com.moddedmite.mitemod.MoreMetals.items.register;

import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import net.minecraft.*;
import net.xiaoyu233.fml.reload.event.RecipeRegistryEvent;


public class RecipeRegister extends MMItems {

    public static void registerRecipes(RecipeRegistryEvent register) {
        registerIngotRecipes(register);
        registerNuggetRecipes(register);
        registerArmorRecipes(register);
        registerToolRecipes(register);
        registerWeaponRecipes(register);
        registerBlockRecipes(register);
    }

    private static void registerIngotRecipes(RecipeRegistryEvent register) {

        register.registerShapelessRecipe(new ItemStack(celestium_ingot, 2), true, ingotAdamantium,MMBlocks.blockMidas_Gold,MMBlocks.blockSteel,Block.blockAncientMetal,Block.blockMithril,Block.blockDiamond);

        // 青铜锭合成：3个铜锭 + 1个锡锭
        register.registerShapelessRecipe(new ItemStack(bronze_ingot, 3), true, tin_ingot, new ItemStack(ingotCopper, 2));
        
        // 钢锭合成：1个锰锭 + 2个铁锭
        register.registerShapelessRecipe(new ItemStack(steel_ingot, 3), true, manganese_ingot, new ItemStack(ingotIron, 2));
    }

    private static void registerNuggetRecipes(RecipeRegistryEvent register) {
        // 青铜粒合成：1个青铜锭
        register.registerShapelessRecipe(new ItemStack(bronze_nugget, 9), true, bronze_ingot);
        
        // 钢粒合成：1个钢锭
        register.registerShapelessRecipe(new ItemStack(steel_nugget, 9), true, steel_ingot);
        
        // 飓霆粒合成：1个飓霆锭
        register.registerShapelessRecipe(new ItemStack(stormyx_nugget, 9), true, stormyx_ingot);
        
        // 迈达斯金粒合成：1个迈达斯金锭
        register.registerShapelessRecipe(new ItemStack(midas_gold_nugget, 9), true, midas_gold_ingot);
        
        // 天体粒合成：1个天体锭
        register.registerShapelessRecipe(new ItemStack(celestium_nugget, 9), true, celestium_ingot);
        
        // 青铜锭合成：9个青铜粒
        register.registerShapedRecipe(new ItemStack(bronze_ingot, 1), true, "NNN", "NNN", "NNN", 
            'N', bronze_nugget);
        
        // 钢锭合成：9个钢粒
        register.registerShapedRecipe(new ItemStack(steel_ingot, 1), true, "NNN", "NNN", "NNN", 
            'N', steel_nugget);
        
        // 飓霆锭合成：9个飓霆粒
        register.registerShapedRecipe(new ItemStack(stormyx_ingot, 1), true, "NNN", "NNN", "NNN", 
            'N', stormyx_nugget);
        
        // 迈达斯金锭合成：9个迈达斯金粒
        register.registerShapedRecipe(new ItemStack(midas_gold_ingot, 1), true, "NNN", "NNN", "NNN", 
            'N', midas_gold_nugget);
        
        // 天体锭合成：9个天体粒
        register.registerShapedRecipe(new ItemStack(celestium_ingot, 1), true, "NNN", "NNN", "NNN", 
            'N', celestium_nugget);
    }

    private static void registerArmorRecipes(RecipeRegistryEvent register) {
        // 青铜防具
        register.registerShapedRecipe(new ItemStack(bronze_helmet, 1), true, "BBB", "B B", 
            'B', bronze_ingot);
        register.registerShapedRecipe(new ItemStack(bronze_cuirass, 1), true, "B B", "BBB", "BBB", 
            'B', bronze_ingot);
        register.registerShapedRecipe(new ItemStack(bronze_leggings, 1), true, "BBB", "B B", "B B", 
            'B', bronze_ingot);
        register.registerShapedRecipe(new ItemStack(bronze_boots, 1), true, "B B", "B B", 
            'B', bronze_ingot);
        
        // 钢防具
        register.registerShapedRecipe(new ItemStack(steel_helmet, 1), true, "SSS", "S S", 
            'S', steel_ingot);
        register.registerShapedRecipe(new ItemStack(steel_cuirass, 1), true, "S S", "SSS", "SSS", 
            'S', steel_ingot);
        register.registerShapedRecipe(new ItemStack(steel_leggings, 1), true, "SSS", "S S", "S S", 
            'S', steel_ingot);
        register.registerShapedRecipe(new ItemStack(steel_boots, 1), true, "S S", "S S", 
            'S', steel_ingot);
        
        // 飓霆防具
        register.registerShapedRecipe(new ItemStack(stormyx_helmet, 1), true, "YYY", "Y Y", 
            'Y', stormyx_ingot);
        register.registerShapedRecipe(new ItemStack(stormyx_cuirass, 1), true, "Y Y", "YYY", "YYY", 
            'Y', stormyx_ingot);
        register.registerShapedRecipe(new ItemStack(stormyx_leggings, 1), true, "YYY", "Y Y", "Y Y", 
            'Y', stormyx_ingot);
        register.registerShapedRecipe(new ItemStack(stormyx_boots, 1), true, "Y Y", "Y Y", 
            'Y', stormyx_ingot);
        
        // 迈达斯金防具
        register.registerShapedRecipe(new ItemStack(midas_gold_helmet, 1), true, "GGG", "G G", 
            'G', midas_gold_ingot);
        register.registerShapedRecipe(new ItemStack(midas_gold_cuirass, 1), true, "G G", "GGG", "GGG", 
            'G', midas_gold_ingot);
        register.registerShapedRecipe(new ItemStack(midas_gold_leggings, 1), true, "GGG", "G G", "G G", 
            'G', midas_gold_ingot);
        register.registerShapedRecipe(new ItemStack(midas_gold_boots, 1), true, "G G", "G G", 
            'G', midas_gold_ingot);
        
        // 天体防具
        register.registerShapedRecipe(new ItemStack(celestium_helmet, 1), true, "CCC", "C C", 
            'C', celestium_ingot);
        register.registerShapedRecipe(new ItemStack(celestium_cuirass, 1), true, "C C", "CCC", "CCC", 
            'C', celestium_ingot);
        register.registerShapedRecipe(new ItemStack(celestium_leggings, 1), true, "CCC", "C C", "C C", 
            'C', celestium_ingot);
        register.registerShapedRecipe(new ItemStack(celestium_boots, 1), true, "C C", "C C", 
            'C', celestium_ingot);
    }

    private static void registerToolRecipes(RecipeRegistryEvent register) {
        // 青铜工具
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
        
        // 钢工具
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
        
        // 飓霆工具
        register.registerShapedRecipe(new ItemStack(stormyx_sword, 1), true, "Y", "Y", "S", 
            'Y', stormyx_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(stormyx_pickaxe, 1), true, "YYY", " S ", " S ", 
            'Y', stormyx_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(stormyx_axe, 1), true, "YY", "YS", " S", 
            'Y', stormyx_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(stormyx_shovel, 1), true, "Y", "S", "S", 
            'Y', stormyx_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(stormyx_hoe, 1), true, "YY", " S", " S", 
            'Y', stormyx_ingot, 'S', Item.stick);
        
        // 迈达斯金工具
        register.registerShapedRecipe(new ItemStack(midas_gold_pickaxe, 1), true, "GGG", " S ", " S ", 
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_axe, 1), true, "GG", "GS", " S", 
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_shovel, 1), true, "G", "S", "S", 
            'G', midas_gold_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(midas_gold_hoe, 1), true, "GG", " S", " S", 
            'G', midas_gold_ingot, 'S', Item.stick);
        
        // 天体工具
        register.registerShapedRecipe(new ItemStack(celestium_sword, 1), true, "C", "C", "S", 
            'C', celestium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(celestium_pickaxe, 1), true, "CCC", " S ", " S ", 
            'C', celestium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(celestium_axe, 1), true, "CC", "CS", " S", 
            'C', celestium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(celestium_shovel, 1), true, "C", "S", "S", 
            'C', celestium_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(celestium_hoe, 1), true, "CC", " S", " S", 
            'C', celestium_ingot, 'S', Item.stick);
    }

    private static void registerWeaponRecipes(RecipeRegistryEvent register) {
        // 青铜特殊武器
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
        
        // 钢特殊武器
        register.registerShapedRecipe(new ItemStack(steel_battle_axe, 1), true, "T T", "TST", " S ", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_war_hammer, 1), true, "TTT", "TST", " S ", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_mattock, 1), true, "TTT", "TS ", " S ", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_scythe, 1), true, " TS", "T S", "  S", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_dagger, 1), true, "T", "S", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_hatchet, 1), true,  "TS", " S", 'T', steel_ingot, 'S', Item.stick);
        register.registerShapedRecipe(new ItemStack(steel_shears, 1), true, " T", "T ", 'T', steel_ingot);
        // 迈达斯金特殊武器
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
    }
    
    private static void registerBlockRecipes(RecipeRegistryEvent register) {
        // 方块合成
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockManganese,1), true, "III", "III", "III",
                'I',manganese_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockTin,1), true, "III", "III", "III",
                'I',tin_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockBronze, 1), true, "III", "III", "III", 
            'I', bronze_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockSteel, 1), true, "III", "III", "III", 
            'I', steel_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockStormyx, 1), true, "III", "III", "III", 
            'I', stormyx_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockMidas_Gold, 1), true, "III", "III", "III",
            'I', midas_gold_ingot);
        register.registerShapedRecipe(new ItemStack(MMBlocks.blockCelestium, 1), true, "III", "III", "III",
            'I', celestium_ingot);
        
        // 方块分解
        register.registerShapelessRecipe(new ItemStack(bronze_ingot, 9), true, MMBlocks.blockBronze);
        register.registerShapelessRecipe(new ItemStack(steel_ingot, 9), true, MMBlocks.blockSteel);
        register.registerShapelessRecipe(new ItemStack(stormyx_ingot, 9), true, MMBlocks.blockStormyx);
        register.registerShapelessRecipe(new ItemStack(midas_gold_ingot, 9), true, MMBlocks.blockMidas_Gold);
        register.registerShapelessRecipe(new ItemStack(celestium_ingot, 9), true, MMBlocks.blockCelestium);


        register.registerShapedRecipe(new ItemStack(gilded_midas_gold_sword, 1), true, "BBB", "BDB", "BBB",
            'B', MMBlocks.blockMidas_Gold, 'D', MMItems.midas_gold_dagger).extendsNBT();
        register.registerShapedRecipe(new ItemStack(royal_midas_gold_broadsword, 1), true, "BBB", "BDB", "BBB",
            'B', MMBlocks.blockMidas_Gold, 'D', MMItems.gilded_midas_gold_sword).extendsNBT();
        register.registerShapedRecipe(new ItemStack(royal_midas_gold_greatsword, 1), true, "BBB", "BDB", "BBB",
            'B', MMBlocks.blockMidas_Gold, 'D', MMItems.royal_midas_gold_broadsword).extendsNBT();
        register.registerShapedRecipe(new ItemStack(true_royal_midas_gold_sword, 1), true, "BBB", "BDB", "BBB",
            'B', MMBlocks.blockMidas_Gold, 'D', MMItems.royal_midas_gold_greatsword).extendsNBT();
    }
}