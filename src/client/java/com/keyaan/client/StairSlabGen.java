package com.keyaan.client;

import com.keyaan.Enditium;
import com.keyaan.EnditiumBlocks;
import net.fabricmc.fabric.api.client.rendering.v1.WorldRenderEvents;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.data.models.ItemModelGenerators;
import net.minecraft.data.models.BlockModelGenerators;

public class StairSlabGen extends net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider {

    public StairSlabGen(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(net.minecraft.data.models.BlockModelGenerators generator) {
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
            //new 1.21.1 datagen things because it wont work manually for some reason
        generator.createTrivialCube(EnditiumBlocks.BOILED_ETHERSTONE);;
        generator.createTrivialCube(EnditiumBlocks.BOILED_RESIN_ETHERSTONE);;
        generator.createTrivialCube(EnditiumBlocks.ENDITIUM_BLOCK);
        generator.createTrivialCube(EnditiumBlocks.ETHER_RESIN_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerators generator) {
    }
}