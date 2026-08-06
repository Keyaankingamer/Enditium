package com.keyaan;

import com.bananaman.api.RegistryHelper;
import com.mojang.logging.LogUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;
import org.slf4j.Logger;

public class SpikeFeature extends Feature<NoneFeatureConfiguration> {
    static SpikeFeature SPIKE_FEATURE = new SpikeFeature();
    private static final Logger LOGGER = LogUtils.getLogger();

    public SpikeFeature() {
        super(NoneFeatureConfiguration.CODEC);
    }
    public static void RegisterSpike() {

        Registry.register(
                BuiltInRegistries.FEATURE,
                Identifier.fromNamespaceAndPath(Enditium.MOD_ID, "etherstone_spike"),
                SPIKE_FEATURE
        );
    }



    @Override
    public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {


        ServerLevel world = context.level().getLevel();
        BlockPos position = context.origin();

        SpikesSpawn.placeSpike(world, position);
        SpikesSpawn.placeSpike(world, position);
        SpikesSpawn.placeSpike(world, position);
        SpikesSpawn.placeSpike(world, position);

        return true;
    }
}