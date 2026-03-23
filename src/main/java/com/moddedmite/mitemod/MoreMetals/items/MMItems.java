package com.moddedmite.mitemod.MoreMetals.items;

import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.minecraft.*;
import net.xiaoyu233.fml.reload.utils.IdUtil;

public class MMItems extends Item {
    public static final ItemIngot midas_gold_ingot = new MMItemIngot(getItemId("midas_gold_ingot"), Materials.midas_gold,"midas_gold_ingot");
    public static final ItemIngot platinum_ingot = new MMItemIngot(getItemId("platinum_ingot"), Materials.platinum,"platinum_ingot");
    public static final ItemIngot adamantium_ingot = new MMItemIngot(getItemId("adamantium_ingot"), Materials.adamantium_mm,"adamantium_ingot");
    public static final ItemIngot rose_gold_ingot = new MMItemIngot(getItemId("rose_gold_ingot"), Materials.rose_gold,"rose_gold_ingot");
    public static final ItemIngot aluminium_ingot = new MMItemIngot(getItemId("aluminium_ingot"), Materials.aluminium,"aluminium_ingot");
    public static final ItemIngot titanium_ingot = new MMItemIngot(getItemId("titanium_ingot"), Materials.titanium,"titanium_ingot");
    public static final ItemIngot titanium_alloy_ingot = new MMItemIngot(getItemId("titanium_alloy_ingot"), Materials.titanium_alloy,"titanium_alloy_ingot");
    public static final ItemIngot tin_ingot = new MMItemIngot(getItemId("tin_ingot"), Materials.bronze,"tin_ingot");
    public static final ItemIngot manganese_ingot = new MMItemIngot(getItemId("manganese_ingot"), Materials.steel,"manganese_ingot");
    public static final ItemIngot steel_ingot = new MMItemIngot(getItemId("steel_ingot"), Materials.steel,"steel_ingot");
    public static final ItemIngot bronze_ingot = new MMItemIngot(getItemId("bronze_ingot"), Materials.bronze,"bronze_ingot");
    public static final ItemIngot midas_gold_nugget = new MMItemNugget(getItemId("midas_gold_nugget"), Materials.midas_gold,"midas_gold_nugget");
    public static final ItemIngot platinum_nugget = new MMItemNugget(getItemId("platinum_nugget"), Materials.platinum,"platinum_nugget");
    public static final ItemIngot adamantium_nugget = new MMItemNugget(getItemId("adamantium_nugget"), Materials.adamantium_mm,"adamantium_nugget");
    public static final ItemIngot rose_gold_nugget = new MMItemNugget(getItemId("rose_gold_nugget"), Materials.rose_gold,"rose_gold_nugget");
    public static final ItemIngot titanium_alloy_nugget = new MMItemNugget(getItemId("titanium_alloy_nugget"), Materials.titanium_alloy,"titanium_alloy_nugget");
    public static final ItemIngot steel_nugget = new MMItemNugget(getItemId("steel_nugget"), Materials.steel,"steel_nugget");
    public static final ItemNugget bronze_nugget = new MMItemNugget(getItemId("bronze_nugget"), Materials.bronze,"bronze_nugget");
    public static final ItemHelmet midas_gold_helmet = new MMItemHelmet(getItemId("midas_gold_helmet"), Materials.midas_gold,"midas_gold_helmet");
    public static final ItemHelmet platinum_helmet = new MMItemHelmet(getItemId("platinum_helmet"), Materials.platinum,"platinum_helmet");
    public static final ItemHelmet adamantium_helmet = new MMItemHelmet(getItemId("adamantium_helmet"), Materials.adamantium_mm,"adamantium_helmet");
    public static final ItemHelmet rose_gold_helmet = new MMItemHelmet(getItemId("rose_gold_helmet"), Materials.rose_gold,"rose_gold_helmet");
    public static final ItemHelmet titanium_alloy_helmet = new MMItemHelmet(getItemId("titanium_alloy_helmet"), Materials.titanium_alloy,"titanium_alloy_helmet");
    public static final ItemHelmet steel_helmet = new MMItemHelmet(getItemId("steel_helmet"), Materials.steel,"steel_helmet");
    public static final ItemHelmet bronze_helmet = new MMItemHelmet(getItemId("bronze_helmet"), Materials.bronze,"bronze_helmet");
    public static final ItemCuirass midas_gold_chestplate = new MMItemCuirass(getItemId("midas_gold_chestplate"), Materials.midas_gold,"midas_gold_chestplate");
    public static final ItemCuirass platinum_chestplate = new MMItemCuirass(getItemId("platinum_chestplate"), Materials.platinum,"platinum_chestplate");
    public static final ItemCuirass adamantium_chestplate = new MMItemCuirass(getItemId("adamantium_chestplate"), Materials.adamantium_mm,"adamantium_chestplate");
    public static final ItemCuirass rose_gold_chestplate = new MMItemCuirass(getItemId("rose_gold_chestplate"), Materials.rose_gold,"rose_gold_chestplate");
    public static final ItemCuirass titanium_alloy_chestplate = new MMItemCuirass(getItemId("titanium_alloy_chestplate"), Materials.titanium_alloy,"titanium_alloy_chestplate");
    public static final ItemCuirass steel_chestplate = new MMItemCuirass(getItemId("steel_chestplate"), Materials.steel,"steel_chestplate");
    public static final ItemCuirass bronze_chestplate = new MMItemCuirass(getItemId("bronze_chestplate"), Materials.bronze,"bronze_chestplate");
    public static final ItemLeggings midas_gold_leggings = new MMItemLeggings(getItemId("midas_gold_leggings"), Materials.midas_gold,"midas_gold_leggings");
    public static final ItemLeggings platinum_leggings = new MMItemLeggings(getItemId("platinum_leggings"), Materials.platinum,"platinum_leggings");
    public static final ItemLeggings adamantium_leggings = new MMItemLeggings(getItemId("adamantium_leggings"), Materials.adamantium_mm,"adamantium_leggings");
    public static final ItemLeggings rose_gold_leggings = new MMItemLeggings(getItemId("rose_gold_leggings"), Materials.rose_gold,"rose_gold_leggings");
    public static final ItemLeggings titanium_alloy_leggings = new MMItemLeggings(getItemId("titanium_alloy_leggings"), Materials.titanium_alloy,"titanium_alloy_leggings");
    public static final ItemLeggings steel_leggings = new MMItemLeggings(getItemId("steel_leggings"), Materials.steel,"steel_leggings");
    public static final ItemLeggings bronze_leggings = new MMItemLeggings(getItemId("bronze_leggings"), Materials.bronze,"bronze_leggings");
    public static final ItemBoots midas_gold_boots = new MMItemBoots(getItemId("midas_gold_boots"), Materials.midas_gold,"midas_gold_boots");
    public static final ItemBoots platinum_boots = new MMItemBoots(getItemId("platinum_boots"), Materials.platinum,"platinum_boots");
    public static final ItemBoots adamantium_boots = new MMItemBoots(getItemId("adamantium_boots"), Materials.adamantium_mm,"adamantium_boots");
    public static final ItemBoots rose_gold_boots = new MMItemBoots(getItemId("rose_gold_boots"), Materials.rose_gold,"rose_gold_boots");
    public static final ItemBoots titanium_alloy_boots = new MMItemBoots(getItemId("titanium_alloy_boots"), Materials.titanium_alloy,"titanium_alloy_boots");
    public static final ItemBoots steel_boots = new MMItemBoots(getItemId("steel_boots"), Materials.steel,"steel_boots");
    public static final ItemBoots bronze_boots = new MMItemBoots(getItemId("bronze_boots"), Materials.bronze,"bronze_boots");
    public static final ItemSword midas_gold_sword = new MMItemSword(getItemId("midas_gold_sword"), Materials.midas_gold,"midas_gold_sword");
    public static final ItemSword platinum_sword = new MMItemSword(getItemId("platinum_sword"), Materials.platinum,"platinum_sword");
    public static final ItemSword adamantium_sword = new MMItemSword(getItemId("adamantium_sword"), Materials.adamantium_mm,"adamantium_sword");
    public static final ItemSword rose_gold_sword = new MMItemSword(getItemId("rose_gold_sword"), Materials.rose_gold,"rose_gold_sword");
    public static final ItemSword titanium_alloy_sword = new MMItemSword(getItemId("titanium_alloy_sword"), Materials.titanium_alloy,"titanium_alloy_sword");
    public static final ItemSword steel_sword = new MMItemSword(getItemId("steel_sword"), Materials.steel,"steel_sword");
    public static final ItemSword bronze_sword = new MMItemSword(getItemId("bronze_sword"), Materials.bronze,"bronze_sword");
    public static final ItemPickaxe midas_gold_pickaxe = new MMItemPickaxe(getItemId("midas_gold_pickaxe"), Materials.midas_gold,"midas_gold_pickaxe");
    public static final ItemPickaxe platinum_pickaxe = new MMItemPickaxe(getItemId("platinum_pickaxe"), Materials.platinum,"platinum_pickaxe");
    public static final ItemPickaxe adamantium_pickaxe = new MMItemPickaxe(getItemId("adamantium_pickaxe"), Materials.adamantium_mm,"adamantium_pickaxe");
    public static final ItemPickaxe rose_gold_pickaxe = new MMItemPickaxe(getItemId("rose_gold_pickaxe"), Materials.rose_gold,"rose_gold_pickaxe");
    public static final ItemPickaxe titanium_alloy_pickaxe = new MMItemPickaxe(getItemId("titanium_alloy_pickaxe"), Materials.titanium_alloy,"titanium_alloy_pickaxe");
    public static final ItemPickaxe steel_pickaxe = new MMItemPickaxe(getItemId("steel_pickaxe"), Materials.steel,"steel_pickaxe");
    public static final ItemPickaxe bronze_pickaxe = new MMItemPickaxe(getItemId("bronze_pickaxe"), Materials.bronze,"bronze_pickaxe");
    public static final ItemAxe midas_gold_axe = new MMItemAxe(getItemId("midas_gold_axe"), Materials.midas_gold,"midas_gold_axe");
    public static final ItemAxe platinum_axe = new MMItemAxe(getItemId("platinum_axe"), Materials.platinum,"platinum_axe");
    public static final ItemAxe adamantium_axe = new MMItemAxe(getItemId("adamantium_axe"), Materials.adamantium_mm,"adamantium_axe");
    public static final ItemAxe rose_gold_axe = new MMItemAxe(getItemId("rose_gold_axe"), Materials.rose_gold,"rose_gold_axe");
    public static final ItemAxe titanium_alloy_axe = new MMItemAxe(getItemId("titanium_alloy_axe"), Materials.titanium_alloy,"titanium_alloy_axe");
    public static final ItemAxe steel_axe = new MMItemAxe(getItemId("steel_axe"), Materials.steel,"steel_axe");
    public static final ItemAxe bronze_axe = new MMItemAxe(getItemId("bronze_axe"), Materials.bronze,"bronze_axe");
    public static final ItemShovel midas_gold_shovel = new MMItemShovel(getItemId("midas_gold_shovel"), Materials.midas_gold,"midas_gold_shovel");
    public static final ItemShovel platinum_shovel = new MMItemShovel(getItemId("platinum_shovel"), Materials.platinum,"platinum_shovel");
    public static final ItemShovel adamantium_shovel = new MMItemShovel(getItemId("adamantium_shovel"), Materials.adamantium_mm,"adamantium_shovel");
    public static final ItemShovel rose_gold_shovel = new MMItemShovel(getItemId("rose_gold_shovel"), Materials.rose_gold,"rose_gold_shovel");
    public static final ItemShovel titanium_alloy_shovel = new MMItemShovel(getItemId("titanium_alloy_shovel"), Materials.titanium_alloy,"titanium_alloy_shovel");
    public static final ItemShovel steel_shovel = new MMItemShovel(getItemId("steel_shovel"), Materials.steel,"steel_shovel");
    public static final ItemShovel bronze_shovel = new MMItemShovel(getItemId("bronze_shovel"), Materials.bronze,"bronze_shovel");
    public static final ItemHoe midas_gold_hoe = new MMItemHoe(getItemId("midas_gold_hoe"), Materials.midas_gold,"midas_gold_hoe");
    public static final ItemHoe platinum_hoe = new MMItemHoe(getItemId("platinum_hoe"), Materials.platinum,"platinum_hoe");
    public static final ItemHoe adamantium_hoe = new MMItemHoe(getItemId("adamantium_hoe"), Materials.adamantium_mm,"adamantium_hoe");
    public static final ItemHoe rose_gold_hoe = new MMItemHoe(getItemId("rose_gold_hoe"), Materials.rose_gold,"rose_gold_hoe");
    public static final ItemHoe titanium_alloy_hoe = new MMItemHoe(getItemId("titanium_alloy_hoe"), Materials.titanium_alloy,"titanium_alloy_hoe");
    public static final ItemHoe steel_hoe = new MMItemHoe(getItemId("steel_hoe"), Materials.steel,"steel_hoe");
    public static final ItemHoe bronze_hoe = new MMItemHoe(getItemId("bronze_hoe"), Materials.bronze,"bronze_hoe");
    public static final ItemBattleAxe midas_gold_battle_axe = new MMItemBattleAxe(getItemId("midas_gold_battle_axe"), Materials.midas_gold,"midas_gold_battle_axe");
    public static final ItemBattleAxe platinum_battle_axe = new MMItemBattleAxe(getItemId("platinum_battle_axe"), Materials.platinum,"platinum_battle_axe");
    public static final ItemBattleAxe adamantium_battle_axe = new MMItemBattleAxe(getItemId("adamantium_battle_axe"), Materials.adamantium_mm,"adamantium_battle_axe");
    public static final ItemBattleAxe rose_gold_battle_axe = new MMItemBattleAxe(getItemId("rose_gold_battle_axe"), Materials.rose_gold,"rose_gold_battle_axe");
    public static final ItemBattleAxe titanium_alloy_battle_axe = new MMItemBattleAxe(getItemId("titanium_alloy_battle_axe"), Materials.titanium_alloy,"titanium_alloy_battle_axe");
    public static final ItemBattleAxe bronze_battle_axe = new MMItemBattleAxe(getItemId("bronze_battle_axe"), Materials.bronze,"bronze_battle_axe");
    public static final ItemBattleAxe steel_battle_axe = new MMItemBattleAxe(getItemId("steel_battle_axe"), Materials.steel,"steel_battle_axe");
    public static final ItemWarHammer midas_gold_war_hammer = new MMItemWarHammer(getItemId("midas_gold_war_hammer"), Materials.midas_gold,"midas_gold_war_hammer");
    public static final ItemWarHammer platinum_war_hammer = new MMItemWarHammer(getItemId("platinum_war_hammer"), Materials.platinum,"platinum_war_hammer");
    public static final ItemWarHammer adamantium_war_hammer = new MMItemWarHammer(getItemId("adamantium_war_hammer"), Materials.adamantium_mm,"adamantium_war_hammer");
    public static final ItemWarHammer rose_gold_war_hammer = new MMItemWarHammer(getItemId("rose_gold_war_hammer"), Materials.rose_gold,"rose_gold_war_hammer");
    public static final ItemWarHammer titanium_alloy_war_hammer = new MMItemWarHammer(getItemId("titanium_alloy_war_hammer"), Materials.titanium_alloy,"titanium_alloy_war_hammer");
    public static final ItemWarHammer bronze_war_hammer = new MMItemWarHammer(getItemId("bronze_war_hammer"), Materials.bronze,"bronze_war_hammer");
    public static final ItemWarHammer steel_war_hammer = new MMItemWarHammer(getItemId("steel_war_hammer"), Materials.steel,"steel_war_hammer");
    public static final ItemMattock midas_gold_mattock = new MMItemMattock(getItemId("midas_gold_mattock"), Materials.midas_gold,"midas_gold_mattock");
    public static final ItemMattock platinum_mattock = new MMItemMattock(getItemId("platinum_mattock"), Materials.platinum,"platinum_mattock");
    public static final ItemMattock adamantium_mattock = new MMItemMattock(getItemId("adamantium_mattock"), Materials.adamantium_mm,"adamantium_mattock");
    public static final ItemMattock rose_gold_mattock = new MMItemMattock(getItemId("rose_gold_mattock"), Materials.rose_gold,"rose_gold_mattock");
    public static final ItemMattock titanium_alloy_mattock = new MMItemMattock(getItemId("titanium_alloy_mattock"), Materials.titanium_alloy,"titanium_alloy_mattock");
    public static final ItemMattock bronze_mattock = new MMItemMattock(getItemId("bronze_mattock"), Materials.bronze,"bronze_mattock");
    public static final ItemMattock steel_mattock = new MMItemMattock(getItemId("steel_mattock"), Materials.steel,"steel_mattock");
    public static final ItemScythe midas_gold_scythe = new MMItemScythe(getItemId("midas_gold_scythe"), Materials.midas_gold,"midas_gold_scythe");
    public static final ItemScythe platinum_scythe = new MMItemScythe(getItemId("platinum_scythe"), Materials.platinum,"platinum_scythe");
    public static final ItemScythe adamantium_scythe = new MMItemScythe(getItemId("adamantium_scythe"), Materials.adamantium_mm,"adamantium_scythe");
    public static final ItemScythe rose_gold_scythe = new MMItemScythe(getItemId("rose_gold_scythe"), Materials.rose_gold,"rose_gold_scythe");
    public static final ItemScythe titanium_alloy_scythe = new MMItemScythe(getItemId("titanium_alloy_scythe"), Materials.titanium_alloy,"titanium_alloy_scythe");
    public static final ItemScythe steel_scythe = new MMItemScythe(getItemId("steel_scythe"), Materials.steel,"steel_scythe");
    public static final ItemScythe bronze_scythe = new MMItemScythe(getItemId("bronze_scythe"), Materials.bronze,"bronze_scythe");
    public static final ItemDagger midas_gold_dagger = new MMItemDagger(getItemId("midas_gold_dagger"), Materials.midas_gold,"midas_gold_dagger");
    public static final ItemDagger platinum_dagger = new MMItemDagger(getItemId("platinum_dagger"), Materials.platinum,"platinum_dagger");
    public static final ItemDagger adamantium_dagger = new MMItemDagger(getItemId("adamantium_dagger"), Materials.adamantium_mm,"adamantium_dagger");
    public static final ItemDagger rose_gold_dagger = new MMItemDagger(getItemId("rose_gold_dagger"), Materials.rose_gold,"rose_gold_dagger");
    public static final ItemDagger titanium_alloy_dagger = new MMItemDagger(getItemId("titanium_alloy_dagger"), Materials.titanium_alloy,"titanium_alloy_dagger");
    public static final ItemDagger bronze_dagger = new MMItemDagger(getItemId("bronze_dagger"), Materials.bronze,"bronze_dagger");
    public static final ItemDagger steel_dagger = new MMItemDagger(getItemId("steel_dagger"), Materials.steel,"steel_dagger");
    public static final ItemHatchet midas_gold_hatchet = new MMItemHatchet(getItemId("midas_gold_hatchet"), Materials.midas_gold,"midas_gold_hatchet");
    public static final ItemHatchet platinum_hatchet = new MMItemHatchet(getItemId("platinum_hatchet"), Materials.platinum,"platinum_hatchet");
    public static final ItemHatchet adamantium_hatchet = new MMItemHatchet(getItemId("adamantium_hatchet"), Materials.adamantium_mm,"adamantium_hatchet");
    public static final ItemHatchet rose_gold_hatchet = new MMItemHatchet(getItemId("rose_gold_hatchet"), Materials.rose_gold,"rose_gold_hatchet");
    public static final ItemHatchet titanium_alloy_hatchet = new MMItemHatchet(getItemId("titanium_alloy_hatchet"), Materials.titanium_alloy,"titanium_alloy_hatchet");
    public static final ItemHatchet bronze_hatchet = new MMItemHatchet(getItemId("bronze_hatchet"), Materials.bronze,"bronze_hatchet");
    public static final ItemHatchet steel_hatchet = new MMItemHatchet(getItemId("steel_hatchet"), Materials.steel,"steel_hatchet");
    public static final ItemShears midas_gold_shears = new MMItemShears(getItemId("midas_gold_shears"), Materials.midas_gold,"midas_gold_shears");
    public static final ItemShears platinum_shears = new MMItemShears(getItemId("platinum_shears"), Materials.platinum,"platinum_shears");
    public static final ItemShears adamantium_shears = new MMItemShears(getItemId("adamantium_shears"), Materials.adamantium_mm,"adamantium_shears");
    public static final ItemShears rose_gold_shears = new MMItemShears(getItemId("rose_gold_shears"), Materials.rose_gold,"rose_gold_shears");
    public static final ItemShears titanium_alloy_shears = new MMItemShears(getItemId("titanium_alloy_shears"), Materials.titanium_alloy,"titanium_alloy_shears");
    public static final ItemShears bronze_shears = new MMItemShears(getItemId("bronze_shears"), Materials.bronze,"bronze_shears");
    public static final ItemShears steel_shears = new MMItemShears(getItemId("steel_shears"), Materials.steel,"steel_shears");
    private static int getItemId(String contentName) {
        return IdUtil.getNextItemID();
    }

