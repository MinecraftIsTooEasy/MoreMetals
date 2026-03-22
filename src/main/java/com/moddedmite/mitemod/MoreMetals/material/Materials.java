package com.moddedmite.mitemod.MoreMetals.material;

import net.minecraft.EnumEquipmentMaterial;
import net.minecraft.Material;
import net.minecraft.Minecraft;

import java.util.List;

public class Materials extends Material {
    public static final EnumEquipmentMaterial BRONZE = EnumEquipmentMaterials.BRONZE.get();
    public static final EnumEquipmentMaterial STEEL = EnumEquipmentMaterials.STEEL.get();
    public static final EnumEquipmentMaterial TIN = EnumEquipmentMaterials.TIN.get();
    public static final EnumEquipmentMaterial Manganese = EnumEquipmentMaterials.MANGANESE.get();
    public static final EnumEquipmentMaterial Midas_Gold = EnumEquipmentMaterials.MIDAS_GOLD.get();
    public static final EnumEquipmentMaterial Netherite = EnumEquipmentMaterials.NETHERITE.get();
    public static final EnumEquipmentMaterial ROSE_GOLD = EnumEquipmentMaterials.ROSE_GOLD.get();
    public static final EnumEquipmentMaterial PLATINUM = EnumEquipmentMaterials.PLATINUM.get();
    public static final EnumEquipmentMaterial ADAMANTIUM_MM = EnumEquipmentMaterials.ADAMANTIUM_MM.get();
    public static final EnumEquipmentMaterial ALUMINIUM = EnumEquipmentMaterials.ALUMINIUM.get();
    public static final EnumEquipmentMaterial TITANIUM = EnumEquipmentMaterials.TITANIUM.get();
    public static final EnumEquipmentMaterial TITANIUM_ALLOY = EnumEquipmentMaterials.TITANIUM_ALLOY.get();

    public static final Material bronze;
    public static final Material steel;
    public static final Material tin;
    public static final Material manganese;
    public static final Material midas_gold;
    public static final Material netherite;
    public static final Material rose_gold;
    public static final Material platinum;
    public static final Material adamantium_mm;
    public static final Material aluminium;
    public static final Material titanium;
    public static final Material titanium_alloy;

    public static Materials magical;

    public static final List<Material> ARMOR_MATERIALS;

    static {
        bronze = new MaterialBronze(BRONZE);
        steel = new MaterialSteel(STEEL);
        tin = new MaterialTin(TIN);
        manganese = new MaterialManganese(Manganese);
        midas_gold = new MaterialMidasGold(Midas_Gold);
        netherite = new MaterialNetherite(Netherite);
        rose_gold = new MaterialRoseGold(ROSE_GOLD);
        platinum = new MaterialPlatinum(PLATINUM);
        adamantium_mm = new MaterialAdamantium(ADAMANTIUM_MM);
        aluminium = new MaterialAluminium(ALUMINIUM);
        titanium = new MaterialTitanium(TITANIUM);
        titanium_alloy = new MaterialTitaniumAlloy(TITANIUM_ALLOY);
        ARMOR_MATERIALS = List.of(bronze, steel, tin, manganese, midas_gold, netherite, rose_gold, platinum, adamantium_mm, titanium_alloy);



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
