package ru.power_umc.forestxreborn.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

public class SnailRamkaghranitsaSploshnaiaProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !(entity instanceof LivingEntity _livEnt0 && _livEnt0.isBaby());
	}
}
