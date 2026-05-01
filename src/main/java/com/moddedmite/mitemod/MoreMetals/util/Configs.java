package com.moddedmite.mitemod.MoreMetals.util;

import net.xiaoyu233.fml.config.ConfigEntry;
import net.xiaoyu233.fml.config.ConfigRoot;
import net.xiaoyu233.fml.util.FieldReference;

import java.io.File;

public class Configs {
    public static final File CONFIG_FILE = new File("MoreMatels.json");
    public static final ConfigRoot ROOT = ConfigRoot.create(1)
            .addEntry(ConfigEntry.of("Midas_Gold_Generation_Probability", GameMechanics.Midas_Gold_Generation_Probability).withComment("迈达斯金生成概率"))
            .addEntry(ConfigEntry.of("Platinum_Generation_Probability", GameMechanics.Platinum_Generation_Probability).withComment("铂金生成概率"))
            .addEntry(ConfigEntry.of("TIN_Generation_Probability_OverWorld", GameMechanics.TIN_Generation_Probability_OverWorld).withComment("主世界锡生成概率"))
            .addEntry(ConfigEntry.of("TIN_Generation_Probability_NetherWorld", GameMechanics.TIN_Generation_Probability_NetherWorld).withComment("地下世界锡生成概率"))
            .addEntry(ConfigEntry.of("Manganese_Generation_Probability", GameMechanics.Manganese_Generation_Probability).withComment("锰生成概率"))
            .addEntry(ConfigEntry.of("Manganese_Generation_Probability", GameMechanics.Adamantium_Generation_Probability).withComment("精金生成概率"))
                .addEntry(ConfigEntry.of("Aluminium_Generation_Probability", GameMechanics.Aluminium_Generation_Probability).withComment("铝生成概率"))
            .addEntry(ConfigEntry.of("Titanium_Generation_Probability", GameMechanics.Titanium_Generation_Probability).withComment("钛生成概率"));


    public static class GameMechanics {
        public static final FieldReference<Integer> Midas_Gold_Generation_Probability = new FieldReference<>(4);
        public static final FieldReference<Integer> Platinum_Generation_Probability = new FieldReference<>(14);
        public static final FieldReference<Integer> TIN_Generation_Probability_OverWorld = new FieldReference<>(10);
        public static final FieldReference<Integer> TIN_Generation_Probability_NetherWorld = new FieldReference<>(14);
        public static final FieldReference<Integer> Manganese_Generation_Probability = new FieldReference<>(8);
        public static final FieldReference<Integer> Adamantium_Generation_Probability = new FieldReference<>(2);
        public static final FieldReference<Integer> Aluminium_Generation_Probability = new FieldReference<>(5);
        public static final FieldReference<Integer> Titanium_Generation_Probability = new FieldReference<>(2);

    }
}