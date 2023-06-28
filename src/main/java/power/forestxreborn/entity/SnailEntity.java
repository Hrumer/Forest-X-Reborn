
package power.forestxreborn.entity;

import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.level.material.Material;
import net.minecraft.nbt.Tag;
import net.minecraft.sounds.SoundEvent;

import javax.annotation.Nullable;





public class SnailEntity extends PathfinderMob  {


	public SnailEntity(PlayMessages.SpawnEntity packet, Level world) {
    	this(ForestModEntities.SNAIL.get(), world);
    }

	public SnailEntity(EntityType<SnailEntity> type, Level world) {
    	super(type, world);
		maxUpStep = 0.6f;
		xpReward = 3;
		setNoAi(false);




	}

	@Override public Packet<ClientGamePacketListener> getAddEntityPacket() {
		return NetworkHooks.getEntitySpawningPacket(this);
	}


	@Override protected void registerGoals() {
		super.registerGoals();

            this.goalSelector.addGoal(1,new PanicGoal(this, 0.1));this.goalSelector.addGoal(2, new RandomStrollGoal(this, 1));this.goalSelector.addGoal(3, new RandomLookAroundGoal(this));

	}

	@Override public MobType getMobType() {
		return MobType.UNDEFINED;
	}







	@Override public SoundEvent getHurtSound(DamageSource ds) {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
	}

	@Override public SoundEvent getDeathSound() {
		return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
	}




















	public static void init() {
			SpawnPlacements.register(ForestModEntities.SNAIL.get(),
					SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES,
					(entityType, world, reason, pos, random) ->
							(world.getBlockState(pos.below()).getMaterial() == Material.GRASS && world.getRawBrightness(pos, 0) > 8)
			);

	}

	public static AttributeSupplier.Builder createAttributes() {
		AttributeSupplier.Builder builder = Mob.createMobAttributes();
		builder = builder.add(Attributes.MOVEMENT_SPEED, 0.05);
		builder = builder.add(Attributes.MAX_HEALTH, 6);
		builder = builder.add(Attributes.ARMOR, 0);
		builder = builder.add(Attributes.ATTACK_DAMAGE, 0);
		builder = builder.add(Attributes.FOLLOW_RANGE, 16);






		return builder;
	}

}
