package com.keyaan;

import com.bananaman.api.RegistryHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.equipment.*;
import net.minecraft.core.Holder;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.Util;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.EnumMap;
import java.util.List;

import static com.keyaan.Enditium.MOD_ID;


public class EnditiumArmor {

    //Initialize Registry Helper
    private static final RegistryHelper<Item> registryHelper =
            new RegistryHelper<>(
                    BuiltInRegistries.ITEM,
                    MOD_ID
            );

    public static class ArmorInit {

        //This is a refrence back to Minecraft's original Armor registry system so I can swap back and fourth through them
        //ArmorMaterials.DIAMOND


        public static final ResourceKey<EquipmentAsset> ENDITIUM_ARMOR_ASSET =
                ResourceKey.create(
                        EquipmentAssets.ROOT_ID,
                        Identifier.fromNamespaceAndPath(
                                MOD_ID,
                                "enditium"
                        )
                );


        public static final ArmorMaterial ENDITIUM_ARMOR =
                new ArmorMaterial(
                        37,
                        Util.make(new EnumMap<ArmorType, Integer>(ArmorType.class), map -> {
                            map.put(ArmorType.HELMET, 3);
                            map.put(ArmorType.CHESTPLATE, 8);
                            map.put(ArmorType.LEGGINGS, 6);
                            map.put(ArmorType.BOOTS, 3);
                        }),
                        10,
                        SoundEvents.ARMOR_EQUIP_NETHERITE,
                        2.0F,
                        0.0F,
                        EnditiumTags.Tags.ENDITIUM_ARMOR_REPAIR,
                        ENDITIUM_ARMOR_ASSET
                );

        public static final Item ENDITIUM_HELMET =
                    registryHelper.registerArmor(
                            "enditium_helmet",
                            ENDITIUM_ARMOR,
                            ArmorType.HELMET
                        );

        public static final Item ENDITIUM_CHESTPLATE =
                registryHelper.registerArmor(
                        "enditium_chestplate",
                        ENDITIUM_ARMOR,
                        ArmorType.HELMET
                );

        public static final Item ENDITIUM_LEGGINGS =
                registryHelper.registerArmor(
                        "enditium_leggings",
                        ENDITIUM_ARMOR,
                        ArmorType.HELMET
                );

        public static final Item ENDITIUM_BOOTS =
                registryHelper.registerArmor(
                        "enditium_boots",
                        ENDITIUM_ARMOR,
                        ArmorType.HELMET
                );
    }
}
