
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.world.inventory.SawMenuMenu;
import power.forestxreborn.world.inventory.QuiverInventoryMenu;
import power.forestxreborn.world.inventory.FermentationBarrelMenuMenu;
import power.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class ForestModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, ForestMod.MODID);
	public static final RegistryObject<MenuType<QuiverInventoryMenu>> QUIVER_INVENTORY = REGISTRY.register("quiver_inventory", () -> IForgeMenuType.create(QuiverInventoryMenu::new));
	public static final RegistryObject<MenuType<SawMenuMenu>> SAW_MENU = REGISTRY.register("saw_menu", () -> IForgeMenuType.create(SawMenuMenu::new));
	public static final RegistryObject<MenuType<FermentationBarrelMenuMenu>> FERMENTATION_BARREL_MENU = REGISTRY.register("fermentation_barrel_menu", () -> IForgeMenuType.create(FermentationBarrelMenuMenu::new));
}
