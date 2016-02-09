package com.tigerbird.maglevmod.item.misc;

import com.tigerbird.maglevmod.reference.References;

public class RodTitanium extends ItemMM {

	public final String name = "rodtitanium";

	public RodTitanium(){
		super();
		this.setMaxStackSize(64);
		this.setUnlocalizedName(References.MODID + ":" + name);
	}

	@Override
	public String getName() { return this.name; }
}
