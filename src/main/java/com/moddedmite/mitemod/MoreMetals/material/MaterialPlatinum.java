package com.moddedmite.mitemod.MoreMetals.material;

import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import huix.glacier.api.extension.material.IArmorMaterial;
import huix.glacier.api.extension.material.IArrowMaterial;
import huix.glacier.api.extension.material.IRepairableMaterial;
import huix.glacier.api.extension.material.IToolMaterial;
import net.minecraft.EnumEquipmentMaterial;
import net.minecraft.Item;
import net.minecraft.Material;

public class MaterialPlatinum extends Material implements IArmorMaterial, IArrowMaterial, IRepairableMaterial, IToolMaterial {
    @Override
    public float getChanceOfRecovery() {
        return 0.7F;
    }



    public MaterialPlatinum(EnumEquipmentMaterial enum_crafting_material) {
        super(enum_crafting_material);
        this.setRequiresTool().setMetal(false).setMinHarvestLevel(4);
    }

    @Override
    public float getDamageVsEntity() {
        return 4.5F;
    }

    @Override
    public int getProtection() {
        return 7;
    }

    @Override
    public Item getRepairItem() {
        return MMItems.platinum_nugget;
    }

    @Override
    public float getHarvestEfficiency() {
        return 4.0F;
    }


}