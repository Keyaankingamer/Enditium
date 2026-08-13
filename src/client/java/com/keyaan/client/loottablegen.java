package com.keyaan.client;

import com.keyaan.EnditiumBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.storage.loot.LootTable;


public class loottablegen extends FabricBlockLootTableProvider {

    public loottablegen(FabricDataGenerator generator) {
        super(generator, generator.getRegistries());
    }

    @Override
    public void generate(HolderLookup.Provider registries) {
        // Ether Resin Brick
        dropSelf(EnditiumBlocks.ETHER_RESIN_BRICK_STAIR);
        dropSelf(EnditiumBlocks.ETHER_RESIN_BRICK_STAIR);
        dropSelf(EnditiumBlocks.ETHER_RESIN_BRICK_WALL);
        //Polished etherstone
        dropSelf(EnditiumBlocks.POLISHED_ETHERSTONE_WALL);
        dropSelf(EnditiumBlocks.POLISHED_ETHERSTONE_SLAB);
        dropSelf(EnditiumBlocks.POLISHED_ETHERSTONE_STAIR);
        //Etherstone
        dropSelf(EnditiumBlocks.ETHERSTONE_SLAB);
        dropSelf(EnditiumBlocks.ETHERSTONE_STAIR);
        dropSelf(EnditiumBlocks.ETHERSTONE_WALL);
        //Etherstone tiles
        dropSelf(EnditiumBlocks.ETHERSTONE_TILES_WALL);
        dropSelf(EnditiumBlocks.ETHERSTONE_TILES_SLAB);
        dropSelf(EnditiumBlocks.ETHERSTONE_TILES_STAIR);
    }
}
