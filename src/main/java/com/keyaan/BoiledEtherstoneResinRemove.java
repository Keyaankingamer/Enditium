package com.keyaan;

import com.mojang.logging.LogUtils;
import net.minecraft.core.BlockPos;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.state.BlockState;
import org.slf4j.Logger;

public class BoiledEtherstoneResinRemove extends AxeItem {
    private static final Logger LOGGER =  LogUtils.getLogger();

    public BoiledEtherstoneResinRemove(
            ToolMaterial material,
            float attackDamage,
            float attackSpeed,
            Item.Properties properties
    ) {
        super(material, attackDamage, attackSpeed, properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        BlockPos pos = context.getClickedPos();
        LOGGER.info("An Axe was used on anything!");
        BlockState state = context.getLevel().getBlockState(pos);
        if (state.getBlock() == EnditiumBlocks.BOILED_RESIN_ETHERSTONE) {
            LOGGER.info("Axe was used on Boiled Resin Etherstone!");
        }
        return InteractionResult.SUCCESS;

    }

    public static void Init() {
        LOGGER.info("Initialized Script for Axe and Boiled Etherstone!!");
    }
}
