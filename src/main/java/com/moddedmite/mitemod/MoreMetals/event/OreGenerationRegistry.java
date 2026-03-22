package com.moddedmite.mitemod.MoreMetals.event;

import com.moddedmite.mitemod.MoreMetals.blocks.MMBlocks;
import moddedmite.rustedironcore.api.event.events.OreGenerationRegisterEvent;
import moddedmite.rustedironcore.api.world.Dimension;
import moddedmite.rustedironcore.api.world.MinableWorldGen;

import java.util.function.Consumer;

public class OreGenerationRegistry implements Consumer<OreGenerationRegisterEvent> {
    @Override
    public void accept(OreGenerationRegisterEvent event) {
        MinableWorldGen tinGen = new MinableWorldGen(MMBlocks.oreTin.blockID, 6)
                .setMinVeinHeight((world, minableWorldGen) -> 0)
                .setMaxVeinHeight(((world, minableWorldGen) -> 255))
                .setRandomVeinHeight(MinableWorldGen.Common);

        MinableWorldGen manganeseGen = new MinableWorldGen(MMBlocks.oreManganese.blockID, 3)
                .setMinVeinHeight((world, minableWorldGen) -> 0)
                .setMaxVeinHeight((world, minableWorldGen) -> world.isUnderworld() ? 255 : 48)
                .setRandomVeinHeight(MinableWorldGen.Common);
        MinableWorldGen adamantiumGen = new MinableWorldGen(MMBlocks.oreAdamantium.blockID, 3)
                .setMinVeinHeight((world, minableWorldGen) -> 0)
                .setMaxVeinHeight((world, minableWorldGen) -> 255)
                .setRandomVeinHeight(MinableWorldGen.Common);
        MinableWorldGen aluminiumOverworldGen = new MinableWorldGen(MMBlocks.oreAluminium.blockID, 6)
                .setMinVeinHeight((world, minableWorldGen) -> 0)
                .setMaxVeinHeight((world, minableWorldGen) -> 255)
                .setRandomVeinHeight(MinableWorldGen.Common);
        MinableWorldGen aluminiumUnderworldGen = new MinableWorldGen(MMBlocks.oreAluminium.blockID, 6)
                .setMinVeinHeight((world, minableWorldGen) -> 0)
                .setMaxVeinHeight((world, minableWorldGen) -> 255)
                .setRandomVeinHeight(MinableWorldGen.Common);
        MinableWorldGen titaniumGen = new MinableWorldGen(MMBlocks.oreTitanium.blockID, 4)
                .setMinVeinHeight((world, minableWorldGen) -> 0)
                .setMaxVeinHeight((world, minableWorldGen) -> 255)
                .setRandomVeinHeight(MinableWorldGen.Common);

        event.register(Dimension.OVERWORLD, tinGen, 15, true);
        event.register(Dimension.OVERWORLD, aluminiumOverworldGen, 10, true);

        event.register(Dimension.UNDERWORLD, tinGen, 25, true);
        event.register(Dimension.UNDERWORLD, manganeseGen, 7, true);
        event.register(Dimension.UNDERWORLD, adamantiumGen, 4, true);
        event.register(Dimension.UNDERWORLD, aluminiumUnderworldGen, 18, true);
        event.register(Dimension.UNDERWORLD, titaniumGen, 7, true);

    }
}
