package net.drifthyena.fluiditality;

import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FluiditalityMod implements ModInitializer {
    public static final String MOD_ID = "fluiditality";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final String INSTANCE_LOCATION = "";

    @Override
    public void onInitialize() {
        LOGGER.info("Init");
    }
}
