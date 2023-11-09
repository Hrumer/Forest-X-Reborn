package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import ru.power_umc.forestxreborn.entity.WaspEntity;

import net.minecraft.resources.ResourceLocation;

public class WaspModel extends GeoModel<WaspEntity> {
	@Override
	public ResourceLocation getAnimationResource(WaspEntity entity) {
		return new ResourceLocation("forest", "animations/wasp.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(WaspEntity entity) {
		return new ResourceLocation("forest", "geo/wasp.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(WaspEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
