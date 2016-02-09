package com.tigerbird.maglevmod.item.tool.tier2;

import net.minecraft.item.ItemSpade;
import com.tigerbird.maglevmod.reference.References;

public class ShovelMagno extends ItemSpade {

	public final String name = "shovelMagno";
	
	public ShovelMagno(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(References.MODID + ":" + name);
		this.setCreativeTab(References.tabMM);
	}
}
