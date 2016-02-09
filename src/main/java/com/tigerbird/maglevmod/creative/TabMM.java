package com.tigerbird.maglevmod.creative;

import com.tigerbird.maglevmod.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabMM extends CreativeTabs {

	public TabMM(String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.magnetizer;
	}

}
