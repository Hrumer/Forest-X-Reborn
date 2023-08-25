package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import ru.power_umc.forestxreborn.entity.ScorpionEntity;

import net.minecraft.resources.ResourceLocation;

public class ScorpionModel extends GeoModel<ScorpionEntity> {
	@Override
	public ResourceLocation getAnimationResource(ScorpionEntity entity) {
		return new ResourceLocation("forest", "animations/scorpion.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(ScorpionEntity entity) {
		return new ResourceLocation("forest", "geo/scorpion.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(ScorpionEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
