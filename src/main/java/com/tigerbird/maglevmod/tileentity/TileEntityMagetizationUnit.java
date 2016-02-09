package com.tigerbird.maglevmod.tileentity;

import com.tigerbird.maglevmod.init.ModBlocks;
import com.tigerbird.maglevmod.item.tool.misc.ToolMagnetizer;
import com.tigerbird.maglevmod.reference.References;
import cyano.poweradvantage.api.ConduitType;
import cyano.poweradvantage.api.PowerRequest;
import cyano.poweradvantage.api.simple.TileEntitySimplePowerSource;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

/**
 * Created by hayesj3 on 12/16/2015.
 */
public class TileEntityMagetizationUnit extends TileEntitySimplePowerSource {

	private float magneticBuffer;
	private float magneticBufferCap = 200.0f;

    private final ItemStack[] inventory = new ItemStack[2];
    private final int[] dataSyncArray = new int[1];

    public TileEntityMagetizationUnit() {
        super(References.ELECTRICAL_POWER, 100.0f, References.MODID + ":" + ModBlocks.magnetizationUnit.name);
    }

    @Override
    protected ItemStack[] getInventory() {
        return inventory;
    }

    @Override
    public int[] getDataFieldArray() {
        return dataSyncArray;
    }
    @Override
    public void prepareDataFieldsForSync() {
        dataSyncArray[0] = Float.floatToRawIntBits(this.getEnergy());
    }
    @Override
    public void onDataFieldUpdate() {
        this.setEnergy(Float.intBitsToFloat(dataSyncArray[0]), this.getType());
    }

    @Override
    public void tickUpdate(boolean isServerWorld) {
        // All logic is server-side
        if (isServerWorld) {
            if(inventory[0] != null) {
                if (inventory[0].getItemDamage() > 25) {
                    this.addEnergy(50.0f, References.MAGNETIC_POWER);
                } else if (inventory[0].getItemDamage() > 0) {
                    this.addEnergy((float) inventory[0].getItemDamage() * 2, References.MAGNETIC_POWER);
                } else {
                    if (inventory[1] == null) {
                        ItemStack temp = inventory[0];
                        temp.setItemDamage(0);
                        inventory[1] = temp;
                        inventory[0] = null;
                    } else {
                        if (inventory[1].getItem() instanceof ToolMagnetizer) {
                            inventory[1].stackSize++;
                            inventory[0] = null;
                        }
                    }
                }
                this.sync();
            }
        }
    }
	@Override
	public void powerUpdate() {
		super.powerUpdate();
	}
	@Override
	public PowerRequest getPowerRequest(ConduitType type) {
		return new PowerRequest(PowerRequest.MEDIUM_PRIORITY, 5, this);
	}

	@Override
	public float addEnergy(float energy, ConduitType type){
		float newValue = this.getEnergy() + energy;
		float delta;
		float newEnergy;
		if(newValue < 0) {
			if(type.equals(References.ELECTRICAL_POWER)) {
				delta = -1 * this.getEnergy();
			} else if (type.equals(References.MAGNETIC_POWER)) {
				delta = -1 * this.getMagneticBuffer();
			} else {
				delta = 0.0f;
			}
			newEnergy = 0.0f;
			this.setEnergy(newEnergy,type);
			return delta;
		} else if(newValue > this.getEnergyCapacity()) {
			if(type.equals(References.ELECTRICAL_POWER)) {
				delta = this.getEnergyCapacity() - this.getEnergy();
				newEnergy = this.getEnergyCapacity();
			} else {
				delta = this.getMagneticBufferCap() - this.getMagneticBuffer();
				newEnergy = this.getMagneticBufferCap();
			}
			this.setEnergy(newEnergy,type);
			return delta;
		}
		this.setEnergy(newValue,type);
		return energy;
	}

	@Override
	public void setEnergy(float energy, ConduitType type) {
		if (type.equals(References.ELECTRICAL_POWER)) {
			super.setEnergy(energy, type);
	} else if (type.equals(References.MAGNETIC_POWER)) {
			this.magneticBuffer = energy;
		}
	}

	@Override
	public boolean isPowerSink() { return true; }

	@Override
    public void writeToNBT(NBTTagCompound tagRoot) {
        super.writeToNBT(tagRoot);
    }
    @Override
    public void readFromNBT(NBTTagCompound tagRoot) {
        super.readFromNBT(tagRoot);
    }

    @Override
    public String getCommandSenderName() {
        return "";
    }

	@Override
	public ItemStack getStackInSlotOnClosing(int index) {
		return this.inventory[index];
	}

	public float getMagneticBuffer() { return magneticBuffer; }
	public float getMagneticBufferCap() { return magneticBufferCap; }
}
