package com.tigerbird.maglevmod.init;

import com.tigerbird.maglevmod.item.armor.tier1.ArmorTitanium;
import com.tigerbird.maglevmod.item.misc.*;
import com.tigerbird.maglevmod.item.tool.misc.ToolMagnetizer;
import com.tigerbird.maglevmod.item.tool.tier1.*;
import com.tigerbird.maglevmod.item.tool.tier2.*;
import com.tigerbird.maglevmod.reference.References;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class ModItems {
	// materials
	public static final ToolMaterial TITANIUM_T = EnumHelper.addToolMaterial("Titanium", 3, 2500, 15.0F, 8.0F, 25);
	public static final ToolMaterial MAGNOTHEUM_T = EnumHelper.addToolMaterial("Magnotheum", 4, 5000, 25.0F, 12.0F, 35);
	public static final ArmorMaterial TITANIUM_A = EnumHelper.addArmorMaterial("Titanium", References.MODID + "models.armor", 250, new int[]{3, 10, 7, 3}, 25);
	public static final ArmorMaterial MAGNOTHEUM_A = EnumHelper.addArmorMaterial("Magnotheum", References.MODID + "models.armor", 500, new int[] {5, 15, 10, 5}, 35);
	
	// misc item
	public static final ItemMM mapleLeaf = new ItemMapleLeaf(); // test item
	public static final ItemMM ingotTitanium = new IngotTitanium();
	public static final ItemMM rodTitanium = new RodTitanium();
	public static final ItemMM plateTitanium = new PlateTitanium();
	public static final ItemMM rodMagnotheum = new RodMagnotheum();
	public static final ItemMM plateMagnothuem = new PlateMagnothuem();
	public static final ItemMM astralArgoniteCrystal = new AstralArgoniteCrystal();
	public static final ItemMM astralArgoniteCoil = new AstralArgoniteCoil();
	
	// tools: tier 1
	public static final SwordTitanium swordTitanium = new SwordTitanium(TITANIUM_T);
	public static final ShovelTitanium shovelTitanium = new ShovelTitanium(TITANIUM_T);
	public static final PickaxeTitanium pickaxeTitanium = new PickaxeTitanium(TITANIUM_T);
	public static final AxeTitanuim axeTitanium = new AxeTitanuim(TITANIUM_T);
	public static final HoeTitanium hoeTitanium = new HoeTitanium(TITANIUM_T);
	
	// tools: tier 2
	public static final SwordMagno swordMagno = new SwordMagno(MAGNOTHEUM_T);
	public static final ShovelMagno shovelMagno = new ShovelMagno(MAGNOTHEUM_T);
	public static final PickaxeMagno pickaxeMagno = new PickaxeMagno(MAGNOTHEUM_T);
	public static final AxeMagno axeMagno = new AxeMagno(MAGNOTHEUM_T);
	public static final HoeMagno hoeMagno = new HoeMagno(MAGNOTHEUM_T);
	
	// tools: misc
	public static final ItemMM magnetizer = new ToolMagnetizer();
	
	// armor: tier 1
	public static final ItemArmor armorTitaniumHelmet = new ArmorTitanium(TITANIUM_A, 4, 0);
	public static final ItemArmor armorTitaniumChectplate = new ArmorTitanium(TITANIUM_A, 4, 1);
	public static final ItemArmor armorTitaniumLeggings = new ArmorTitanium(TITANIUM_A, 4, 2);
	public static final ItemArmor armorTitaniumBoots = new ArmorTitanium(TITANIUM_A, 4, 3);
	
	// armor: tier 2
	public static final ItemArmor armorMagnoHelmet = new ArmorTitanium(MAGNOTHEUM_A, 5, 0);
	public static final ItemArmor armorMagnoChectplate = new ArmorTitanium(MAGNOTHEUM_A, 5, 1);
	public static final ItemArmor armorMagnoLeggings = new ArmorTitanium(MAGNOTHEUM_A, 5, 2);
	public static final ItemArmor armorMagnoBoots = new ArmorTitanium(MAGNOTHEUM_A, 5, 3);

	public static void init() {
		// misc item
		GameRegistry.registerItem(mapleLeaf, mapleLeaf.getName());
		GameRegistry.registerItem(ingotTitanium, ingotTitanium.getName());
		GameRegistry.registerItem(rodTitanium, rodTitanium.getName());
		GameRegistry.registerItem(plateTitanium, plateTitanium.getName());
		GameRegistry.registerItem(rodMagnotheum, rodMagnotheum.getName());
		GameRegistry.registerItem(plateMagnothuem, plateMagnothuem.getName());
		GameRegistry.registerItem(astralArgoniteCrystal, astralArgoniteCrystal.getName());
		GameRegistry.registerItem(astralArgoniteCoil, astralArgoniteCoil.getName());

		// tools: tier 1
		GameRegistry.registerItem(swordTitanium, swordTitanium.name);
		GameRegistry.registerItem(shovelTitanium, shovelTitanium.name);
		GameRegistry.registerItem(pickaxeTitanium, pickaxeTitanium.name);
		GameRegistry.registerItem(axeTitanium, axeTitanium.name);
		GameRegistry.registerItem(hoeTitanium, hoeTitanium.name);

		// tools: tier 2
		GameRegistry.registerItem(swordMagno, swordMagno.name);
		GameRegistry.registerItem(shovelMagno, shovelMagno.name);
		GameRegistry.registerItem(pickaxeMagno, pickaxeMagno.name);
		GameRegistry.registerItem(axeMagno, axeMagno.name);
		GameRegistry.registerItem(hoeMagno, hoeMagno.name);

		// tools: misc
		GameRegistry.registerItem(magnetizer, magnetizer.getName());
	}
}
