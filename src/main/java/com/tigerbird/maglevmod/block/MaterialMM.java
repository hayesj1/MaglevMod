package com.tigerbird.maglevmod.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class MaterialMM extends Material {

	public static final Material titanium = new MaterialMM(MapColor.ironColor);
	public static final Material magnotheum = new MaterialMM(MapColor.ironColor).setImmovableMobility();
	
	public MaterialMM(MapColor color) {
		super(color);
	}

}