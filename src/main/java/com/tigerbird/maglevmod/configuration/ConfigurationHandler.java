package com.tigerbird.maglevmod.configuration;

import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import com.tigerbird.maglevmod.reference.References;

import java.io.File;

public class ConfigurationHandler {
	private static Configuration configuration;
	private static boolean testValue;
	
	public static void init(File configFile) {
		// create the configuration from the given config File

		boolean configValue = false;
		if (configuration == null) {
			configuration = new Configuration(configFile);
			//load the configuration File
			loadConfiguration();
		}	
			//read in properties from configuration File
			
			//save the configuration File
			configuration.save();
		
		System.out.println("Configuration Test " + configValue);
	}
	@SubscribeEvent
	public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event) {
		if (event.modID.equalsIgnoreCase(References.MODID)) {
			loadConfiguration();
		}
	}
	private static void loadConfiguration() {
		testValue = configuration.getBoolean("Config Value", "Example Category", true, "This is an example");
		
		if(configuration.hasChanged()) {
			configuration.save();
		}
	}
}
