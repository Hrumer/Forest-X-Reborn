
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.client.gui.SawMenuScreen;
import power.forestxreborn.client.gui.QuiverInventoryScreen;

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
			MenuScreens.register(ForestModMenus.QUIVER_INVENTORY.get(), QuiverInventoryScreen::new);
			MenuScreens.register(ForestModMenus.SAW_MENU.get(), SawMenuScreen::new);
		});
	}
}
