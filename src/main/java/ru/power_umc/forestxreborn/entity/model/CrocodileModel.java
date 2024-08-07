package ru.power_umc.forestxreborn.entity.model;

import software.bernie.geckolib.model.GeoModel;

import ru.power_umc.forestxreborn.entity.CrocodileEntity;

import net.minecraft.resources.ResourceLocation;

public class CrocodileModel extends GeoModel<CrocodileEntity> {
	@Override
	public ResourceLocation getAnimationResource(CrocodileEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "animations/crocodile.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(CrocodileEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "geo/crocodile.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(CrocodileEntity entity) {
		return ResourceLocation.fromNamespaceAndPath("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

}
