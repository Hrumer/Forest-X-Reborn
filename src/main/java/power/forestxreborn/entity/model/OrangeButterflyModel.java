package power.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import power.forestxreborn.entity.OrangeButterflyEntity;

import net.minecraft.resources.ResourceLocation;

public class OrangeButterflyModel extends GeoModel<OrangeButterflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(OrangeButterflyEntity entity) {
		return new ResourceLocation("forest", "animations/butterfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrangeButterflyEntity entity) {
		return new ResourceLocation("forest", "geo/butterfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrangeButterflyEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
