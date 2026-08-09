package com.keyaan;

import com.bananaman.api.RegistryHelper;
import net.minecraft.world.effect.MobEffect;

import static com.keyaan.Enditium.MOD_ID;

public class ArmorCooldown {
    private static final RegistryHelper<MobEffect> EFFECTS =
            RegistryHelper.mobEffects(MOD_ID);

    public static final MobEffect ENDITIUM_RESONANCE =
            EFFECTS.register(
                    "enditium_resonance",
                    new EnditiumResonanceEffect()
            );


}