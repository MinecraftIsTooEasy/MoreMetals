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
        boolean needHaste = hasFullMidasGoldArmor;
        boolean hasHaste = this.isPotionActive(Potion.digSpeed.id);




        if (needHaste && !hasHaste) {
            this.addPotionEffect(new PotionEffect(Potion.digSpeed.id, 100, 1, true));
        } else if (!needHaste && hasHaste) {
            this.removePotionEffect(Potion.digSpeed.id);
        }
    }

}
