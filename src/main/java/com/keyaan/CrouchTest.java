package com.keyaan;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionResult;

public class CrouchTest {
    public static void Init() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {

            if (world.isClientSide()) {
                return InteractionResult.PASS;
            }

            if (player.isCrouching()) {
                SpikesSpawn.placeSpike(
                        (ServerLevel) world,
                        player.blockPosition()
                );

                return InteractionResult.SUCCESS;
            }

            return InteractionResult.PASS;
        });
    }
}