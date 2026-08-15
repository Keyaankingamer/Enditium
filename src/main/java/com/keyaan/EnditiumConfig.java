package com.keyaan;

import dev.isxander.yacl3.config.v2.api.SerialEntry;

public class EnditiumConfig {
    @SerialEntry(comment = "The amount of seconds you get the Enditium Resonance effect after getting saved from death with a full set of Enditium Armor")
    public static int ArmorCooldown = 300;
    @SerialEntry(comment = "The spawn chance of a group of Etherstone Spikes spawning")
    public static int EtherstoneSpikeSpawn = 750;
}
