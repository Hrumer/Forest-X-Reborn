package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import ru.power_umc.forestxreborn.entity.BabySkeletonEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class BabySkeletonModel extends GeoModel<BabySkeletonEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabySkeletonEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "animations/baby_skeleton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabySkeletonEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "geo/baby_skeleton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabySkeletonEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BabySkeletonEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("animation.common.look_at_target");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
