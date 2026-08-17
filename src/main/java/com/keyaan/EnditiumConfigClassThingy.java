package com.keyaan;

import com.google.gson.GsonBuilder;
import dev.isxander.yacl3.config.v2.api.ConfigClassHandler;
import dev.isxander.yacl3.config.v2.api.serializer.GsonConfigSerializerBuilder;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceLocation;

public class EnditiumConfigClassThingy {
    //Thank you YACL docs for this useful code
    public static ConfigClassHandler<EnditiumConfig> HANDLER =
            ConfigClassHandler.createBuilder(EnditiumConfig.class)
                    .id(ResourceLocation.fromNamespaceAndPath(Enditium.MOD_ID, "enditiumconfig"))
                    .serializer(config -> GsonConfigSerializerBuilder.create(config)
                            .setPath(FabricLoader.getInstance().getConfigDir().resolve("enditium.json5"))
                            .appendGsonBuilder(GsonBuilder::setPrettyPrinting)
                            .setJson5(true)
                            .build())
                    .build();
}
