package com.keyaan;

import net.minecraft.core.Registry;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

public class EnditiumSounds {
    //Thank you fabric docs for this useful code
    public static final SoundEvent ENDITIUMARMORUSE = registerSound("resonance_activate");

    // actual registration of all the custom SoundEvents
    private static SoundEvent registerSound(String id) {
        ResourceLocation identifier = ResourceLocation.fromNamespaceAndPath(Enditium.MOD_ID, id);
        return Registry.register(BuiltInRegistries.SOUND_EVENT, identifier, SoundEvent.createVariableRangeEvent(identifier));
    }


    public static void init() {}
}
