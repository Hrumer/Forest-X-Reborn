
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.entity.SnailEntity;
import power.forestxreborn.entity.RacoonEntity;
import power.forestxreborn.entity.FireSalamanderEntity;
import power.forestxreborn.entity.FennecEntity;
import power.forestxreborn.entity.BrownBearEntity;
import power.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForestModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, ForestMod.MODID);
	public static final RegistryObject<EntityType<RacoonEntity>> RACOON = register("racoon",
			EntityType.Builder.<RacoonEntity>of(RacoonEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RacoonEntity::new)

					.sized(0.5f, 0.7f));
	public static final RegistryObject<EntityType<SnailEntity>> SNAIL = register("snail",
			EntityType.Builder.<SnailEntity>of(SnailEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnailEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<FireSalamanderEntity>> FIRE_SALAMANDER = register("fire_salamander", EntityType.Builder.<FireSalamanderEntity>of(FireSalamanderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireSalamanderEntity::new).fireImmune().sized(1f, 0.5f));
	public static final RegistryObject<EntityType<FennecEntity>> FENNEC = register("fennec",
			EntityType.Builder.<FennecEntity>of(FennecEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FennecEntity::new)

					.sized(0.5f, 0.7f));
	public static final RegistryObject<EntityType<BrownBearEntity>> BROWN_BEAR = register("brown_bear",
			EntityType.Builder.<BrownBearEntity>of(BrownBearEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3).setCustomClientFactory(BrownBearEntity::new)

					.sized(0.9f, 2f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RacoonEntity.init();
			SnailEntity.init();
			FireSalamanderEntity.init();
			FennecEntity.init();
			BrownBearEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RACOON.get(), RacoonEntity.createAttributes().build());
		event.put(SNAIL.get(), SnailEntity.createAttributes().build());
		event.put(FIRE_SALAMANDER.get(), FireSalamanderEntity.createAttributes().build());
		event.put(FENNEC.get(), FennecEntity.createAttributes().build());
		event.put(BROWN_BEAR.get(), BrownBearEntity.createAttributes().build());
	}
}
