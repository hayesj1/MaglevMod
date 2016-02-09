package com.tigerbird.maglevmod.block;

import com.tigerbird.maglevmod.reference.References;
import com.tigerbird.maglevmod.tileentity.TileEntityMagetizationUnit;
import cyano.poweradvantage.api.PoweredEntity;
import cyano.poweradvantage.api.simple.BlockSimplePowerSource;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by hayesj3 on 8/31/2015.
 */
public class BlockMagnetizationUnit extends BlockSimplePowerSource {

    public final String name = "magnetizationunit";

    public BlockMagnetizationUnit(Material material) {
        super(Material.piston, 2.0f, References.MAGNETIC_POWER);
        setResistance(7.0f);
        setUnlocalizedName(References.MODID + ":" + name);
        GameRegistry.registerBlock(this, name);
    }

    public String getName() { return name; }

    @Override
    public PoweredEntity createNewTileEntity(World world, int metaDataValue) {
        return new TileEntityMagetizationUnit();
    }

    @Override
    public boolean hasComparatorInputOverride() {
        return false;
    }

    @Override
    public int getComparatorInputOverride(World world, BlockPos blockPos) {
        return 0;
    }
}
