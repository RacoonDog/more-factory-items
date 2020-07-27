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
	
	//Unused Materials
	static boolean elementium = false;
	static boolean gaia = false;
	static boolean mana_diamond = false;
	static boolean manasteel = false;
	static boolean terrasteel = false;
	static boolean awakened_draconium = false;
	static boolean draconium = false;
	static boolean conductive_iron = false;
	static boolean crude_steel = false;
	static boolean crystalline = false;
	static boolean pink_slime_crystalline = false;
	static boolean dark_steel = false;
	static boolean electrical_steel = false;
	static boolean end_steel = false;
	static boolean energetic_alloy = false;
	static boolean energetic_silver = false;
	static boolean melodic_alloy = false;
	static boolean pulsating_iron = false;
	static boolean redstone_alloy = false;
	static boolean soularium = false;
	static boolean stellar_alloy = false;
	static boolean vibrant_alloy = false;
	static boolean vivid_alloy = false;
	static boolean nethercotta = false;
	static boolean enderium_base = false;
	static boolean demon = false;
	static boolean enchanted = false;
	static boolean evil_infused = false;
	static boolean unstable = false;
	static boolean blutonium = false;
	static boolean cyanite = false;
	static boolean graphite = false;
	static boolean ludicrite = false;
	static boolean yellorium = false;
	static boolean anglesite = false;
	static boolean benitoite = false;
	static boolean osmium = false;
	static boolean refined_glowstone = false;
	static boolean refined_obsidian = false;
	static boolean enriched_iron = false;
	static boolean infused_diamond = false;
	static boolean amber = false;
	static boolean brass = false;
	static boolean thaumium = false;
	static boolean void_material = false;
	static boolean alubrass = false;
	static boolean ardite = false;
	static boolean cobalt = false;
	static boolean knightslime = false;
	static boolean manyullyn = false;
	static boolean pigiron = false;
	static boolean silky_jewel = false;
	static boolean sun_crystal = false;
	static boolean pink_slime = false;
	static boolean treated_wood = false;
	static boolean uranium = false;
	static boolean hop_graphite = false;
	static boolean ironwood = false;
	static boolean fiery = false;
	static boolean steeleaf = false;
	static boolean knightmetal = false;
	static boolean advanced_alloy = false;
	static boolean carbon_plate = false;
	static boolean red_alloy = false;
	static boolean electrotine_alloy = false;
	static boolean enhanced_galgadorian = false;
	static boolean reinforced = false;
	static boolean galgadorian = false;
	static boolean wub = false;
	static boolean crystalized_menril = false;
	static boolean thorium = false;
	static boolean boron = false;
	static boolean lithium = false;
	static boolean magnesium = false;
	static boolean beryllium = false;
	static boolean zirconium = false;
	static boolean manganese = false;
	static boolean thorium_oxide = false;
	static boolean uranium_oxide = false;
	static boolean manganese_oxide = false;
	static boolean manganese_dioxide = false;
	static boolean tough_alloy = false;
	static boolean hard_carbon_alloy = false;
	static boolean magnesium_diboride_alloy = false;
	static boolean lithium_manganese_dioxide_alloy = false;
	static boolean ferroboron_alloy = false;
	static boolean shibuichi_alloy = false;
	static boolean tin_silver_alloy = false;
	static boolean lead_platinum_alloy = false;
	static boolean extreme_alloy = false;
	static boolean thermoconducting_alloy = false;
	static boolean zicaloy = false;
	static boolean silicon_carbide = false;
	static boolean sic_sic_ceramic_matrix_composite = false;
	static boolean hsla_steel = false;
	static boolean dark_matter = false;
	static boolean red_matter = false;
	static boolean spectre = false;
	static boolean star_metal = false;
	static boolean psimetal = false;
	static boolean ebony_psimetal = false;
	static boolean ivory_psimetal = false;
	static boolean base_essence = false;
	static boolean inferium = false;
	static boolean prudentium = false;
	static boolean intermedium = false;
	static boolean superium = false;
	static boolean supremium = false;
	static boolean soulium = false;
	static boolean titanium = false;
	static boolean ultimate = false;
	static boolean adamantine = false;
	static boolean antimony = false;
	static boolean aquarium = false;
	static boolean bismuth = false;
	static boolean cold_iron = false;
	static boolean cupronickel = false;
	static boolean obsidian_ingot = false;
	static boolean pewter = false;
	static boolean liquid_mercury = false;
	static boolean zinc = false;
	static boolean star_steel = false;
	static boolean redstone_ingot = false;
	static boolean chromium = false;
	static boolean cadmium = false;
	static boolean galvanized_steel = false;
	static boolean tantalum = false;
	static boolean stainless_steel = false;
	static boolean rutile = false;
	static boolean nichrome = false;
	static boolean tungsten = false;
	static boolean celestial_crystal = false;
	static boolean terrestrial_artifact = false;
	static boolean amordrine = false;
	static boolean haderoth = false;
	static boolean alduorite = false;
	static boolean vulcanite = false;
	static boolean ignatius = false;
	static boolean etherium = false;
	static boolean quicksilver = false;
	static boolean astral_silver = false;
	static boolean hepatizon = false;
	static boolean lemurite = false;
	static boolean sanguinite = false;
	static boolean eximite = false;
	static boolean desichalkos = false;
	static boolean celenegil = false;
	static boolean shadow_iron = false;
	static boolean carmot = false;
	static boolean ceruclase = false;
	static boolean deep_iron = false;
	static boolean angmallen = false;
	static boolean kallendrite = false;
	static boolean damascus_steel = false;
	static boolean prometheum = false;
	static boolean tartarite = false;
	static boolean atlarus = false;
	static boolean vyroxeres = false;
	static boolean black_steel = false;
	static boolean lutetium = false;
	static boolean oureclase = false;
	static boolean inolashite = false;
	static boolean meutoite = false;
	static boolean orichalum = false;
	static boolean rubracium = false;
	static boolean krik = false;
	static boolean midasium = false;
	static boolean shadow_steel = false;
	static boolean chrome = false;
	static boolean tungstensteel = false;
	static boolean refined_iron = false;
	
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
		if (Loader.isModLoaded("appliedenergistics2")) {
			try {
				certus_quartz = true;
				fluix = true;
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Botania
		if (Loader.isModLoaded("botania")) {
			try {
				elementium = true;
				gaia = true;
				mana_diamond = true;
				manasteel = true;
				terrasteel = true;
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Draconic Evolution
		if (Loader.isModLoaded("draconicevolution")) {
			try {
				awakened_draconium = true;
				draconium = true;
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Ender IO
		if (Loader.isModLoaded("enderio")) {
			try {
				conductive_iron = true;
				crude_steel = true;
				crystalline = true;
				pink_slime_crystalline = true;
				dark_steel = true;
				electrical_steel = true;
				end_steel = true;
				energetic_alloy = true;
				energetic_silver = true;
				melodic_alloy = true;
				pulsating_iron = true;
				redstone_alloy = true;
				soularium = true;
				stellar_alloy = true;
				vibrant_alloy = true;
				vivid_alloy = true;
				nethercotta = true;
				enderium_base = true;
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Extra Utilities 2
		if (Loader.isModLoaded("extrautils2")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Extreme Reactors
		if (Loader.isModLoaded("extremereactors")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Mekanism
		if (Loader.isModLoaded("mekanism")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Mekanica
		if (Loader.isModLoaded("mekanica")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Refined Storage
		if (Loader.isModLoaded("refinedstorage")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//RFTools
		if (Loader.isModLoaded("rftools")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Thaumcraft
		if (Loader.isModLoaded("thaumcraft")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Tinker's Construct
		if (Loader.isModLoaded("tinkersconstruct")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Industrial Foregoing
		if (Loader.isModLoaded("industrialforegoing")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Immersive Engineering
		if (Loader.isModLoaded("immersiveengineering")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Twilight Forest
		if (Loader.isModLoaded("twilightforest")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Industrial Craft 2
		if (Loader.isModLoaded("ic2")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Project Red
		if (Loader.isModLoaded("projectred")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Steve's Cart
		if (Loader.isModLoaded("stevescart")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Tiny Progressions
		if (Loader.isModLoaded("tinyprogressions")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Integrated Dynamics
		if (Loader.isModLoaded("integrateddynamics")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Nuclear Craft
		if (Loader.isModLoaded("nuclearcraft")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//ProjectE
		if (Loader.isModLoaded("projecte")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Random Things
		if (Loader.isModLoaded("randomthings")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Astral Sorcery
		if (Loader.isModLoaded("astralsorcery")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Psi
		if (Loader.isModLoaded("psi")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Mystical Agriculture
		if (Loader.isModLoaded("mysticalagriculture")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Base Metals
		if (Loader.isModLoaded("basemetals")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Modern Metals
		if (Loader.isModLoaded("modernmetals")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Biomes O' Plenty
		if (Loader.isModLoaded("biomesoplenty")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Metallurgy
		if (Loader.isModLoaded("metallurgy")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Tech Reborn
		if (Loader.isModLoaded("techreborn")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Forestry
		if (Loader.isModLoaded("forestry")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Mystical World
		if (Loader.isModLoaded("mysticalworld")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
		
		//Railcraft
		if (Loader.isModLoaded("railcraft")) {
			try {
				//do stuff
			}
			catch (Exception error) {
				error.printStackTrace(System.err);
			}
		}
	}
}
