package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import ru.power_umc.forestxreborn.entity.BigWitherSkeletonEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class BigWitherSkeletonModel extends GeoModel<BigWitherSkeletonEntity> {
	@Override
	public ResourceLocation getAnimationResource(BigWitherSkeletonEntity entity) {
		return new ResourceLocation("forest", "animations/big_skeleton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BigWitherSkeletonEntity entity) {
		return new ResourceLocation("forest", "geo/big_skeleton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BigWitherSkeletonEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BigWitherSkeletonEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("animation.common.look_at_target");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
