package power.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import power.forestxreborn.entity.CrocodileEntity;

import net.minecraft.resources.ResourceLocation;

public class CrocodileModel extends GeoModel<CrocodileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrocodileEntity entity) {
		return new ResourceLocation("forest", "animations/crocodile.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrocodileEntity entity) {
		return new ResourceLocation("forest", "geo/crocodile.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrocodileEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
