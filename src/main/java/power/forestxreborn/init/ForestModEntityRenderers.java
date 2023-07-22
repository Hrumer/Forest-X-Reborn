
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.client.renderer.SnailRenderer;
import power.forestxreborn.client.renderer.RacoonRenderer;
import power.forestxreborn.client.renderer.FireSalamanderRenderer;
import power.forestxreborn.client.renderer.FennecRenderer;
import power.forestxreborn.client.renderer.BrownBearRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForestModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ForestModEntities.RACOON.get(), RacoonRenderer::new);
		event.registerEntityRenderer(ForestModEntities.SNAIL.get(), SnailRenderer::new);
		event.registerEntityRenderer(ForestModEntities.FIRE_SALAMANDER.get(), FireSalamanderRenderer::new);
		event.registerEntityRenderer(ForestModEntities.FENNEC.get(), FennecRenderer::new);
		event.registerEntityRenderer(ForestModEntities.BROWN_BEAR.get(), BrownBearRenderer::new);
	}
}
