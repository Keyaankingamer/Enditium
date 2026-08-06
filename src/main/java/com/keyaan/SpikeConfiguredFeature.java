package com.keyaan;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.configurations.NoneFeatureConfiguration;

public class SpikeConfiguredFeature {

    public static final ResourceKey<ConfiguredFeature<?, ?>> SPIKE_CONFIGURED_KEY =
            ResourceKey.create(
                    Registries.CONFIGURED_FEATURE,
                    Identifier.fromNamespaceAndPath(Enditium.MOD_ID, "etherstone_spike")
            );


    public static void Configure(BootstrapContext<ConfiguredFeature<?, ?>> context) {

        context.register(
                SPIKE_CONFIGURED_KEY,
                new ConfiguredFeature<>(
                        SpikeFeature.SPIKE_FEATURE,
                        NoneFeatureConfiguration.INSTANCE
                )
        );
    }
}