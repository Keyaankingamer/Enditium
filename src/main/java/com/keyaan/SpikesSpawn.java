package com.keyaan;

import com.mojang.logging.LogUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.resources.Identifier;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Rotation;
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
        int spikeNumberToSpawn = world.getRandom().nextInt(1, 5);
        String spikeToSpawn = "etherstone_spike_" + spikeNumberToSpawn;
        //Get the structure manager from the server
        StructureTemplateManager structureManager = world.getServer().getStructureManager();
        //Make sure the spike exists
        LOGGER.info("Checking if the file exists");

        var SpikeCheck = structureManager.get(
                Identifier.fromNamespaceAndPath(Enditium.MOD_ID, spikeToSpawn)
        );

        LOGGER.info("Structure exists? {}", SpikeCheck.isPresent());
        if (!SpikeCheck.isEmpty()) {
            //If it do, create a var w/ it
            StructureTemplate Spike = SpikeCheck.get();
            BlockPos SpikePos = new  BlockPos(pos.getX(), pos.getY()-5, pos.getZ());
            LOGGER.info("Placed Spike 1");
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
    }
}
