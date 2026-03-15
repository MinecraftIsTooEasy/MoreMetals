package com.moddedmite.mitemod.MoreMetals.mixins.slime;

import com.llamalad7.mixinextras.injector.ModifyReturnValue;
import com.llamalad7.mixinextras.sugar.Local;
import com.moddedmite.mitemod.MoreMetals.material.Materials;
import net.minecraft.*;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(EntityOoze.class)
public abstract class EntityOozeMixin extends EntityCubic {
    public EntityOozeMixin(World par1World) {
        super(par1World);
    }

    @ModifyReturnValue(method = "isImmuneTo", at = @At("RETURN"))
    private boolean notImmuneToBronzeDamage(boolean original, @Local(argsOnly = true) DamageSource damage_source) {
        if (damage_source.isExplosion()) return false;
        ItemStack itemAttackedWith = damage_source.getItemAttackedWith();
        if (itemAttackedWith == null) return original;
        Material material = itemAttackedWith.getMaterialForRepairs();
        if (material == Materials.bronze || material == Materials.steel || material == Materials.celestium) return false;
        if (itemAttackedWith.getItem() instanceof ItemFishingRod itemFishingRod) {
            Material hookMaterial = itemFishingRod.getHookMaterial();
            if (hookMaterial == Materials.bronze || hookMaterial == Materials.steel || hookMaterial == Materials.celestium) return false;
        }
        return original;
    }

    @ModifyConstant(method = "setSize", constant = @Constant(intValue = 2))
    private int larger(int constant) {
        return 4;
    }
}