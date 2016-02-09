package com.tigerbird.maglevmod.item.tool.tier2;

import net.minecraft.item.ItemAxe;
import com.tigerbird.maglevmod.reference.References;

public class AxeMagno extends ItemAxe {

	public final String name = "axeMagno";
	
	public AxeMagno(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(References.MODID + ":" + name);
		this.setCreativeTab(References.tabMM);
	}
}
