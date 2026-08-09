package com.keyaan;

import net.minecraft.core.Holder;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.Identifier;
import net.minecraft.world.effect.MobEffect;

import static com.keyaan.Enditium.MOD_ID;

public class ArmorCooldown {

    public static final Holder<MobEffect> ENDITIUM_RESONANCE =
            Registry.registerForHolder(
                    BuiltInRegistries.MOB_EFFECT,
                    Identifier.fromNamespaceAndPath(MOD_ID, "enditium_resonance"),
                    new EnditiumResonanceEffect()
            );

    public static void init() {

    }
}