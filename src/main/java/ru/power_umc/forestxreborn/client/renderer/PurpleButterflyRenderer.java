
package ru.power_umc.forestxreborn.client.renderer;

import software.bernie.geckolib.renderer.GeoEntityRenderer;
import software.bernie.geckolib.cache.object.BakedGeoModel;

import ru.power_umc.forestxreborn.procedures.Baby_ModelProcedure;
import ru.power_umc.forestxreborn.entity.model.PurpleButterflyModel;
import ru.power_umc.forestxreborn.entity.PurpleButterflyEntity;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class PurpleButterflyRenderer extends GeoEntityRenderer<PurpleButterflyEntity> {
	public PurpleButterflyRenderer(EntityRendererProvider.Context renderManager) {
		super(renderManager, new PurpleButterflyModel());
		this.shadowRadius = 0.4f;
	}

	@Override
	public RenderType getRenderType(PurpleButterflyEntity animatable, ResourceLocation texture, MultiBufferSource bufferSource, float partialTick) {
		return RenderType.entityTranslucent(getTextureLocation(animatable));
	}

	@Override
	public void preRender(PoseStack poseStack, PurpleButterflyEntity entity, BakedGeoModel model, MultiBufferSource bufferSource, VertexConsumer buffer, boolean isReRender, float partialTick, int packedLight, int packedOverlay, int colour) {
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		float scale = (float) Baby_ModelProcedure.execute(entity);
		this.scaleHeight = scale;
		this.scaleWidth = scale;
		super.preRender(poseStack, entity, model, bufferSource, buffer, isReRender, partialTick, packedLight, packedOverlay, 0);
	}
}
