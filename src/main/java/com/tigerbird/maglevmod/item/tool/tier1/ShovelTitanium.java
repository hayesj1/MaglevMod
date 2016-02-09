package com.tigerbird.maglevmod.item.tool.tier1;

import net.minecraft.item.ItemSpade;

import com.tigerbird.maglevmod.reference.References;

public class ShovelTitanium extends ItemSpade {

	public final String name = "shovelTitanium";
	
	public ShovelTitanium(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(References.MODID + ":" + name);
		this.setCreativeTab(References.tabMM);
	}
}
