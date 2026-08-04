package com.keyaan;

import net.fabricmc.fabric.api.event.player.UseBlockCallback;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.phys.Vec3;

public class BoiledEtherstoneResinRemove {
    public static void Init() {
        UseBlockCallback.EVENT.register((player, world, hand, hitResult) -> {
            //player right clicked on a block
            //Whats in the players hand?
            ItemStack itemInHand = player.getItemInHand(hand);
            //Check if you have an axe
            if (itemInHand.is(ItemTags.PICKAXES)) {
                //The item is an axe
                //Check what block's actually?
                BlockPos pos = hitResult.getBlockPos();
                Block BlockClicked = world.getBlockState(pos).getBlock();
                if (BlockClicked == EnditiumBlocks.BOILED_RESIN_ETHERSTONE) {
                    ItemStack EtherResinNugget = new ItemStack(EnditiumItems.ETHER_RESIN_NUGGET);
                    //Visuals and Audio
                    world.addDestroyBlockEffect(pos, EnditiumBlocks.BOILED_ETHERSTONE.defaultBlockState());
                    world.playSound(player, pos, SoundEvents.HONEY_BLOCK_BREAK, SoundSource.BLOCKS, 1.0F, 1.0F);
                    world.playSound(player, pos, SoundEvents.CALCITE_BREAK, SoundSource.BLOCKS, 1.0F, 1.0F);
                    player.swing(hand);
                    //Functionallity
                    world.setBlock(pos, EnditiumBlocks.BOILED_ETHERSTONE.defaultBlockState(), Block.UPDATE_ALL);
                    //the position of where the item should be
                    Direction face = hitResult.getDirection();
                    Vec3 facedirection = new Vec3(
                            face.getStepX(),
                            face.getStepY(),
                            face.getStepZ()
                    );
                    //Spawn the item
                    ItemEntity SpawnedResin = new ItemEntity(world, pos.getX()+facedirection.x, pos.getY()+facedirection.y, pos.getZ()+facedirection.z, EtherResinNugget);
                        //then set the velocity
                        Vec3 rawDirection = player.position().subtract(SpawnedResin.position());
                        Vec3 direction = rawDirection.normalize();
                        SpawnedResin.setDeltaMovement(direction.scale(0.15));
                        world.addFreshEntity(SpawnedResin);
                    return InteractionResult.SUCCESS;
                }
            }

            return InteractionResult.PASS;
        });
    }
}
