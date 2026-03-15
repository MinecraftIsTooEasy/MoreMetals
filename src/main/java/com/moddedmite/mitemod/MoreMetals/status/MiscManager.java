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

    public float getBronzeArmorCoverage() {

    float coverage = 0.0F;
    ItemStack[] worn_items = this.player.getWornItems();
    for (ItemStack item_stack : worn_items) {
        if (item_stack != null)
            if (item_stack.isArmor()) {
                ItemArmor itemArmor = item_stack.getItem().getAsArmor();
                if (itemArmor.getArmorMaterial() == Materials.stormyx)
                    coverage += itemArmor.getCoverage() * itemArmor.getDamageFactor(item_stack, this.player);
            } else if (item_stack.getItem() instanceof ItemHorseArmor var6) {
                if (var6.getArmorMaterial() == Materials.stormyx)
                    coverage += var6.getCoverage();

            }
    }
    return coverage;
}

    public boolean hasFullStormyxArmor() {
        ItemStack[] wornItems = player.getWornItems();
        int stormyxArmorCount = 0;
        
        for (ItemStack itemStack : wornItems) {
            if (itemStack != null && itemStack.isArmor()) {
                ItemArmor armor = itemStack.getItem().getAsArmor();
                if (armor.getArmorMaterial() == Materials.stormyx) {
                    stormyxArmorCount++;
                }
            }
        }
        
        // 检查是否穿着完整的4件stormyx装备
        return stormyxArmorCount >= 4;
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
    
    public boolean hasFullCelestiumArmor() {
        ItemStack[] wornItems = player.getWornItems();
        int celestiumArmorCount = 0;
        
        for (ItemStack itemStack : wornItems) {
            if (itemStack != null && itemStack.isArmor()) {
                ItemArmor armor = itemStack.getItem().getAsArmor();
                if (armor.getArmorMaterial() == Materials.celestium) {
                    celestiumArmorCount++;
                }
            }
        }
        
        // 检查是否穿着完整的4件celestium装备
        return celestiumArmorCount >= 4;
    }

}