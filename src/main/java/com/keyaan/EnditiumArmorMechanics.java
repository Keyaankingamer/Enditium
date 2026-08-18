package com.keyaan;

import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EnditiumArmorMechanics {
    public static final Logger LOGGER = LoggerFactory.getLogger(Enditium.MOD_ID);

    public static void init() {

        ServerLivingEntityEvents.ALLOW_DEATH.register((entity, source, amount) -> {
            if (entity instanceof Player) {
                //Is the player wearing and Enditium armor?
                Player player = ((Player) entity);
                ItemStack helmet = player.getItemBySlot(EquipmentSlot.HEAD);
                ItemStack chestplate = player.getItemBySlot(EquipmentSlot.CHEST);
                ItemStack leggings = player.getItemBySlot(EquipmentSlot.LEGS);
                ItemStack boots = player.getItemBySlot(EquipmentSlot.FEET);

                //This is def not the best way to do this but idc
                if (helmet.getItem() == EnditiumArmor.ArmorInit.ENDITIUM_HELMET && chestplate.getItem() == EnditiumArmor.ArmorInit.ENDITIUM_CHESTPLATE && leggings.getItem() == EnditiumArmor.ArmorInit.ENDITIUM_LEGGINGS && boots.getItem() == EnditiumArmor.ArmorInit.ENDITIUM_BOOTS) {
                    SaveLife(player);
                    return false;
                    }
//                else if (chestplate.getItem() == EnditiumArmor.ArmorInit.ENDITIUM_CHESTPLATE) {
//                    SaveLife();
//                    return false;
//                } else if (leggings.getItem() == EnditiumArmor.ArmorInit.ENDITIUM_LEGGINGS) {
//                    SaveLife();
//                    return false;
//                } else if (boots.getItem() == EnditiumArmor.ArmorInit.ENDITIUM_BOOTS) {
//                    SaveLife();
//                    return false;
//                }
//
                }
            return true;
            }
        );

    }
    public static void SaveLife(Player player) {
        if (!player.hasEffect(ArmorCooldown.ENDITIUM_RESONANCE)) {
            player.setHealth(2.0F);
            //LOGGER.info("Ay you cant die")
            ServerLevel serverLevel = (ServerLevel) player.level();
            serverLevel.sendParticles(
                    ParticleTypes.TOTEM_OF_UNDYING,
                    player.getX(),
                    player.getY() + 1,
                    player.getZ(),
                    100,
                    0.5,
                    1.0,
                    0.5,
                    0.5
            );
            player.addEffect(new MobEffectInstance(
                    ArmorCooldown.ENDITIUM_RESONANCE,
                    EnditiumConfig.ArmorCooldown * 20,
                    0
            ));
            player.addEffect(new MobEffectInstance(
                    MobEffects.REGENERATION,
                    15 * 20,
                    1
            ));
            player.addEffect(new MobEffectInstance(
                    MobEffects.DAMAGE_RESISTANCE,
                    30 * 20,
                    1
            ));
            player.addEffect(new MobEffectInstance(
                    MobEffects.FIRE_RESISTANCE,
                    15 * 20,
                    1
            ));
            player.addEffect(new MobEffectInstance(
                    MobEffects.ABSORPTION,
                    30 * 20,
                    1
            ));
        }
    }

}
