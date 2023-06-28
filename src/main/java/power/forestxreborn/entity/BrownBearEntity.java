
package power.forestxreborn.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;





public class BrownBearEntity extends Animal  {


	public BrownBearEntity(PlayMessages.SpawnEntity packet, Level world) {
    	this(ForestModEntities.BROWN_BEAR.get(), world);
    }

	public BrownBearEntity(EntityType<BrownBearEntity> type, Level world) {
    	super(type, world);
		maxUpStep = 0.6f;
		xpReward = 25;
		setNoAi(false);


			setPersistenceRequired();


	}

	@Override public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}


	@Override protected void registerGoals() {
		super.registerGoals();

            this.goalSelector.addGoal(1, new TemptGoal(this, 1, Ingredient.of(Items.HONEYCOMB), false));this.goalSelector.addGoal(2, new TemptGoal(this, 1, Ingredient.of(Items.SALMON), false));this.goalSelector.addGoal(3, new TemptGoal(this, 1, Ingredient.of(Items.COD), false));this.goalSelector.addGoal(4, new FollowParentGoal(this, 0.8));
this.goalSelector.addGoal(5, new BreedGoal(this, 1));
this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Player.class, false,
        true));this.goalSelector.addGoal(7, new MeleeAttackGoal(this, 0.65, false) {

	@Override protected double getAttackReachSqr(LivingEntity entity) {
		return this.mob.getBbWidth() * this.mob.getBbWidth() + entity.getBbWidth();
    }


});this.targetSelector.addGoal(8, new HurtByTargetGoal(this)
);this.goalSelector.addGoal(9, new LookAtPlayerGoal(this, Animal.class,(float)16));this.goalSelector.addGoal(10, new RemoveBlockGoal(Blocks.BEEHIVE,
        this, 1.5, (int) 10));this.goalSelector.addGoal(11, new RandomStrollGoal(this, 0.8));this.goalSelector.addGoal(12, new FloatGoal(this));this.goalSelector.addGoal(13, new RandomLookAroundGoal(this));

	}

	@Override public MobType getMobType() {
		return MobType.UNDEFINED;
	}

	@Override public boolean removeWhenFarAway(double distanceToClosestPlayer) {
		return false;
	}



    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack(Items.HONEYCOMB));
   	}

	@Override public SoundEvent getAmbientSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.polar_bear.ambient"));
	}

	@Override public void playStepSound(BlockPos pos, BlockState blockIn) {
		this.playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.polar_bear.step")), 0.15f, 1);
	}

	@Override public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.polar_bear.hurt"));
	}

	@Override public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.polar_bear.death"));
	}












        @Override public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
			BrownBearEntity retval = ForestModEntities.BROWN_BEAR.get().create(serverWorld);
			retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
			return retval;
		}

		@Override public boolean isFood(ItemStack stack) {
			return List.of(Items.HONEYCOMB,Items.COD,Items.SALMON).contains(stack.getItem());
		}








	public static void init() {
			SpawnPlacements.register(ForestModEntities.BROWN_BEAR.get(),
					SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
					(entityType, world, reason, pos, random) ->
							(world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8)
			);

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
		builder = builder.add(Attributes.MAX_HEALTH, 40);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 10);
		builder = builder.add(Attributes.FOLLOW_RANGE, 8);






		return builder;
	}

}
