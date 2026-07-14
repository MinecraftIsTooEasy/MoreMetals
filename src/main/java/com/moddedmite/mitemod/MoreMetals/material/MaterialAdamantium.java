package com.moddedmite.mitemod.MoreMetals.material;

import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import huix.glacier.api.extension.material.IArmorMaterial;
import huix.glacier.api.extension.material.IArrowMaterial;
import huix.glacier.api.extension.material.ICoinMaterial;
import huix.glacier.api.extension.material.IRepairableMaterial;
import huix.glacier.api.extension.material.IToolMaterial;
import net.minecraft.EnumEquipmentMaterial;
import net.minecraft.Item;
import net.minecraft.ItemCoin;
import net.minecraft.Material;

public class MaterialAdamantium extends Material implements IArmorMaterial, IArrowMaterial, ICoinMaterial, IRepairableMaterial, IToolMaterial {
    @Override
    public float getChanceOfRecovery() {
        return 0.7F;
    }



    public MaterialAdamantium(EnumEquipmentMaterial enum_crafting_material) {
        super(enum_crafting_material);
        this.setRequiresTool().setMetal(true).setHarmedByLava(false).setMinHarvestLevel(5);
    }

    @Override
    public float getDamageVsEntity() {
        return 6.0F;
    }

    @Override
    public int getProtection() {
        return 10;
    }

    @Override
    public Item getRepairItem() {
        return MMItems.adamantium_nugget;
    }

    @Override
    public float getHarvestEfficiency() {
        return 5.0F;
    }

    @Override
    public int getExperienceValue() {
        return 10000;
    }

    @Override
    public ItemCoin getForInstance() {
        return MMItems.adamantium_coin;
    }

    @Override
    public Item getNuggetPeer() {
        return MMItems.adamantium_nugget;
    }
}