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
	public static final String VERSION = "2.0.0";
	public static final String MC_VERSION = "[1.12.2]";

	public static final Logger LOGGER = LogManager.getLogger(MoreFactoryItems.MODID);

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		LOGGER.info("PreInit Phase");
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info("Init Phase");
		RegistryUtil.OreDict(ModItems.aluminum_rod, "rodAluminum");
		RegistryUtil.OreDict(ModItems.aluminum_gearbox, "gearboxAluminum");
		RegistryUtil.OreDict(ModItems.bronze_rod, "rodBronze");
		RegistryUtil.OreDict(ModItems.bronze_gearbox, "gearboxBronze");
		RegistryUtil.OreDict(ModItems.complicated_factory_blend, "factoryblendComplicated");
		RegistryUtil.OreDict(ModItems.constantan_rod, "rodConstantan");
		RegistryUtil.OreDict(ModItems.constantan_gearbox, "gearboxConstantan");
		RegistryUtil.OreDict(ModItems.copper_rod, "rodCopper");
		RegistryUtil.OreDict(ModItems.copper_gearbox, "gearboxCopper");
		RegistryUtil.OreDict(ModItems.electrum_rod, "rodElectrum");
		RegistryUtil.OreDict(ModItems.electrum_gearbox, "gearboxElectrum");
		RegistryUtil.OreDict(ModItems.enderium_rod, "rodEnderium");
		RegistryUtil.OreDict(ModItems.enderium_gearbox, "gearboxEnderium");
		RegistryUtil.OreDict(ModItems.invar_rod, "rodInvar");
		RegistryUtil.OreDict(ModItems.invar_gearbox, "gearboxInvar");
		RegistryUtil.OreDict(ModItems.iridium_rod, "rodIridium");
		RegistryUtil.OreDict(ModItems.iridium_gearbox, "gearboxIridium");
		RegistryUtil.OreDict(ModItems.lead_rod, "rodLead");
		RegistryUtil.OreDict(ModItems.lead_gearbox, "gearboxLead");
		RegistryUtil.OreDict(ModItems.lumium_rod, "rodLumium");
		RegistryUtil.OreDict(ModItems.lumium_gearbox, "gearboxLumium");
		RegistryUtil.OreDict(ModItems.mithril_rod, "rodMithril");
		RegistryUtil.OreDict(ModItems.mithril_gearbox, "gearboxMithril");
		RegistryUtil.OreDict(ModItems.nickel_rod, "rodNickel");
		RegistryUtil.OreDict(ModItems.nickel_gearbox, "gearboxNickel");
		RegistryUtil.OreDict(ModItems.platinum_rod, "rodPlatinum");
		RegistryUtil.OreDict(ModItems.platinum_gearbox, "gearboxPlatinum");
		RegistryUtil.OreDict(ModItems.rare_factory_blend, "factoryblendRare");
		RegistryUtil.OreDict(ModItems.resonant_factory_blend, "factoryblendResonant");
		RegistryUtil.OreDict(ModItems.signalum_rod, "rodSignalum");
		RegistryUtil.OreDict(ModItems.signalum_gearbox, "gearboxSignalum");
		RegistryUtil.OreDict(ModItems.silver_rod, "rodSilver");
		RegistryUtil.OreDict(ModItems.silver_gearbox, "gearboxSilver");
		RegistryUtil.OreDict(ModItems.simple_factory_blend, "factoryblendSimple");
		RegistryUtil.OreDict(ModItems.steel_rod, "rodSteel");
		RegistryUtil.OreDict(ModItems.steel_gearbox, "gearboxSteel");
		RegistryUtil.OreDict(ModItems.tin_rod, "rodTin");
		RegistryUtil.OreDict(ModItems.tin_gearbox, "gearboxTin");
		RegistryUtil.OreDict(ModItems.wooden_gearbox, "gearboxWood");
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LOGGER.info("PostInit Phase");
	}

}
