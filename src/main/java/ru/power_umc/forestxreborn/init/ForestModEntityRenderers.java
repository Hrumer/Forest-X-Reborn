
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.client.renderer.SarbakanRenderer;
import ru.power_umc.forestxreborn.client.renderer.RacconRenderer;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForestModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(ForestModEntities.RACCON.get(), RacconRenderer::new);
		event.registerEntityRenderer(ForestModEntities.BROWN_BEAR.get(), BrownBearRenderer::new);
		event.registerEntityRenderer(ForestModEntities.SNAIL.get(), SnailRenderer::new);
		event.registerEntityRenderer(ForestModEntities.FENNEC.get(), FennecRenderer::new);
		event.registerEntityRenderer(ForestModEntities.FIRE_SALAMANDER.get(), FireSalamanderRenderer::new);
		event.registerEntityRenderer(ForestModEntities.ORANGE_BUTTERFLY.get(), OrangeButterflyRenderer::new);
		event.registerEntityRenderer(ForestModEntities.PINK_BUTTERFLY.get(), PinkButterflyRenderer::new);
		event.registerEntityRenderer(ForestModEntities.BLUE_BUTTERFLY.get(), BlueButterflyRenderer::new);
		event.registerEntityRenderer(ForestModEntities.GREEN_BUTTERFLY.get(), GreenButterflyRenderer::new);
		event.registerEntityRenderer(ForestModEntities.PURPLE_BUTTERFLY.get(), PurpleButterflyRenderer::new);
		event.registerEntityRenderer(ForestModEntities.CALIBRI.get(), CalibriRenderer::new);
		event.registerEntityRenderer(ForestModEntities.VULTURE.get(), VultureRenderer::new);
		event.registerEntityRenderer(ForestModEntities.RAT.get(), RatRenderer::new);
		event.registerEntityRenderer(ForestModEntities.CROCODILE.get(), CrocodileRenderer::new);
		event.registerEntityRenderer(ForestModEntities.TUMBLEWEED.get(), TumbleweedRenderer::new);
		event.registerEntityRenderer(ForestModEntities.SCORPION.get(), ScorpionRenderer::new);
		event.registerEntityRenderer(ForestModEntities.SARBAKAN.get(), SarbakanRenderer::new);
	}
}
