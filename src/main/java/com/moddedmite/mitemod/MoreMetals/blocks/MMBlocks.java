package com.moddedmite.mitemod.MoreMetals.blocks;

import com.moddedmite.mitemod.MoreMetals.MoreMetalsInit;
import com.moddedmite.mitemod.MoreMetals.creativetab.MMCreativeTab;
import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import com.moddedmite.mitemod.MoreMetals.material.Materials;
import moddedmite.rustedironcore.api.block.DoorBlock;
import moddedmite.rustedironcore.api.block.PaneBlock;
import moddedmite.rustedironcore.api.event.events.CraftingRecipeRegisterEvent;
import net.minecraft.Block;
import net.minecraft.BlockAnvil;
import net.minecraft.BlockConstants;
import net.minecraft.BlockOre;
import net.minecraft.Item;
import net.minecraft.ItemStack;
import net.minecraft.Material;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;

import static com.moddedmite.mitemod.MoreMetals.MoreMetalsInit.NameSpace;
import static net.xiaoyu233.fml.reload.utils.IdUtil.getNextBlockID;

public class MMBlocks extends Block {
    public static final Block oreTin = (new BlockOre(getNextBlockID(), Materials.tin, 2)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block oreManganese = (new BlockOre(getNextBlockID(), Materials.manganese, 3)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block oreMidas_Gold = (new BlockOre(getNextBlockID(), Materials.midas_gold, 4)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block orePlatinum = (new BlockOre(getNextBlockID(), Materials.platinum, 3)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block oreAdamantium = (new BlockOre(getNextBlockID(), Materials.adamantium_mm, 4)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block oreAluminium = (new BlockOre(getNextBlockID(), Materials.aluminium, 3)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block oreTitanium = (new BlockOre(getNextBlockID(), Materials.titanium, 4)).setHardness(3.0F).setStepSound(Block.soundStoneFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block blockTin = (new BlockOreBlockExtend(getNextBlockID(), Materials.tin)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block blockManganese = (new BlockOreBlockExtend(getNextBlockID(), Materials.manganese)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block blockSteel = (new BlockOreBlockExtend(getNextBlockID(), Materials.steel)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block blockBronze = (new BlockOreBlockExtend(getNextBlockID(), Materials.bronze)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block blockMidas_Gold = (new BlockOreBlockExtend(getNextBlockID(), Materials.midas_gold)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block blockRose_Gold = (new BlockOreBlockExtend(getNextBlockID(), Materials.rose_gold)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block blockPlatinum = (new BlockOreBlockExtend(getNextBlockID(), Materials.platinum)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block blockAdamantium = (new BlockOreBlockExtend(getNextBlockID(), Materials.adamantium_mm)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block blockAluminium = (new BlockOreBlockExtend(getNextBlockID(), Materials.aluminium)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block blockTitanium = (new BlockOreBlockExtend(getNextBlockID(), Materials.titanium)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block blockTitaniumAlloy = (new BlockOreBlockExtend(getNextBlockID(), Materials.titanium_alloy)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);

    // ==================== 栅栏 (Fences) ====================
    public static final Block fence_bronze = (new PaneBlock(getNextBlockID(), MoreMetalsInit.resourceId + "bars/bronze_bars", MoreMetalsInit.resourceId + "bars/bronze_bars", Materials.bronze, false)).setStepSound(Block.soundMetalFootstep).setHardness(3.2F).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block fence_steel = (new PaneBlock(getNextBlockID(), MoreMetalsInit.resourceId + "bars/steel_bars", MoreMetalsInit.resourceId + "bars/steel_bars", Materials.steel, false)).setStepSound(Block.soundMetalFootstep).setHardness(5.0F).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block fence_midas_gold = (new PaneBlock(getNextBlockID(), MoreMetalsInit.resourceId + "bars/midas_gold_bars", MoreMetalsInit.resourceId + "bars/midas_gold_bars", Materials.midas_gold, false)).setStepSound(Block.soundMetalFootstep).setHardness(5.0F).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block fence_rose_gold = (new PaneBlock(getNextBlockID(), MoreMetalsInit.resourceId + "bars/rose_gold_bars", MoreMetalsInit.resourceId + "bars/rose_gold_bars", Materials.rose_gold, false)).setStepSound(Block.soundMetalFootstep).setHardness(3.2F).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block fence_platinum = (new PaneBlock(getNextBlockID(), MoreMetalsInit.resourceId + "bars/platinum_bars", MoreMetalsInit.resourceId + "bars/platinum_bars", Materials.platinum, false)).setStepSound(Block.soundMetalFootstep).setHardness(5.0F).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block fence_adamantium = (new PaneBlock(getNextBlockID(), MoreMetalsInit.resourceId + "bars/adamantium_bars", MoreMetalsInit.resourceId + "bars/adamantium_bars", Materials.adamantium_mm, false)).setStepSound(Block.soundMetalFootstep).setHardness(15.0F).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final Block fence_titanium_alloy = (new PaneBlock(getNextBlockID(), MoreMetalsInit.resourceId + "bars/titanium_alloy_bars", MoreMetalsInit.resourceId + "bars/titanium_alloy_bars", Materials.titanium_alloy, false)).setStepSound(Block.soundMetalFootstep).setHardness(10.0F).setCreativeTab(MMCreativeTab.BLOCKS_TAB);

    // ==================== 砧 (Anvils) ====================
    public static final BlockAnvil anvil_bronze = new MMAnvil(getNextBlockID(), Materials.bronze, "bronze");
    public static final BlockAnvil anvil_steel = new MMAnvil(getNextBlockID(), Materials.steel, "steel");
    public static final BlockAnvil anvil_midas_gold = new MMAnvil(getNextBlockID(), Materials.midas_gold, "midas_gold");
    public static final BlockAnvil anvil_rose_gold = new MMAnvil(getNextBlockID(), Materials.rose_gold, "rose_gold");
    public static final BlockAnvil anvil_platinum = new MMAnvil(getNextBlockID(), Materials.platinum, "platinum");
    public static final BlockAnvil anvil_adamantium = new MMAnvil(getNextBlockID(), Materials.adamantium_mm, "adamantium");
    public static final BlockAnvil anvil_titanium_alloy = new MMAnvil(getNextBlockID(), Materials.titanium_alloy, "titanium_alloy");

    // ==================== 门方块 (Door Blocks) ====================
    public static final DoorBlock door_bronze = (DoorBlock) (new DoorBlock(getNextBlockID(), Materials.bronze, () -> MMItems.door_bronze)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final DoorBlock door_steel = (DoorBlock) (new DoorBlock(getNextBlockID(), Materials.steel, () -> MMItems.door_steel)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final DoorBlock door_midas_gold = (DoorBlock) (new DoorBlock(getNextBlockID(), Materials.midas_gold, () -> MMItems.door_midas_gold)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final DoorBlock door_rose_gold = (DoorBlock) (new DoorBlock(getNextBlockID(), Materials.rose_gold, () -> MMItems.door_rose_gold)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final DoorBlock door_platinum = (DoorBlock) (new DoorBlock(getNextBlockID(), Materials.platinum, () -> MMItems.door_platinum)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final DoorBlock door_adamantium = (DoorBlock) (new DoorBlock(getNextBlockID(), Materials.adamantium_mm, () -> MMItems.door_adamantium)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    public static final DoorBlock door_titanium_alloy = (DoorBlock) (new DoorBlock(getNextBlockID(), Materials.titanium_alloy, () -> MMItems.door_titanium_alloy)).setStepSound(Block.soundMetalFootstep).setCreativeTab(MMCreativeTab.BLOCKS_TAB);

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
        // 栅栏
        registryEvent.registerItemBlock(NameSpace, "moremetals:bronze_bars", "bronze_bars", fence_bronze);
        registryEvent.registerItemBlock(NameSpace, "moremetals:steel_bars", "steel_bars", fence_steel);
        registryEvent.registerItemBlock(NameSpace, "moremetals:midas_gold_bars", "midas_gold_bars", fence_midas_gold);
        registryEvent.registerItemBlock(NameSpace, "moremetals:rose_gold_bars", "rose_gold_bars", fence_rose_gold);
        registryEvent.registerItemBlock(NameSpace, "moremetals:platinum_bars", "platinum_bars", fence_platinum);
        registryEvent.registerItemBlock(NameSpace, "moremetals:adamantium_bars", "adamantium_bars", fence_adamantium);
        registryEvent.registerItemBlock(NameSpace, "moremetals:titanium_alloy_bars", "titanium_alloy_bars", fence_titanium_alloy);
        // 砧
        registryEvent.registerItemBlock(NameSpace, "moremetals:anvil_bronze", "anvil_bronze", anvil_bronze);
        registryEvent.registerItemBlock(NameSpace, "moremetals:anvil_steel", "anvil_steel", anvil_steel);
        registryEvent.registerItemBlock(NameSpace, "moremetals:anvil_midas_gold", "anvil_midas_gold", anvil_midas_gold);
        registryEvent.registerItemBlock(NameSpace, "moremetals:anvil_rose_gold", "anvil_rose_gold", anvil_rose_gold);
        registryEvent.registerItemBlock(NameSpace, "moremetals:anvil_platinum", "anvil_platinum", anvil_platinum);
        registryEvent.registerItemBlock(NameSpace, "moremetals:anvil_adamantium", "anvil_adamantium", anvil_adamantium);
        registryEvent.registerItemBlock(NameSpace, "moremetals:anvil_titanium_alloy", "anvil_titanium_alloy", anvil_titanium_alloy);
        // 门
        registryEvent.registerItemBlock(NameSpace, "moremetals:door/door_bronze", "door_bronze", door_bronze);
        registryEvent.registerItemBlock(NameSpace, "moremetals:door/door_steel", "door_steel", door_steel);
        registryEvent.registerItemBlock(NameSpace, "moremetals:door/door_midas_gold", "door_midas_gold", door_midas_gold);
        registryEvent.registerItemBlock(NameSpace, "moremetals:door/door_rose_gold", "door_rose_gold", door_rose_gold);
        registryEvent.registerItemBlock(NameSpace, "moremetals:door/door_platinum", "door_platinum", door_platinum);
        registryEvent.registerItemBlock(NameSpace, "moremetals:door/door_adamantium", "door_adamantium", door_adamantium);
        registryEvent.registerItemBlock(NameSpace, "moremetals:door/door_titanium_alloy", "door_titanium_alloy", door_titanium_alloy);
    }
}