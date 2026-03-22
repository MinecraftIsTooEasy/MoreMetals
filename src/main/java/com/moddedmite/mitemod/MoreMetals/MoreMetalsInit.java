package com.moddedmite.mitemod.MoreMetals;

import com.moddedmite.mitemod.MoreMetals.event.MMEventRIC;
import net.fabricmc.api.ModInitializer;
import net.xiaoyu233.fml.ModResourceManager;
import net.xiaoyu233.fml.reload.event.MITEEvents;

public class MoreMetalsInit implements ModInitializer {
    public static final String MOD_ID = "moremetals";
    public static final String NameSpace = "MoreMetals";
    public static final String NameSpaceCompactWithUnderScore = "MoreMetals_";
    public static final String ResourceDomain = "moremetals";
    public static final String resourceId = "moremetals:";

    @Override
    public void onInitialize() {
        MITEEvents.MITE_EVENT_BUS.register(new EventListen());
        MMEventRIC.register();
        ModResourceManager.addResourcePackDomain(MOD_ID);
        ModResourceManager.addResourcePackDomain(ResourceDomain);
    }
}
