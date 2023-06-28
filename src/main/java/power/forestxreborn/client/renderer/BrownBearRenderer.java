

package power.forestxreborn.client.renderer;




public class BrownBearRenderer extends MobRenderer<BrownBearEntity, ModelBrownBearModel<BrownBearEntity>> {

	public BrownBearRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelBrownBearModel(context.bakeLayer(ModelBrownBearModel.LAYER_LOCATION)), 0.9f);


	}


	@Override public ResourceLocation getTextureLocation(BrownBearEntity entity) {
		return new ResourceLocation("forest:textures/entities/brown_bear.png");
	}



}
