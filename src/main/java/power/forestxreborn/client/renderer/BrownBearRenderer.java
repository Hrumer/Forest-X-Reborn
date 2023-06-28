
package power.forestxreborn.client.renderer;

import power.forestxreborn.entity.BrownBearEntity;
import power.forestxreborn.client.model.ModelBrownBearModel;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class BrownBearRenderer extends MobRenderer<BrownBearEntity, ModelBrownBearModel<BrownBearEntity>> {
	public BrownBearRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBrownBearModel(context.bakeLayer(ModelBrownBearModel.LAYER_LOCATION)), 0.9f);
	}

	@Override
	public ResourceLocation getTextureLocation(BrownBearEntity entity) {
		return new ResourceLocation("forest:textures/entities/brown_bear.png");
	}
}
