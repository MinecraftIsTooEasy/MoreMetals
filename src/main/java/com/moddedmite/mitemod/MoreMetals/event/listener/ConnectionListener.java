package com.moddedmite.mitemod.MoreMetals.event.listener;


import moddedmite.rustedironcore.api.event.listener.IConnectionListener;
import moddedmite.rustedironcore.api.util.FabricUtil;
import net.minecraft.ChatMessageComponent;
import net.minecraft.Minecraft;
import net.minecraft.NetClientHandler;
import net.minecraft.Packet1Login;

public class ConnectionListener implements IConnectionListener {
    @Override
    public void onClientLoggedIn(NetClientHandler clientHandler, Packet1Login login) {
        boolean hasMiteItfReborn = FabricUtil.isModLoaded("mite-itf-reborn");

        boolean hasMoreMetalPieces = FabricUtil.isModLoaded("more-metal-pieces");

        if (hasMiteItfReborn && !hasMoreMetalPieces) {
            Minecraft client = Minecraft.getMinecraft();
            client.thePlayer.addChatMessage(String.valueOf(ChatMessageComponent.createFromTranslationKey("moremetals.itf.reborn.warning")));
        }
    }
}