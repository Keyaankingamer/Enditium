package com.keyaan;

import com.bananaman.api.RegistryHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class EnditiumBlocks {
    //Initialize Registry Helper
    private static final RegistryHelper<Block> registryHelper =
            new RegistryHelper<Block>(
                    BuiltInRegistries.BLOCK,
                    Enditium.MOD_ID
            );
    //BLOCKS
    public static final Block ETHERSTONE =
            registryHelper.registerBlock(
                    "etherstone",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.NETHER_GOLD_ORE)
                            .destroyTime(11)
                            .requiresCorrectToolForDrops()
            );

    public static final Block BOILED_ETHERSTONE =
            registryHelper.registerBlock(
                    "boiled_etherstone",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.CALCITE)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );

    public static final Block BOILED_RESIN_ETHERSTONE =
            registryHelper.registerBlock(
                    "boiled_resin_etherstone",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.CALCITE)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );

    public static final Block DETRITUS_CLUMP =
            registryHelper.registerBlock(
                    "detritus_clump",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.ANCIENT_DEBRIS)
                            .destroyTime(20)
                            .requiresCorrectToolForDrops()
            );

    //Load the script you lazy ass fucking bum
    public static void init() {

    }

}
