package com.tigerbird.maglevmod.item.tool.tier1;

import net.minecraft.item.ItemPickaxe;

import com.tigerbird.maglevmod.reference.References;

public class PickaxeTitanium extends ItemPickaxe {

	public final String name = "pickaxeTitanium";
	
	public PickaxeTitanium(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(References.MODID + ":" + name);
		this.setCreativeTab(References.tabMM);
	}
}
