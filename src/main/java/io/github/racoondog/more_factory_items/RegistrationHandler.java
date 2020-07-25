package io.github.racoondog.more_factory_items;

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
				//Modded Items
				RegistryUtil.setItemName(new Item(), "aluminum_gearbox", "gearboxAluminum").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "aluminum_rod", "rodAluminum").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "bronze_gearbox", "gearboxBronze").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "bronze_rod", "rodBronze").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "constantan_gearbox", "gearboxConstantan").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "constantan_rod", "rodConstantan").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "copper_gearbox", "gearboxCopper").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "copper_rod", "rodCopper").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "electrum_gearbox", "gearboxElectrum").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "electrum_rod", "rodElectrum").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "enderium_gearbox", "gearboxEnderium").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "enderium_rod", "rodEnderium").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "invar_gearbox", "gearboxInvar").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "invar_rod", "rodInvar").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "iridium_gearbox", "gearboxIridium").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "iridium_rod", "rodIridium").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "lead_gearbox", "gearboxLead").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "lead_rod", "gearboxLead").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "lumium_gearbox", "gearboxLumium").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "lumium_rod", "rodLumium").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "mithril_gearbox", "gearboxMithril").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "mithril_rod", "rodMithril").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "nickel_gearbox", "gearboxNickel").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "nickel_rod", "rodNickel").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "platinum_gearbox", "gearboxPlatinum").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "platinum_rod", "rodPlatinum").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "signalum_gearbox", "gearboxSignalum").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "signalum_rod", "rodSignalum").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "silver_gearbox", "gearboxSilver").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "silver_rod", "rodSilver").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "steel_gearbox", "gearboxSteel").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "steel_rod", "rodSteel").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "tin_gearbox", "gearboxTin").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "tin_rod", "rodTin").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				
				//Vanilla Items
				RegistryUtil.setItemName(new Item(), "wooden_gearbox", "gearboxWood").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "stone_rod", "rodStone").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "stone_gearbox", "gearboxStone").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "iron_rod", "rodIron").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "iron_gearbox", "gearboxIron").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "gold_rod", "rodGold").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "gold_gearbox", "gearboxGold").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "emerald_rod", "rodEmerald").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "emerald_gearbox", "gearboxEmerald").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "diamond_rod", "rodDiamond").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "diamond_gearbox", "gearboxDiamond").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "wooden_gear", "gearWood").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "stone_gear", "gearStone").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "iron_gear", "gearIron").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "gold_gear", "gearGold").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "emerald_gear", "gearEmerald").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "diamond_gear", "gearDiamond").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				
				//Factory Blends
				RegistryUtil.setItemName(new Item(), "simple_factory_blend", "factoryblendSimple").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "complicated_factory_blend", "factoryblendComplicated").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "rare_factory_blend", "factoryblendRare").setCreativeTab(MoreFactoryItems.CREATIVE_TAB),
				RegistryUtil.setItemName(new Item(), "resonant_factory_blend", "factoryblendResonant").setCreativeTab(MoreFactoryItems.CREATIVE_TAB)
		};

		event.getRegistry().registerAll(items);
	}

} 
