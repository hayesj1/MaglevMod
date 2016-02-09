package com.tigerbird.maglevmod.item.tool.tier1;

import net.minecraft.item.ItemHoe;

import com.tigerbird.maglevmod.reference.References;

public class HoeTitanium extends ItemHoe {

	public final String name = "hoeTitanium";
	
	public HoeTitanium(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(References.MODID + ":" + name);
		this.setCreativeTab(References.tabMM);
	}
}