    public static class MMItem extends Item {
        public MMItem(int id, Material material, String textureName) {super(id, String.valueOf(material));
        }
    }

    public static class MMItemAxe extends ItemAxe {
        public MMItemAxe(int id, Material material, String textureName) {
            super(id, material);
        }
    }

     public static class MMItemShears extends ItemShears {
        public MMItemShears(int id, Material material, String textureName) {
            super(id, material);
        }
    }

     public static class MMItemHatchet extends ItemHatchet {
        public MMItemHatchet(int id, Material material, String textureName) {
            super(id, material);
        }
    }

     public static class MMItemDagger extends ItemDagger {
        public MMItemDagger(int id, Material material, String textureName) {
            super(id, material);
        }
    }

    public static class MMItemScythe extends ItemScythe {
        public MMItemScythe(int id, Material material, String textureName) {
            super(id, material);
        }
    }

    public static class MMItemMattock extends ItemMattock {
        public MMItemMattock(int id, Material material, String textureName) {
            super(id, material);
        }
    }

    public static class MMItemWarHammer extends ItemWarHammer {
        public MMItemWarHammer(int id, Material material, String textureName) {
            super(id, material);
        }
    }

    public static class MMItemBattleAxe extends ItemBattleAxe {
        public MMItemBattleAxe(int id, Material material, String textureName) {
            super(id, material);
        }
    }

