package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.constant.DataTickets;
import software.bernie.geckolib.cache.object.GeoBone;
import software.bernie.geckolib.animation.AnimationState;

import ru.power_umc.forestxreborn.entity.RatEntity;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;

public class RatModel extends GeoModel<RatEntity> {
	@Override
	public ResourceLocation getAnimationResource(RatEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "animations/rat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RatEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "geo/rat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RatEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(RatEntity animatable, long instanceId, AnimationState animationState) {
		GeoBone head = getAnimationProcessor().getBone("animation.common.look_at_target");
		if (head != null) {
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * Mth.DEG_TO_RAD);
			head.setRotY(entityData.netHeadYaw() * Mth.DEG_TO_RAD);
		}

	}
}
