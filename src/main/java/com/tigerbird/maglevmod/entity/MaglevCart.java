package com.tigerbird.maglevmod.entity;

import com.tigerbird.maglevmod.block.BlockMaglevRail;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.Explosion;
import net.minecraft.world.World;
import net.minecraftforge.event.world.ExplosionEvent;

/**
 * Created by hayesj3 on 2/5/2016.
 */
public class MaglevCart extends EntityMinecart {

	public MaglevCart(World worldIn) {
		super(worldIn);
		setCanUseRail(false);
	}

	public MaglevCart(World worldIn, double x, double y, double z) {
		super(worldIn, x, y, z);
	}

	@Override
	protected void applyDrag() {
		this.motionX *= 0.99999999D;
		this.motionY *= 0.0D;
		this.motionZ *= 0.99999999D;
	}

	@Override
	public boolean canUseRail() {
		return false;
	}

	@Override
	public void setDead() {
		super.setDead();
		Explosion ex = new Explosion(this.worldObj, this, this.posX, this.posY, this.posZ, 5.0f, true, true);
		ExplosionEvent ee = new ExplosionEvent(this.worldObj, ex);
		ex.doExplosionB(true);
	}

	@Override
	public void onEntityUpdate() {
		super.onEntityUpdate();
		if (!BlockMaglevRail.isMaglevRailBlock(this.worldObj, this.getPosition().down())) {
			this.setDead();
		}
	}

	@Override
	public EnumMinecartType getMinecartType() {
		return EnumMinecartType.RIDEABLE;
	}
}
