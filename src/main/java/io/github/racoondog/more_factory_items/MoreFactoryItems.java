package io.github.racoondog.more_factory_items;

import io.github.racoondog.more_factory_items.oredict.OreDict;
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
	public static final String VERSION = "2.4.0";
	public static final String MC_VERSION = "[1.12.2]";

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		// --Registering Oredict Entries--
		OreDict.registerOreDict(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		// --Unloading Useless Items--
		RegisteredMods.modsLoaded(event);
	}

}
