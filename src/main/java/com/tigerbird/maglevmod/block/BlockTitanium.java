package com.tigerbird.maglevmod.block;

import com.tigerbird.maglevmod.reference.References;
import net.minecraft.block.material.Material;

public class BlockTitanium extends BlockMM {

	public final String name = "blocktitanium";
	
	public BlockTitanium(Material material) {
        super(material);
       	setHardness(2.0F);
        setResistance(7.0f);
    	setUnlocalizedName(References.MODID + ":" + name);
   	}

	@Override
	public String getName() { return this.name; }
}
