package com.moddedmite.mitemod.MoreMetals.mixins.player;

import com.moddedmite.mitemod.MoreMetals.mixin.interfaces.MMEntityPlayer;
import com.moddedmite.mitemod.MoreMetals.status.MiscManager;
import net.minecraft.EntityLivingBase;
import net.minecraft.EntityPlayer;
import net.minecraft.ICommandSender;
import net.minecraft.World;
import net.xiaoyu233.fml.util.ReflectHelper;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;

@Mixin(EntityPlayer.class)
public abstract class EntityPlayerMixin extends EntityLivingBase implements ICommandSender, MMEntityPlayer {
    @Unique
    private final MiscManager miscManager = new MiscManager(ReflectHelper.dyCast(this));

    public EntityPlayerMixin(World par1World) {
        super(par1World);
    }

    @Override
    public MiscManager mm$getMiscManager() {
        return this.miscManager;
    }
}