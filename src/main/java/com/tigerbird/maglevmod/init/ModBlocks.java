package com.tigerbird.maglevmod.init;

import com.tigerbird.maglevmod.block.*;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {

        public static final BlockMM titaniumBlock = new BlockTitanium(Material.iron);
        public static final BlockMM titaniumOre = new OreTitanium(Material.rock);
        public static final BlockMM astralArgonite = new OreAstralArgonite(Material.rock);
        public static final BlockMM magnotheumBlock = new BlockMagnothuem(Material.iron);
        public static final BlockMM astralArgoniteBlock = new BlockAstralArgonite(Material.iron);

        public static final BlockMaglevRail maglevRail = new BlockMaglevRail(Material.iron);
        public static final BlockMagnetizationUnit magnetizationUnit = new BlockMagnetizationUnit(Material.iron);

        public static void init() {
                System.out.println("titaniumBlock: "+ titaniumBlock.getName());

                GameRegistry.registerBlock(titaniumBlock, titaniumBlock.getName());
                GameRegistry.registerBlock(titaniumOre, titaniumOre.getName());
                GameRegistry.registerBlock(astralArgonite, astralArgonite.getName());
                GameRegistry.registerBlock(magnotheumBlock, magnotheumBlock.getName());
                GameRegistry.registerBlock(astralArgoniteBlock, astralArgoniteBlock.getName());
        }
}
