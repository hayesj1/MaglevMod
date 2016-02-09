package com.tigerbird.maglevmod.item.misc;

import com.tigerbird.maglevmod.reference.References;

public class RodMagnotheum extends ItemMM {

	public final String name = "rodmagnotheum";
	
	public RodMagnotheum() {
		super();
		this.setMaxStackSize(16);
		this.setUnlocalizedName(References.MODID + ":" + name);
	}

	@Override
	public String getName() { return this.name; }
}
