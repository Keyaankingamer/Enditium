package com.keyaan;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.Biomes;
import net.minecraft.world.level.levelgen.GenerationStep;

public class SpikeSpawnEnd {
    public static void generate() {
        BiomeModifications.addFeature(
                BiomeSelectors.includeByKey(
                        Biomes.END_HIGHLANDS,
                        Biomes.END_MIDLANDS
                ),
                GenerationStep.Decoration.VEGETAL_DECORATION,
                SpikePlacedFeature.SPIKE_PLACED_KEY
        );
    }
}
