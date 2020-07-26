package io.github.racoondog.more_factory_items;

import net.minecraftforge.fml.common.Loader;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

public class RegisteredMods {
	//Set Material Variables
	static boolean aluminum = false;
	static boolean bronze = false;
	static boolean constantan = false;
	static boolean copper = false;
	static boolean electrum = false;
	static boolean enderium = false;
	static boolean invar = false;
	static boolean iridium = false;
	static boolean lead = false;
	static boolean lumium = false;
	static boolean mithril = false;
	static boolean nickel = false;
	static boolean platinum = false;
	static boolean signalum = false;
	static boolean silver = false;
	static boolean steel = false;
	static boolean tin = false;
	static boolean certus_quartz = false;
	static boolean fluix = false;
	
	public static void modsLoaded(FMLPostInitializationEvent event) {
		//Thermal Foundation
		if (Loader.isModLoaded("thermalfoundation")) {
			try {
				aluminum = true;
				bronze = true;
				constantan = true;
				copper = true;
				electrum = true;
				enderium = true;
				invar = true;
				iridium = true;
				lead = true;
				lumium = true;
				mithril = true;
				nickel = true;
				platinum = true;
				signalum = true;
				silver = true;
				steel = true;
				tin = true;
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		//Applied Energistics 2
		if (Loader.isModLoaded("ae2")) {
			try {
				certus_quartz = true;
				fluix = true;
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
	}
}
