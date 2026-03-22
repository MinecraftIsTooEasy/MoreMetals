package com.moddedmite.mitemod.MoreMetals.blocks;

import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.minecraft.Block;
import net.minecraft.BlockOre;
import net.minecraft.Icon;
import net.minecraft.IconRegister;
import net.xiaoyu233.fml.reload.utils.IdUtil;

public class AncientDebrisBlock extends BlockOre {

    private Icon side_icon;

    private Icon top_icon;

    @Override
    public net.minecraft.Icon getIcon(int side, int metadata) {
        return (net.minecraft.Icon) switch (side) {
            //top
            case 1 -> top_icon;
            //Side
            case 0, 2, 3, 5, 4 -> side_icon;
            default -> super.getIcon(side, metadata);
        };
    }


    public AncientDebrisBlock(int nextBlockID) {
        super(IdUtil.getNextBlockID(), Materials.netherite, 4);
        this.setHardness(6.0F);
        this.setResistance(3.0F);
        this.setStepSound(Block.soundStoneFootstep);
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister) {
        this.side_icon = par1IconRegister.registerIcon("moremetals:ancient_debris_side");
        this.top_icon = par1IconRegister.registerIcon("moremetals:ancient_debris_top");
    }
}