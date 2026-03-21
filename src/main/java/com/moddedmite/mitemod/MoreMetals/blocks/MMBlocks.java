package com.moddedmite.mitemod.MoreMetals.blocks;

import com.moddedmite.mitemod.MoreMetals.creativetab.MMCreativeTab;
import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.minecraft.Block;
import net.minecraft.BlockConstants;
import net.minecraft.BlockOre;
import net.minecraft.Material;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;
import net.xiaoyu233.fml.reload.event.RecipeRegistryEvent;

import static com.moddedmite.mitemod.MoreMetals.MoreMetalsInit.NameSpace;
import static net.xiaoyu233.fml.reload.utils.IdUtil.getNextBlockID;

public class MMBlocks extends Block {
    protected MMBlocks(int par1, Material par2Material, BlockConstants constants) {
        super(par1, par2Material, constants);
    }

    public static final Block oreTin = (new BlockOre(getNextBlockID(), Materials.tin, 2)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block oreManganese = (new BlockOre(getNextBlockID(), Materials.manganese, 3)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block oreMidas_Gold = (new BlockOre(getNextBlockID(), Materials.midas_gold, 3)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockTin = (new BlockOreBlockExtend(getNextBlockID(), Materials.tin)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockManganese = (new BlockOreBlockExtend(getNextBlockID(), Materials.manganese)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockSteel = (new BlockOreBlockExtend(getNextBlockID(), Materials.steel)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockBronze = (new BlockOreBlockExtend(getNextBlockID(), Materials.bronze)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);
    public static final Block blockMidas_Gold = (new BlockOreBlockExtend(getNextBlockID(), Materials.midas_gold)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.MISC_TAB);



    //在这里注册影子物品
    public static void registerItemBlocks(ItemRegistryEvent registryEvent) {
        registryEvent.registerItemBlock(NameSpace,"moremetals:tin_ore","tin_ore",oreTin);
        registryEvent.registerItemBlock(NameSpace,"moremetals:manganese_ore","manganese_ore",oreManganese);
        registryEvent.registerItemBlock(NameSpace,"moremetals:midas_gold_ore","midas_gold_ore",oreMidas_Gold);
        registryEvent.registerItemBlock(NameSpace,"moremetals:tin_block","tin_block",blockTin);
        registryEvent.registerItemBlock(NameSpace,"moremetals:manganese_block","manganese_block",blockManganese);
        registryEvent.registerItemBlock(NameSpace,"moremetals:steel_block","steel_block",blockSteel);
        registryEvent.registerItemBlock(NameSpace,"moremetals:bronze_block","bronze_block",blockBronze);
        registryEvent.registerItemBlock(NameSpace,"moremetals:midas_gold_block","midas_gold_block",blockMidas_Gold);
    }


    //在这里注册影子物品合成配方
    public static void registerRecipes(RecipeRegistryEvent register) {

    }
}