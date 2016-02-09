package com.tigerbird.maglevmod.item.armor;

import com.tigerbird.maglevmod.reference.References;

import net.minecraft.item.ItemArmor;

public class ItemArmorMM extends ItemArmor {

	public final String helmetName = "helmetbase";
	public final String chestPlateName = "chestplatebase";
	public final String leggingsName = "leggingsbase";
	public final String bootsName = "bootsbase";
	
	public ItemArmorMM(ArmorMaterial material, int renderIndex, int armorType) {
		super(material, renderIndex, armorType);
		setCreativeTab(References.tabMM);
		
		switch(renderIndex) {
		case 0:
			setUnlocalizedName(References.MODID + ":" + helmetName);
			break;
		case 1:
			setUnlocalizedName(References.MODID + ":" + chestPlateName);
			break;
		case 2:
			setUnlocalizedName(References.MODID + ":" + leggingsName);
			break;
		case 3:
			setUnlocalizedName(References.MODID + ":" + bootsName);
			break;
		}
	}
}
