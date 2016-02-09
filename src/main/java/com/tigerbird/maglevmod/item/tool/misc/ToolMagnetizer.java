package com.tigerbird.maglevmod.item.tool.misc;

import com.tigerbird.maglevmod.item.misc.ItemMM;
import com.tigerbird.maglevmod.reference.References;
import net.minecraft.entity.player.EntityPlayer;

import java.util.LinkedList;
import java.util.List;

public class ToolMagnetizer extends ItemMM {

	public static EntityPlayer player;
	public static List<String> toolTip = new LinkedList<String>();

	public final String name = "magnetizer";
	
	public ToolMagnetizer() {
		super();
		this.setMaxStackSize(1);
		this.setMaxDamage(100);
		this.setUnlocalizedName(References.MODID + ":" + name);
	}

	@Override
	public String getName() { return this.name; }
}
