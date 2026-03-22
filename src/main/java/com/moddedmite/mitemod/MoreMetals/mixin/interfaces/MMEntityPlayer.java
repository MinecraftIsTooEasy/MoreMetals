package com.moddedmite.mitemod.MoreMetals.mixin.interfaces;

import com.moddedmite.mitemod.MoreMetals.status.MiscManager;
import com.moddedmite.mitemod.MoreMetals.tileentity.SmithingTableTileEntity;
import net.minecraft.EntityPlayer;

public interface MMEntityPlayer {
    default MiscManager itf_GetMiscManager() {
        return null;
    }

    default void moremetals$displayGUISmithing(SmithingTableTileEntity tileEntity) {
    }

    static MMEntityPlayer cast(EntityPlayer player) {
        return (MMEntityPlayer) player;
    }
}
