package com.moddedmite.mitemod.MoreMetals.event;

import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import com.moddedmite.mitemod.MoreMetals.util.Configs;
import moddedmite.rustedironcore.api.event.events.OreGenerationRegisterEvent;
import moddedmite.rustedironcore.api.world.Dimension;
import moddedmite.rustedironcore.api.world.MinableWorldGen;

import java.util.function.Consumer;

public class OreGenerationRegistry implements Consumer<OreGenerationRegisterEvent> {
    @Override
    public void accept(OreGenerationRegisterEvent event) {
        MinableWorldGen tinGen = new MinableWorldGen(MMBlocks.oreTin.blockID, 6)
                .setMinVeinHeight((world, minableWorldGen) -> 0)
                .setMaxVeinHeight(((world, minableWorldGen) -> 70))
                .setRandomVeinHeight(MinableWorldGen.Common);

        MinableWorldGen manganeseGen = new MinableWorldGen(MMBlocks.oreManganese.blockID, 3)
                .setMinVeinHeight((world, minableWorldGen) -> 0)
                .setMaxVeinHeight((world, minableWorldGen) -> 255)
                .setRandomVeinHeight(MinableWorldGen.Common);
        MinableWorldGen adamantiumGen = new MinableWorldGen(MMBlocks.oreAdamantium.blockID, 3)
                .setMinVeinHeight((world, minableWorldGen) -> 0)
                .setMaxVeinHeight((world, minableWorldGen) -> world.isUnderworld() ? 255: 144)
                .setRandomVeinHeight(MinableWorldGen.Common);
        MinableWorldGen aluminiumUnderworldGen = new MinableWorldGen(MMBlocks.oreAluminium.blockID, 6)
                .setMinVeinHeight((world, minableWorldGen) -> 0)
                .setMaxVeinHeight((world, minableWorldGen) -> 255)
                .setRandomVeinHeight(MinableWorldGen.Common);
        MinableWorldGen titaniumGen = new MinableWorldGen(MMBlocks.oreTitanium.blockID, 4)
                .setMinVeinHeight((world, minableWorldGen) -> 0)
                .setMaxVeinHeight((world, minableWorldGen) -> 255)
                .setRandomVeinHeight(MinableWorldGen.Common);

        event.register(Dimension.OVERWORLD, tinGen, Configs.GameMechanics.TIN_Generation_Probability_OverWorld.get(), true);

        event.register(Dimension.UNDERWORLD, tinGen, Configs.GameMechanics.TIN_Generation_Probability_NetherWorld.get(), true);
        event.register(Dimension.UNDERWORLD, manganeseGen, Configs.GameMechanics.Manganese_Generation_Probability.get(), true);
        event.register(Dimension.UNDERWORLD, adamantiumGen, Configs.GameMechanics.Adamantium_Generation_Probability.get(), true);
        event.register(Dimension.UNDERWORLD, aluminiumUnderworldGen, Configs.GameMechanics.Aluminium_Generation_Probability.get(), true);
        event.register(Dimension.UNDERWORLD, titaniumGen, Configs.GameMechanics.Titanium_Generation_Probability.get(), true);

    }
}
