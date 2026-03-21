package com.moddedmite.mitemod.MoreMetals.status;

import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.minecraft.EntityPlayer;
import net.minecraft.ItemArmor;
import net.minecraft.ItemHorseArmor;
import net.minecraft.ItemStack;

public class MiscManager {
    private final EntityPlayer player;

    public MiscManager(EntityPlayer player) {
        this.player = player;
    }


    public boolean hasFullMidasGoldArmor() {
        ItemStack[] wornItems = player.getWornItems();
        int midasGoldArmorCount = 0;
        
        for (ItemStack itemStack : wornItems) {
            if (itemStack != null && itemStack.isArmor()) {
                ItemArmor armor = itemStack.getItem().getAsArmor();
                if (armor.getArmorMaterial() == Materials.midas_gold) {
                    midasGoldArmorCount++;
                }
            }
        }
        
        // 检查是否穿着完整的4件midas_gold装备
        return midasGoldArmorCount >= 4;
    }
    


}