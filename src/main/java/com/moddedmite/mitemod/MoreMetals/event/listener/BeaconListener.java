package com.moddedmite.mitemod.MoreMetals.event.listener;

import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import moddedmite.rustedironcore.api.event.listener.IBeaconUpdateHandler;

import net.minecraft.Item;
import net.minecraft.ItemStack;
import net.minecraft.TileEntityBeacon;


public class BeaconListener implements IBeaconUpdateHandler {
    @Override
    public boolean onBlockValidModify(TileEntityBeacon tileEntityBeacon, int blockID, boolean original) {
        if (blockID == MMBlocks.blockBronze.blockID ||blockID == MMBlocks.blockSteel.blockID ||blockID == MMBlocks.blockTitaniumAlloy.blockID ||blockID == MMBlocks.blockRose_Gold.blockID ||blockID == MMBlocks.blockPlatinum.blockID ||blockID == MMBlocks.blockMidas_Gold.blockID ||blockID == MMBlocks.blockAdamantium.blockID) {
            return true;
        }
        return original;
    }

    @Override
    public boolean onItemValidModify(TileEntityBeacon tileEntityBeacon, ItemStack itemStack, boolean original) {
        Item item = itemStack.getItem();
        return original || item == MMItems.bronze_ingot || item == MMItems.steel_ingot || item == MMItems.titanium_alloy_ingot || item == MMItems.rose_gold_ingot || item == MMItems.platinum_ingot || item == MMItems.midas_gold_ingot || item == MMItems.adamantium_ingot;
    }
}
