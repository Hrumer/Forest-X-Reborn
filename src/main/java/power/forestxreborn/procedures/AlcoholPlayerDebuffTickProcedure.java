package power.forestxreborn.procedures;

import power.forestxreborn.network.ForestModVariables;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.TickEvent;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class AlcoholPlayerDebuffTickProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player);
		}
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		if ((entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForestModVariables.PlayerVariables())).alcohol >= 1) {
			if (!(entity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(MobEffects.WEAKNESS))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 600, 1, false, false));
			}
		}
		if ((entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForestModVariables.PlayerVariables())).alcohol >= 1.5) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.CONFUSION, 100, 0, false, false));
		}
		if ((entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForestModVariables.PlayerVariables())).alcohol >= 1.8) {
			if (!(entity instanceof LivingEntity _livEnt3 && _livEnt3.hasEffect(MobEffects.HUNGER))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.HUNGER, 600, 0, false, false));
			}
		}
		if ((entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForestModVariables.PlayerVariables())).alcohol >= 2) {
			if (!(entity instanceof LivingEntity _livEnt5 && _livEnt5.hasEffect(MobEffects.DIG_SLOWDOWN))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 600, 2, false, false));
			}
		}
		if ((entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForestModVariables.PlayerVariables())).alcohol >= 3) {
			if (!(entity instanceof LivingEntity _livEnt7 && _livEnt7.hasEffect(MobEffects.POISON))) {
				if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
					_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 600, 1, false, false));
			}
		}
		if ((entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForestModVariables.PlayerVariables())).alcoholTimer > 0) {
			{
				double _setval = (entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForestModVariables.PlayerVariables())).alcoholTimer - 1;
				entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.alcoholTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
		} else {
			{
				double _setval = 1800;
				entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
					capability.alcoholTimer = _setval;
					capability.syncPlayerVariables(entity);
				});
			}
			if ((entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForestModVariables.PlayerVariables())).alcohol >= 0.05) {
				{
					double _setval = (entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForestModVariables.PlayerVariables())).alcohol - 0.05;
					entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).ifPresent(capability -> {
						capability.alcohol = _setval;
						capability.syncPlayerVariables(entity);
					});
				}
			}
		}
	}
}
