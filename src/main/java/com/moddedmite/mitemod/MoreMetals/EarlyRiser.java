package com.moddedmite.mitemod.MoreMetals;

import com.moddedmite.mitemod.MoreMetals.material.EnumEquipmentMaterials;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class EarlyRiser implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
/*        MMConfig.getInstance().load();*/
        EnumEquipmentMaterials.register();
    }

}
