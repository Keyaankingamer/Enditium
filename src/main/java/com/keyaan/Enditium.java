package com.keyaan;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.Commands;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.levelgen.GenerationStep;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static net.fabricmc.loader.impl.FabricLoaderImpl.MOD_ID;

public class Enditium implements ModInitializer {
	public static final String MOD_ID = "enditium";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Enditium has been initialized :D");
		EnditiumConfigClassThingy.HANDLER.load();
		EnditiumItems.init();
		EnditiumBlocks.init();
		EnditiumArmor.ArmorInit.Init();
		BoiledEtherstoneResinRemove.Init();
		SpikeFeature.RegisterSpike();
		SpikeSpawnEnd.generate();
		UpgradeTemplateLootttable.Init();
		EnditiumArmorMechanics.init();
		ArmorCooldown.init();
		EnditiumSounds.init();
		BiomeModifications.addFeature(
				BiomeSelectors.foundInTheEnd(),
				GenerationStep.Decoration.UNDERGROUND_ORES,
				GenerationRegistry.DETRIUSCLUMP
		);
	}
	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
	}
}
