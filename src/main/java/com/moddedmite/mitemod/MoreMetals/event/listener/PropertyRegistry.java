package com.moddedmite.mitemod.MoreMetals.event.listener;

import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import moddedmite.rustedironcore.property.ItemProperties;
import net.minecraft.Item;

public class PropertyRegistry implements Runnable {
    @Override
    public void run() {
        ItemProperties.HeatLevelRequired.register(Item.getItem(MMBlocks.oreTin), 2);
        ItemProperties.HeatLevelRequired.register(Item.getItem(MMBlocks.oreMidas_Gold), 4);
        ItemProperties.HeatLevelRequired.register(Item.getItem(MMBlocks.orePlatinum), 3);
        ItemProperties.HeatLevelRequired.register(Item.getItem(MMBlocks.oreAdamantium), 4);
        ItemProperties.HeatLevelRequired.register(Item.getItem(MMBlocks.oreAluminium), 2);
        ItemProperties.HeatLevelRequired.register(Item.getItem(MMBlocks.oreTitanium), 4);
        ItemProperties.HeatLevelRequired.register(Item.getItem(MMBlocks.oreManganese), 2);
    }
}