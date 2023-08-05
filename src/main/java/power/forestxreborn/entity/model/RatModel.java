package power.forestxreborn.entity.model;

import software.bernie.geckolib.model.data.EntityModelData;
import software.bernie.geckolib.model.GeoModel;
import software.bernie.geckolib.core.animation.AnimationState;
import software.bernie.geckolib.core.animatable.model.CoreGeoBone;
import software.bernie.geckolib.constant.DataTickets;

import power.forestxreborn.entity.RatEntity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.Minecraft;

public class RatModel extends GeoModel<RatEntity> {
	@Override
	public ResourceLocation getAnimationResource(RatEntity entity) {
		return new ResourceLocation("forest", "animations/rat.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(RatEntity entity) {
		return new ResourceLocation("forest", "geo/rat.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(RatEntity entity) {
		return new ResourceLocation("forest", "textures/entities/" + entity.getTexture() + ".png");
	}

	@Override
	public void setCustomAnimations(RatEntity animatable, long instanceId, AnimationState animationState) {
		CoreGeoBone head = getAnimationProcessor().getBone("head");
		if (head != null) {
			int unpausedMultiplier = !Minecraft.getInstance().isPaused() ? 1 : 0;
			EntityModelData entityData = (EntityModelData) animationState.getData(DataTickets.ENTITY_MODEL_DATA);
			head.setRotX(entityData.headPitch() * ((float) Math.PI / 180F) * unpausedMultiplier);
			head.setRotY(entityData.netHeadYaw() * ((float) Math.PI / 180F) * unpausedMultiplier);
		}

	}
}
