
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.world.inventory.QuiverInventoryMenu;
import ru.power_umc.forestxreborn.world.inventory.FermentationBarrelScreenMenu;
import ru.power_umc.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class ForestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ForestMod.MODID);
	public static final RegistryObject<MenuType<QuiverInventoryMenu>> QUIVER_INVENTORY = REGISTRY.register("quiver_inventory", () -> IForgeMenuType.create(QuiverInventoryMenu::new));
	public static final RegistryObject<MenuType<FermentationBarrelScreenMenu>> FERMENTATION_BARREL_SCREEN = REGISTRY.register("fermentation_barrel_screen", () -> IForgeMenuType.create(FermentationBarrelScreenMenu::new));
}
