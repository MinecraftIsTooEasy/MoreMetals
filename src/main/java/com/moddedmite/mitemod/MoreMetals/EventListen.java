package com.moddedmite.mitemod.MoreMetals;

import com.google.common.eventbus.Subscribe;
import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import com.moddedmite.mitemod.MoreMetals.items.register.ItemTextureRegister;
import net.xiaoyu233.fml.reload.event.ItemRegistryEvent;
import net.xiaoyu233.fml.reload.event.PlayerLoggedInEvent;
import net.xiaoyu233.fml.reload.event.SoundsRegisterEvent;
import net.xiaoyu233.fml.reload.event.TileEntityRendererRegisterEvent;

public class EventListen {
    @Subscribe
    public void onItemRegister(ItemRegistryEvent event) {
        ItemTextureRegister.registerItems(event);
        MMBlocks.registerItemBlocks(event);
    }

    @Subscribe
    public void onPlayerLoggedIn(PlayerLoggedInEvent event) {
    }

    @Subscribe
    public void onTileEntityRendererRegister(TileEntityRendererRegisterEvent event) {
    }

    @Subscribe
    public void onSoundsRegister(SoundsRegisterEvent event) {
    }
}
