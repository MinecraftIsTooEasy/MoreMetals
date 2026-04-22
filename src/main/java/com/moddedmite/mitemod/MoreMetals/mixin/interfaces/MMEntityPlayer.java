package com.moddedmite.mitemod.MoreMetals.mixin.interfaces;

import com.moddedmite.mitemod.MoreMetals.status.MiscManager;
import net.minecraft.EntityPlayer;

public interface MMEntityPlayer {
    MiscManager mm$getMiscManager();

    static MiscManager getMiscManager(EntityPlayer player) {
        return ((MMEntityPlayer) player).mm$getMiscManager();
    }
}
