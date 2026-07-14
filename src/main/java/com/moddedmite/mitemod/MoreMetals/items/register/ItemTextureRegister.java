package com.moddedmite.mitemod.MoreMetals.items.register;

import com.moddedmite.mitemod.MoreMetals.MoreMetalsInit;
import com.moddedmite.mitemod.MoreMetals.creativetab.MMCreativeTab;
import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import net.minecraft.Item;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;

import static com.moddedmite.mitemod.MoreMetals.MoreMetalsInit.NameSpace;

public class ItemTextureRegister extends MMItems {


    public static void registerItems(ItemRegistryEvent event) {
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/midas_gold_ingot", "midas_gold_ingot", midas_gold_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/platinum_ingot", "platinum_ingot", platinum_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/adamantium_ingot", "adamantium_ingot", adamantium_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/rose_gold_ingot", "rose_gold_ingot", rose_gold_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/aluminium_ingot", "aluminium_ingot", aluminium_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/titanium_ingot", "titanium_ingot", titanium_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/titanium_alloy_ingot", "titanium_alloy_ingot", titanium_alloy_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/manganese_ingot", "manganese_ingot", manganese_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/tin_ingot", "tin_ingot", tin_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/steel_ingot", "steel_ingot", steel_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/bronze_ingot", "bronze_ingot", bronze_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/midas_gold_nugget", "midas_gold_nugget", midas_gold_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/platinum_nugget", "platinum_nugget", platinum_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/adamantium_nugget", "adamantium_nugget", adamantium_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/rose_gold_nugget", "rose_gold_nugget", rose_gold_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/titanium_alloy_nugget", "titanium_alloy_nugget", titanium_alloy_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/steel_nugget", "steel_nugget", steel_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/bronze_nugget", "bronze_nugget", bronze_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/tin_nugget", "tin_nugget", tin_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/titanium_nugget", "titanium_nugget", titanium_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/manganese_nugget", "manganese_nugget", manganese_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/aluminium_nugget", "aluminium_nugget", aluminium_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_helmet", "midas_gold_helmet", midas_gold_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/platinum_helmet", "platinum_helmet", platinum_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/adamantium_helmet", "adamantium_helmet", adamantium_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/rose_gold_helmet", "rose_gold_helmet", rose_gold_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/titanium_alloy_helmet", "titanium_alloy_helmet", titanium_alloy_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_helmet", "steel_helmet", steel_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_helmet", "bronze_helmet", bronze_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_chestplate", "midas_gold_chestplate", midas_gold_chestplate, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/platinum_chestplate", "platinum_chestplate", platinum_chestplate, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/adamantium_chestplate", "adamantium_chestplate", adamantium_chestplate, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/rose_gold_chestplate", "rose_gold_chestplate", rose_gold_chestplate, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/titanium_alloy_chestplate", "titanium_alloy_chestplate", titanium_alloy_chestplate, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_chestplate", "steel_chestplate", steel_chestplate, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_chestplate", "bronze_chestplate", bronze_chestplate, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_leggings", "midas_gold_leggings", midas_gold_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/platinum_leggings", "platinum_leggings", platinum_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/adamantium_leggings", "adamantium_leggings", adamantium_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/rose_gold_leggings", "rose_gold_leggings", rose_gold_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/titanium_alloy_leggings", "titanium_alloy_leggings", titanium_alloy_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_leggings", "steel_leggings", steel_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_leggings", "bronze_leggings", bronze_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_boots", "midas_gold_boots", midas_gold_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/platinum_boots", "platinum_boots", platinum_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/adamantium_boots", "adamantium_boots", adamantium_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/rose_gold_boots", "rose_gold_boots", rose_gold_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/titanium_alloy_boots", "titanium_alloy_boots", titanium_alloy_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_boots", "steel_boots", steel_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_boots", "bronze_boots", bronze_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_sword", "midas_gold_sword", midas_gold_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_sword", "platinum_sword", platinum_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_sword", "adamantium_sword", adamantium_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_sword", "rose_gold_sword", rose_gold_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_sword", "titanium_alloy_sword", titanium_alloy_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_sword", "steel_sword", steel_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_sword", "bronze_sword", bronze_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_pickaxe", "midas_gold_pickaxe", midas_gold_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_pickaxe", "platinum_pickaxe", platinum_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_pickaxe", "adamantium_pickaxe", adamantium_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_pickaxe", "rose_gold_pickaxe", rose_gold_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_pickaxe", "titanium_alloy_pickaxe", titanium_alloy_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_pickaxe", "steel_pickaxe", steel_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_pickaxe", "bronze_pickaxe", bronze_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_shovel", "midas_gold_shovel", midas_gold_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_shovel", "platinum_shovel", platinum_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_shovel", "adamantium_shovel", adamantium_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_shovel", "rose_gold_shovel", rose_gold_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_shovel", "titanium_alloy_shovel", titanium_alloy_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_shovel", "steel_shovel", steel_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_shovel", "bronze_shovel", bronze_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_axe", "midas_gold_axe", midas_gold_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_axe", "platinum_axe", platinum_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_axe", "adamantium_axe", adamantium_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_axe", "rose_gold_axe", rose_gold_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_axe", "titanium_alloy_axe", titanium_alloy_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_axe", "steel_axe", steel_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_axe", "bronze_axe", bronze_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_hoe", "midas_gold_hoe", midas_gold_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_hoe", "platinum_hoe", platinum_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_hoe", "adamantium_hoe", adamantium_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_hoe", "rose_gold_hoe", rose_gold_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_hoe", "titanium_alloy_hoe", titanium_alloy_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_hoe", "steel_hoe", steel_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_hoe", "bronze_hoe", bronze_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_battle_axe", "midas_gold_battle_axe", midas_gold_battle_axe, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_battle_axe", "platinum_battle_axe", platinum_battle_axe, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_battle_axe", "adamantium_battle_axe", adamantium_battle_axe, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_battle_axe", "rose_gold_battle_axe", rose_gold_battle_axe, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_battle_axe", "titanium_alloy_battle_axe", titanium_alloy_battle_axe, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_battle_axe", "steel_battle_axe", steel_battle_axe, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_battle_axe", "bronze_battle_axe", bronze_battle_axe, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_war_hammer", "midas_gold_war_hammer", midas_gold_war_hammer, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_war_hammer", "platinum_war_hammer", platinum_war_hammer, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_war_hammer", "adamantium_war_hammer", adamantium_war_hammer, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_war_hammer", "rose_gold_war_hammer", rose_gold_war_hammer, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_war_hammer", "titanium_alloy_war_hammer", titanium_alloy_war_hammer, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_war_hammer", "steel_war_hammer", steel_war_hammer, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_war_hammer", "bronze_war_hammer", bronze_war_hammer, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_mattock", "midas_gold_mattock", midas_gold_mattock, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_mattock", "platinum_mattock", platinum_mattock, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_mattock", "adamantium_mattock", adamantium_mattock, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_mattock", "rose_gold_mattock", rose_gold_mattock, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_mattock", "titanium_alloy_mattock", titanium_alloy_mattock, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_mattock", "steel_mattock", steel_mattock, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_mattock", "bronze_mattock", bronze_mattock, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_scythe", "midas_gold_scythe", midas_gold_scythe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_scythe", "platinum_scythe", platinum_scythe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_scythe", "adamantium_scythe", adamantium_scythe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_scythe", "rose_gold_scythe", rose_gold_scythe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_scythe", "titanium_alloy_scythe", titanium_alloy_scythe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_scythe", "steel_scythe", steel_scythe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_scythe", "bronze_scythe", bronze_scythe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_dagger", "midas_gold_dagger", midas_gold_dagger, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_dagger", "platinum_dagger", platinum_dagger, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_dagger", "adamantium_dagger", adamantium_dagger, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_dagger", "rose_gold_dagger", rose_gold_dagger, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_dagger", "titanium_alloy_dagger", titanium_alloy_dagger, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_dagger", "steel_dagger", steel_dagger, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_dagger", "bronze_dagger", bronze_dagger, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_hatchet", "midas_gold_hatchet", midas_gold_hatchet, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_hatchet", "platinum_hatchet", platinum_hatchet, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_hatchet", "adamantium_hatchet", adamantium_hatchet, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_hatchet", "rose_gold_hatchet", rose_gold_hatchet, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_hatchet", "titanium_alloy_hatchet", titanium_alloy_hatchet, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_hatchet", "steel_hatchet", steel_hatchet, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_hatchet", "bronze_hatchet", bronze_hatchet, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_shears", "midas_gold_shears", midas_gold_shears, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/platinum_shears", "platinum_shears", platinum_shears, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/adamantium_shears", "adamantium_shears", adamantium_shears, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/rose_gold_shears", "rose_gold_shears", rose_gold_shears, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/titanium_alloy_shears", "titanium_alloy_shears", titanium_alloy_shears, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_shears", "steel_shears", steel_shears, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_shears", "bronze_shears", bronze_shears, MMCreativeTab.TOOLS_TAB);

