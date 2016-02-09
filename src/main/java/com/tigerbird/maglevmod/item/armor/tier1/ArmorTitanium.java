package com.tigerbird.maglevmod.item.armor.tier1;

import com.tigerbird.maglevmod.item.armor.ItemArmorMM;

public class ArmorTitanium extends ItemArmorMM {

	public final String helmetName = "helmettitanium";
	public final String chestPlateName = "chestplatetitanium";
	public final String leggingsName = "leggingstitanium";
	public final String bootsName = "bootstitanium";
	
	public ArmorTitanium(ArmorMaterial material, int renderIndex, int armorSlot) {
		super(material, renderIndex, armorSlot);
	}
	
	/*public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
		if(stack.getItem() == CommonProxy.titaniumHelmet || stack.getItem() == CommonProxy.titaniumChestplate || stack.getItem() == CommonProxy.titaniumBoots)
			return References.MODID + ":textures/models/armor/titaniumlayer1.png";
		else if(stack.getItem() == CommonProxy.titaniumLeggings)
			return References.MODID + ":textures/models/armor/titaniumlayer2.png";
		else
			return null;
	}*/

}
