package io.github.racoondog.more_factory_items;

import io.github.racoondog.more_factory_items.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class MFICreativeTab extends CreativeTabs {
	
	public MFICreativeTab() {
		super(MoreFactoryItems.MODID);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack createIcon() {
		return new ItemStack(ModItems.lumium_gearbox);
	}
	
}