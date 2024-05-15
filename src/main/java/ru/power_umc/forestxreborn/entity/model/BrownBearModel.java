package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import ru.power_umc.forestxreborn.entity.BrownBearEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class BrownBearModel extends GeoModel<BrownBearEntity> {
	@Override
	public ResourceLocation getAnimationResource(BrownBearEntity entity) {
		return new ResourceLocation("forest", "animations/brown_bear.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BrownBearEntity entity) {
		return new ResourceLocation("forest", "geo/brown_bear.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BrownBearEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BrownBearEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("animation.common.look_at_target");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
