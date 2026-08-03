package com.moddedmite.mitemod.MoreMetals.util;

import fi.dy.masa.malilib.config.SimpleConfigs;
import fi.dy.masa.malilib.config.options.ConfigBase;
import fi.dy.masa.malilib.config.options.ConfigInteger;

import java.util.Arrays;
import java.util.List;

/**
 * 基于 ManyLib (MaLiLib) 的配置管理。
 *
 * <p>配置文件位于 {@code config/moremetals.json}, 使用 JSON 格式。
 * 通过 {@link fi.dy.masa.malilib.config.ConfigManager} 注册后,
 * ManyLib 会在进入/退出世界时自动加载/保存配置,
 * 并提供游戏内配置 GUI 和 {@code /manylib reload} 命令支持。</p>
 */
public class Configs extends SimpleConfigs {

    private static Configs INSTANCE;

    // ==================== 矿物生成概率 ====================
    public static final ConfigInteger MIDAS_GOLD_GENERATION_PROBABILITY =
            new ConfigInteger("Midas_Gold_Generation_Probability", 4, 0, Integer.MAX_VALUE);
    public static final ConfigInteger PLATINUM_GENERATION_PROBABILITY =
            new ConfigInteger("Platinum_Generation_Probability", 14, 0, Integer.MAX_VALUE);
    public static final ConfigInteger TIN_GENERATION_PROBABILITY_OVERWORLD =
            new ConfigInteger("TIN_Generation_Probability_OverWorld", 10, 0, Integer.MAX_VALUE);
    public static final ConfigInteger TIN_GENERATION_PROBABILITY_NETHERWORLD =
            new ConfigInteger("TIN_Generation_Probability_NetherWorld", 14, 0, Integer.MAX_VALUE);
    public static final ConfigInteger MANGANESE_GENERATION_PROBABILITY =
            new ConfigInteger("Manganese_Generation_Probability", 8, 0, Integer.MAX_VALUE);
    public static final ConfigInteger ADAMANTIUM_GENERATION_PROBABILITY =
            new ConfigInteger("Adamantium_Generation_Probability", 2, 0, Integer.MAX_VALUE);
    public static final ConfigInteger ALUMINIUM_GENERATION_PROBABILITY =
            new ConfigInteger("Aluminium_Generation_Probability", 5, 0, Integer.MAX_VALUE);
    public static final ConfigInteger TITANIUM_GENERATION_PROBABILITY =
            new ConfigInteger("Titanium_Generation_Probability", 2, 0, Integer.MAX_VALUE);

    private static final List<ConfigBase<?>> VALUES = Arrays.asList(
            MIDAS_GOLD_GENERATION_PROBABILITY,
            PLATINUM_GENERATION_PROBABILITY,
            TIN_GENERATION_PROBABILITY_OVERWORLD,
            TIN_GENERATION_PROBABILITY_NETHERWORLD,
            MANGANESE_GENERATION_PROBABILITY,
            ADAMANTIUM_GENERATION_PROBABILITY,
            ALUMINIUM_GENERATION_PROBABILITY,
            TITANIUM_GENERATION_PROBABILITY
    );

    public Configs() {
        super("MoreMetals", null, VALUES, "更多金属配置");
    }

    public static Configs getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Configs();
        }
        return INSTANCE;
    }
}
