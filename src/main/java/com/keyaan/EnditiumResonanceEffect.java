package com.keyaan;

import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;

public class EnditiumResonanceEffect extends MobEffect {

    public EnditiumResonanceEffect() {
        super(MobEffectCategory.BENEFICIAL, 0x088F8F);
        withSoundOnAdded(SoundEvents.ALLAY_DEATH);
        withSoundOnAdded(SoundEvents.TOTEM_USE);
        withSoundOnAdded(SoundEvents.SOUL_SOIL_HIT);
        withSoundOnAdded(SoundEvents.CHAIN_BREAK);
    }
}
