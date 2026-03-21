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
    public EntityPlayerMixin(World par1World) {
        super(par1World);
    }



    @Inject(method = "onUpdate", at = @At("HEAD"))
    private void checkArmorEffects(CallbackInfo ci) {
        boolean hasFullMidasGoldArmor = this.miscManager.hasFullMidasGoldArmor();
        
        // 检查是否需要火焰保护效果
        boolean needFireProtection = hasFullMidasGoldArmor;
        boolean hasFireProtection = this.isPotionActive(Potion.fireResistance.id);
        
        // 检查是否需要速度效果
        boolean needSpeed = hasFullMidasGoldArmor;
        boolean hasSpeed = this.isPotionActive(Potion.moveSpeed.id);
        
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
    }

    @Unique
    private MiscManager miscManager = new MiscManager(ReflectHelper.dyCast(this));

}