        // ==================== 锁链装备 (Chain Armor) ====================
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_helmet_chain", "bronze_helmet_chain", bronze_helmet_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_chestplate_chain", "bronze_chestplate_chain", bronze_chestplate_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_leggings_chain", "bronze_leggings_chain", bronze_leggings_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_boots_chain", "bronze_boots_chain", bronze_boots_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_helmet_chain", "steel_helmet_chain", steel_helmet_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_chestplate_chain", "steel_chestplate_chain", steel_chestplate_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_leggings_chain", "steel_leggings_chain", steel_leggings_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_boots_chain", "steel_boots_chain", steel_boots_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_helmet_chain", "midas_gold_helmet_chain", midas_gold_helmet_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_chestplate_chain", "midas_gold_chestplate_chain", midas_gold_chestplate_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_leggings_chain", "midas_gold_leggings_chain", midas_gold_leggings_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_boots_chain", "midas_gold_boots_chain", midas_gold_boots_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/rose_gold_helmet_chain", "rose_gold_helmet_chain", rose_gold_helmet_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/rose_gold_chestplate_chain", "rose_gold_chestplate_chain", rose_gold_chestplate_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/rose_gold_leggings_chain", "rose_gold_leggings_chain", rose_gold_leggings_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/rose_gold_boots_chain", "rose_gold_boots_chain", rose_gold_boots_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/platinum_helmet_chain", "platinum_helmet_chain", platinum_helmet_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/platinum_chestplate_chain", "platinum_chestplate_chain", platinum_chestplate_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/platinum_leggings_chain", "platinum_leggings_chain", platinum_leggings_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/platinum_boots_chain", "platinum_boots_chain", platinum_boots_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/adamantium_helmet_chain", "adamantium_helmet_chain", adamantium_helmet_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/adamantium_chestplate_chain", "adamantium_chestplate_chain", adamantium_chestplate_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/adamantium_leggings_chain", "adamantium_leggings_chain", adamantium_leggings_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/adamantium_boots_chain", "adamantium_boots_chain", adamantium_boots_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/titanium_alloy_helmet_chain", "titanium_alloy_helmet_chain", titanium_alloy_helmet_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/titanium_alloy_chestplate_chain", "titanium_alloy_chestplate_chain", titanium_alloy_chestplate_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/titanium_alloy_leggings_chain", "titanium_alloy_leggings_chain", titanium_alloy_leggings_chain, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/titanium_alloy_boots_chain", "titanium_alloy_boots_chain", titanium_alloy_boots_chain, MMCreativeTab.COMBAT_TAB);

        // ==================== 箭 (Arrows) ====================
        event.register(NameSpace, MoreMetalsInit.resourceId + "arrows/bronze_arrow", "bronze_arrow", bronze_arrow, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "arrows/steel_arrow", "steel_arrow", steel_arrow, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "arrows/midas_gold_arrow", "midas_gold_arrow", midas_gold_arrow, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "arrows/rose_gold_arrow", "rose_gold_arrow", rose_gold_arrow, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "arrows/platinum_arrow", "platinum_arrow", platinum_arrow, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "arrows/adamantium_arrow", "adamantium_arrow", adamantium_arrow, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "arrows/titanium_alloy_arrow", "titanium_alloy_arrow", titanium_alloy_arrow, MMCreativeTab.COMBAT_TAB);

        // ==================== 锁链 (Chains) ====================
        event.register(NameSpace, MoreMetalsInit.resourceId + "chains/bronze", "bronze_chain", bronze_chain, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "chains/steel", "steel_chain", steel_chain, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "chains/midas_gold", "midas_gold_chain", midas_gold_chain, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "chains/rose_gold", "rose_gold_chain", rose_gold_chain, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "chains/platinum", "platinum_chain", platinum_chain, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "chains/adamantium", "adamantium_chain", adamantium_chain, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "chains/titanium_alloy", "titanium_alloy_chain", titanium_alloy_chain, MMCreativeTab.MISC_TAB);

        // ==================== 硬币 (Coins) ====================
        event.register(NameSpace, MoreMetalsInit.resourceId + "coins/bronze", "bronze_coin", bronze_coin, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "coins/steel", "steel_coin", steel_coin, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "coins/midas_gold", "midas_gold_coin", midas_gold_coin, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "coins/rose_gold", "rose_gold_coin", rose_gold_coin, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "coins/platinum", "platinum_coin", platinum_coin, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "coins/adamantium", "adamantium_coin", adamantium_coin, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "coins/titanium_alloy", "titanium_alloy_coin", titanium_alloy_coin, MMCreativeTab.MISC_TAB);

        // ==================== 门物品 (Door Items) ====================
        event.register(NameSpace, MoreMetalsInit.resourceId + "doors/bronze", "door_bronze", door_bronze, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "doors/steel", "door_steel", door_steel, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "doors/midas_gold", "door_midas_gold", door_midas_gold, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "doors/rose_gold", "door_rose_gold", door_rose_gold, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "doors/platinum", "door_platinum", door_platinum, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "doors/adamantium", "door_adamantium", door_adamantium, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "doors/titanium_alloy", "door_titanium_alloy", door_titanium_alloy, MMCreativeTab.MISC_TAB);

        // ==================== 桶 (Buckets) ====================
        String[][] bucketNames = {
            {"bronze", "bronze"}, {"steel", "steel"}, {"midas_gold", "midas_gold"},
            {"rose_gold", "rose_gold"}, {"platinum", "platinum"}, {"adamantium", "adamantium"}, {"titanium_alloy", "titanium_alloy"}
        };
        String[] bucketTypes = {"empty", "water", "lava", "milk", "stone"};
        for (String[] metal : bucketNames) {
            String matName = metal[0];
            String prefix = metal[1];
            for (String type : bucketTypes) {
                String itemName = prefix + "_bucket" + (type.equals("empty") ? "" : "_" + type);
                event.register(NameSpace, MoreMetalsInit.resourceId + "buckets/" + matName + "/" + type, itemName, getBucketItem(itemName), MMCreativeTab.MISC_TAB);
            }
        }
    }

    private static Item getBucketItem(String name) {
        switch (name) {
            case "bronze_bucket": return bronze_bucket;
            case "bronze_bucket_water": return bronze_bucket_water;
            case "bronze_bucket_lava": return bronze_bucket_lava;
            case "bronze_bucket_milk": return bronze_bucket_milk;
            case "bronze_bucket_stone": return bronze_bucket_stone;
            case "steel_bucket": return steel_bucket;
            case "steel_bucket_water": return steel_bucket_water;
            case "steel_bucket_lava": return steel_bucket_lava;
            case "steel_bucket_milk": return steel_bucket_milk;
            case "steel_bucket_stone": return steel_bucket_stone;
            case "midas_gold_bucket": return midas_gold_bucket;
            case "midas_gold_bucket_water": return midas_gold_bucket_water;
            case "midas_gold_bucket_lava": return midas_gold_bucket_lava;
            case "midas_gold_bucket_milk": return midas_gold_bucket_milk;
            case "midas_gold_bucket_stone": return midas_gold_bucket_stone;
            case "rose_gold_bucket": return rose_gold_bucket;
            case "rose_gold_bucket_water": return rose_gold_bucket_water;
            case "rose_gold_bucket_lava": return rose_gold_bucket_lava;
            case "rose_gold_bucket_milk": return rose_gold_bucket_milk;
            case "rose_gold_bucket_stone": return rose_gold_bucket_stone;
            case "platinum_bucket": return platinum_bucket;
            case "platinum_bucket_water": return platinum_bucket_water;
            case "platinum_bucket_lava": return platinum_bucket_lava;
            case "platinum_bucket_milk": return platinum_bucket_milk;
            case "platinum_bucket_stone": return platinum_bucket_stone;
            case "adamantium_bucket": return adamantium_bucket;
            case "adamantium_bucket_water": return adamantium_bucket_water;
            case "adamantium_bucket_lava": return adamantium_bucket_lava;
            case "adamantium_bucket_milk": return adamantium_bucket_milk;
            case "adamantium_bucket_stone": return adamantium_bucket_stone;
            case "titanium_alloy_bucket": return titanium_alloy_bucket;
            case "titanium_alloy_bucket_water": return titanium_alloy_bucket_water;
            case "titanium_alloy_bucket_lava": return titanium_alloy_bucket_lava;
            case "titanium_alloy_bucket_milk": return titanium_alloy_bucket_milk;
            case "titanium_alloy_bucket_stone": return titanium_alloy_bucket_stone;
            default: return null;
        }
    }
}
