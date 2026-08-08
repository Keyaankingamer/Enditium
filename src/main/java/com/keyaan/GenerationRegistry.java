package com.keyaan;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class GenerationRegistry {

    public static final ResourceKey<PlacedFeature> DETRIUSCLUMP =
            ResourceKey.create(
                    Registries.PLACED_FEATURE,
                    Identifier.fromNamespaceAndPath(
                            Enditium.MOD_ID,
                            "detritus_clump"
                    )
            );
}