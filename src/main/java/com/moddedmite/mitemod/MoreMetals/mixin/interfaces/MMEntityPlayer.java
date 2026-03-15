package com.moddedmite.mitemod.MoreMetals.mixin.interfaces;

import com.moddedmite.mitemod.MoreMetals.status.MiscManager;
import net.minecraft.EntityPlayer;

public interface MMEntityPlayer {

    MiscManager itf_GetMiscManager();

    static MMEntityPlayer cast(EntityPlayer player) {
        return (MMEntityPlayer) player;
    }
}