

package power.forestxreborn.client.renderer;




public class RacoonRenderer extends MobRenderer<RacoonEntity, ModelRacoonModel<RacoonEntity>> {

	public RacoonRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelRacoonModel(context.bakeLayer(ModelRacoonModel.LAYER_LOCATION)), 0.5f);


	}


	@Override public ResourceLocation getTextureLocation(RacoonEntity entity) {
		return new ResourceLocation("forest:textures/entities/racoon.png");
	}



}
