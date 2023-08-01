package power.forestxreborn.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import power.forestxreborn.entity.BlueButterflyEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

public class BlueButterflyModel extends GeoModel<BlueButterflyEntity> {
	@Override
	public ResourceLocation getAnimationResource(BlueButterflyEntity entity) {
		return new ResourceLocation("forest", "animations/butterfly.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BlueButterflyEntity entity) {
		return new ResourceLocation("forest", "geo/butterfly.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BlueButterflyEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(BlueButterflyEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}