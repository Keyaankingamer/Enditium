package com.keyaan;


import com.bananaman.api.RegistryHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;


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
            );

    public static void init() {

    }
}
