package com.keyaan;

import com.bananaman.api.RegistryHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class EnditiumBlocks {
    //Initialize Registry Helper
    private static final RegistryHelper<Block> registryHelper =
            new RegistryHelper<Block>(
                    BuiltInRegistries.BLOCK,
                    Enditium.MOD_ID
            );
    //BLOCKS

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
    //Ether Resin Bricks
    public static final Block ETHER_RESIN_BRICK =
            registryHelper.registerBlock(
                    "ether_resin_brick",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.RESIN_BRICKS)
                            .destroyTime(3)
                            .requiresCorrectToolForDrops()
            );
    public static final Block ETHER_RESIN_BRICK_SLAB =
            registryHelper.registerBlock(
                    "ether_resin_brick_slab",
                    SlabBlock::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.RESIN_BRICKS)
                            .destroyTime(3)
                            .requiresCorrectToolForDrops()
            );
    public static final Block ETHER_RESIN_BRICK_STAIR =
            registryHelper.registerBlock(
                    "ether_resin_brick_stair",
                    properties -> new StairBlock(
                            ETHER_RESIN_BRICK.defaultBlockState(),
                            properties
                    ),
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.RESIN_BRICKS)
                            .destroyTime(3)
                            .requiresCorrectToolForDrops()
            );

    public static final Block ETHER_RESIN_BRICK_WALL =
            registryHelper.registerBlock(
                    "ether_resin_brick_wall",
                    WallBlock::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.RESIN_BRICKS)
                            .destroyTime(3)
                            .requiresCorrectToolForDrops()
            );

    //Etherstone
    public static final Block ETHERSTONE =
            registryHelper.registerBlock(
                    "etherstone",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.NETHER_GOLD_ORE)
                            .destroyTime(11)
                            .requiresCorrectToolForDrops()
            );

    public static final Block ETHERSTONE_SLAB =
            registryHelper.registerBlock(
                    "etherstone_slab",
                    SlabBlock::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.NETHER_GOLD_ORE)
                            .destroyTime(11)
                            .requiresCorrectToolForDrops()
            );
    public static final Block ETHERSTONE_STAIR =
            registryHelper.registerBlock(
                    "etherstone_stair",
                    properties -> new StairBlock(
                            ETHERSTONE.defaultBlockState(),
                            properties
                    ),
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.NETHER_GOLD_ORE)
                            .destroyTime(11)
                            .requiresCorrectToolForDrops()
            );
    public static final Block ETHERSTONE_WALL =
            registryHelper.registerBlock(
                    "etherstone_wall",
                    WallBlock::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.NETHER_GOLD_ORE)
                            .destroyTime(11)
                            .requiresCorrectToolForDrops()
            );

    //Polished Etherstone
    public static final Block POLISHED_ETHERSTONE =
            registryHelper.registerBlock(
                    "polished_etherstone",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.POLISHED_TUFF)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );
    public static final Block POLISHED_ETHERSTONE_SLAB =
            registryHelper.registerBlock(
                    "polished_etherstone_slab",
                    SlabBlock::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.POLISHED_TUFF)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );
    public static final Block POLISHED_ETHERSTONE_STAIR =
            registryHelper.registerBlock(
                    "polished_etherstone_stair",
                    properties -> new StairBlock(
                            ETHERSTONE.defaultBlockState(),
                            properties
                    ),
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.POLISHED_TUFF)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );
    public static final Block POLISHED_ETHERSTONE_WALL =
            registryHelper.registerBlock(
                    "polished_etherstone_wall",
                    WallBlock::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.POLISHED_TUFF)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );

    //Etherstone Tiles
    public static final Block ETHERSTONE_TILES =
            registryHelper.registerBlock(
                    "etherstone_tiles",
                    Block::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.TUFF_BRICKS)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );

    public static final Block ETHERSTONE_TILES_SLAB =
            registryHelper.registerBlock(
                    "etherstone_tiles_slab",
                    SlabBlock::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.TUFF_BRICKS)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );
    public static final Block ETHERSTONE_TILES_STAIR =
            registryHelper.registerBlock(
                    "etherstone_tiles_stair",
                    properties -> new StairBlock(
                            ETHERSTONE.defaultBlockState(),
                            properties
                    ),
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.TUFF_BRICKS)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );
    public static final Block ETHERSTONE_TILES_WALL =
            registryHelper.registerBlock(
                    "etherstone_tiles_wall",
                    WallBlock::new,
                    BlockBehaviour.Properties.of()
                            .sound(SoundType.TUFF_BRICKS)
                            .destroyTime(5)
                            .requiresCorrectToolForDrops()
            );

    //Load the script you lazy ass fucking bum
    public static void init() {

    }

}
