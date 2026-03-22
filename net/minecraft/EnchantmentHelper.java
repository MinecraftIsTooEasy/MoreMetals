/*
 * Decompiled with CFR 0.2.1 (FabricMC 53fa44c9).
 */
package net.minecraft;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import net.minecraft.Enchantment;
import net.minecraft.EnchantmentData;
import net.minecraft.EntityLivingBase;
import net.minecraft.Item;
import net.minecraft.ItemStack;
import net.minecraft.Minecraft;
import net.minecraft.NBTTagCompound;
import net.minecraft.NBTTagList;
import net.minecraft.WeightedRandom;

public class EnchantmentHelper {
    private static final Random enchantmentRand = new Random();

    public static boolean hasEnchantment(ItemStack item_stack, Enchantment enchantment) {
        return EnchantmentHelper.getEnchantmentLevel(enchantment.effectId, item_stack) > 0;
    }

    public static int getEnchantmentLevel(int par0, ItemStack par1ItemStack) {
        if (par1ItemStack == null) {
            return 0;
        }
        NBTTagList var2 = par1ItemStack.getEnchantmentTagList();
        if (var2 == null) {
            return 0;
        }
        for (int var3 = 0; var3 < var2.tagCount(); ++var3) {
            short var4 = ((NBTTagCompound)var2.tagAt(var3)).getShort("id");
            short var5 = ((NBTTagCompound)var2.tagAt(var3)).getShort("lvl");
            if (var4 != par0) continue;
            return var5;
        }
        return 0;
    }

    public static int getEnchantmentLevel(Enchantment enchantment, ItemStack item_stack) {
        return EnchantmentHelper.getEnchantmentLevel(enchantment.effectId, item_stack);
    }

    public static float getEnchantmentLevelFraction(Enchantment enchantment, ItemStack item_stack) {
        if (!EnchantmentHelper.hasEnchantment(item_stack, enchantment)) {
            return 0.0f;
        }
        return enchantment.hasLevels() ? (float)EnchantmentHelper.getEnchantmentLevel(enchantment, item_stack) / (float)enchantment.getNumLevels() : 1.0f;
    }

    public static int getEnchantmentLevelFractionOfInteger(Enchantment enchantment, ItemStack item_stack, int integer) {
        if (!EnchantmentHelper.hasEnchantment(item_stack, enchantment)) {
            return 0;
        }
        return enchantment.hasLevels() ? Math.round((float)integer * EnchantmentHelper.getEnchantmentLevelFraction(enchantment, item_stack)) : integer;
    }

    public static int getEnchantmentLevels(Enchantment enchantment, ItemStack[] item_stacks) {
        int levels = 0;
        for (int i = 0; i < item_stacks.length; ++i) {
            levels += EnchantmentHelper.getEnchantmentLevel(enchantment, item_stacks[i]);
        }
        return levels;
    }

    public static Map getEnchantmentsMapFromTags(NBTTagList enchantment_tag_list) {
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
        if (enchantment_tag_list == null) {
            return map;
        }
        for (int i = 0; i < enchantment_tag_list.tagCount(); ++i) {
            NBTTagCompound tag = (NBTTagCompound)enchantment_tag_list.tagAt(i);
            map.put(Integer.valueOf(tag.getShort("id")), Integer.valueOf(tag.getShort("lvl")));
        }
        return map;
    }

    public static Map getEnchantmentsMap(ItemStack item_stack) {
        if (item_stack.getItem() == Item.enchantedBook) {
            Minecraft.setErrorMessage("getEnchantmentsMap: item is enchanted book, wrong func?");
        }
        return EnchantmentHelper.getEnchantmentsMapFromTags(item_stack.getEnchantmentTagList());
    }

    public static Map getStoredEnchantmentsMap(ItemStack item_stack) {
        if (item_stack.getItem() != Item.enchantedBook) {
            Minecraft.setErrorMessage("getStoredEnchantmentsMap: item is not enchanted book, wrong func?");
        }
        return EnchantmentHelper.getEnchantmentsMapFromTags(item_stack.getStoredEnchantmentTagList());
    }

