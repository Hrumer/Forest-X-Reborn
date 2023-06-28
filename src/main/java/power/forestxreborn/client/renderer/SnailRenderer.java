
package power.forestxreborn.client.renderer;

import power.forestxreborn.entity.SnailEntity;
import power.forestxreborn.client.model.Modelsnail;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

public class SnailRenderer extends MobRenderer<SnailEntity, Modelsnail<SnailEntity>> {
	public SnailRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelsnail(context.bakeLayer(Modelsnail.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(SnailEntity entity) {
		return new ResourceLocation("forest:textures/entities/snail.png");
	}
}
