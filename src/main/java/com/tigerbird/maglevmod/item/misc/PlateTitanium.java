package com.tigerbird.maglevmod.item.misc;

import net.minecraftforge.fml.common.registry.GameRegistry;

import com.tigerbird.maglevmod.reference.References;


public class PlateTitanium extends ItemMM {

	public final String name = "platetitanium";
	
	public PlateTitanium(){
		super();
		this.setMaxStackSize(64);
		this.setUnlocalizedName(References.MODID + ":" + name);
		GameRegistry.registerItem(this, name);
	}

	@Override
	public String getName() { return this.name; }
}
