
package power.forestxreborn.client.renderer;

import power.forestxreborn.entity.FennecEntity;
import power.forestxreborn.client.model.ModelFennecModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class FennecRenderer extends MobRenderer<FennecEntity, ModelFennecModel<FennecEntity>> {
	public FennecRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelFennecModel(context.bakeLayer(ModelFennecModel.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(FennecEntity entity) {
		return new ResourceLocation("forest:textures/entities/fennec.png");
	}
}
