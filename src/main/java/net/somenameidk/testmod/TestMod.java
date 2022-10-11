package net.somenameidk.testmod;

import net.fabricmc.api.ModInitializer;
import net.somenameidk.testmod.item.ItemsClass;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMod implements ModInitializer {
	public static String MOD_ID = "testmod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemsClass.registerModItems();
	}
}
