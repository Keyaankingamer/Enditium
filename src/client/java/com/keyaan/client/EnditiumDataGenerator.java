package com.keyaan.client;

import com.keyaan.DataGenMain;
import com.keyaan.SpikeConfiguredFeature;
import com.keyaan.SpikePlacedFeature;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;

import java.util.concurrent.CompletableFuture;

//I am legit never writing datagen again bro writing JSON is completly fine by me cuz less java the better lmao

public class EnditiumDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(DataGenMain::new);
		pack.addProvider(StairSlabGen::new);
	}
	//Below this line is not my code
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