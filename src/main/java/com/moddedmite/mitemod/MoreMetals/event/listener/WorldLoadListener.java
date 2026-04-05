package com.moddedmite.mitemod.MoreMetals.event.listener;


import moddedmite.rustedironcore.api.event.listener.IWorldLoadListener;
import moddedmite.rustedironcore.api.util.FabricUtil;
import net.minecraft.ChatMessageComponent;
import net.minecraft.Minecraft;
import net.minecraft.WorldClient;

public class WorldLoadListener implements IWorldLoadListener {
    @Override
    public void onWorldLoad(WorldClient world) {
        boolean hasMiteItfReborn = FabricUtil.isModLoaded("mite-itf-reborn");

        boolean hasMoreMetalPieces = FabricUtil.isModLoaded("more-metal-pieces");

        if (hasMiteItfReborn && !hasMoreMetalPieces) {
            Minecraft client = Minecraft.getMinecraft();
            client.thePlayer.addChatMessage(String.valueOf(ChatMessageComponent.createFromTranslationKey("moremetals.itf.reborn.warning")));
        }
    }
}