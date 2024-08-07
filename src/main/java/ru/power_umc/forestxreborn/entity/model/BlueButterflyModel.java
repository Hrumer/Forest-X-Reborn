package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import ru.power_umc.forestxreborn.entity.BlueButterflyEntity;

import net.minecraft.resources.ResourceLocation;

public class BlueButterflyModel extends GeoModel<BlueButterflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlueButterflyEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "animations/butterfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlueButterflyEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "geo/butterfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlueButterflyEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
