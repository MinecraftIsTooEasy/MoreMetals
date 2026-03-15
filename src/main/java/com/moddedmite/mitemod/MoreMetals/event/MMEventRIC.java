package com.moddedmite.mitemod.MoreMetals.event;

import com.moddedmite.mitemod.MoreMetals.event.listener.ArmorModelListener;
import moddedmite.rustedironcore.api.event.Handlers;

public class MMEventRIC extends Handlers {
    public static void register() {

        ArmorModel.register(new ArmorModelListener());
        OreGeneration.register(new OreGenerationRegistry());
    }
}