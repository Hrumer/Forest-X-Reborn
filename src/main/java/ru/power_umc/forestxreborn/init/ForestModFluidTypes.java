
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.fluid.types.AcidFluidType;
import ru.power_umc.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

public class ForestModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, ForestMod.MODID);
	public static final RegistryObject<FluidType> ACID_TYPE = REGISTRY.register("acid", () -> new AcidFluidType());
}
