package com.moddedmite.mitemod.MoreMetals.items;

import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.minecraft.*;
import net.xiaoyu233.fml.reload.utils.IdUtil;

public class MMItems extends Item {
    public static final ItemIngot midas_gold_ingot = new MMItemIngot(getItemId("midas_gold_ingot"), Materials.midas_gold,"midas_gold_ingot");
    public static final ItemIngot tin_ingot = new MMItemIngot(getItemId("tin_ingot"), Materials.bronze,"tin_ingot");
    public static final ItemIngot manganese_ingot = new MMItemIngot(getItemId("manganese_ingot"), Materials.steel,"manganese_ingot");
    public static final ItemIngot steel_ingot = new MMItemIngot(getItemId("steel_ingot"), Materials.steel,"steel_ingot");
    public static final ItemIngot bronze_ingot = new MMItemIngot(getItemId("bronze_ingot"), Materials.bronze,"bronze_ingot");
    public static final ItemIngot midas_gold_nugget = new MMItemNugget(getItemId("midas_gold_nugget"), Materials.midas_gold,"midas_gold_nugget");
    public static final ItemIngot steel_nugget = new MMItemNugget(getItemId("steel_nugget"), Materials.steel,"steel_nugget");
    public static final ItemNugget bronze_nugget = new MMItemNugget(getItemId("bronze_nugget"), Materials.bronze,"bronze_nugget");
    public static final ItemHelmet midas_gold_helmet = new MMItemHelmet(getItemId("midas_gold_helmet"), Materials.midas_gold,"midas_gold_helmet");
    public static final ItemHelmet steel_helmet = new MMItemHelmet(getItemId("steel_helmet"), Materials.steel,"steel_helmet");
    public static final ItemHelmet bronze_helmet = new MMItemHelmet(getItemId("bronze_helmet"), Materials.bronze,"bronze_helmet");
    public static final ItemCuirass midas_gold_chestplate = new MMItemCuirass(getItemId("midas_gold_chestplate"), Materials.midas_gold,"midas_gold_chestplate");
    public static final ItemCuirass steel_chestplate = new MMItemCuirass(getItemId("steel_chestplate"), Materials.steel,"steel_chestplate");
    public static final ItemCuirass bronze_chestplate = new MMItemCuirass(getItemId("bronze_chestplate"), Materials.bronze,"bronze_chestplate");
    public static final ItemLeggings midas_gold_leggings = new MMItemLeggings(getItemId("midas_gold_leggings"), Materials.midas_gold,"midas_gold_leggings");
    public static final ItemLeggings steel_leggings = new MMItemLeggings(getItemId("steel_leggings"), Materials.steel,"steel_leggings");
    public static final ItemLeggings bronze_leggings = new MMItemLeggings(getItemId("bronze_leggings"), Materials.bronze,"bronze_leggings");
    public static final ItemBoots midas_gold_boots = new MMItemBoots(getItemId("midas_gold_boots"), Materials.midas_gold,"midas_gold_boots");
    public static final ItemBoots steel_boots = new MMItemBoots(getItemId("steel_boots"), Materials.steel,"steel_boots");
    public static final ItemBoots bronze_boots = new MMItemBoots(getItemId("bronze_boots"), Materials.bronze,"bronze_boots");
    public static final ItemSword midas_gold_sword = new MMItemSword(getItemId("midas_gold_sword"), Materials.midas_gold,"midas_gold_sword");
    public static final ItemSword steel_sword = new MMItemSword(getItemId("steel_sword"), Materials.steel,"steel_sword");
    public static final ItemSword bronze_sword = new MMItemSword(getItemId("bronze_sword"), Materials.bronze,"bronze_sword");
    public static final ItemPickaxe midas_gold_pickaxe = new MMItemPickaxe(getItemId("midas_gold_pickaxe"), Materials.midas_gold,"midas_gold_pickaxe");
    public static final ItemPickaxe steel_pickaxe = new MMItemPickaxe(getItemId("steel_pickaxe"), Materials.steel,"steel_pickaxe");
    public static final ItemPickaxe bronze_pickaxe = new MMItemPickaxe(getItemId("bronze_pickaxe"), Materials.bronze,"bronze_pickaxe");
    public static final ItemAxe midas_gold_axe = new MMItemAxe(getItemId("midas_gold_axe"), Materials.midas_gold,"midas_gold_axe");
    public static final ItemAxe steel_axe = new MMItemAxe(getItemId("steel_axe"), Materials.steel,"steel_axe");
    public static final ItemAxe bronze_axe = new MMItemAxe(getItemId("bronze_axe"), Materials.bronze,"bronze_axe");
    public static final ItemShovel midas_gold_shovel = new MMItemShovel(getItemId("midas_gold_shovel"), Materials.midas_gold,"midas_gold_shovel");
    public static final ItemShovel steel_shovel = new MMItemShovel(getItemId("steel_shovel"), Materials.steel,"steel_shovel");
    public static final ItemShovel bronze_shovel = new MMItemShovel(getItemId("bronze_shovel"), Materials.bronze,"bronze_shovel");
    public static final ItemHoe midas_gold_hoe = new MMItemHoe(getItemId("midas_gold_hoe"), Materials.midas_gold,"midas_gold_hoe");
    public static final ItemHoe steel_hoe = new MMItemHoe(getItemId("steel_hoe"), Materials.steel,"steel_hoe");
    public static final ItemHoe bronze_hoe = new MMItemHoe(getItemId("bronze_hoe"), Materials.bronze,"bronze_hoe");
    public static final ItemBattleAxe midas_gold_battle_axe = new MMItemBattleAxe(getItemId("midas_gold_battle_axe"), Materials.midas_gold,"midas_gold_battle_axe");
    public static final ItemBattleAxe bronze_battle_axe = new MMItemBattleAxe(getItemId("bronze_battle_axe"), Materials.bronze,"bronze_battle_axe");
    public static final ItemBattleAxe steel_battle_axe = new MMItemBattleAxe(getItemId("steel_battle_axe"), Materials.steel,"steel_battle_axe");
    public static final ItemWarHammer midas_gold_war_hammer = new MMItemWarHammer(getItemId("midas_gold_war_hammer"), Materials.midas_gold,"midas_gold_war_hammer");
    public static final ItemWarHammer bronze_war_hammer = new MMItemWarHammer(getItemId("bronze_war_hammer"), Materials.bronze,"bronze_war_hammer");
    public static final ItemWarHammer steel_war_hammer = new MMItemWarHammer(getItemId("steel_war_hammer"), Materials.steel,"steel_war_hammer");
    public static final ItemMattock midas_gold_mattock = new MMItemMattock(getItemId("midas_gold_mattock"), Materials.midas_gold,"midas_gold_mattock");
    public static final ItemMattock bronze_mattock = new MMItemMattock(getItemId("bronze_mattock"), Materials.bronze,"bronze_mattock");
    public static final ItemMattock steel_mattock = new MMItemMattock(getItemId("steel_mattock"), Materials.steel,"steel_mattock");
    public static final ItemScythe midas_gold_scythe = new MMItemScythe(getItemId("midas_gold_scythe"), Materials.midas_gold,"midas_gold_scythe");
    public static final ItemScythe steel_scythe = new MMItemScythe(getItemId("steel_scythe"), Materials.steel,"steel_scythe");
    public static final ItemScythe bronze_scythe = new MMItemScythe(getItemId("bronze_scythe"), Materials.bronze,"bronze_scythe");
    public static final ItemDagger midas_gold_dagger = new MMItemDagger(getItemId("midas_gold_dagger"), Materials.midas_gold,"midas_gold_dagger");
    public static final ItemDagger bronze_dagger = new MMItemDagger(getItemId("bronze_dagger"), Materials.bronze,"bronze_dagger");
    public static final ItemDagger steel_dagger = new MMItemDagger(getItemId("steel_dagger"), Materials.steel,"steel_dagger");
    public static final ItemHatchet midas_gold_hatchet = new MMItemHatchet(getItemId("midas_gold_hatchet"), Materials.midas_gold,"midas_gold_hatchet");
    public static final ItemHatchet bronze_hatchet = new MMItemHatchet(getItemId("bronze_hatchet"), Materials.bronze,"bronze_hatchet");
    public static final ItemHatchet steel_hatchet = new MMItemHatchet(getItemId("steel_hatchet"), Materials.steel,"steel_hatchet");
    public static final ItemShears midas_gold_shears = new MMItemShears(getItemId("midas_gold_shears"), Materials.midas_gold,"midas_gold_shears");
    public static final ItemShears bronze_shears = new MMItemShears(getItemId("bronze_shears"), Materials.bronze,"bronze_shears");
    public static final ItemShears steel_shears = new MMItemShears(getItemId("steel_shears"), Materials.steel,"steel_shears");


    private static int getItemId(String contentName) {
        return IdUtil.getNextItemID();
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