package com.tigerbird.maglevmod.item.tool.tier1;

import net.minecraft.item.ItemSword;
import com.tigerbird.maglevmod.reference.References;

public class SwordTitanium extends ItemSword {

	public final String name = "swordTitanium";
	
	public SwordTitanium(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(References.MODID + ":" + name);
		this.setCreativeTab(References.tabMM);
	}
}
