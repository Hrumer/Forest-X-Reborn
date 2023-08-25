package ru.power_umc.forestxreborn.procedures;

import ru.power_umc.forestxreborn.network.ForestModVariables;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

public class WineAlcoholMultiplierProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.REGENERATION, 400, 1, false, false));
		if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
			_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SPEED, 3000, 3, false, false));
		{
			double _setval = (entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForestModVariables.PlayerVariables())).alcohol + 0.3;
			entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
				capability.alcohol = _setval;
				capability.syncPlayerVariables(entity);
			});
		}
	}
}
