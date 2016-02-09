package com.tigerbird.maglevmod.item.misc;

import com.tigerbird.maglevmod.reference.References;

public class PlateMagnothuem extends ItemMM {

	public final String name = "platemagnotheum";
	
	public PlateMagnothuem() {
		super();
		this.setMaxStackSize(16);
		this.setUnlocalizedName(References.MODID + ":" + name);
	}

	@Override
	public String getName() { return this.name; }
}
