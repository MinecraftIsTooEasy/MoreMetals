package com.moddedmite.mitemod.MoreMetals.mixins;

import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import net.minecraft.Block;
import net.minecraft.ChunkProviderHell;
import net.minecraft.IChunkProvider;
import net.minecraft.World;
import net.minecraft.WorldGenMinable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Random;

@Mixin(ChunkProviderHell.class)
public class ChunkProviderHellTrans {
    @Shadow private Random hellRNG;
    @Shadow private World worldObj;

    @Inject(method = "populate", at = @At(value = "INVOKE", target = "Lnet/minecraft/WorldInfo;getEarliestMITEReleaseRunIn()I", ordinal = 1, shift = At.Shift.BEFORE))
    private void injectGenOres(IChunkProvider par1IChunkProvider, int par2, int par3, CallbackInfo ci) {
        int var8;
        int var9;
        int var10;
        int var11;
        int var4 = par2 * 16;
        int var5 = par3 * 16;

        WorldGenMinable midasGen = (new WorldGenMinable(MMBlocks.oreMidas_Gold.blockID, 4, Block.netherrack.blockID))
                .setMinableBlockMetadata(0);
        int midasCount = this.hellRNG.nextInt(10) + 6;
        for (var8 = 0; var8 < midasCount; ++var8) {
            var9 = var4 + this.hellRNG.nextInt(16);
            var10 = this.hellRNG.nextInt(255);
            var11 = var5 + this.hellRNG.nextInt(16);
            midasGen.generate(this.worldObj, this.hellRNG, var9, var10, var11);
        }


        WorldGenMinable platinumGen = (new WorldGenMinable(MMBlocks.orePlatinum.blockID, 4, Block.netherrack.blockID))
                .setMinableBlockMetadata(0);
        int platinumCount = this.hellRNG.nextInt(14) + 10;
        for (var8 = 0; var8 < platinumCount; ++var8) {
            var9 = var4 + this.hellRNG.nextInt(16);
            var10 = 8 + this.hellRNG.nextInt(255);
            var11 = var5 + this.hellRNG.nextInt(16);
            platinumGen.generate(this.worldObj, this.hellRNG, var9, var10, var11);
        }
    }
}
