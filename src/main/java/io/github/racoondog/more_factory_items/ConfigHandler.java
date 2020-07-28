package io.github.racoondog.more_factory_items;

import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.Config.Comment;
import net.minecraftforge.common.config.Config.Name;
import net.minecraftforge.common.config.Config.RequiresMcRestart;
@Config(modid = MoreFactoryItems.MODID, name = "MoreFactoryItems")
public class ConfigHandler {
	@Comment("Setting this to true will force load all items in this mod.")
	@RequiresMcRestart
	@Name("Load All Items")
	public static boolean loadAllItems = false;
	
	@Comment({
		"Setting this to true will remove the factory blends and all of it's byproducts.",
		"It is seperate to 'Load All Items'."
	})
	@RequiresMcRestart
	@Name("Remove Factory Blends")
	public static boolean removeFactoryBlends = false;
}