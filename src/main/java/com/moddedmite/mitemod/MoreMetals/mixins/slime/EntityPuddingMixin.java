package com.moddedmite.mitemod.MoreMetals.mixins.slime;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.minecraft.DamageSource;
import net.minecraft.EntityPudding;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(EntityPudding.class)
public class EntityPuddingMixin {
    @ModifyReturnValue(method = "isImmuneTo", at = @At("RETURN"))
    private boolean nickelDamage(boolean original, @Local(argsOnly = true) DamageSource damage_source) {
        return (damage_source.getItemAttackedWith() != null) ? ((original && damage_source.getItemAttackedWith().getMaterialForRepairs() != Materials.bronze && damage_source.getItemAttackedWith().getMaterialForRepairs() != Materials.steel && damage_source.getItemAttackedWith().getMaterialForRepairs() != Materials.titanium_alloy)) : original;
    }
}
