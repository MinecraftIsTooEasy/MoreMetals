package com.moddedmite.mitemod.MoreMetals.event.listener;


import moddedmite.rustedironcore.api.event.listener.IWorldLoadListener;
import moddedmite.rustedironcore.api.util.StringUtil;
import net.minecraft.Minecraft;
import net.minecraft.WorldClient;

public class WorldLoadListener implements IWorldLoadListener {
    @Override
    public void onWorldLoad(WorldClient world) {
        Minecraft client = Minecraft.getMinecraft();
        client.thePlayer.addChatMessage("【MoreMetals】如果你加载了itfrb(黄昏重生)模组请安装MoreMetalPieces模组以获得完整游戏体验");
    }
}
