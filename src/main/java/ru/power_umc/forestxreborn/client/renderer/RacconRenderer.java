
package ru.power_umc.forestxreborn.client.renderer;

import ru.power_umc.forestxreborn.entity.RacconEntity;
import ru.power_umc.forestxreborn.client.model.ModelRacoonModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class RacconRenderer extends MobRenderer<RacconEntity, ModelRacoonModel<RacconEntity>> {
	public RacconRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRacoonModel(context.bakeLayer(ModelRacoonModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(RacconEntity entity) {
		return new ResourceLocation("forest:textures/entities/racoon.png");
	}
}
