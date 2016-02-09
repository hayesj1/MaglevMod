package com.tigerbird.maglevmod.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {
	
	public static void init() {
	//Register Shaped Recipes
		// misc item
       	GameRegistry.addRecipe(new ItemStack(ModItems.rodTitanium, 2), new Object[] {"I", "I", 'I', ModItems.ingotTitanium});
       	GameRegistry.addRecipe(new ItemStack(ModItems.plateTitanium), new Object[] {"TT", 'T', ModItems.ingotTitanium});
		GameRegistry.addRecipe(new ItemStack(ModItems.rodMagnotheum, 2), new Object[] {"TAT", "TAT", "TAT", 'T', ModItems.ingotTitanium, 'A', ModItems.astralArgoniteCrystal});
		GameRegistry.addRecipe(new ItemStack(ModItems.plateMagnothuem), new Object[] {"TA", "AT", 'T', ModItems.ingotTitanium, 'A', ModItems.astralArgoniteCrystal});

       	// misc block
       	GameRegistry.addRecipe(new ItemStack(ModBlocks.titaniumBlock), new Object[] {"III", "III", "III", 'I', ModItems.ingotTitanium});
       	GameRegistry.addRecipe(new ItemStack(ModBlocks.magnotheumBlock), new Object[] {"III", "III", "III", 'I', ModItems.ingotTitanium});
       	GameRegistry.addRecipe(new ItemStack(ModBlocks.astralArgoniteBlock), new Object[] {"CCC", "CCC", "CCC", 'C', ModItems.astralArgoniteCrystal});
       	GameRegistry.addRecipe(new ItemStack(ModBlocks.magnetizationUnit), new Object[] {"C C", "RAR", "C C", 'A', ModBlocks.astralArgoniteBlock, 'C', ModItems.astralArgoniteCoil, 'R', ModItems.rodMagnotheum});

       	// tools: tier 1
       	GameRegistry.addRecipe(new ItemStack(ModItems.swordTitanium), new Object[] {" I ", " I ", " R ", 'I', ModItems.ingotTitanium, 'R', ModItems.rodTitanium});
       	GameRegistry.addRecipe(new ItemStack(ModItems.pickaxeTitanium), new Object[] {"III", " R ", " R ", 'I', ModItems.ingotTitanium, 'R', ModItems.rodTitanium});
       	GameRegistry.addRecipe(new ItemStack(ModItems.axeTitanium), new Object[] {"II ", "IR ", " R ", 'I', ModItems.ingotTitanium, 'R', ModItems.rodTitanium});
       	GameRegistry.addRecipe(new ItemStack(ModItems.shovelTitanium), new Object[] {" I ", " R ", " R ", 'I', ModItems.ingotTitanium, 'R', ModItems.rodTitanium});
       	GameRegistry.addRecipe(new ItemStack(ModItems.hoeTitanium), new Object[] {"II ", " R ", " R ", 'I', ModItems.ingotTitanium, 'R', ModItems.rodTitanium});

       	// armor: tier 1
       	GameRegistry.addRecipe(new ItemStack(ModItems.armorTitaniumHelmet), new Object[] {"III", "I I", 'I', ModItems.ingotTitanium});
       	GameRegistry.addRecipe(new ItemStack(ModItems.armorTitaniumChectplate), new Object[] {"I I", "III", "III", 'I', ModItems.ingotTitanium});
       	GameRegistry.addRecipe(new ItemStack(ModItems.armorTitaniumLeggings), new Object[] {"III", "I I", "I I", 'I', ModItems.ingotTitanium});
       	GameRegistry.addRecipe(new ItemStack(ModItems.armorTitaniumBoots), new Object[] {"I I", "I I", 'I', ModItems.ingotTitanium});
       	
       	// rails
       	GameRegistry.addRecipe(new ItemStack(ModBlocks.maglevRail), new Object[]{" R ", "PRP", " R ", 'P', ModItems.plateTitanium, 'R', ModItems.rodMagnotheum});
       	
    //Register Shapeless Recipes
       	// mineral block -> mineral item
       	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.ingotTitanium, 9), new Object[] {ModBlocks.titaniumBlock});
       	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.astralArgoniteCrystal, 9), new Object[] {ModBlocks.astralArgoniteBlock});
       	
       	// tools: tier 2
       	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.swordMagno), new Object[] {ModItems.astralArgoniteCrystal, ModItems.magnetizer, ModItems.swordTitanium});
       	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.pickaxeMagno), new Object[] {ModItems.astralArgoniteCrystal, ModItems.magnetizer, ModItems.pickaxeTitanium});
       	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.axeMagno), new Object[] {ModItems.astralArgoniteCrystal, ModItems.magnetizer, ModItems.axeTitanium});
       	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.shovelMagno), new Object[] {ModItems.astralArgoniteCrystal, ModItems.magnetizer, ModItems.shovelTitanium});
       	GameRegistry.addShapelessRecipe(new ItemStack(ModItems.hoeMagno), new Object[] {ModItems.astralArgoniteCrystal, ModItems.magnetizer, ModItems.hoeTitanium});
       	
    // Register Smelting Recipes
       	// ores and gems
       	GameRegistry.addSmelting(ModBlocks.titaniumOre, new ItemStack(ModItems.ingotTitanium), 3.0f);
       	GameRegistry.addSmelting(ModBlocks.astralArgonite, new ItemStack(ModItems.astralArgoniteCrystal), 5.0f);
	}
}
