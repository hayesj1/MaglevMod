package com.tigerbird.maglevmod.item.misc;

import com.tigerbird.maglevmod.reference.References;

public class IngotTitanium extends ItemMM {

	public final String name = "ingottitanium";
	
	public IngotTitanium() {
		super();
		this.setMaxStackSize(64);
		this.setUnlocalizedName(References.MODID + ":" + name);
	}

	@Override
	public String getName() { return this.name; }
}
