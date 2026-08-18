package com.keyaan;


import com.bananaman.api.RegistryHelper;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.*;

import java.util.List;


public class EnditiumItems {

    //Initialize Registry Helper
    public static final RegistryHelper<Item> registryHelper =
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
            );

    public static final Item ENDITIUM_UPGRADE_TEMPLATE = Registry.register(
            BuiltInRegistries.ITEM,
            ResourceLocation.fromNamespaceAndPath(
                    Enditium.MOD_ID,
                    "enditium_upgrade_template"
            ),
            new SmithingTemplateItem(
                    Component.translatable("item.enditium.ether_upgrade.applies_to")
                            .withStyle(style -> style.withColor(0x55FFFF)),
                    Component.translatable("item.enditium.ether_upgrade.ingredients")
                            .withStyle(style -> style.withColor(0x55FFFF)),
                    Component.translatable("item.enditium.ether_upgrade.name")
                            .withStyle(style -> style.withColor(0x55FFFF)),
                    Component.translatable("item.enditium.ether_upgrade.base_slot"),
                    Component.translatable("item.enditium.ether_upgrade.addition_slot"),
                    List.of(
                            ResourceLocation.fromNamespaceAndPath(
                                    "minecraft", "container/slot/helmet"),
                            ResourceLocation.fromNamespaceAndPath(
                                    "minecraft", "container/slot/chestplate"),
                            ResourceLocation.fromNamespaceAndPath(
                                    "minecraft", "container/slot/leggings"),
                            ResourceLocation.fromNamespaceAndPath(
                                    "minecraft", "container/slot/boots")
                    ),
                    List.of(
                            ResourceLocation.fromNamespaceAndPath(
                                    "minecraft", "container/slot/ingot")
                    )
            )
    );;

    //Creative Tab
    public static final CreativeModeTab ENDITIUM_TAB =
            registryHelper.registerCreativeTab(
                    "enditium",
                    () -> new ItemStack(ENDITIUM),
                    builder -> builder.displayItems((parameters, output) -> {
                        registryHelper.getRegisteredItems().forEach(output::accept);
                        EnditiumBlocks.registryHelper.getRegisteredBlocks().forEach(output::accept);
                        EnditiumArmor.registryHelper.getRegisteredItems().forEach(output::accept);
                    })
            );
    public static void init() {

    }
}
