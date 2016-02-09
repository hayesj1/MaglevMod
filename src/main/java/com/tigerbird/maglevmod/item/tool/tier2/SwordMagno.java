package com.tigerbird.maglevmod.item.tool.tier2;

import net.minecraft.item.ItemSword;
import com.tigerbird.maglevmod.reference.References;

public class SwordMagno extends ItemSword {

	public final String name = "swordMagno";
	
	public SwordMagno(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(References.MODID + ":" + name);
		this.setCreativeTab(References.tabMM);
	}
}
