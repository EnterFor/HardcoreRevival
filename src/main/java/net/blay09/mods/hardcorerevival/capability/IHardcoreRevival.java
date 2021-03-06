package net.blay09.mods.hardcorerevival.capability;

import net.minecraft.entity.player.PlayerEntity;

import javax.annotation.Nullable;

public interface IHardcoreRevival {
	void setDeathTime(int deathTime);
	int getDeathTime();
	void setRescueTime(int rescueTime);
	int getRescueTime();
	void setRescueTarget(@Nullable PlayerEntity rescueTarget);
	@Nullable
	PlayerEntity getRescueTarget();
}
