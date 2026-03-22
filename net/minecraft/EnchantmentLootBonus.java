/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package net.minecraft;

import net.minecraft.CreativeTabs;
import net.minecraft.Enchantment;
import net.minecraft.EnumRarity;
import net.minecraft.Item;
import net.minecraft.ItemCudgel;
import net.minecraft.ItemPickaxe;
import net.minecraft.ItemShovel;
import net.minecraft.ItemSword;
import net.minecraft.Minecraft;

public class EnchantmentLootBonus
extends Enchantment {
    protected EnchantmentLootBonus(int id, EnumRarity rarity, int difficulty) {
        super(id, rarity, difficulty);
    }

    @Override
    public int getNumLevels() {
        return 3;
    }

    @Override
    public String getNameSuffix() {
        if (this == looting) {
            return "lootBonus";
        }
        if (this == fortune) {
            return "lootBonusDigger";
        }
        Minecraft.setErrorMessage("getName: no handler for " + this);
        return null;
    }

    @Override
    public boolean canApplyTogether(Enchantment par1Enchantment) {
        return super.canApplyTogether(par1Enchantment) && par1Enchantment.effectId != EnchantmentLootBonus.silkTouch.effectId;
    }

    @Override
    public boolean canEnchantItem(Item item) {
        if (this == looting) {
            return item instanceof ItemCudgel || item instanceof ItemSword;
        }
        if (this == fortune) {
            return item.getClass() == ItemPickaxe.class || item.getClass() == ItemShovel.class;
        }
        return false;
    }

    @Override
    public boolean isOnCreativeTab(CreativeTabs creative_tab) {
        if (this == looting) {
            return creative_tab == CreativeTabs.tabCombat;
        }
        return creative_tab == CreativeTabs.tabTools;
    }
}

