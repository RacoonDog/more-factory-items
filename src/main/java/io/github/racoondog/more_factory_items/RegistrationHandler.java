package io.github.racoondog.more_factory_items;

import io.github.racoondog.more_factory_items.init.ModItems;
import io.github.racoondog.more_factory_items.util.RegistryUtil;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber(modid = MoreFactoryItems.MODID)
public class RegistrationHandler {
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				// -=- Modded Items -=-
				// --Thermal Foundation--
				//Gearbox
				RegistryUtil.setItemName(new Item(), "aluminum_gearbox", "gearboxAluminum"),
				RegistryUtil.setItemName(new Item(), "bronze_gearbox", "gearboxBronze"),
				RegistryUtil.setItemName(new Item(), "constantan_gearbox", "gearboxConstantan"),
				RegistryUtil.setItemName(new Item(), "copper_gearbox", "gearboxCopper"),
				RegistryUtil.setItemName(new Item(), "electrum_gearbox", "gearboxElectrum"),
				RegistryUtil.setItemName(new Item(), "enderium_gearbox", "gearboxEnderium"),
				RegistryUtil.setItemName(new Item(), "invar_gearbox", "gearboxInvar"),
				RegistryUtil.setItemName(new Item(), "iridium_gearbox", "gearboxIridium"),
				RegistryUtil.setItemName(new Item(), "lead_gearbox", "gearboxLead"),
				RegistryUtil.setItemName(new Item(), "lumium_gearbox", "gearboxLumium"),
				RegistryUtil.setItemName(new Item(), "mithril_gearbox", "gearboxMithril"),
				RegistryUtil.setItemName(new Item(), "nickel_gearbox", "gearboxNickel"),
				RegistryUtil.setItemName(new Item(), "platinum_gearbox", "gearboxPlatinum"),
				RegistryUtil.setItemName(new Item(), "signalum_gearbox", "gearboxSignalum"),
				RegistryUtil.setItemName(new Item(), "silver_gearbox", "gearboxSilver"),
				RegistryUtil.setItemName(new Item(), "steel_gearbox", "gearboxSteel"),
				RegistryUtil.setItemName(new Item(), "tin_gearbox", "gearboxTin"),
				
				//Rod
				RegistryUtil.setItemName(new Item(), "aluminum_rod", "rodAluminum"),
				RegistryUtil.setItemName(new Item(), "bronze_rod", "rodBronze"),
				RegistryUtil.setItemName(new Item(), "constantan_rod", "rodConstantan"),
				RegistryUtil.setItemName(new Item(), "copper_rod", "rodCopper"),
				RegistryUtil.setItemName(new Item(), "electrum_rod", "rodElectrum"),
				RegistryUtil.setItemName(new Item(), "enderium_rod", "rodEnderium"),
				RegistryUtil.setItemName(new Item(), "invar_rod", "rodInvar"),
				RegistryUtil.setItemName(new Item(), "iridium_rod", "rodIridium"),
				RegistryUtil.setItemName(new Item(), "lead_rod", "gearboxLead"),
				RegistryUtil.setItemName(new Item(), "lumium_rod", "rodLumium"),
				RegistryUtil.setItemName(new Item(), "mithril_rod", "rodMithril"),
				RegistryUtil.setItemName(new Item(), "nickel_rod", "rodNickel"),
				RegistryUtil.setItemName(new Item(), "platinum_rod", "rodPlatinum"),
				RegistryUtil.setItemName(new Item(), "signalum_rod", "rodSignalum"),
				RegistryUtil.setItemName(new Item(), "silver_rod", "rodSilver"),
				RegistryUtil.setItemName(new Item(), "steel_rod", "rodSteel"),
				RegistryUtil.setItemName(new Item(), "tin_rod", "rodTin"),
				
				//Factory Blends
				RegistryUtil.setItemName(new Item(), "simple_factory_blend", "factoryblendSimple"),
				RegistryUtil.setItemName(new Item(), "complicated_factory_blend", "factoryblendComplicated"),
				RegistryUtil.setItemName(new Item(), "rare_factory_blend", "factoryblendRare"),
				RegistryUtil.setItemName(new Item(), "resonant_factory_blend", "factoryblendResonant"),
				
				// --Applied Energistics 2--
				//Gearbox
				RegistryUtil.setItemName(new Item(), "certus_quartz_gearbox", "gearboxCertusQuartz"),
				RegistryUtil.setItemName(new Item(), "fluix_gearbox", "gearboxFluix"),
				
				//Rod
				RegistryUtil.setItemName(new Item(), "certus_quartz_rod", "rodCertusQuartz"),
				RegistryUtil.setItemName(new Item(), "fluix_rod", "rodFluix"),
				
				//Gear
				RegistryUtil.setItemName(new Item(), "certus_quartz_gear", "gearCertusQuartz"),
				RegistryUtil.setItemName(new Item(), "fluix_gear", "gearFluix"),
				
				// -=- Vanilla Items -=-
				//Gearbox
				RegistryUtil.setItemName(new Item(), "wooden_gearbox", "gearboxWood").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "stone_gearbox", "gearboxStone").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "iron_gearbox", "gearboxIron").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "gold_gearbox", "gearboxGold").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "emerald_gearbox", "gearboxEmerald").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "diamond_gearbox", "gearboxDiamond").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				
				//Rod
				RegistryUtil.setItemName(new Item(), "stone_rod", "rodStone").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "iron_rod", "rodIron").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "gold_rod", "rodGold").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "emerald_rod", "rodEmerald").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "diamond_rod", "rodDiamond").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				
				//Gear
				RegistryUtil.setItemName(new Item(), "wooden_gear", "gearWood").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "stone_gear", "gearStone").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "iron_gear", "gearIron").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "gold_gear", "gearGold").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "emerald_gear", "gearEmerald").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "diamond_gear", "gearDiamond").setCreativeTab(MoreFactoryItems.CREATIVE_TAB)
		};
		if (RegisteredMods.aluminum) {
			ModItems.aluminum_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.aluminum_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.bronze) {
			ModItems.bronze_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.bronze_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.constantan) {
			ModItems.constantan_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.constantan_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.copper) {
			ModItems.copper_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.copper_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.electrum) {
			ModItems.electrum_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.electrum_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.enderium) {
			ModItems.enderium_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.enderium_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.invar) {
			ModItems.invar_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.invar_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.iridium) {
			ModItems.iridium_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.iridium_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.lead) {
			ModItems.lead_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.lead_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.lumium) {
			ModItems.lumium_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.lumium_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.mithril) {
			ModItems.mithril_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.mithril_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.nickel) {
			ModItems.nickel_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.nickel_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.platinum) {
			ModItems.platinum_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.platinum_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.signalum) {
			ModItems.signalum_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.signalum_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.silver) {
			ModItems.silver_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.silver_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.steel) {
			ModItems.steel_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.steel_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.tin) {
			ModItems.tin_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.tin_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.certus_quartz) {
			ModItems.certus_quartz_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.certus_quartz_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.certus_quartz_gear.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		if (RegisteredMods.fluix) {
			ModItems.fluix_gearbox.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.fluix_rod.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
			ModItems.fluix_gear.setCreativeTab(MoreFactoryItems.CREATIVE_TAB);
		}
		event.getRegistry().registerAll(items);
	}
} 
