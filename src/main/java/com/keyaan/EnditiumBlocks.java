package com.keyaan;

import com.bananaman.api.RegistryHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
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
                            .requiresCorrectToolForDrops(),
                            new Item.Properties()
                                    .rarity(Rarity.EPIC)
            );

    public static final Block ENDITIUM_BLOCK =
            registryHelper.registerBlock(
                    "enditium_block",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.NETHERITE_BLOCK)
                            .destroyTime(20)
                            .requiresCorrectToolForDrops()
            );

    public static final Block ETHER_RESIN_BLOCK =
            registryHelper.registerBlock(
                    "ether_resin_block",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.RESIN)
                            .destroyTime(0)
            );

    public static final Block ETHER_RESIN_BRICK =
            registryHelper.registerBlock(
                    "ether_resin_brick",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.RESIN_BRICKS)
                            .destroyTime(3)
                            .requiresCorrectToolForDrops()
            );

    public static final Block POLISHED_ETHERSTONE =
            registryHelper.registerBlock(
                    "polished_etherstone",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.POLISHED_TUFF)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );

    public static final Block ETHERSTONE_TILES =
            registryHelper.registerBlock(
                    "etherstone_tiles",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.TUFF_BRICKS)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );

    //Load the script you lazy ass fucking bum
    public static void init() {

    }

}
