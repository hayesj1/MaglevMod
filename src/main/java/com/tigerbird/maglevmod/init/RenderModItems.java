package com.tigerbird.maglevmod.init;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

import com.tigerbird.maglevmod.reference.References;

public class RenderModItems {
	
	public static void init() {
		RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		// item
		renderItem.getItemModelMesher().register(ModItems.mapleLeaf, 0, new ModelResourceLocation(References.MODID + ":" +  ModItems.mapleLeaf.getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.magnetizer, 0, new ModelResourceLocation(References.MODID + ":" +  ModItems.magnetizer.getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.ingotTitanium, 0, new ModelResourceLocation(References.MODID + ":" +  ModItems.ingotTitanium.getName(), "inventory"));
		renderItem.getItemModelMesher().register(ModItems.astralArgoniteCrystal, 0, new ModelResourceLocation(References.MODID + ":" +  ModItems.astralArgoniteCrystal.getName(), "inventory"));
		
		// block
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.titaniumBlock), 0, new ModelResourceLocation(References.MODID + ":" +  ModBlocks.titaniumBlock.getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.titaniumOre), 0, new ModelResourceLocation(References.MODID + ":" +  ModBlocks.titaniumOre.getName(), "inventory"));
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.magnetizationUnit), 0, new ModelResourceLocation(References.MODID + ":" + ModBlocks.magnetizationUnit.getName(), "inventory"));
		// rails
		renderItem.getItemModelMesher().register(Item.getItemFromBlock(ModBlocks.maglevRail), 0, new ModelResourceLocation(References.MODID + ":" +  ModBlocks.maglevRail.getName(), "inventory"));
		
		System.out.println("Item rendering complete!");
	}
}
