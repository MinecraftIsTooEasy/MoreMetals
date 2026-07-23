package com.moddedmite.mitemod.MoreMetals.blocks;

import com.moddedmite.mitemod.MoreMetals.creativetab.MMCreativeTab;
import net.minecraft.Block;
import net.minecraft.BlockAnvil;
import net.minecraft.Icon;
import net.minecraft.IconRegister;
import net.minecraft.Material;

import static com.moddedmite.mitemod.MoreMetals.MoreMetalsInit.ResourceDomain;

public class MMAnvil extends BlockAnvil {
    private Icon[] iconArray;
    private final String metalName;
    private static final String[] anvilIconNames = new String[]{"top_damaged_0", "top_damaged_1", "top_damaged_2"};

    public MMAnvil(int par1, Material metal_type, String metalName) {
        super(par1, metal_type);
        this.metalName = metalName;
        this.stepSound = Block.soundAnvilFootstep;
        this.setCreativeTab(MMCreativeTab.BLOCKS_TAB);
    }

    @Override
    public Icon getIcon(int par1, int par2) {
        if (this.field_82521_b == 3 && par1 == 1) {
            int var3 = (par2 >> 2) % this.iconArray.length;
            return this.iconArray[var3];
        } else {
            return this.blockIcon;
        }
    }

    @Override
    public void registerIcons(IconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(ResourceDomain + ":" + "anvil/" + this.metalName + "/base");
        this.iconArray = new Icon[anvilIconNames.length];
        for (int var2 = 0; var2 < this.iconArray.length; ++var2) {
            this.iconArray[var2] = par1IconRegister.registerIcon(ResourceDomain + ":" + "anvil/" + this.metalName + "/" + anvilIconNames[var2]);
        }
    }
}
