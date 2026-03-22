/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package net.minecraft;

import net.minecraft.CreativeTabs;
import net.minecraft.Enchantment;
import net.minecraft.EnumRarity;
import net.minecraft.Item;
import net.minecraft.ItemAxe;
import net.minecraft.ItemHoe;
import net.minecraft.ItemPickaxe;
import net.minecraft.ItemShovel;

public class EnchantmentDigging
extends Enchantment {
    protected EnchantmentDigging(int id, EnumRarity rarity, int difficulty) {
        super(id, rarity, difficulty);
    }

    @Override
    public String getNameSuffix() {
        return "digging";
    }

    @Override
    public boolean canEnchantItem(Item item) {
        return item.getClass() == ItemPickaxe.class || item instanceof ItemAxe || item instanceof ItemShovel || item instanceof ItemHoe;
    }

    @Override
    public boolean isOnCreativeTab(CreativeTabs creative_tab) {
        return creative_tab == CreativeTabs.tabTools;
    }
}

