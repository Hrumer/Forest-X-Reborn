
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.client.gui.QuiverInventoryScreen;
import ru.power_umc.forestxreborn.client.gui.FermentationBarrelScreenScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;
import ru.power_umc.forestxreborn.client.gui.WoodCutterMenu;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ForestModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(ForestModMenus.QUIVER_INVENTORY.get(), QuiverInventoryScreen::new);
			MenuScreens.register(ForestModMenus.FERMENTATION_BARREL_SCREEN.get(), FermentationBarrelScreenScreen::new);
		});
	}
}
