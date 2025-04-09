package net.mechalina.kapibaramod;

import net.fabricmc.api.ModInitializer;

import net.mechalina.kapibaramod.block.ModBlocks;
import net.mechalina.kapibaramod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KapibaraMod implements ModInitializer {
	public static final String MOD_ID = "kapibaramod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}