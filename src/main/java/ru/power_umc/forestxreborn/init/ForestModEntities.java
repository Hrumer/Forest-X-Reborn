
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.entity.VultureEntity;
import ru.power_umc.forestxreborn.entity.TumbleweedEntity;
import ru.power_umc.forestxreborn.entity.SnailEntity;
import ru.power_umc.forestxreborn.entity.ScorpionEntity;
import ru.power_umc.forestxreborn.entity.RatEntity;
import ru.power_umc.forestxreborn.entity.RacconEntity;
import ru.power_umc.forestxreborn.entity.PurpleButterflyEntity;
import ru.power_umc.forestxreborn.entity.PinkButterflyEntity;
import ru.power_umc.forestxreborn.entity.OrangeButterflyEntity;
import ru.power_umc.forestxreborn.entity.GreenButterflyEntity;
import ru.power_umc.forestxreborn.entity.FireSalamanderEntity;
import ru.power_umc.forestxreborn.entity.FennecEntity;
import ru.power_umc.forestxreborn.entity.CrocodileEntity;
import ru.power_umc.forestxreborn.entity.CalibriEntity;
import ru.power_umc.forestxreborn.entity.BrownBearEntity;
import ru.power_umc.forestxreborn.entity.BlueButterflyEntity;
import ru.power_umc.forestxreborn.entity.BigWitherSkeletonEntity;
import ru.power_umc.forestxreborn.entity.BigSkeletonEntity;
import ru.power_umc.forestxreborn.entity.BabyWitherSkeletonEntity;
import ru.power_umc.forestxreborn.entity.BabySkeletonEntity;
import ru.power_umc.forestxreborn.ForestMod;

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
	public static final RegistryObject<EntityType<RacconEntity>> RACCON = register("raccon",
			EntityType.Builder.<RacconEntity>of(RacconEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RacconEntity::new)

					.sized(0.5f, 0.7f));
	public static final RegistryObject<EntityType<BrownBearEntity>> BROWN_BEAR = register("brown_bear",
			EntityType.Builder.<BrownBearEntity>of(BrownBearEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3).setCustomClientFactory(BrownBearEntity::new)

					.sized(0.9f, 2f));
	public static final RegistryObject<EntityType<SnailEntity>> SNAIL = register("snail",
			EntityType.Builder.<SnailEntity>of(SnailEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(SnailEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<FennecEntity>> FENNEC = register("fennec",
			EntityType.Builder.<FennecEntity>of(FennecEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FennecEntity::new)

					.sized(1f, 0.7f));
	public static final RegistryObject<EntityType<FireSalamanderEntity>> FIRE_SALAMANDER = register("fire_salamander", EntityType.Builder.<FireSalamanderEntity>of(FireSalamanderEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true)
			.setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(FireSalamanderEntity::new).fireImmune().sized(1f, 0.5f));
	public static final RegistryObject<EntityType<OrangeButterflyEntity>> ORANGE_BUTTERFLY = register("orange_butterfly",
			EntityType.Builder.<OrangeButterflyEntity>of(OrangeButterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OrangeButterflyEntity::new)

					.sized(0.8f, 1f));
	public static final RegistryObject<EntityType<PinkButterflyEntity>> PINK_BUTTERFLY = register("pink_butterfly",
			EntityType.Builder.<PinkButterflyEntity>of(PinkButterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PinkButterflyEntity::new)

					.sized(0.8f, 1f));
	public static final RegistryObject<EntityType<BlueButterflyEntity>> BLUE_BUTTERFLY = register("blue_butterfly",
			EntityType.Builder.<BlueButterflyEntity>of(BlueButterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BlueButterflyEntity::new)

					.sized(0.8f, 1f));
	public static final RegistryObject<EntityType<GreenButterflyEntity>> GREEN_BUTTERFLY = register("green_butterfly",
			EntityType.Builder.<GreenButterflyEntity>of(GreenButterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GreenButterflyEntity::new)

					.sized(0.8f, 1f));
	public static final RegistryObject<EntityType<PurpleButterflyEntity>> PURPLE_BUTTERFLY = register("purple_butterfly",
			EntityType.Builder.<PurpleButterflyEntity>of(PurpleButterflyEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(PurpleButterflyEntity::new)

					.sized(0.8f, 1f));
	public static final RegistryObject<EntityType<CalibriEntity>> CALIBRI = register("calibri",
			EntityType.Builder.<CalibriEntity>of(CalibriEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(CalibriEntity::new)

					.sized(0.6f, 0.8f));
	public static final RegistryObject<EntityType<VultureEntity>> VULTURE = register("vulture",
			EntityType.Builder.<VultureEntity>of(VultureEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(VultureEntity::new)

					.sized(1.4f, 1.8f));
	public static final RegistryObject<EntityType<RatEntity>> RAT = register("rat",
			EntityType.Builder.<RatEntity>of(RatEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(RatEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<CrocodileEntity>> CROCODILE = register("crocodile",
			EntityType.Builder.<CrocodileEntity>of(CrocodileEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(16).setUpdateInterval(3).setCustomClientFactory(CrocodileEntity::new)

					.sized(3f, 1.5f));
	public static final RegistryObject<EntityType<TumbleweedEntity>> TUMBLEWEED = register("tumbleweed",
			EntityType.Builder.<TumbleweedEntity>of(TumbleweedEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TumbleweedEntity::new)

					.sized(0.8f, 0.8f));
	public static final RegistryObject<EntityType<ScorpionEntity>> SCORPION = register("scorpion",
			EntityType.Builder.<ScorpionEntity>of(ScorpionEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(ScorpionEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<BigSkeletonEntity>> BIG_SKELETON = register("big_skeleton",
			EntityType.Builder.<BigSkeletonEntity>of(BigSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigSkeletonEntity::new)

					.sized(0.5f, 2.5f));
	public static final RegistryObject<EntityType<BigWitherSkeletonEntity>> BIG_WITHER_SKELETON = register("big_wither_skeleton",
			EntityType.Builder.<BigWitherSkeletonEntity>of(BigWitherSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BigWitherSkeletonEntity::new)

					.sized(0.5f, 2.5f));
	public static final RegistryObject<EntityType<BabySkeletonEntity>> BABY_SKELETON = register("baby_skeleton",
			EntityType.Builder.<BabySkeletonEntity>of(BabySkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabySkeletonEntity::new)

					.sized(0.5f, 1.25f));
	public static final RegistryObject<EntityType<BabyWitherSkeletonEntity>> BABY_WITHER_SKELETON = register("baby_wither_skeleton",
			EntityType.Builder.<BabyWitherSkeletonEntity>of(BabyWitherSkeletonEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BabyWitherSkeletonEntity::new)

					.sized(0.5f, 1.25f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			RacconEntity.init();
			BrownBearEntity.init();
			SnailEntity.init();
			FennecEntity.init();
			FireSalamanderEntity.init();
			OrangeButterflyEntity.init();
			PinkButterflyEntity.init();
			BlueButterflyEntity.init();
			GreenButterflyEntity.init();
			PurpleButterflyEntity.init();
			CalibriEntity.init();
			VultureEntity.init();
			RatEntity.init();
			CrocodileEntity.init();
			TumbleweedEntity.init();
			ScorpionEntity.init();
			BigSkeletonEntity.init();
			BigWitherSkeletonEntity.init();
			BabySkeletonEntity.init();
			BabyWitherSkeletonEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(RACCON.get(), RacconEntity.createAttributes().build());
		event.put(BROWN_BEAR.get(), BrownBearEntity.createAttributes().build());
		event.put(SNAIL.get(), SnailEntity.createAttributes().build());
		event.put(FENNEC.get(), FennecEntity.createAttributes().build());
		event.put(FIRE_SALAMANDER.get(), FireSalamanderEntity.createAttributes().build());
		event.put(ORANGE_BUTTERFLY.get(), OrangeButterflyEntity.createAttributes().build());
		event.put(PINK_BUTTERFLY.get(), PinkButterflyEntity.createAttributes().build());
		event.put(BLUE_BUTTERFLY.get(), BlueButterflyEntity.createAttributes().build());
		event.put(GREEN_BUTTERFLY.get(), GreenButterflyEntity.createAttributes().build());
		event.put(PURPLE_BUTTERFLY.get(), PurpleButterflyEntity.createAttributes().build());
		event.put(CALIBRI.get(), CalibriEntity.createAttributes().build());
		event.put(VULTURE.get(), VultureEntity.createAttributes().build());
		event.put(RAT.get(), RatEntity.createAttributes().build());
		event.put(CROCODILE.get(), CrocodileEntity.createAttributes().build());
		event.put(TUMBLEWEED.get(), TumbleweedEntity.createAttributes().build());
		event.put(SCORPION.get(), ScorpionEntity.createAttributes().build());
		event.put(BIG_SKELETON.get(), BigSkeletonEntity.createAttributes().build());
		event.put(BIG_WITHER_SKELETON.get(), BigWitherSkeletonEntity.createAttributes().build());
		event.put(BABY_SKELETON.get(), BabySkeletonEntity.createAttributes().build());
		event.put(BABY_WITHER_SKELETON.get(), BabyWitherSkeletonEntity.createAttributes().build());
	}
}
