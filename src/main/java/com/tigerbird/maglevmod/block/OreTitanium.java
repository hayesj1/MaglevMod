package com.tigerbird.maglevmod.block;

import com.tigerbird.maglevmod.reference.References;
import net.minecraft.block.material.Material;

public class OreTitanium extends BlockMM {
	
	public final String name = "oretitanium";
	
    public OreTitanium(Material material) {
        super(material);
        setHardness(3.5F);
        setResistance(7.0f);
    	setUnlocalizedName(References.MODID + ":" + name);
    }

	@Override
	public String getName() { return this.name; }
}