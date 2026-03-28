package com.moddedmite.mitemod.MoreMetals.blocks;

import com.moddedmite.mitemod.MoreMetals.creativetab.MMCreativeTab;
import com.moddedmite.mitemod.MoreMetals.material.Materials;
import moddedmite.rustedironcore.api.event.events.CraftingRecipeRegisterEvent;
import net.minecraft.Block;
import net.minecraft.BlockConstants;
import net.minecraft.BlockOre;
import net.minecraft.Item;
import net.minecraft.ItemStack;
import net.minecraft.Material;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;

import static com.moddedmite.mitemod.MoreMetals.MoreMetalsInit.NameSpace;
import static net.xiaoyu233.fml.reload.utils.IdUtil.getNextBlockID;

public class MMBlocks extends Block {
    public static final Block oreTin = (new BlockOre(getNextBlockID(), Materials.tin, 2)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block oreManganese = (new BlockOre(getNextBlockID(), Materials.manganese, 3)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block oreMidas_Gold = (new BlockOre(getNextBlockID(), Materials.midas_gold, 3)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block orePlatinum = (new BlockOre(getNextBlockID(), Materials.platinum, 4)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block oreAdamantium = (new BlockOre(getNextBlockID(), Materials.adamantium_mm, 5)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block oreAluminium = (new BlockOre(getNextBlockID(), Materials.aluminium, 2)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block oreTitanium = (new BlockOre(getNextBlockID(), Materials.titanium, 4)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockTin = (new BlockOreBlockExtend(getNextBlockID(), Materials.tin)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockManganese = (new BlockOreBlockExtend(getNextBlockID(), Materials.manganese)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockSteel = (new BlockOreBlockExtend(getNextBlockID(), Materials.steel)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockBronze = (new BlockOreBlockExtend(getNextBlockID(), Materials.bronze)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockMidas_Gold = (new BlockOreBlockExtend(getNextBlockID(), Materials.midas_gold)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockRose_Gold = (new BlockOreBlockExtend(getNextBlockID(), Materials.rose_gold)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockPlatinum = (new BlockOreBlockExtend(getNextBlockID(), Materials.platinum)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockAdamantium = (new BlockOreBlockExtend(getNextBlockID(), Materials.adamantium_mm)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockAluminium = (new BlockOreBlockExtend(getNextBlockID(), Materials.aluminium)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockTitanium = (new BlockOreBlockExtend(getNextBlockID(), Materials.titanium)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockTitaniumAlloy = (new BlockOreBlockExtend(getNextBlockID(), Materials.titanium_alloy)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);

    protected MMBlocks(int par1, Material par2Material, BlockConstants constants) {
        super(par1, par2Material, constants);
    }

    public static void registerItemBlocks(ItemRegistryEvent registryEvent) {
        registryEvent.registerItemBlock(NameSpace, "moremetals:tin_ore", "tin_ore", oreTin);
        registryEvent.registerItemBlock(NameSpace, "moremetals:manganese_ore", "manganese_ore", oreManganese);
        registryEvent.registerItemBlock(NameSpace, "moremetals:midas_gold_ore", "midas_gold_ore", oreMidas_Gold);
        registryEvent.registerItemBlock(NameSpace, "moremetals:platinum_ore", "platinum_ore", orePlatinum);
        registryEvent.registerItemBlock(NameSpace, "moremetals:adamantium_ore", "adamantium_ore", oreAdamantium);
        registryEvent.registerItemBlock(NameSpace, "moremetals:aluminium_ore", "aluminium_ore", oreAluminium);
        registryEvent.registerItemBlock(NameSpace, "moremetals:titanium_ore", "titanium_ore", oreTitanium);
        registryEvent.registerItemBlock(NameSpace, "moremetals:tin_block", "tin_block", blockTin);
        registryEvent.registerItemBlock(NameSpace, "moremetals:manganese_block", "manganese_block", blockManganese);
        registryEvent.registerItemBlock(NameSpace, "moremetals:steel_block", "steel_block", blockSteel);
        registryEvent.registerItemBlock(NameSpace, "moremetals:bronze_block", "bronze_block", blockBronze);
        registryEvent.registerItemBlock(NameSpace, "moremetals:midas_gold_block", "midas_gold_block", blockMidas_Gold);
        registryEvent.registerItemBlock(NameSpace, "moremetals:rose_gold_block", "rose_gold_block", blockRose_Gold);
        registryEvent.registerItemBlock(NameSpace, "moremetals:platinum_block", "platinum_block", blockPlatinum);
        registryEvent.registerItemBlock(NameSpace, "moremetals:adamantium_block", "adamantium_block", blockAdamantium);
        registryEvent.registerItemBlock(NameSpace, "moremetals:aluminium_block", "aluminium_block", blockAluminium);
        registryEvent.registerItemBlock(NameSpace, "moremetals:titanium_block", "titanium_block", blockTitanium);
        registryEvent.registerItemBlock(NameSpace, "moremetals:titanium_alloy_block", "titanium_alloy_block", blockTitaniumAlloy);
    }
}
