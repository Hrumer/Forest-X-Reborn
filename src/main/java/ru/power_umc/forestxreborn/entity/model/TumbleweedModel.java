package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import ru.power_umc.forestxreborn.entity.TumbleweedEntity;

import net.minecraft.resources.ResourceLocation;

public class TumbleweedModel extends GeoModel<TumbleweedEntity> {
	@Override
	public ResourceLocation getAnimationResource(TumbleweedEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "animations/tumbleweed.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(TumbleweedEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "geo/tumbleweed.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(TumbleweedEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
