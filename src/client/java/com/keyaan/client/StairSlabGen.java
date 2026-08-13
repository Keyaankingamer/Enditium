package com.keyaan.client;

import com.keyaan.Enditium;
import com.keyaan.EnditiumBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;

public class StairSlabGen extends FabricModelProvider {

    public StairSlabGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockModelGenerators generator) {
            //Etherstone Tiles
            generator.family(EnditiumBlocks.ETHERSTONE_TILES)
                    .stairs(EnditiumBlocks.ETHERSTONE_TILES_STAIR)
                    .slab(EnditiumBlocks.ETHERSTONE_TILES_SLAB)
                    .wall(EnditiumBlocks.ETHERSTONE_TILES_WALL);

            //Polished Etherstone
            generator.family(EnditiumBlocks.POLISHED_ETHERSTONE)
                    .stairs(EnditiumBlocks.POLISHED_ETHERSTONE_STAIR)
                    .slab(EnditiumBlocks.POLISHED_ETHERSTONE_SLAB)
                    .wall(EnditiumBlocks.POLISHED_ETHERSTONE_WALL);
            //Etherstone
            generator.family(EnditiumBlocks.ETHERSTONE)
                    .stairs(EnditiumBlocks.ETHERSTONE_STAIR)
                    .slab(EnditiumBlocks.ETHERSTONE_SLAB)
                    .wall(EnditiumBlocks.ETHERSTONE_WALL);
            //Ether Resin Brick
            generator.family(EnditiumBlocks.ETHER_RESIN_BRICK)
                    .stairs(EnditiumBlocks.ETHER_RESIN_BRICK_STAIR)
                    .slab(EnditiumBlocks.ETHER_RESIN_BRICK_SLAB)
                    .wall(EnditiumBlocks.ETHER_RESIN_BRICK_WALL);
            }
    @Override
    public void generateItemModels(ItemModelGenerators generator) {
    }
}