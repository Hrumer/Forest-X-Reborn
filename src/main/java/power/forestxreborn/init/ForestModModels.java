
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.client.model.ModelRacoonModel;
import power.forestxreborn.client.model.ModelFennecModel;
import power.forestxreborn.client.model.ModelBrownBearModel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ForestModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelRacoonModel.LAYER_LOCATION, ModelRacoonModel::createBodyLayer);
		event.registerLayerDefinition(ModelFennecModel.LAYER_LOCATION, ModelFennecModel::createBodyLayer);
		event.registerLayerDefinition(ModelBrownBearModel.LAYER_LOCATION, ModelBrownBearModel::createBodyLayer);
	}
}
