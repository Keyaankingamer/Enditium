package com.keyaan;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.placement.*;

import java.util.List;

public class SpikePlacedFeature {
    public static final ResourceKey<PlacedFeature> SPIKE_PLACED_KEY = ResourceKey.create(Registries.PLACED_FEATURE, Identifier.fromNamespaceAndPath(Enditium.MOD_ID, "etherstone_spike"));

    public static void Configure(BootstrapContext<PlacedFeature> context) {
        //Not my code, but apparently is how im supposed to do it so
        HolderGetter<ConfiguredFeature<?, ?>> configuredFeatures =
                context.lookup(Registries.CONFIGURED_FEATURE);
        Holder<ConfiguredFeature<?, ?>> spike =
                configuredFeatures.getOrThrow(SpikeConfiguredFeature.SPIKE_CONFIGURED_KEY);
        //End of the code thats not mine

        context.register(
                SPIKE_PLACED_KEY,
                new PlacedFeature(
                        spike,
                        List.of(
                                RarityFilter.onAverageOnceEvery(750),
                                CountPlacement.of(3),
                                InSquarePlacement.spread(),
                                HeightmapPlacement.onHeightmap(Heightmap.Types.WORLD_SURFACE)
                        )
                )
        );

    }
}
