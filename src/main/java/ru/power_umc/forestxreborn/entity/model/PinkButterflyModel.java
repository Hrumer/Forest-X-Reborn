package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import ru.power_umc.forestxreborn.entity.PinkButterflyEntity;

import net.minecraft.resources.ResourceLocation;

public class PinkButterflyModel extends GeoModel<PinkButterflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(PinkButterflyEntity entity) {
		return new ResourceLocation("forest", "animations/butterfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(PinkButterflyEntity entity) {
		return new ResourceLocation("forest", "geo/butterfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(PinkButterflyEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
