package com.tigerbird.maglevmod.block;

import com.tigerbird.maglevmod.reference.References;
import cyano.poweradvantage.api.simple.BlockSimplePowerConduit;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Random;

public class BlockMaglevRail extends BlockSimplePowerConduit {
	
	public final String name = "maglevrail";
	/**
	 * Index 0 = North
	 * Index 1 = East
	 * Index 2 = South
	 * Index 3 = West
	 */
	private boolean[] connections = new boolean[4];
	private boolean isCorner = false;

	public BlockMaglevRail(Material material) {
		super(Material.iron, 2.0f, 0.1875f, References.MAGNETIC_POWER);
    	setHardness(2.0f);
    	setResistance(7.0f);
		setUnlocalizedName(References.MODID + ":" + name);
		setDefaultState(this.blockState.getBaseState()
				.withProperty(WEST, false)
				.withProperty(DOWN, false)
				.withProperty(SOUTH, false)
				.withProperty(EAST, false)
				.withProperty(UP, false)
				.withProperty(NORTH, false));
		connections[0] = false;
		connections[1] = false;
		connections[2] = false;
		connections[3] = false;
		GameRegistry.registerBlock(this, name);
	}

	/*@Override
	public PoweredEntity createNewTileEntity(World world, int metaDataValue) {
		return new TileEntityMaglevRail(metaDataValue);
	}*/

	@Override
	protected boolean canConnectTo(IBlockAccess w, BlockPos thisBlock, IBlockState bs, EnumFacing face, BlockPos otherBlock) {
		boolean sameType = super.canConnectTo(w, thisBlock, bs, face, otherBlock);

		if(sameType) {
			if(!isCorner()) {
				boolean northSouth = false;
				boolean eastWest = false;
				boolean invalid = false;

				if(connections[0] || connections[2]) {
					northSouth = true;
				} else if (connections[1] || connections[3]) {
					eastWest = true;
				}
				if (northSouth && eastWest) {
					invalid = true;
				}

				switch (face) {
					case NORTH:
					case SOUTH:
						return (northSouth && !invalid);
					case EAST:
					case WEST:
						return (eastWest && !invalid);
					case UP:
					case DOWN:
					default:
						return false;
				}
			} else {
				EnumFacing beforeTurn;
				EnumFacing afterTurn;
				if(connections[0]) {
					beforeTurn = EnumFacing.SOUTH;
				} else if (connections[1]) {
					beforeTurn = EnumFacing.WEST;
				} else if (connections[2]) {
					beforeTurn = EnumFacing.NORTH;
				} else if (connections[3]) {
					beforeTurn = EnumFacing.EAST;
				} else {
					beforeTurn = EnumFacing.NORTH;
				}

				if (face.rotateY().equals(beforeTurn) || face.rotateYCCW().equals(beforeTurn)) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public boolean hasComparatorInputOverride() {
		return false;
	}

	@Override
	public int getComparatorInputOverride(World world, BlockPos blockPos) {
		return 0;
	}

	public static boolean isMaglevRailBlock(World worldIn, BlockPos pos)
	{
		return isMaglevRailBlock(worldIn.getBlockState(pos));
	}

	public static boolean isMaglevRailBlock(IBlockState state)
	{
		Block block = state.getBlock();
		return block instanceof BlockMaglevRail;
	}

	@Override
	public void updateTick(World worldIn, BlockPos pos, IBlockState state, Random rand) {
		super.updateTick(worldIn, pos, state, rand);
		checkForNeighbooringRails(worldIn, pos, state);
	}

	private void checkForNeighbooringRails(World worldIn, BlockPos pos, IBlockState state) {
		this.connections[0] = worldIn.getBlockState(pos.north()).getBlock() instanceof BlockMaglevRail;
		this.connections[1] = worldIn.getBlockState(pos.east()).getBlock() instanceof BlockMaglevRail;
		this.connections[2] = worldIn.getBlockState(pos.south()).getBlock() instanceof BlockMaglevRail;
		this.connections[3] = worldIn.getBlockState(pos.west()).getBlock() instanceof BlockMaglevRail;
	}

	public String getName() { return this.name; }
	public boolean isCorner() { return isCorner; }

}
