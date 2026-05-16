package com.moddedmite.mitemod.MoreMetals.blocks;

import moddedmite.rustedironcore.api.util.FabricUtil;
import net.minecraft.*;

public class BlockOreBlockExtend extends Block {
    public BlockOreBlockExtend(int par1, Material material) {
        super(par1, material, new BlockConstants());
        modifyMinHarvestLevel(1);
        if (FabricUtil.isModLoaded("vanilla_stack")) setMaxStackSize(64);
        else setMaxStackSize(4);
        setHardnessRelativeToWood(BlockHardness.log);
    }
    public int dropBlockAsEntityItem(BlockBreakInfo info) {
        return super.dropBlockAsEntityItem(info);
    }
}
