package com.tigerbird.maglevmod.block;

import com.tigerbird.maglevmod.reference.References;
import net.minecraft.block.material.Material;

public class BlockMagnothuem extends BlockMM {

	public final String name = "blockmagnotheum";
	
	public BlockMagnothuem(Material materialIn) {
		super(materialIn);
       	setHardness(4.0F);
        setResistance(7.0f);
        setHarvestLevel("pickaxe", 4);
    	setUnlocalizedName(References.MODID + ":" + name);
   	}

	@Override
	public String getName() { return this.name; }
}
