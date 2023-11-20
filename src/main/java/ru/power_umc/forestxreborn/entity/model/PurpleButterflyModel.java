package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import ru.power_umc.forestxreborn.entity.PurpleButterflyEntity;

import net.minecraft.resources.ResourceLocation;

public class PurpleButterflyModel extends GeoModel<PurpleButterflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(PurpleButterflyEntity entity) {
		return new ResourceLocation("forest", "animations/butterfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PurpleButterflyEntity entity) {
		return new ResourceLocation("forest", "geo/butterfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PurpleButterflyEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
