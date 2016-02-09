package com.tigerbird.maglevmod;

import com.tigerbird.maglevmod.init.ModBlocks;
import com.tigerbird.maglevmod.init.ModItems;
import com.tigerbird.maglevmod.init.ModRecipes;
import com.tigerbird.maglevmod.init.RenderModItems;
import com.tigerbird.maglevmod.tileentity.TileEntityMagetizationUnit;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInterModComms;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = MaglevMod.MODID, name = MaglevMod.NAME, version = MaglevMod.VERSION)
public class MaglevMod
{
    public static final String MODID = "maglevmod";
    public static final String VERSION = "0.0.1";
    public static final String NAME = "Maglev Mod";

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
        ModBlocks.init();
        ModItems.init();
    }
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        ModRecipes.init();
        if (event.getSide() == Side.CLIENT) {
            RenderModItems.init();
        }
        // Register TileEntities
        GameRegistry.registerTileEntity(TileEntityMagetizationUnit.class, ModBlocks.magnetizationUnit.name);
    }
    @EventHandler
    public void IMC(FMLInterModComms.IMCEvent event) {

    }
    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {

    }
}
