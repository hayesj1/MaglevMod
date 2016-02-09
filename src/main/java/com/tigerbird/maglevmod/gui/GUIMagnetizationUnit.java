package com.tigerbird.maglevmod.gui;

import com.tigerbird.maglevmod.reference.References;
import cyano.poweradvantage.api.simple.SimpleMachineGUI;
import cyano.poweradvantage.math.Integer2D;
import net.minecraft.util.ResourceLocation;

/**
 * Created by hayesj3 on 12/16/2015.
 */
public class GUIMagnetizationUnit extends SimpleMachineGUI{

    public GUIMagnetizationUnit() {
        super(
                new ResourceLocation(References.MODID +
                        ":textures/gui/container/magnetization_unit.png"),
                Integer2D.fromCoordinates(60,30, 100,30));
    }
}
