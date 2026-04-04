package com.moddedmite.mitemod.MoreMetals.status;

import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.minecraft.EntityPlayer;
import net.minecraft.ItemArmor;
import net.minecraft.ItemStack;
import net.minecraft.Material;

public class MiscManager {
    private final EntityPlayer player;

    public MiscManager(EntityPlayer player) {
        this.player = player;
    }

    public boolean hasFullMidasGoldArmor() {
        return this.hasFullArmorSet(Materials.midas_gold);
    }

    public boolean hasFullRoseGoldArmor() {
        return this.hasFullArmorSet(Materials.rose_gold);
    }

    public boolean hasFullPlatinumArmor() {
        return this.hasFullArmorSet(Materials.platinum);
    }

    private boolean hasFullArmorSet(Material armorMaterial) {
        ItemStack[] wornItems = this.player.getWornItems();
        int armorCount = 0;

        for (ItemStack itemStack : wornItems) {
            if (itemStack != null && itemStack.isArmor()) {
                ItemArmor armor = itemStack.getItem().getAsArmor();
                if (armor.getArmorMaterial() == armorMaterial) {
                    armorCount++;
                }
            }
        }

        return armorCount >= 4;
    }
}