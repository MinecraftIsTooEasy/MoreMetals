package com.moddedmite.mitemod.MoreMetals.material;

import net.minecraft.EnumEquipmentMaterial;
import net.minecraft.Material;

public class MaterialAluminium extends Material {
    public MaterialAluminium(EnumEquipmentMaterial enum_crafting_material) {
        super(enum_crafting_material);
        this.setRequiresTool().setMetal(false).setMinHarvestLevel(2);
    }
}
