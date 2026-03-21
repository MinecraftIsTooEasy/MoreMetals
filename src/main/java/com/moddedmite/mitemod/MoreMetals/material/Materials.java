package com.moddedmite.mitemod.MoreMetals.material;

import net.minecraft.EnumEquipmentMaterial;
import net.minecraft.Material;
import net.minecraft.Minecraft;

import java.util.List;

import static com.moddedmite.mitemod.MoreMetals.material.EnumEquipmentMaterials.ROYAL_MIDAS_GOLD_BROADAWORD;

public class Materials extends Material {
    public static final EnumEquipmentMaterial BRONZE = EnumEquipmentMaterials.BRONZE.get();
    public static final EnumEquipmentMaterial STEEL = EnumEquipmentMaterials.STEEL.get();
    public static final EnumEquipmentMaterial TIN = EnumEquipmentMaterials.TIN.get();
    public static final EnumEquipmentMaterial Manganese = EnumEquipmentMaterials.MANGANESE.get();
    public static final EnumEquipmentMaterial Midas_Gold = EnumEquipmentMaterials.MIDAS_GOLD.get();


    public static final Material bronze;
    public static final Material steel;
    public static final Material tin;
    public static final Material manganese;
    public static final Material midas_gold;

    public static Materials magical;

    public static final List<Material> ARMOR_MATERIALS;

    static {
        bronze = new MaterialBronze(BRONZE);
        steel = new MaterialSteel(STEEL);
        tin = new MaterialTin(TIN);
        manganese = new MaterialManganese(Manganese);
        midas_gold = new MaterialMidasGold(Midas_Gold);
        ARMOR_MATERIALS = List.of( bronze, steel, tin, manganese, midas_gold);

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