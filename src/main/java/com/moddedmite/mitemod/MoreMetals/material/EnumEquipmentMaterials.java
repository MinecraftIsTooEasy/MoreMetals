package com.moddedmite.mitemod.MoreMetals.material;

import com.chocohead.mm.api.ClassTinkerers;
import com.moddedmite.mitemod.MoreMetals.MoreMetalsInit;
import net.minecraft.EnumEquipmentMaterial;
import net.minecraft.EnumQuality;
import net.xiaoyu233.fml.util.EnumExtends;

public enum EnumEquipmentMaterials {
    BRONZE(6.0F, 30, EnumQuality.masterwork, "bronze"),
    STEEL(24.0F, 5, EnumQuality.legendary, "steel"),
    TIN(5.0F, 10, EnumQuality.masterwork, "tin"),
    MANGANESE(12.0F, 10, EnumQuality.masterwork, "manganese"),
    MIDAS_GOLD(24.0F, 50, EnumQuality.legendary, "midas_gold"),
    GILDED_MIDAS_GOLD_SWORD(24.0F, 50, EnumQuality.legendary, "gilded_midas_gold_sword"),
    ROYAL_MIDAS_GOLD_BROADAWORD(24.0F, 50, EnumQuality.legendary, "royal_midas_gold_broadsword"),
    ROYAL_MIDAS_GOLD_GREATSWORD(24.0F, 50, EnumQuality.legendary, "royal_midas_gold_greatsword"),
    TRUE_ROYAL_MIDAS_GOLD_SWORD(24.0F, 100, EnumQuality.legendary, "true_royal_midas_gold_sword");

    public final String EnumName;
    public final float durability;
    public final int enchantability;
    public final EnumQuality max_quality;
    public final String name;

    EnumEquipmentMaterials(float durability, int enchantability, EnumQuality max_quality, String material_name) {
        this.EnumName = MoreMetalsInit.NameSpaceCompactWithUnderScore + this.name();
        this.durability = durability;
        this.enchantability = enchantability;
        this.max_quality = max_quality;
        this.name = material_name;
    }

    public static void register() {
        for (EnumEquipmentMaterials arg : values()) {
            EnumExtends.EQUIPMENT_MATERIAL.addEnum(arg.EnumName, () -> new Object[]{arg.durability, arg.enchantability, arg.max_quality, arg.name});
        }
    }

    public EnumEquipmentMaterial get() {
        return ClassTinkerers.getEnum(EnumEquipmentMaterial.class, this.EnumName);
    }
}