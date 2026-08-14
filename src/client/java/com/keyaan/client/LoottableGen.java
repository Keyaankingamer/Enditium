package com.keyaan.client;

import com.keyaan.EnditiumBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class LoottableGen extends FabricBlockLootTableProvider {

    protected LoottableGen(
            FabricDataOutput dataOutput,
            CompletableFuture<HolderLookup.Provider> registryLookup
    ) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(EnditiumBlocks.ETHER_RESIN_BRICK_SLAB);
        dropSelf(EnditiumBlocks.ETHER_RESIN_BRICK_STAIR);
        dropSelf(EnditiumBlocks.ETHER_RESIN_BRICK_WALL);
        dropSelf(EnditiumBlocks.ETHERSTONE_SLAB);
        dropSelf(EnditiumBlocks.ETHERSTONE_STAIR);
        dropSelf(EnditiumBlocks.ETHERSTONE_WALL);
        dropSelf(EnditiumBlocks.POLISHED_ETHERSTONE_SLAB);
        dropSelf(EnditiumBlocks.POLISHED_ETHERSTONE_STAIR);
        dropSelf(EnditiumBlocks.POLISHED_ETHERSTONE_WALL);
        dropSelf(EnditiumBlocks.ETHERSTONE_TILES_SLAB);
        dropSelf(EnditiumBlocks.ETHERSTONE_TILES_STAIR);
        dropSelf(EnditiumBlocks.ETHERSTONE_TILES_WALL);

    }
}
