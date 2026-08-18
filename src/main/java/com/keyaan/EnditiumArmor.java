package com.keyaan;

import com.bananaman.api.RegistryHelper;
import net.minecraft.Util;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.*;
import net.minecraft.world.item.crafting.Ingredient;
import org.intellij.lang.annotations.Identifier;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import static com.keyaan.Enditium.MOD_ID;


public class EnditiumArmor {

    //Initialize Registry Helper
    public static final RegistryHelper<Item> registryHelper =
            new RegistryHelper<>(
                    BuiltInRegistries.ITEM,
                    MOD_ID
            );

    public static class ArmorInit {

        //This is a refrence back to Minecraft's original Armor registry system so I can swap back and fourth through them
        //ArmorMaterials.DIAMOND




        public static final Holder<ArmorMaterial> ENDITIUM_ARMOR =
                Registry.registerForHolder(
                        BuiltInRegistries.ARMOR_MATERIAL,
                        ResourceLocation.fromNamespaceAndPath(MOD_ID, "enditim"),
                new ArmorMaterial(
                Map.of(
                        ArmorItem.Type.BOOTS, 4,
                        ArmorItem.Type.LEGGINGS, 7,
                        ArmorItem.Type.CHESTPLATE, 8,
                        ArmorItem.Type.HELMET, 4
                ),
                10, // Enchantment thingy
                SoundEvents.ARMOR_EQUIP_NETHERITE,
                () -> Ingredient.of(EnditiumTags.Tags.ENDITIUM_ARMOR_REPAIR), // Repair item
                List.of(
                        new ArmorMaterial.Layer(ResourceLocation.fromNamespaceAndPath(MOD_ID, "enditium"))
                ),
                3.0F, // Armor Toughness
                0.2F  // Knockback Resistance
        ));

        public static final Item ENDITIUM_HELMET =
                    registryHelper.registerArmor(
                            "enditium_helmet",
                            ENDITIUM_ARMOR,
                            ArmorItem.Type.HELMET,
                            new Item.Properties()
                                    .rarity(Rarity.EPIC)
                                    .stacksTo(1)
                        );

        public static final Item ENDITIUM_CHESTPLATE =
                registryHelper.registerArmor(
                        "enditium_chestplate",
                        ENDITIUM_ARMOR,
                        ArmorItem.Type.CHESTPLATE,
                        new Item.Properties()
                                .rarity(Rarity.EPIC)
                                .stacksTo(1)
                );

        public static final Item ENDITIUM_LEGGINGS =
                registryHelper.registerArmor(
                        "enditium_leggings",
                        ENDITIUM_ARMOR,
                        ArmorItem.Type.LEGGINGS,
                        new Item.Properties()
                                .rarity(Rarity.EPIC)
                                .stacksTo(1)
                );

        public static final Item ENDITIUM_BOOTS =
                registryHelper.registerArmor(
                        "enditium_boots",
                        ENDITIUM_ARMOR,
                        ArmorItem.Type.BOOTS,
                        new Item.Properties()
                                .rarity(Rarity.EPIC)
                                .stacksTo(1)
                );


        public static void Init() {

        }
    }

}
