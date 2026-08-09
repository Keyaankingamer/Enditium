package com.keyaan;

import com.mojang.logging.LogUtils;
import net.fabricmc.fabric.api.entity.event.v1.ServerLivingEntityEvents;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
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
        player.setHealth(2.0F);
        player.playSound(SoundEvents.TOTEM_USE);
        player.playSound(SoundEvents.ANVIL_USE);
        LOGGER.info("Ay you cant die");
        player.addEffect(new MobEffectInstance(
                MobEffects.REGENERATION,
                45 * 20,
                1
        ));
        player.addEffect(new MobEffectInstance(
                MobEffects.RESISTANCE,
                45 * 20,
                1
        ));
        player.addEffect(new MobEffectInstance(
                MobEffects.FIRE_RESISTANCE,
                45 * 20,
                1
        ));
        player.addEffect(new MobEffectInstance(
                MobEffects.ABSORPTION,
                45 * 20,
                1
        ));

    }

}
