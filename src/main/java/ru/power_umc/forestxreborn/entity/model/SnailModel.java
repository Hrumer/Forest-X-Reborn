package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import ru.power_umc.forestxreborn.entity.SnailEntity;

import net.minecraft.resources.ResourceLocation;

public class SnailModel extends GeoModel<SnailEntity> {
	@Override
	public ResourceLocation getAnimationResource(SnailEntity entity) {
		return new ResourceLocation("forest", "animations/snail.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(SnailEntity entity) {
		return new ResourceLocation("forest", "geo/snail.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(SnailEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
