
package power.forestxreborn.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;





public class FennecEntity extends Animal  {


	public FennecEntity(PlayMessages.SpawnEntity packet, Level world) {
    	this(ForestModEntities.FENNEC.get(), world);
    }

	public FennecEntity(EntityType<FennecEntity> type, Level world) {
    	super(type, world);
		maxUpStep = 0.6f;
		xpReward = 10;
		setNoAi(false);


			setPersistenceRequired();


	}

	@Override public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}


	@Override protected void registerGoals() {
		super.registerGoals();

            this.goalSelector.addGoal(1, new FollowParentGoal(this, 0.6));
this.goalSelector.addGoal(2, new RandomLookAroundGoal(this));this.goalSelector.addGoal(3,new PanicGoal(this, 0.6));this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, Rabbit.class, false,
        false));this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, Chicken.class, false,
        false));this.goalSelector.addGoal(6, new MeleeAttackGoal(this, 0.6, true) {

	@Override protected double getAttackReachSqr(LivingEntity entity) {
		return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
    }


});this.goalSelector.addGoal(7, new TemptGoal(this, 1, Ingredient.of(Items.EGG), false));this.goalSelector.addGoal(8, new RandomStrollGoal(this, 1));this.goalSelector.addGoal(9, new LeapAtTargetGoal(this, (float)0.6));this.goalSelector.addGoal(10, new FloatGoal(this));

	}

	@Override public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}




	@Override public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fox.ambient"));
	}


	@Override public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fox.hurt"));
	}

	@Override public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.fox.death"));
	}












        @Override public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
			FennecEntity retval = ForestModEntities.FENNEC.get().create(serverWorld);
			retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
			return retval;
		}

		@Override public boolean isFood(ItemStack stack) {
			return List.of(Items.EGG).contains(stack.getItem());
		}








	public static void init() {
			SpawnPlacements.register(ForestModEntities.FENNEC.get(),
					SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
					(entityType, world, reason, pos, random) ->
							(world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8)
			);

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
		builder = builder.add(Attributes.MAX_HEALTH, 10);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 3);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);






		return builder;
	}

}
