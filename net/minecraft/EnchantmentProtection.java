/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package net.minecraft;

import net.minecraft.CreativeTabs;
import net.minecraft.DamageSource;
import net.minecraft.Enchantment;
import net.minecraft.EnchantmentHelper;
import net.minecraft.Entity;
import net.minecraft.EntityLivingBase;
import net.minecraft.EnumRarity;
import net.minecraft.Item;
import net.minecraft.ItemArmor;
import net.minecraft.ItemBoots;
import net.minecraft.ItemCuirass;
import net.minecraft.ItemLeggings;
import net.minecraft.ItemStack;
import net.minecraft.MathHelper;
import net.minecraft.Minecraft;

public class EnchantmentProtection
extends Enchantment {
    public EnchantmentProtection(int id, EnumRarity rarity, int difficulty) {
        super(id, rarity, difficulty);
    }

    @Override
    public int getNumLevels() {
        return 4;
    }

    private String getProtectionType() {
        if (this == protection) {
            return "all";
        }
        if (this == fireProtection) {
            return "fire";
        }
        if (this == featherFalling) {
            return "fall";
        }
        if (this == blastProtection) {
            return "explosion";
        }
        if (this == projectileProtection) {
            return "projectile";
        }
        Minecraft.setErrorMessage("getProtectionType: no handler for " + this);
        return null;
    }

    private boolean canReduceDamage(DamageSource damage_source) {
        if (damage_source == null) {
            return this == protection;
        }
        if (damage_source.canHarmInCreative()) {
            return false;
        }
        if (this == protection) {
            return true;
        }
        if (this == fireProtection) {
            return damage_source.isFireDamage();
        }
        if (this == featherFalling) {
            return damage_source == DamageSource.fall;
        }
        if (this == blastProtection) {
            return damage_source.isExplosion();
        }
        if (this == projectileProtection) {
            return damage_source.isProjectile();
        }
        Minecraft.setErrorMessage("canReduceDamage: no handler for " + this);
        return false;
    }

    public float getDefenseSqPerLevel() {
        if (this == protection) {
            return 4.0f;
        }
        if (this == fireProtection) {
            return 6.0f;
        }
        if (this == featherFalling) {
            return 16.0f;
        }
        if (this == blastProtection) {
            return 8.0f;
        }
        if (this == projectileProtection) {
            return 8.0f;
        }
        Minecraft.setErrorMessage("getDefensePerLevel: no handler for " + this);
        return 0.0f;
    }

    public static float getTotalProtectionOfEnchantments(ItemStack[] armors, DamageSource damage_source, EntityLivingBase owner) {
        EnchantmentProtection[] protection_enchantments = new EnchantmentProtection[]{Enchantment.fireProtection, Enchantment.featherFalling, Enchantment.blastProtection, Enchantment.projectileProtection};
        int max_enchantment_level = protection_enchantments[1].getNumLevels();
        float total_protection = 0.0f;
        for (int i = 0; i < protection_enchantments.length; ++i) {
            EnchantmentProtection protection_enchantment = protection_enchantments[i];
            if (protection_enchantment.getNumLevels() != max_enchantment_level) {
                Minecraft.setErrorMessage("getTotalDefenseOfEnchantments: " + protection_enchantment + " has a different number of levels!");
            }
            if (!protection_enchantment.canReduceDamage(damage_source)) continue;
            for (int j = 0; j < armors.length; ++j) {
                float enchantment_level_fraction;
                ItemStack item_stack = armors[j];
                if (item_stack == null || !((enchantment_level_fraction = item_stack.getEnchantmentLevelFraction(protection_enchantment)) > 0.0f)) continue;
                Item item = item_stack.getItem();
                if (item instanceof ItemArmor) {
                    ItemArmor armor = item_stack.getItemAsArmor();
                    if (protection_enchantment == Enchantment.featherFalling) {
                        return 15.0f * enchantment_level_fraction * armor.getDamageFactor(item_stack, owner);
                    }
                    total_protection += armor.getProtectionAfterDamageFactor(item_stack, owner) * enchantment_level_fraction;
                    continue;
                }
                Minecraft.setErrorMessage("getTotalProtectionOfEnchantments: don't know how to handle enchanted items that aren't armor");
            }
        }
        return total_protection;
    }

    @Override
    public String getNameSuffix() {
        return "protect." + this.getProtectionType();
    }

    @Override
    public boolean canApplyTogether(Enchantment par1Enchantment) {
        if (par1Enchantment instanceof EnchantmentProtection) {
            EnchantmentProtection var2 = (EnchantmentProtection)par1Enchantment;
            return var2 == this ? false : this == featherFalling || var2 == featherFalling;
        }
        return super.canApplyTogether(par1Enchantment);
    }

    public static int getFireTimeForEntity(Entity par0Entity, int par1) {
        int var2 = EnchantmentHelper.getMaxEnchantmentLevel(Enchantment.fireProtection.effectId, par0Entity.getLastActiveItems());
        if (var2 > 0) {
            par1 -= MathHelper.floor_float((float)par1 * (float)var2 * 0.15f);
        }
        return par1;
    }

    public static double func_92092_a(Entity par0Entity, double par1) {
        int var3 = EnchantmentHelper.getMaxEnchantmentLevel(Enchantment.blastProtection.effectId, par0Entity.getLastActiveItems());
        if (var3 > 0) {
            par1 -= (double)MathHelper.floor_double(par1 * (double)((float)var3 * 0.15f));
        }
        return par1;
    }

    @Override
    public boolean canEnchantItem(Item item) {
        if (!item.isArmor()) {
            return false;
        }
        ItemArmor armor = (ItemArmor)item;
        if (this == protection) {
            return item instanceof ItemArmor;
        }
        if (this == fireProtection) {
            return item instanceof ItemArmor;
        }
        if (this == featherFalling) {
            return item instanceof ItemBoots;
        }
        if (this == blastProtection) {
            return (item instanceof ItemCuirass || item instanceof ItemLeggings) && armor.isSolidMetal();
        }
        if (this == projectileProtection) {
            return (item instanceof ItemCuirass || item instanceof ItemLeggings) && armor.isSolidMetal();
        }
        Minecraft.setErrorMessage("canEnchantItem: no handler for " + this);
        return false;
    }

    @Override
    public boolean isOnCreativeTab(CreativeTabs creative_tab) {
        return creative_tab == CreativeTabs.tabCombat;
    }
}

