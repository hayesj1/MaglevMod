package com.tigerbird.maglevmod.block;

import com.tigerbird.maglevmod.reference.References;
import net.minecraft.block.material.Material;

public class BlockAstralArgonite extends BlockMM {

	public final String name = "blockskycrystal";

	public BlockAstralArgonite(Material material) {
		super(material);
		setHardness(2.75F);
		setResistance(10.0f);
    	setUnlocalizedName(References.MODID + ":" + name);
	}

	@Override
	public String getName() { return this.name; }
}
