package com.moddedmite.mitemod.MoreMetals.event.listener;

import com.moddedmite.mitemod.MoreMetals.items.MMItems;
import moddedmite.rustedironcore.api.event.listener.ILootTableRegisterListener;
import net.minecraft.ItemStack;
import net.minecraft.WeightedRandomChestContent;

import java.util.List;

public class LootTableListener implements ILootTableRegisterListener {

    @Override
    public void onFortressRegister(List<WeightedRandomChestContent> original) {

        original.add(new WeightedRandomChestContent(
                new ItemStack(MMItems.netherite_upgrade_smithing_template, 1),
                1,
                1,
                3
        ));

    }
}