    public static void setEnchantments(Map par0Map, ItemStack par1ItemStack) {
        NBTTagList var2 = new NBTTagList();
        Iterator var3 = par0Map.keySet().iterator();
        while (var3.hasNext()) {
            int var4 = (Integer)var3.next();
            NBTTagCompound var5 = new NBTTagCompound();
            var5.setShort("id", (short)var4);
            var5.setShort("lvl", (short)((Integer)par0Map.get(var4)).intValue());
            var2.appendTag(var5);
            if (par1ItemStack.itemID != Item.enchantedBook.itemID) continue;
            Item.enchantedBook.addEnchantment(par1ItemStack, new EnchantmentData(var4, (int)((Integer)par0Map.get(var4))));
        }
        if (var2.tagCount() > 0) {
            if (par1ItemStack.itemID != Item.enchantedBook.itemID) {
                par1ItemStack.setTagInfo("ench", var2);
            }
        } else if (par1ItemStack.hasTagCompound()) {
            par1ItemStack.getTagCompound().removeTag("ench");
        }
    }

    public static boolean hasValidEnchantmentForItem(NBTTagList enchantments, Item item) {
        for (int i = 0; i < enchantments.tagCount(); ++i) {
            NBTTagCompound tag = (NBTTagCompound)enchantments.tagAt(i);
            short id = tag.getShort("id");
            Enchantment enchantment = Enchantment.enchantmentsList[id];
            if (!enchantment.canEnchantItem(item)) continue;
            return true;
        }
        return false;
    }

