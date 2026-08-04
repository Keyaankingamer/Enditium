package com.keyaan;

import com.mojang.logging.LogUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
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

    public static void placeSpike(ServerLevel world, BlockPos pos) {
        for(int tries = 0; tries < 20; tries++) {
        int spikeNumberToSpawn = world.getRandom().nextInt(1, 5);
        String spikeToSpawn = "etherstone_spike_" + spikeNumberToSpawn;
        //Get the structure manager from the server
        StructureTemplateManager structureManager = world.getServer().getStructureManager();
        //Make sure the spike exists
        var SpikeCheck = structureManager.get(
                //Randomize the spike to spawn in the process
                Identifier.fromNamespaceAndPath(Enditium.MOD_ID, spikeToSpawn)
        );
        if (!SpikeCheck.isEmpty()) {
            //If it do, randomize the positions
            int x = pos.getX()+world.getRandom().nextInt(30, 100);
            int z = pos.getZ()+world.getRandom().nextInt(30, 100);
            int y = world.getHeight(Heightmap.Types.WORLD_SURFACE, x, z);
            //Turn the structuretemplatemanager into a structure template
            StructureTemplate Spike = SpikeCheck.get();
            //Finally, place the structure!
            BlockPos SpikePos = new  BlockPos(x, y-5, z);
            if (!world.getBlockState(SpikePos).isAir()) {
                Spike.placeInWorld(
                        world,
                        SpikePos,
                        pos,
                        new StructurePlaceSettings()
                                .setRotation(Rotation.getRandom(world.getRandom())),
                        world.getRandom(),
                        Block.UPDATE_ALL
                );
            }
            else {
                placeSpike(world, pos);
            }
            }
        }
    }
};
