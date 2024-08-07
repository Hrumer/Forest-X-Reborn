package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import ru.power_umc.forestxreborn.entity.CalibriEntity;

import net.minecraft.resources.ResourceLocation;

public class CalibriModel extends GeoModel<CalibriEntity> {
	@Override
	public ResourceLocation getAnimationResource(CalibriEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "animations/calibri.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CalibriEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "geo/calibri.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CalibriEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
