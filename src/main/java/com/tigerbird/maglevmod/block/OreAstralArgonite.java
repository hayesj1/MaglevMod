package com.tigerbird.maglevmod.block;

import com.tigerbird.maglevmod.init.ModItems;
import com.tigerbird.maglevmod.reference.References;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

import java.util.Random;

public class OreAstralArgonite extends BlockMM {

	public final String name = "oreskycrystal";
	
	public OreAstralArgonite(Material material) {
		super(material);
			setHardness(5.0F);
			setResistance(8.5f);
	    	setUnlocalizedName(References.MODID + ":" + name);
	}
    
	@Override
	public Item getItemDropped(IBlockState par1, Random randomPar2, int par3) {
		return ModItems.astralArgoniteCrystal;
	}
	
	@Override
	public int quantityDropped(Random randomPar1){
		int rand = randomPar1.nextInt(12) - 5;
		if (rand <= 3)
			rand = 3;
		else if (rand > 3 && rand < 6)
			rand += 2;
		
		return rand;
	}

	@Override
	public String getName() { return this.name; }
}
