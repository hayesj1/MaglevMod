package com.tigerbird.maglevmod.reference;

import com.tigerbird.maglevmod.creative.TabMM;
import cyano.poweradvantage.api.ConduitType;
import net.minecraft.creativetab.CreativeTabs;

public class References {
	
    public static final String MODID = "maglevmod";
    public static final String MOD_NAME = "Maglev Mod";
    public static final String VERSION = "1.8.8-0.1";
    public static final String CLIENT_PROXY_CLASS = "com.tigerbird.maglevmod.proxy.ClientProxy";
    public static final String SERVER_PROXY_CLASS = "com.tigerbird.maglevmod.proxy.ServerProxy";
    
    public static final CreativeTabs tabMM = new TabMM(MODID);
    
    public static final String ARMORTEXTURE1 = MODID + ":titaniumlayer1";
    public static final String ARMORTEXTURE2 = MODID + ":titaniumlayer2";

	public static final ConduitType ELECTRICAL_POWER = new ConduitType("electricity");
    public static final ConduitType MAGNETIC_POWER = new ConduitType("magnetism");
    
}
