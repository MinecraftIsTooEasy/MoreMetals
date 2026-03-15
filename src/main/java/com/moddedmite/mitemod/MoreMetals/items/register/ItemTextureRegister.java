package com.moddedmite.mitemod.MoreMetals.items.register;

import com.moddedmite.mitemod.MoreMetals.MoreMetalsInit;
import com.moddedmite.mitemod.MoreMetals.creativetab.MMCreativeTab;
import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;

import static com.moddedmite.mitemod.MoreMetals.MoreMetalsInit.NameSpace;

public class ItemTextureRegister extends MMItems {


    public static void registerItems(ItemRegistryEvent event) {
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/celestium_ingot", "celestium_ingot", celestium_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/stormyx_ingot", "stormyx_ingot", stormyx_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/midas_gold_ingot", "midas_gold_ingot", midas_gold_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/manganese_ingot", "manganese_ingot", manganese_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/tin_ingot", "tin_ingot", tin_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/steel_ingot", "steel_ingot", steel_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "ingot/bronze_ingot", "bronze_ingot", bronze_ingot, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/celestium_nugget", "celestium_nugget", celestium_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/stormyx_nugget", "stormyx_nugget", stormyx_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/midas_gold_nugget", "midas_gold_nugget", midas_gold_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/steel_nugget", "steel_nugget", steel_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "nugget/bronze_nugget", "bronze_nugget", bronze_nugget, MMCreativeTab.MISC_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/celestium_helmet", "celestium_helmet", celestium_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/stormyx_helmet", "stormyx_helmet", stormyx_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_helmet", "midas_gold_helmet", midas_gold_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_helmet", "steel_helmet", steel_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_helmet", "bronze_helmet", bronze_helmet, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/celestium_cuirass", "celestium_cuirass", celestium_cuirass, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/stormyx_cuirass", "stormyx_cuirass", stormyx_cuirass, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_cuirass", "midas_gold_cuirass", midas_gold_cuirass, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_cuirass", "steel_cuirass", steel_cuirass, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_cuirass", "bronze_cuirass", bronze_cuirass, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/celestium_leggings", "celestium_leggings", celestium_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/stormyx_leggings", "stormyx_leggings", stormyx_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_leggings", "midas_gold_leggings", midas_gold_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_leggings", "steel_leggings", steel_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_leggings", "bronze_leggings", bronze_leggings, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/celestium_boots", "celestium_boots", celestium_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/stormyx_boots", "stormyx_boots", stormyx_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/midas_gold_boots", "midas_gold_boots", midas_gold_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/steel_boots", "steel_boots", steel_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "armor/bronze_boots", "bronze_boots", bronze_boots, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/celestium_sword", "celestium_sword", celestium_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/stormyx_sword", "stormyx_sword", stormyx_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_sword", "steel_sword", steel_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_sword", "bronze_sword", bronze_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/celestium_pickaxe", "celestium_pickaxe", celestium_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/stormyx_pickaxe", "stormyx_pickaxe", stormyx_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_pickaxe", "midas_gold_pickaxe", midas_gold_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_pickaxe", "steel_pickaxe", steel_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_pickaxe", "bronze_pickaxe", bronze_pickaxe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/celestium_shovel", "celestium_shovel", celestium_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/stormyx_shovel", "stormyx_shovel", stormyx_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_shovel", "midas_gold_shovel", midas_gold_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_shovel", "steel_shovel", steel_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_shovel", "bronze_shovel", bronze_shovel, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/celestium_axe", "celestium_axe", celestium_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/stormyx_axe", "stormyx_axe", stormyx_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_axe", "midas_gold_axe", midas_gold_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_axe", "steel_axe", steel_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_axe", "bronze_axe", bronze_axe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/celestium_hoe", "celestium_hoe", celestium_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/stormyx_hoe", "stormyx_hoe", stormyx_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_hoe", "midas_gold_hoe", midas_gold_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_hoe", "steel_hoe", steel_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_hoe", "bronze_hoe", bronze_hoe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_battle_axe", "midas_gold_battle_axe", midas_gold_battle_axe, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_battle_axe", "steel_battle_axe", steel_battle_axe, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_battle_axe", "bronze_battle_axe", bronze_battle_axe, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_war_hammer", "midas_gold_war_hammer", midas_gold_war_hammer, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_war_hammer", "steel_war_hammer", steel_war_hammer, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_war_hammer", "bronze_war_hammer", bronze_war_hammer, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_mattock", "midas_gold_mattock", midas_gold_mattock, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_mattock", "steel_mattock", steel_mattock, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_mattock", "bronze_mattock", bronze_mattock, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_scythe", "midas_gold_scythe", midas_gold_scythe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_scythe", "steel_scythe", steel_scythe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_scythe", "bronze_scythe", bronze_scythe, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_dagger", "midas_gold_dagger", midas_gold_dagger, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_dagger", "steel_dagger", steel_dagger, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_dagger", "bronze_dagger", bronze_dagger, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_hatchet", "midas_gold_hatchet", midas_gold_hatchet, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_hatchet", "steel_hatchet", steel_hatchet, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_hatchet", "bronze_hatchet", bronze_hatchet, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/midas_gold_shears", "midas_gold_shears", midas_gold_shears, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/steel_shears", "steel_shears", steel_shears, MMCreativeTab.TOOLS_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/bronze_shears", "bronze_shears", bronze_shears, MMCreativeTab.TOOLS_TAB);



        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/gilded_midas_gold_sword", "gilded_midas_gold_sword", gilded_midas_gold_sword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/royal_midas_gold_broadsword", "royal_midas_gold_broadsword", royal_midas_gold_broadsword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/royal_midas_gold_greatsword", "royal_midas_gold_greatsword", royal_midas_gold_greatsword, MMCreativeTab.COMBAT_TAB);
        event.register(NameSpace, MoreMetalsInit.resourceId + "tool/true_royal_midas_gold_sword", "true_royal_midas_gold_sword", true_royal_midas_gold_sword, MMCreativeTab.COMBAT_TAB);
    }
}