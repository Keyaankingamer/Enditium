package com.keyaan;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class EnditiumTags {

    public static class Tags {
        public static final TagKey<Item> ENDITIUM_ARMOR_REPAIR =
                TagKey.create(
                        Registries.ITEM,
                        ResourceLocation.fromNamespaceAndPath(
                                Enditium.MOD_ID,
                                "enditium_armor_repair"
                        )
                );
    }
}