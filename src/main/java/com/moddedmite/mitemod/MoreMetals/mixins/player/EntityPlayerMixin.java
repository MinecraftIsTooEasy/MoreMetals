package com.moddedmite.mitemod.MoreMetals.mixins.player;

import com.moddedmite.mitemod.MoreMetals.mixin.interfaces.MMEntityPlayer;
import com.moddedmite.mitemod.MoreMetals.status.MiscManager;
import net.minecraft.*;
import net.xiaoyu233.fml.util.ReflectHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(EntityPlayer.class)
public abstract class EntityPlayerMixin extends EntityLivingBase implements ICommandSender, MMEntityPlayer {
    @Unique
    private final MiscManager miscManager = new MiscManager(ReflectHelper.dyCast(this));

    public EntityPlayerMixin(World par1World) {
        super(par1World);
    }

    @Inject(method = "onUpdate", at = @At("HEAD"))
    private void checkArmorEffects(CallbackInfo ci) {
        boolean hasFullMidasGoldArmor = this.miscManager.hasFullMidasGoldArmor();
        boolean hasFullPlatinumArmor = this.miscManager.hasFullPlatinumArmor();
        boolean hasFullRoseGoldArmor = this.miscManager.hasFullRoseGoldArmor();
        boolean needFireProtection = hasFullMidasGoldArmor || hasFullPlatinumArmor || hasFullRoseGoldArmor;
        boolean hasFireProtection = this.isPotionActive(Potion.fireResistance.id);
        boolean needSpeed = hasFullMidasGoldArmor || hasFullPlatinumArmor;
        boolean hasSpeed = this.isPotionActive(Potion.moveSpeed.id);
        boolean needHaste = hasFullMidasGoldArmor;
        boolean hasHaste = this.isPotionActive(Potion.digSpeed.id);

        if (needFireProtection && !hasFireProtection) {
            this.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 100, 0, true));
        } else if (!needFireProtection && hasFireProtection) {
            this.removePotionEffect(Potion.fireResistance.id);
        }

        if (needSpeed && !hasSpeed) {
            this.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 0, true));
        } else if (!needSpeed && hasSpeed) {
            this.removePotionEffect(Potion.moveSpeed.id);
        }

        if (needHaste && !hasHaste) {
            this.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100, 1, true));
        } else if (!needHaste && hasHaste) {
            this.removePotionEffect(Potion.digSpeed.id);
        }
    }

    @Override
    public MiscManager itf_GetMiscManager() {
        return this.miscManager;
    }
}
