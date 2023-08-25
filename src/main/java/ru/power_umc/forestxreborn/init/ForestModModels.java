
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.client.model.Modeldart;
import ru.power_umc.forestxreborn.client.model.Modelbear_armor;
import ru.power_umc.forestxreborn.client.model.ModelRacoonModel;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class ForestModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelRacoonModel.LAYER_LOCATION, ModelRacoonModel::createBodyLayer);
		event.registerLayerDefinition(Modeldart.LAYER_LOCATION, Modeldart::createBodyLayer);
		event.registerLayerDefinition(Modelbear_armor.LAYER_LOCATION, Modelbear_armor::createBodyLayer);
	}
}
