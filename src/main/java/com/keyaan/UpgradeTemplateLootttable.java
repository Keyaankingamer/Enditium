package com.keyaan;

import net.fabricmc.fabric.api.loot.v3.LootTableEvents;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.storage.loot.BuiltInLootTables;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.entries.EmptyLootItem;
import net.minecraft.world.level.storage.loot.entries.LootItem;

public class UpgradeTemplateLootttable {
    public static void Init() {
        LootTableEvents.MODIFY.register((key, tableBuilder, source, registries) -> {
            if (source.isBuiltin() && key.equals(BuiltInLootTables.END_CITY_TREASURE)) {

                LootPool.Builder pool = LootPool.lootPool()
                        .add(LootItem.lootTableItem(EnditiumItems.ENDITIUM_UPGRADE_TEMPLATE)
                                .setWeight(1))
                        .add(EmptyLootItem.emptyItem()
                                .setWeight(3));

                tableBuilder.withPool(pool);
            }
        });
    }
}
