package com.tigerbird.maglevmod.item.tool.tier2;

import net.minecraft.item.ItemPickaxe;
import com.tigerbird.maglevmod.reference.References;

public class PickaxeMagno extends ItemPickaxe {

	public final String name = "pickaxeMagno";
	
	public PickaxeMagno(ToolMaterial material) {
		super(material);
		this.setUnlocalizedName(References.MODID + ":" + name);
		this.setCreativeTab(References.tabMM);
	}
}
