package io.github.racoondog.more_factory_items;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import io.github.racoondog.more_factory_items.init.ModItems;
import io.github.racoondog.more_factory_items.util.RegistryUtil;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = MoreFactoryItems.MODID, name = MoreFactoryItems.NAME, version = MoreFactoryItems.VERSION, acceptedMinecraftVersions = MoreFactoryItems.MC_VERSION)
public class MoreFactoryItems {
	
	public static final CreativeTabs CREATIVE_TAB = new MFICreativeTab();

	public static final String MODID = "morefactoryitems";
	public static final String NAME = "More Factory Items";
	public static final String VERSION = "2.3.0";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(MoreFactoryItems.MODID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LOGGER.info("PreInit Phase");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info("Init Phase");
		// --Registering Oredict Entries--
		//Rods/Gearboxes
		RegistryUtil.OreDict(ModItems.aluminum_gearbox, "gearboxAluminum");
		RegistryUtil.OreDict(ModItems.aluminum_rod, "rodAluminum");
		RegistryUtil.OreDict(ModItems.bronze_gearbox, "gearboxBronze");
		RegistryUtil.OreDict(ModItems.bronze_rod, "rodBronze");
		RegistryUtil.OreDict(ModItems.constantan_gearbox, "gearboxConstantan");
		RegistryUtil.OreDict(ModItems.constantan_rod, "rodConstantan");
		RegistryUtil.OreDict(ModItems.copper_gearbox, "gearboxCopper");
		RegistryUtil.OreDict(ModItems.copper_rod, "rodCopper");
		RegistryUtil.OreDict(ModItems.electrum_gearbox, "gearboxElectrum");
		RegistryUtil.OreDict(ModItems.electrum_rod, "rodElectrum");
		RegistryUtil.OreDict(ModItems.enderium_gearbox, "gearboxEnderium");
		RegistryUtil.OreDict(ModItems.enderium_rod, "rodEnderium");
		RegistryUtil.OreDict(ModItems.invar_gearbox, "gearboxInvar");
		RegistryUtil.OreDict(ModItems.invar_rod, "rodInvar");
		RegistryUtil.OreDict(ModItems.iridium_gearbox, "gearboxIridium");
		RegistryUtil.OreDict(ModItems.iridium_rod, "rodIridium");
		RegistryUtil.OreDict(ModItems.lead_gearbox, "gearboxLead");
		RegistryUtil.OreDict(ModItems.lead_rod, "rodLead");
		RegistryUtil.OreDict(ModItems.lumium_gearbox, "gearboxLumium");
		RegistryUtil.OreDict(ModItems.lumium_rod, "rodLumium");
		RegistryUtil.OreDict(ModItems.mithril_gearbox, "gearboxMithril");
		RegistryUtil.OreDict(ModItems.mithril_rod, "rodMithril");
		RegistryUtil.OreDict(ModItems.nickel_gearbox, "gearboxNickel");
		RegistryUtil.OreDict(ModItems.nickel_rod, "rodNickel");
		RegistryUtil.OreDict(ModItems.platinum_gearbox, "gearboxPlatinum");
		RegistryUtil.OreDict(ModItems.platinum_rod, "rodPlatinum");
		RegistryUtil.OreDict(ModItems.signalum_gearbox, "gearboxSignalum");
		RegistryUtil.OreDict(ModItems.signalum_rod, "rodSignalum");
		RegistryUtil.OreDict(ModItems.silver_gearbox, "gearboxSilver");
		RegistryUtil.OreDict(ModItems.silver_rod, "rodSilver");
		RegistryUtil.OreDict(ModItems.steel_gearbox, "gearboxSteel");
		RegistryUtil.OreDict(ModItems.steel_rod, "rodSteel");
		RegistryUtil.OreDict(ModItems.tin_gearbox, "gearboxTin");
		RegistryUtil.OreDict(ModItems.tin_rod, "rodTin");
		
		//Vanilla Rods/Gearboxes
		RegistryUtil.OreDict(ModItems.wooden_gearbox, "gearboxWood");
		RegistryUtil.OreDict(ModItems.stone_rod, "rodStone");
		RegistryUtil.OreDict(ModItems.stone_gearbox, "gearboxStone");
		RegistryUtil.OreDict(ModItems.iron_rod, "rodIron");
		RegistryUtil.OreDict(ModItems.iron_gearbox, "gearboxIron");
		RegistryUtil.OreDict(ModItems.gold_rod, "rodGold");
		RegistryUtil.OreDict(ModItems.gold_gearbox, "gearboxGold");
		RegistryUtil.OreDict(ModItems.emerald_rod, "rodEmerald");
		RegistryUtil.OreDict(ModItems.emerald_gearbox, "gearboxEmerald");
		RegistryUtil.OreDict(ModItems.diamond_rod, "rodDiamond");
		RegistryUtil.OreDict(ModItems.diamond_gearbox, "gearboxDiamond");
		
		//Factory Blends
		RegistryUtil.OreDict(ModItems.simple_factory_blend, "factoryblendSimple");
		RegistryUtil.OreDict(ModItems.complicated_factory_blend, "factoryblendComplicated");
		RegistryUtil.OreDict(ModItems.rare_factory_blend, "factoryblendRare");
		RegistryUtil.OreDict(ModItems.resonant_factory_blend, "factoryblendResonant");
		
		// -Other Entries-
		//Metal Rods
		RegistryUtil.OreDict(ModItems.aluminum_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.bronze_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.constantan_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.copper_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.electrum_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.enderium_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.invar_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.iridium_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.lead_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.lumium_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.mithril_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.nickel_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.platinum_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.signalum_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.silver_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.steel_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.tin_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.iron_rod, "rodMetalAny");
		RegistryUtil.OreDict(ModItems.gold_rod, "rodMetalAny");
		
		//Metal Gearboxes
		RegistryUtil.OreDict(ModItems.aluminum_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.bronze_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.constantan_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.copper_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.electrum_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.enderium_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.invar_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.iridium_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.lead_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.lumium_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.mithril_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.nickel_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.platinum_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.signalum_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.silver_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.steel_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.tin_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.iron_gearbox, "gearboxMetalAny");
		RegistryUtil.OreDict(ModItems.gold_gearbox, "gearboxMetalAny");
		
		//Factory Blends
		RegistryUtil.OreDict(ModItems.simple_factory_blend, "factoryblendAny");
		RegistryUtil.OreDict(ModItems.complicated_factory_blend, "factoryblendAny");
		RegistryUtil.OreDict(ModItems.rare_factory_blend, "factoryblendAny");
		RegistryUtil.OreDict(ModItems.resonant_factory_blend, "factoryblendAny");
		
		//Primitive Items
		RegistryUtil.OreDict(ModItems.wooden_gearbox, "gearboxPrimitiveAny");
		RegistryUtil.OreDict(ModItems.stone_gearbox, "gearboxPrimitiveAny");
		RegistryUtil.OreDict(ModItems.stone_rod, "rodPrimitiveAny");
		
		//Vanilla Items
		RegistryUtil.OreDict(ModItems.wooden_gearbox, "gearboxVanillaAny");
		RegistryUtil.OreDict(ModItems.stone_gearbox, "gearboxVanillaAny");
		RegistryUtil.OreDict(ModItems.iron_gearbox, "gearboxVanillaAny");
		RegistryUtil.OreDict(ModItems.gold_gearbox, "gearboxVanillaAny");
		RegistryUtil.OreDict(ModItems.emerald_gearbox, "gearboxVanillaAny");
		RegistryUtil.OreDict(ModItems.diamond_gearbox, "gearboxVanillaAny");
		
		RegistryUtil.OreDict(ModItems.stone_rod, "rodVanillaAny");
		RegistryUtil.OreDict(ModItems.iron_rod, "rodVanillaAny");
		RegistryUtil.OreDict(ModItems.gold_rod, "rodVanillaAny");
		RegistryUtil.OreDict(ModItems.emerald_rod, "rodVanillaAny");
		RegistryUtil.OreDict(ModItems.diamond_rod, "rodVanillaAny");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LOGGER.info("PostInit Phase");
	}

}
