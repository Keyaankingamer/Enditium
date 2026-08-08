package com.keyaan;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;

import java.util.concurrent.CompletableFuture;

public class DataGenMain extends FabricDynamicRegistryProvider{

    @Override
    public String getName() {
        return "EnditiumWorldgen";
    }


    public DataGenMain(
            FabricDataOutput output,
            CompletableFuture<HolderLookup.Provider> registriesFuture
    )
    {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(
            HolderLookup.Provider registries,
            FabricDynamicRegistryProvider.Entries entries
    ) {
        entries.addAll(registries.lookupOrThrow(Registries.CONFIGURED_FEATURE));
        entries.addAll(registries.lookupOrThrow(Registries.PLACED_FEATURE));
    }

}