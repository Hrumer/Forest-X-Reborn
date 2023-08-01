
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

public class ForestModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ForestMod.MODID);
	public static final RegistryObject<PaintingVariant> PAINTING_VOLCANO = REGISTRY.register("painting_volcano", () -> new PaintingVariant(32, 32));
	public static final RegistryObject<PaintingVariant> PAINTING_PIG_IN_MOOD = REGISTRY.register("painting_pig_in_mood", () -> new PaintingVariant(32, 32));
}
