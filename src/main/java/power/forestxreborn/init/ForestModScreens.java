
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.client.gui.ClayOvenGUIScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForestModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ForestModMenus.CLAY_OVEN_GUI.get(), ClayOvenGUIScreen::new);
		});
	}
}
