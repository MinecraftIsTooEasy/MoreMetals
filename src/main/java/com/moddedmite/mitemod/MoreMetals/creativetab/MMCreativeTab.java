package com.moddedmite.mitemod.MoreMetals.creativetab;

import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import huix.glacier.api.extension.creativetab.GlacierCreativeTabs;

public class MMCreativeTab extends GlacierCreativeTabs {

    public static final MMCreativeTab MISC_TAB = new MMCreativeTab("Miscellaneous");
    public static final MMCreativeTab TOOLS_TAB = new MMCreativeTab("Tools");
    public static final MMCreativeTab COMBAT_TAB = new MMCreativeTab("Combat");
    public static final MMCreativeTab BLOCKS_TAB = new MMCreativeTab("Blocks");

    private final String tabName;

    public MMCreativeTab(String name) {
        super("MoreMetals" + name);
        this.tabName = name;
    }

    public int getTabIconItemIndex() {
        switch (tabName) {
            case "Tools":
                return MMItems.bronze_pickaxe.itemID;
            case "Combat":
                return MMItems.bronze_sword.itemID;
            case "Blocks":
                return MMBlocks.blockBronze.blockID;
            default: // Miscellaneous
                return MMItems.bronze_ingot.itemID;
        }
    }
}