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
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityPlayer.class)
public abstract class EntityPlayerMixin extends EntityLivingBase implements ICommandSender, MMEntityPlayer {
    public EntityPlayerMixin(World par1World) {
        super(par1World);
    }

    @Inject(method = "attackEntityFrom", at = @At("HEAD"), cancellable = true)
    private void bronzeCheck(Damage damage, CallbackInfoReturnable<EntityDamageResult> cir) {
        float bronze_coverage = MathHelper.clamp_float(this.miscManager.getBronzeArmorCoverage(), 0.0F, 1.0F);
        if (damage.getResponsibleEntity() instanceof EntityGelatinousCube) {
            if (bronze_coverage >= 0.999F)
                cir.setReturnValue(null);
            damage.scaleAmount(1.0F - bronze_coverage);
        }
    }

    @Inject(method = "onUpdate", at = @At("HEAD"))
    private void checkArmorEffects(CallbackInfo ci) {
        boolean hasFullStormyxArmor = this.miscManager.hasFullStormyxArmor();
        boolean hasFullMidasGoldArmor = this.miscManager.hasFullMidasGoldArmor();
        boolean hasFullCelestiumArmor = this.miscManager.hasFullCelestiumArmor();
        
        // 检查是否需要火焰保护效果
        boolean needFireProtection = hasFullStormyxArmor || hasFullMidasGoldArmor || hasFullCelestiumArmor;
        boolean hasFireProtection = this.isPotionActive(Potion.fireResistance.id);
        
        // 检查是否需要速度效果
        boolean needSpeed = hasFullMidasGoldArmor || hasFullCelestiumArmor;
        boolean hasSpeed = this.isPotionActive(Potion.moveSpeed.id);
        
        // 检查是否需要急迫效果
        boolean needHaste = hasFullCelestiumArmor;
        boolean hasHaste = this.isPotionActive(Potion.digSpeed.id);
        
        // 处理火焰保护效果
        if (needFireProtection && !hasFireProtection) {
            this.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 100, 0, true));
        } else if (!needFireProtection && hasFireProtection) {
            this.removePotionEffect(Potion.fireResistance.id);
        }
        
        // 处理速度效果
        if (needSpeed && !hasSpeed) {
            this.addPotionEffect(new PotionEffect(Potion.moveSpeed.id, 100, 0, true));
        } else if (!needSpeed && hasSpeed) {
            this.removePotionEffect(Potion.moveSpeed.id);
        }
        
        // 处理急迫效果
        if (needHaste && !hasHaste) {
            this.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100, 2, true));
        } else if (!needHaste && hasHaste) {
            this.removePotionEffect(Potion.digSpeed.id);
        }
    }

    @Unique
    private MiscManager miscManager = new MiscManager(ReflectHelper.dyCast(this));

}