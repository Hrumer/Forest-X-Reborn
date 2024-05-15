
package ru.power_umc.forestxreborn.client.renderer;

import ru.power_umc.forestxreborn.procedures.Baby_ModelProcedure;
import ru.power_umc.forestxreborn.entity.RacconEntity;
import ru.power_umc.forestxreborn.client.model.ModelRacoonModel;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import com.mojang.blaze3d.vertex.PoseStack;

public class RacconRenderer extends MobRenderer<RacconEntity, ModelRacoonModel<RacconEntity>> {
	public RacconRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRacoonModel(context.bakeLayer(ModelRacoonModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	protected void scale(RacconEntity entity, PoseStack poseStack, float f) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) Baby_ModelProcedure.execute(entity);
		poseStack.scale(scale, scale, scale);
	}

	@Override
	public ResourceLocation getTextureLocation(RacconEntity entity) {
		return new ResourceLocation("forest:textures/entities/racoon.png");
	}
}
