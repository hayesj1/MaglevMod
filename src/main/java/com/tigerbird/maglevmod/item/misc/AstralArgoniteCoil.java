package com.tigerbird.maglevmod.item.misc;

import com.tigerbird.maglevmod.reference.References;

/**
 * Created by hayesj3 on 12/16/2015.
 */
public class AstralArgoniteCoil extends ItemMM {

    public final String name = "skycrystalcoil";

    public AstralArgoniteCoil() {
        super();
        this.setMaxStackSize(16);
        this.setUnlocalizedName(References.MODID + ":" + name);
    }

	@Override
	public String getName() { return this.name; }
}
