package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import ru.power_umc.forestxreborn.entity.BabyWitherSkeletonEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class BabyWitherSkeletonModel extends GeoModel<BabyWitherSkeletonEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabyWitherSkeletonEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "animations/baby_skeleton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabyWitherSkeletonEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "geo/baby_skeleton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabyWitherSkeletonEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BabyWitherSkeletonEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("animation.common.look_at_target");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
