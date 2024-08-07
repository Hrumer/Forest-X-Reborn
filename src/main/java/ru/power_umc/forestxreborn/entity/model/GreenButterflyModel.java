package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import ru.power_umc.forestxreborn.entity.GreenButterflyEntity;

import net.minecraft.resources.ResourceLocation;

public class GreenButterflyModel extends GeoModel<GreenButterflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(GreenButterflyEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "animations/butterfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GreenButterflyEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "geo/butterfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GreenButterflyEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
