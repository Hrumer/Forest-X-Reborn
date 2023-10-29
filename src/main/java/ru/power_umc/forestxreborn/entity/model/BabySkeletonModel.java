package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import ru.power_umc.forestxreborn.entity.BabySkeletonEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

public class BabySkeletonModel extends GeoModel<BabySkeletonEntity> {
	@Override
	public ResourceLocation getAnimationResource(BabySkeletonEntity entity) {
		return new ResourceLocation("forest", "animations/baby_skeleton.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BabySkeletonEntity entity) {
		return new ResourceLocation("forest", "geo/baby_skeleton.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BabySkeletonEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BabySkeletonEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}
