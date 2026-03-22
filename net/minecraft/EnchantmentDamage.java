/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package net.minecraft;

import net.minecraft.CreativeTabs;
import net.minecraft.Enchantment;
import net.minecraft.EntityLivingBase;
import net.minecraft.EnumRarity;
import net.minecraft.Item;
import net.minecraft.ItemAxe;
import net.minecraft.ItemBattleAxe;
import net.minecraft.ItemScythe;
import net.minecraft.ItemStack;
import net.minecraft.ItemSword;
import net.minecraft.ItemWarHammer;
import net.minecraft.Minecraft;

public class EnchantmentDamage
extends Enchantment {
    public EnchantmentDamage(int id, EnumRarity rarity, int difficulty) {
        super(id, rarity, difficulty);
    }

    @Override
    public String getTranslatedName(Item item) {
        if (this == sharpness && item instanceof ItemAxe) {
            return "Slaying";
        }
        return super.getTranslatedName(item);
    }

    public float getDamageModifier(int level, EntityLivingBase target) {
        if (this == sharpness) {
            return (float)level * 1.0f;
        }
        if (this == smite) {
            return target != null && target.isEntityUndead() ? (float)level * 2.0f : 0.0f;
        }
        if (this == baneOfArthropods) {
            return target != null && target.isArthropod() ? (float)level * 2.0f : 0.0f;
        }
        Minecraft.setErrorMessage("getDamageModifier: no handler for " + this);
        return 0.0f;
    }

    public static float getDamageModifiers(ItemStack weapon, EntityLivingBase target) {
        float damage_modifiers = 0.0f;
        if (weapon == null || !weapon.isItemEnchanted() || weapon.getItem() == Item.enchantedBook) {
            return damage_modifiers;
        }
        for (int i = 0; i < Enchantment.enchantmentsList.length; ++i) {
            EnchantmentDamage enchantment_damage;
            int level;
            Enchantment enchantment = Enchantment.get(i);
            if (!(enchantment instanceof EnchantmentDamage) || (level = weapon.getEnchantmentLevel(enchantment_damage = (EnchantmentDamage)enchantment)) <= 0) continue;
            damage_modifiers += enchantment_damage.getDamageModifier(level, target);
        }
        return damage_modifiers;
    }

    @Override
    public String getNameSuffix() {
        if (this == sharpness) {
            return "damage.all";
        }
        if (this == smite) {
            return "damage.undead";
        }
        if (this == baneOfArthropods) {
            return "damage.arthropods";
        }
        Minecraft.setErrorMessage("getNameSuffix: no handler for " + this);
        return null;
    }

    @Override
    public boolean canApplyTogether(Enchantment par1Enchantment) {
        return !(par1Enchantment instanceof EnchantmentDamage);
    }

    @Override
    public boolean canEnchantItem(Item item) {
        if (this == sharpness) {
            return item instanceof ItemSword || item.getClass() == ItemBattleAxe.class || item instanceof ItemScythe;
        }
        if (this == baneOfArthropods) {
            return item instanceof ItemSword;
        }
        if (this == smite) {
            return item.getClass() == ItemWarHammer.class;
        }
        return false;
    }

    @Override
    public boolean isOnCreativeTab(CreativeTabs creative_tab) {
        return creative_tab == CreativeTabs.tabCombat;
    }
}

