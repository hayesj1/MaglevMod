package com.tigerbird.maglevmod.item.tool.tier1;

import net.minecraft.item.ItemAxe;

import com.tigerbird.maglevmod.reference.References;

public class AxeTitanuim extends ItemAxe {

	public final String name = "axeTitanium";
	
	public AxeTitanuim(ToolMaterial material) {
		super(material);
    	this.setUnlocalizedName(References.MODID + ":" + name);
    	this.setCreativeTab(References.tabMM);
	}
}
