package com.moddedmite.mitemod.MoreMetals.material;

import net.minecraft.EnumEquipmentMaterial;
import net.minecraft.Material;

public class MaterialTitanium extends Material {
    public MaterialTitanium(EnumEquipmentMaterial enum_crafting_material) {
        super(enum_crafting_material);
        this.setRequiresTool().setMetal(true).setMinHarvestLevel(4);
    }
}
