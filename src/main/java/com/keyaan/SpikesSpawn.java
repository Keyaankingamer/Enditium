package com.keyaan;

import com.mojang.logging.LogUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructurePlaceSettings;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager;

import java.util.Optional;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



public class SpikesSpawn {
    private static final Logger LOGGER = LogUtils.getLogger();

    public static void placeSpike   (WorldGenLevel world, BlockPos pos, RandomSource random) {
        int tries;
        for (tries = 0; tries < 20; tries++) {
        //LOGGER.warn("Trying to place spike at position " + pos);
        int spikeNumberToSpawn = random.nextInt(1, 5);
        String spikeToSpawn = "etherstone_spike_" + spikeNumberToSpawn;
        //Get the structure manager from the server
        StructureTemplateManager structureManager = world.getServer().getStructureManager();
        //Make sure the spike exists
        var SpikeCheck = structureManager.get(
                //Randomize the spike to spawn in the process
                ResourceLocation.fromNamespaceAndPath(Enditium.MOD_ID, spikeToSpawn)
        );
        if (!SpikeCheck.isEmpty()) {
            //LOGGER.warn("Loaded Spike structure file");
            //If it do, randomize the positions
            int x = pos.getX();
            int z = pos.getZ();
            int y = world.getHeight(Heightmap.Types.WORLD_SURFACE, x, z);
            //Turn the structuretemplatemanager into a structure template
            StructureTemplate Spike = SpikeCheck.get();
            //Finally, place the structure!
            BlockPos SpikePos = new  BlockPos(x-4, y-1, z+4);
            Block SurfaceBlock = world.getBlockState(SpikePos).getBlock();
            if  (SurfaceBlock == Blocks.END_STONE) {
                //LOGGER.warn("Placed spike at " + pos);
                Spike.placeInWorld(
                    world,
                    //When placing the spike I fix the positions cuz "spikepos" is actually the middle of the spike so it can check if thats okay to spawn the middle there and i didnt wanna have 2 variables
                    new BlockPos(SpikePos.getX()+4, SpikePos.getY() - 4, SpikePos.getZ()-4),
                    pos,
                    new StructurePlaceSettings(),
                            //.setRotation(Rotation.getRandom(random)),
                    random,
                    Block.UPDATE_ALL
                );
                return;
            }
            else {
                //LOGGER.warn("Could not place spike");
                }
            }
        }
    }
}
