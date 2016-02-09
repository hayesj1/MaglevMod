package com.tigerbird.maglevmod.item.misc;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import com.tigerbird.maglevmod.reference.References;

public abstract class ItemMM extends Item {

	private final String name = "baseitem";
	
	public ItemMM() {
		super();
		setCreativeTab(References.tabMM);
		this.setUnlocalizedName(References.MODID + ":" + name);
	}

	public abstract String getName();

	@Override
	public String getUnlocalizedName() {
		return String.format("item.%s%s", References.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
	@Override
	public String getUnlocalizedName(ItemStack itemsStack) {
		return String.format("item.%s%s", References.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}

	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
	}
	
}
