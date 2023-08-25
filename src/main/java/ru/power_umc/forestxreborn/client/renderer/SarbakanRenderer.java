package ru.power_umc.forestxreborn.client.renderer;

import ru.power_umc.forestxreborn.entity.SarbakanEntity;
import ru.power_umc.forestxreborn.client.model.Modeldart;

import net.minecraft.util.Mth;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class SarbakanRenderer extends EntityRenderer<SarbakanEntity> {
	private static final ResourceLocation texture = new ResourceLocation("forest:textures/entities/dart.png");
	private final Modeldart model;

	public SarbakanRenderer(EntityRendererProvider.Context context) {
		super(context);
		model = new Modeldart(context.bakeLayer(Modeldart.LAYER_LOCATION));
	}

	@Override
	public void render(SarbakanEntity entityIn, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource bufferIn, int packedLightIn) {
		VertexConsumer vb = bufferIn.getBuffer(RenderType.entityCutout(this.getTextureLocation(entityIn)));
		poseStack.pushPose();
		model.renderToBuffer(poseStack, vb, packedLightIn, OverlayTexture.NO_OVERLAY, 1, 1, 1, 0.0625f);
		poseStack.popPose();
		super.render(entityIn, entityYaw, partialTicks, poseStack, bufferIn, packedLightIn);
	}

	@Override
	public ResourceLocation getTextureLocation(SarbakanEntity entity) {
		return texture;
	}
}