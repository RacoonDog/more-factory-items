package io.github.racoondog.more_factory_items.client;

import io.github.racoondog.more_factory_items.MoreFactoryItems;
import io.github.racoondog.more_factory_items.init.ModItems;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT, modid = MoreFactoryItems.MODID)
public class ModelRegistrationHandler {
	
	@SubscribeEvent
	public static void registerModels(ModelRegistryEvent event) {
		//Rods/Gearboxes
		registerModel(ModItems.aluminum_gearbox, 0);
		registerModel(ModItems.aluminum_rod, 0);
		registerModel(ModItems.bronze_gearbox, 0);
		registerModel(ModItems.bronze_rod, 0);
		registerModel(ModItems.constantan_gearbox, 0);
		registerModel(ModItems.constantan_rod, 0);
		registerModel(ModItems.copper_gearbox, 0);
		registerModel(ModItems.copper_rod, 0);
		registerModel(ModItems.electrum_gearbox, 0);
		registerModel(ModItems.electrum_rod, 0);
		registerModel(ModItems.enderium_gearbox, 0);
		registerModel(ModItems.enderium_rod, 0);
		registerModel(ModItems.invar_gearbox, 0);
		registerModel(ModItems.invar_rod, 0);
		registerModel(ModItems.iridium_gearbox, 0);
		registerModel(ModItems.iridium_rod, 0);
		registerModel(ModItems.lead_gearbox, 0);
		registerModel(ModItems.lead_rod, 0);
		registerModel(ModItems.lumium_gearbox, 0);
		registerModel(ModItems.lumium_rod, 0);
		registerModel(ModItems.mithril_gearbox, 0);
		registerModel(ModItems.mithril_rod, 0);
		registerModel(ModItems.nickel_gearbox, 0);
		registerModel(ModItems.nickel_rod, 0);
		registerModel(ModItems.platinum_gearbox, 0);
		registerModel(ModItems.platinum_rod, 0);
		registerModel(ModItems.signalum_gearbox, 0);
		registerModel(ModItems.signalum_rod, 0);
		registerModel(ModItems.silver_gearbox, 0);
		registerModel(ModItems.silver_rod, 0);
		registerModel(ModItems.steel_gearbox, 0);
		registerModel(ModItems.steel_rod, 0);
		registerModel(ModItems.tin_gearbox, 0);
		registerModel(ModItems.tin_rod, 0);
		
		//Vanilla Rods/Gearboxes
		registerModel(ModItems.wooden_gearbox, 0);
		
		//Factory Blends
		registerModel(ModItems.simple_factory_blend, 0);
		registerModel(ModItems.complicated_factory_blend, 0);
		registerModel(ModItems.rare_factory_blend, 0);
		registerModel(ModItems.resonant_factory_blend, 0);
	}

	private static void registerModel(Item item, int meta) {
		ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(item.getRegistryName(), "inventory"));
	}

}