    public static int getMaxEnchantmentLevel(int par0, ItemStack[] par1ArrayOfItemStack) {
        if (par1ArrayOfItemStack == null) {
            return 0;
        }
        int var2 = 0;
        ItemStack[] var3 = par1ArrayOfItemStack;
        int var4 = par1ArrayOfItemStack.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            ItemStack var6 = var3[var5];
            int var7 = EnchantmentHelper.getEnchantmentLevel(par0, var6);
            if (var7 <= var2) continue;
            var2 = var7;
        }
        return var2;
    }

    public static int getKnockbackModifier(EntityLivingBase par0EntityLivingBase, EntityLivingBase par1EntityLivingBase) {
        return EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, par0EntityLivingBase.getHeldItemStack());
    }

    public static int getFireAspectModifier(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, par0EntityLivingBase.getHeldItemStack());
    }

    public static int getRespiration(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getMaxEnchantmentLevel(Enchantment.respiration.effectId, par0EntityLivingBase.getLastActiveItems());
    }

    public static int getEfficiencyModifier(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getEnchantmentLevel(Enchantment.efficiency.effectId, par0EntityLivingBase.getHeldItemStack());
    }

    public static boolean getSilkTouchModifier(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getEnchantmentLevel(Enchantment.silkTouch.effectId, par0EntityLivingBase.getHeldItemStack()) > 0;
    }

    public static int getFortuneModifier(EntityLivingBase par0EntityLivingBase) {
        if (par0EntityLivingBase == null) {
            return 0;
        }
        return EnchantmentHelper.getEnchantmentLevel(Enchantment.fortune.effectId, par0EntityLivingBase.getHeldItemStack());
    }

    public static int getLootingModifier(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getEnchantmentLevel(Enchantment.looting.effectId, par0EntityLivingBase.getHeldItemStack());
    }

    public static boolean getAquaAffinityModifier(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getMaxEnchantmentLevel(Enchantment.aquaAffinity.effectId, par0EntityLivingBase.getLastActiveItems()) > 0;
    }

    public static int func_92098_i(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getMaxEnchantmentLevel(Enchantment.thorns.effectId, par0EntityLivingBase.getLastActiveItems());
    }

    public static ItemStack func_92099_a(Enchantment par0Enchantment, EntityLivingBase par1EntityLivingBase) {
        for (ItemStack var5 : par1EntityLivingBase.getLastActiveItems()) {
            if (var5 == null || EnchantmentHelper.getEnchantmentLevel(par0Enchantment.effectId, var5) <= 0) continue;
            return var5;
        }
        return null;
    }

    public static ItemStack addRandomEnchantment(Random par0Random, ItemStack par1ItemStack, int enchantment_levels) {
        boolean var4;
        if ((enchantment_levels = EnchantmentHelper.getEnchantmentLevelsAlteredByItemEnchantability(enchantment_levels, par1ItemStack.getItem())) < 1) {
            return par1ItemStack;
        }
        List var3 = EnchantmentHelper.buildEnchantmentList(par0Random, par1ItemStack, enchantment_levels);
        boolean bl = var4 = par1ItemStack.itemID == Item.book.itemID;
        if (var4) {
            par1ItemStack.itemID = Item.enchantedBook.itemID;
        }
        if (var3 != null) {
            for (EnchantmentData var6 : var3) {
                if (var4) {
                    Item.enchantedBook.addEnchantment(par1ItemStack, var6);
                    continue;
                }
                par1ItemStack.addEnchantment(var6.enchantmentobj, var6.enchantmentLevel);
            }
        }
        return par1ItemStack;
    }

    public static int getEnchantmentLevelsAlteredByItemEnchantability(int enchantment_levels, Item item) {
        int item_enchantability = item.getItemEnchantability();
        if (item_enchantability < 1) {
            return 0;
        }
        if (enchantment_levels <= item_enchantability) {
            return enchantment_levels;
        }
        float enchantment_levels_float = item_enchantability;
        for (int i = item_enchantability + 1; i <= enchantment_levels; ++i) {
            if (i <= item_enchantability * 2) {
                enchantment_levels_float += 0.5f;
                continue;
            }
            if (i > item_enchantability * 3) break;
            enchantment_levels_float += 0.25f;
        }
        return Math.round(enchantment_levels_float);
    }

    private static void removeEnchantmentsFromMapThatConflict(Map map, ArrayList enchantments) {
        for (int i = 0; i < enchantments.size(); ++i) {
            EnchantmentData enchantment_data = (EnchantmentData)enchantments.get(i);
            Enchantment enchantment = enchantment_data.enchantmentobj;
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                int id = (Integer)iterator.next();
                if (enchantment.canApplyTogether(Enchantment.get(id))) continue;
                iterator.remove();
            }
        }
    }

    public static List buildEnchantmentList(Random random, ItemStack item_stack, int enchantment_levels) {
        Map all_possible_enchantments;
        Item item = item_stack.getItem();
        int enchantability = item.getItemEnchantability();
        if (enchantability <= 0) {
            return null;
        }
        float randomness = 1.0f + (random.nextFloat() - 0.5f) * 0.5f;
        int adjusted_enchantment_levels = (int)((float)enchantment_levels * randomness);
        if (adjusted_enchantment_levels < 1) {
            adjusted_enchantment_levels = 1;
        }
        ArrayList<EnchantmentData> enchantments_for_item = new ArrayList<EnchantmentData>();
        while (adjusted_enchantment_levels > 0 && (all_possible_enchantments = EnchantmentHelper.mapEnchantmentData(adjusted_enchantment_levels, item_stack)) != null) {
            EnchantmentData enchantment_data;
            EnchantmentHelper.removeEnchantmentsFromMapThatConflict(all_possible_enchantments, enchantments_for_item);
            if (all_possible_enchantments.isEmpty() || (enchantment_data = (EnchantmentData)WeightedRandom.getRandomItem(random, all_possible_enchantments.values())) == null) break;
            Enchantment enchantment = enchantment_data.enchantmentobj;
            if (enchantments_for_item.size() < 2 && all_possible_enchantments.size() > 1 && enchantment.hasLevels() && random.nextInt(2) == 0) {
                enchantment_data.enchantmentLevel = random.nextInt(enchantment_data.enchantmentLevel) + 1;
            }
            enchantments_for_item.add(enchantment_data);
            adjusted_enchantment_levels -= enchantment.hasLevels() ? enchantment.getMinEnchantmentLevelsCost(enchantment_data.enchantmentLevel) : enchantment.getMinEnchantmentLevelsCost();
            if ((adjusted_enchantment_levels -= 5) >= 5 && enchantments_for_item.size() <= 2) continue;
            break;
        }
        ArrayList<EnchantmentData> enchantments_for_item_shuffled = new ArrayList<EnchantmentData>();
        int n = enchantments_for_item.size();
        while (n > 0) {
            int index = random.nextInt(enchantments_for_item.size());
            EnchantmentData enchantment_data = (EnchantmentData)enchantments_for_item.get(index);
            if (enchantment_data == null) continue;
            enchantments_for_item_shuffled.add(enchantment_data);
            enchantments_for_item.set(index, null);
            --n;
        }
        return enchantments_for_item_shuffled.size() == 0 ? null : enchantments_for_item_shuffled;
    }

    private static Map mapEnchantmentData(int enchantment_levels, ItemStack item_stack) {
        Item item = item_stack.getItem();
        boolean is_book = item == Item.book;
        HashMap<Integer, EnchantmentData> map = new HashMap<Integer, EnchantmentData>();
        block0: for (int i = 0; i < Enchantment.enchantmentsList.length; ++i) {
            Enchantment enchantment = Enchantment.get(i);
            if (enchantment == null || !is_book && !enchantment.canEnchantItem(item)) continue;
            if (enchantment.hasLevels()) {
                for (int level = enchantment.getNumLevels(); level > 0; --level) {
                    if (enchantment.getMinEnchantmentLevelsCost(level) > enchantment_levels) continue;
                    map.put(enchantment.effectId, new EnchantmentData(enchantment, level));
                    continue block0;
                }
                continue;
            }
            if (enchantment.getMinEnchantmentLevelsCost() > enchantment_levels) continue;
            map.put(enchantment.effectId, new EnchantmentData(enchantment, 1));
        }
        return map.size() == 0 ? null : map;
    }

    public static int getStunModifier(EntityLivingBase par0EntityLivingBase, EntityLivingBase par1EntityLivingBase) {
        return EnchantmentHelper.getEnchantmentLevel(Enchantment.stun.effectId, par0EntityLivingBase.getHeldItemStack());
    }

    public static int getFishingFortuneModifier(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getEnchantmentLevel(Enchantment.fishing_fortune.effectId, par0EntityLivingBase.getHeldItemStack());
    }

    public static int getFertilityModifier(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getEnchantmentLevel(Enchantment.fertility.effectId, par0EntityLivingBase.getHeldItemStack());
    }

    public static int getTreeFellingModifier(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getEnchantmentLevel(Enchantment.tree_felling.effectId, par0EntityLivingBase.getHeldItemStack());
    }

    public static int getVampiricTransfer(EntityLivingBase par0EntityLivingBase, EntityLivingBase par1EntityLivingBase, float inflicted_damage) {
        if (inflicted_damage <= 0.0f || par1EntityLivingBase == null || !par1EntityLivingBase.isEntityBiologicallyAlive()) {
            return 0;
        }
        int potential_effect = EnchantmentHelper.getEnchantmentLevel(Enchantment.vampiric.effectId, par0EntityLivingBase.getHeldItemStack());
        if (Math.random() * 10.0 > (double)potential_effect) {
            return 0;
        }
        int transfer = (int)((double)(inflicted_damage * 0.5f) * Math.random());
        if (transfer < 1) {
            transfer = 1;
        }
        return transfer;
    }

    public static float getSpeedModifier(EntityLivingBase par0EntityLivingBase) {
        return 1.0f + (float)EnchantmentHelper.getMaxEnchantmentLevel(Enchantment.speed.effectId, par0EntityLivingBase.getLastActiveItems()) * 0.05f;
    }

    public static float getRegenerationModifier(EntityLivingBase par0EntityLivingBase) {
        return 1.0f + (float)EnchantmentHelper.getMaxEnchantmentLevel(Enchantment.regeneration.effectId, par0EntityLivingBase.getLastActiveItems()) * 0.5f;
    }

    public static int getFreeActionModifier(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getMaxEnchantmentLevel(Enchantment.free_action.effectId, par0EntityLivingBase.getLastActiveItems());
    }

    public static int getButcheringModifier(EntityLivingBase par0EntityLivingBase) {
        return EnchantmentHelper.getEnchantmentLevel(Enchantment.butchering.effectId, par0EntityLivingBase.getHeldItemStack());
    }

    public static float getEnduranceModifier(EntityLivingBase par0EntityLivingBase) {
        return 1.0f - (float)EnchantmentHelper.getMaxEnchantmentLevel(Enchantment.endurance.effectId, par0EntityLivingBase.getLastActiveItems()) * 0.2f;
    }
}

