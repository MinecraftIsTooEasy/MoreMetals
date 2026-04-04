package com.moddedmite.mitemod.MoreMetals.mixins.player;

import com.moddedmite.mitemod.MoreMetals.status.MiscManager;
import net.minecraft.*;
import net.xiaoyu233.fml.util.ReflectHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityPlayer.class)
public abstract class EntityPlayerMixin extends EntityLivingBase implements ICommandSender {
    @Unique
    private final MiscManager miscManager = new MiscManager(ReflectHelper.dyCast(this));

    public EntityPlayerMixin(World par1World) {
        super(par1World);
    }

    @Inject(method = "onUpdate", at = @At("HEAD"))
    private void checkArmorEffects(CallbackInfo ci) {
        boolean hasFullMidasGoldArmor = this.miscManager.hasFullMidasGoldArmor();
        boolean hasFullRoseGoldArmor = this.miscManager.hasFullRoseGoldArmor();
        boolean hasFullPlatinumArmor = this.miscManager.hasFullPlatinumArmor();

        // 抗火效果
        boolean needFireResistance = hasFullMidasGoldArmor || hasFullRoseGoldArmor || hasFullPlatinumArmor;
        boolean hasFireResistance = this.isPotionActive(Potion.fireResistance.id);

        if (needFireResistance && !hasFireResistance) {
            this.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 100, 0, true));
        } else if (!needFireResistance && hasFireResistance) {
            this.removePotionEffect(Potion.fireResistance.id);
        }

        // 速度效果
        boolean needSpeed = hasFullMidasGoldArmor || hasFullPlatinumArmor;
        boolean hasSpeed = this.isPotionActive(Potion.moveSpeed.id);

        if (needSpeed && !hasSpeed) {
            int speedLevel = hasFullMidasGoldArmor ? 3 : 2;
            this.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, speedLevel - 1, true));
        } else if (!needSpeed && hasSpeed) {
            this.removePotionEffect(Potion.moveSpeed.id);
        }

        // 急迫效果
        boolean needHaste = hasFullMidasGoldArmor;
        boolean hasHaste = this.isPotionActive(Potion.digSpeed.id);

        if (needHaste && !hasHaste) {
            this.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100, 2, true));
        } else if (!needHaste && hasHaste) {
            this.removePotionEffect(Potion.digSpeed.id);
        }

        // 跳跃提升效果
        boolean needJumpBoost = hasFullMidasGoldArmor;
        boolean hasJumpBoost = this.isPotionActive(Potion.jump.id);

        if (needJumpBoost && !hasJumpBoost) {
            this.addPotionEffect(new PotionEffect(Potion.jump.id, 100, 1, true));
        } else if (!needJumpBoost && hasJumpBoost) {
            this.removePotionEffect(Potion.jump.id);
        }
    }

}