package com.moddedmite.mitemod.MoreMetals.material;

import net.minecraft.EnumEquipmentMaterial;
import net.minecraft.Material;
import net.minecraft.Minecraft;

import java.util.List;

import static com.moddedmite.mitemod.MoreMetals.material.EnumEquipmentMaterials.ROYAL_MIDAS_GOLD_BROADAWORD;

public class Materials extends Material {
    public static final EnumEquipmentMaterial STORMYX = EnumEquipmentMaterials.STORMYX.get();
    public static final EnumEquipmentMaterial BRONZE = EnumEquipmentMaterials.BRONZE.get();
    public static final EnumEquipmentMaterial STEEL = EnumEquipmentMaterials.STEEL.get();
    public static final EnumEquipmentMaterial TIN = EnumEquipmentMaterials.TIN.get();
    public static final EnumEquipmentMaterial Manganese = EnumEquipmentMaterials.MANGANESE.get();
    public static final EnumEquipmentMaterial Midas_Gold = EnumEquipmentMaterials.MIDAS_GOLD.get();
    public static final EnumEquipmentMaterial GILDED_MIDAS_GOLD_SWORD = EnumEquipmentMaterials.GILDED_MIDAS_GOLD_SWORD.get();
    public static final EnumEquipmentMaterial ROYAL_MIDAS_GOLD_BROADAWORD = EnumEquipmentMaterials.ROYAL_MIDAS_GOLD_BROADAWORD.get();
    public static final EnumEquipmentMaterial ROYAL_MIDAS_GOLD_GREATSWORD = EnumEquipmentMaterials.ROYAL_MIDAS_GOLD_GREATSWORD.get();
    public static final EnumEquipmentMaterial TRUE_ROYAL_MIDAS_GOLD_SWORD = EnumEquipmentMaterials.TRUE_ROYAL_MIDAS_GOLD_SWORD.get();
    public static final EnumEquipmentMaterial CELESTIUM = EnumEquipmentMaterials.CELESTIUM.get();


    public static final Material stormyx;
    public static final Material bronze;
    public static final Material steel;
    public static final Material tin;
    public static final Material manganese;
    public static final Material midas_gold;
    public static final Material gilded_midas_gold_sword;
    public static final Material royal_midas_gold_broadsword;
    public static final Material royal_midas_gold_greatsword;
    public static final Material true_royal_midas_gold_sword;
    public static final Material celestium;

    public static Materials magical;

    public static final List<Material> ARMOR_MATERIALS;

    static {
        stormyx = new MaterialStormyx(STORMYX);
        bronze = new MaterialBronze(BRONZE);
        steel = new MaterialSteel(STEEL);
        tin = new MaterialTin(TIN);
        manganese = new MaterialManganese(Manganese);
        midas_gold = new MaterialMidasGold(Midas_Gold);
        gilded_midas_gold_sword = new MaterialGildedMidasGoldSword(GILDED_MIDAS_GOLD_SWORD);
        royal_midas_gold_broadsword = new MaterialRoyalMidasGoldBroadsword(ROYAL_MIDAS_GOLD_BROADAWORD);
        royal_midas_gold_greatsword = new MaterialRoyalMidasGoldGreatsword(ROYAL_MIDAS_GOLD_GREATSWORD);
        true_royal_midas_gold_sword = new MaterialTrueRoyalMidasGoldSword(TRUE_ROYAL_MIDAS_GOLD_SWORD);
        celestium = new MaterialCelestium(CELESTIUM);
        ARMOR_MATERIALS = List.of(stormyx, bronze, steel, tin, manganese, midas_gold, gilded_midas_gold_sword, royal_midas_gold_broadsword, royal_midas_gold_greatsword, true_royal_midas_gold_sword, celestium);

    }

    public Materials(EnumEquipmentMaterial enum_crafting_material) {
        super(enum_crafting_material);
    }

    @Override
    public float getDamageVsEntity() {
        if (this == magical)
            return 0.0F;
        Minecraft.setErrorMessage("getDamageVsEntity: unhandled material " + this.name);
        return 0.0F;
    }
}