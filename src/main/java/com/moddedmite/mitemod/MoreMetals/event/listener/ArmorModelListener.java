package com.moddedmite.mitemod.MoreMetals.event.listener;

import com.moddedmite.mitemod.MoreMetals.MoreMetalsInit;
import com.moddedmite.mitemod.MoreMetals.material.Materials;
import moddedmite.rustedironcore.api.event.listener.IArmorModelListener;
import net.minecraft.ItemArmor;
import net.minecraft.Material;
import net.minecraft.ResourceLocation;

import java.util.HashMap;
import java.util.Map;

public class ArmorModelListener implements IArmorModelListener {
    private final Map<String, ResourceLocation> MM_TEXTURE_MAP = new HashMap<>();

    @Override
    public ResourceLocation getArmorTexture(ItemArmor itemArmor, int slotIndex) {
        Material material = itemArmor.getArmorMaterial();
        if (!Materials.ARMOR_MATERIALS.contains(material)) {
            return null;
        }

        String path = String.format("textures/models/armor/%s_layer_%d.png", itemArmor.getTextureFilenamePrefix(), slotIndex == 2 ? 2 : 1);
        ResourceLocation identifier = this.MM_TEXTURE_MAP.get(path);
        if (identifier == null) {
            identifier = new ResourceLocation(MoreMetalsInit.ResourceDomain, path);
            this.MM_TEXTURE_MAP.put(path, identifier);
        }
        return identifier;
    }
}
