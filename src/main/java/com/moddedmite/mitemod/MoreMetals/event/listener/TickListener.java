package com.moddedmite.mitemod.MoreMetals.event.listener;

import com.moddedmite.mitemod.MoreMetals.mixin.interfaces.MMEntityPlayer;
import com.moddedmite.mitemod.MoreMetals.status.MiscManager;
import moddedmite.rustedironcore.api.event.listener.ITickListener;
import net.minecraft.EntityPlayer;
import net.minecraft.Potion;
import net.minecraft.PotionEffect;

public class TickListener implements ITickListener {
    @Override
    public void onEntityPlayerTick(EntityPlayer player) {
        if (player.onServer()) {
            MiscManager miscManager = MMEntityPlayer.getMiscManager(player);

            boolean hasFullMidasGoldArmor = miscManager.hasFullMidasGoldArmor();
            boolean hasFullRoseGoldArmor = miscManager.hasFullRoseGoldArmor();
            boolean hasFullPlatinumArmor = miscManager.hasFullPlatinumArmor();

            // 抗火效果
            boolean needFireResistance = hasFullMidasGoldArmor || hasFullRoseGoldArmor || hasFullPlatinumArmor;
            boolean hasFireResistance = player.isPotionActive(Potion.fireResistance.id);

            if (needFireResistance && !hasFireResistance) {
                player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 100, 0, true));
            }

            // 速度效果
            boolean needSpeed = hasFullMidasGoldArmor || hasFullPlatinumArmor;
            boolean hasSpeed = player.isPotionActive(Potion.moveSpeed.id);

            if (needSpeed && !hasSpeed) {
                int speedLevel = hasFullMidasGoldArmor ? 3 : 2;
                player.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, speedLevel - 1, true));
            }

            // 急迫效果
            boolean needHaste = hasFullMidasGoldArmor;
            boolean hasHaste = player.isPotionActive(Potion.digSpeed.id);

            if (needHaste && !hasHaste) {
                player.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100, 2, true));
            }
        }
    }
}
