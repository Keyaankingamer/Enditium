package com.keyaan;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

public class SpikeBootstrapbs implements DataGeneratorEntrypoint {
    //Not my code, but its 4am and i wanna sleep so tahnk you random discord guy

    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {

    }

    @Override
    public void buildRegistry(RegistrySetBuilder registryBuilder) {

        registryBuilder.add(
                Registries.CONFIGURED_FEATURE,
                SpikeConfiguredFeature::Configure
        );

        registryBuilder.add(
                Registries.PLACED_FEATURE,
                SpikePlacedFeature::Configure
        );
    }
}