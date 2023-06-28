

package power.forestxreborn.client.renderer;




public class SnailRenderer extends MobRenderer<SnailEntity, Modelsnail<SnailEntity>> {

	public SnailRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnail(context.bakeLayer(Modelsnail.LAYER_LOCATION)), 0.5f);


	}


	@Override public ResourceLocation getTextureLocation(SnailEntity entity) {
		return new ResourceLocation("forest:textures/entities/snail.png");
	}



}
