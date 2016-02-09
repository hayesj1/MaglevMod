package com.tigerbird.maglevmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;
import com.tigerbird.maglevmod.reference.References;

import java.util.Random;

public abstract class BlockMM extends Block {

	private final String name = "baseblock";
	
	public BlockMM(Material materialIn) {
		super(materialIn);
		setCreativeTab(References.tabMM);
		setUnlocalizedName(References.MODID + "_" + name);
	}	
	protected BlockMM() {
		this(Material.rock);
	}

	public abstract String getName();

	@Override
	public Item getItemDropped(IBlockState par1, Random randomPar2, int par3) {
		return Item.getItemFromBlock(par1.getBlock());
	}
	
	@Override
	public int quantityDropped(Random randomPar1){
		return 1;
	}
	
	@Override
	public String getUnlocalizedName() {
		return String.format("tile.%s%s", References.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
	}
//	@Override
//	public String getUnlocalizedName(ItemStack itemsStack) {
//		return String.format("tile.%s%s", References.MODID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
//	}
	protected String getUnwrappedUnlocalizedName(String unlocalizedName) {
		return unlocalizedName.substring(unlocalizedName.indexOf('.') + 1);
	}
	
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state,
			EntityPlayer playerIn, EnumFacing side, float hitX, float hitY, float hitZ) {
		return super.onBlockActivated(worldIn, pos, state, playerIn, side, hitX, hitY, hitZ);
	}
}

