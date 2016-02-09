package com.tigerbird.maglevmod.item.tool.tier2;

import net.minecraft.item.ItemHoe;
import com.tigerbird.maglevmod.reference.References;

public class HoeMagno extends ItemHoe {

	public final String name = "hoeMagno";
	
	public HoeMagno(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(References.MODID + ":" + name);
		this.setCreativeTab(References.tabMM);
	}
}