    public static class MMItemHoe extends ItemHoe {
        public MMItemHoe(int id, Material material, String textureName) {
            super(id, material);
        }
    }

    public static class MMItemShovel extends ItemShovel {
        public MMItemShovel(int id, Material material, String textureName) {
            super(id, material);
        }
    }

    public static class MMItemPickaxe extends ItemPickaxe {
        public MMItemPickaxe(int id, Material material, String textureName) {
            super(id, material);
        }
    }

    public static class MMItemSword extends ItemSword {
        public MMItemSword(int id, Material material, String textureName) {
            super(id, material);
        }
    }

    public static class MMItemHelmet extends ItemHelmet {
        public MMItemHelmet(int id, Material material, String textureName) {
            super(id, material, false); // 第三个参数为boolean类型，这里传入false
        }
    }

    public static class MMItemCuirass extends ItemCuirass {
        public MMItemCuirass(int id, Material material, String textureName) {
            super(id, material, false); // 第三个参数为boolean类型，这里传入false
        }
    }

    public static class MMItemLeggings extends ItemLeggings {
        public MMItemLeggings(int id, Material material, String textureName) {
            super(id, material, false); // 第三个参数为boolean类型，这里传入false
        }
    }

    public static class MMItemBoots extends ItemBoots {
        public MMItemBoots(int id, Material material, String textureName) {
            super(id, material, false); // 第三个参数为boolean类型，这里传入false
        }
    }

    public static class MMItemIngot extends ItemIngot {
        protected MMItemIngot(int id, Material material, String textureName) {
            super(id, material);
        }
    }

    public static class MMItemNugget extends ItemNugget {
        protected MMItemNugget(int id, Material material, String textureName) {
            super(id, material);
        }
    }

}
