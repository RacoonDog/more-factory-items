package io.github.racoondog.more_factory_items.util;

import io.github.racoondog.more_factory_items.MoreFactoryItems;
import net.minecraftforge.oredict.OreDictionary;
import net.minecraft.item.Item;

public class RegistryUtil {
	
	public static Item setItemName(final Item item, final String name, final String key) {
		item.setRegistryName(MoreFactoryItems.MODID, name).setTranslationKey(MoreFactoryItems.MODID + "." + key);
		return item;
	}
	
	public static Item OreDict(final Item item, final String entry) {
		OreDictionary.registerOre(entry, item);
		return item;
	}
	
}
