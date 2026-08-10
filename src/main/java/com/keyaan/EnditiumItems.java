package com.keyaan;


import com.bananaman.api.RegistryHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.SmithingTemplateItem;

import java.util.List;


public class EnditiumItems {

    //Initialize Registry Helper
    private static final RegistryHelper<Item> registryHelper =
            new RegistryHelper<>(
                    BuiltInRegistries.ITEM,
                    Enditium.MOD_ID
            );

    //ITEMS
    public static final Item ETHER_RESIN =
            registryHelper.registerItem(
                    "ether_resin",
                    Item::new,
                    new Item.Properties()
            );

    public static final Item ETHER_RESIN_NUGGET =
            registryHelper.registerItem(
                    "ether_resin_nugget",
                    Item::new,
                    new Item.Properties()
            );

    public static final Item ETHERSTONE_PLATE =
            registryHelper.registerItem(
                    "etherstone_plate",
                    Item::new,
                    new Item.Properties()
            );

    public static final Item DETRITUS =
            registryHelper.registerItem(
                    "detritus",
                    Item::new,
                    new Item.Properties()
                            .rarity(Rarity.RARE)
                    );

    public static final Item ENDITIUM =
            registryHelper.registerItem(
                    "enditium",
                    Item::new,
                    new Item.Properties()
                            .rarity(Rarity.EPIC)
            );//nice guy

    public static final Item ENDITIUM_UPGRADE_TEMPLATE = registryHelper.registerItem(
            "enditium_upgrade_template",
            properties -> {
                
                return new SmithingTemplateItem(
                        Component.translatable("item.enditium.ether_upgrade.applies_to")
                                .withStyle(style -> style.withColor(0x55FFFF)),
                        Component.translatable("item.enditium.ether_upgrade.ingredients")
                                .withStyle(style -> style.withColor(0x55FFFF)),
                        Component.translatable("item.enditium.ether_upgrade.base_slot"),
                        Component.translatable("item.enditium.ether_upgrade.addition_slot"),
                        List.of(
                                Identifier.fromNamespaceAndPath("minecraft", "container/slot/helmet"),
                                Identifier.fromNamespaceAndPath("minecraft", "container/slot/chestplate"),
                                Identifier.fromNamespaceAndPath("minecraft", "container/slot/leggings"),
                                Identifier.fromNamespaceAndPath("minecraft", "container/slot/boots")
                                ),
                        List.of(
                                Identifier.fromNamespaceAndPath("minecraft", "container/slot/ingot")
                        ),
                        properties
                );
            },
            new Item.Properties().rarity(Rarity.EPIC)
    );

    public static void init() {

    }
}
