package com.moddedmite.mitemod.MoreMetals.material;

import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import huix.glacier.api.extension.material.IArmorMaterial;
import huix.glacier.api.extension.material.IArrowMaterial;
import huix.glacier.api.extension.material.IRepairableMaterial;
import huix.glacier.api.extension.material.IToolMaterial;
import net.minecraft.EnumEquipmentMaterial;
import net.minecraft.Item;
import net.minecraft.Material;

public class MaterialNetherite extends Material implements IArmorMaterial, IArrowMaterial, IRepairableMaterial, IToolMaterial {
    @Override
    public float getChanceOfRecovery() {
        return 0.7F;
    }



    public MaterialNetherite(EnumEquipmentMaterial enum_crafting_material) {
        super(enum_crafting_material);
        this.setRequiresTool().setMetal(false).setMinHarvestLevel(5);
    }

    @Override
    public float getDamageVsEntity() {
        return 7.0F;
    }

    @Override
    public int getProtection() {
        return 12;
    }

    @Override
    public Item getRepairItem() {
        return MMItems.netherite_nugget;
    }

    @Override
    public float getHarvestEfficiency() {
        return 4.0F;
    }


}