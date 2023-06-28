
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class ForestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ForestMod.MODID);
	public static final RegistryObject<MenuType<ClayOvenGUIMenu>> CLAY_OVEN_GUI = REGISTRY.register("clay_oven_gui", () -> IForgeMenuType.create(ClayOvenGUIMenu::new));
}
