
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.particles.ParticleType;

public class ForestModParticleTypes {
	public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, ForestMod.MODID);
	public static final RegistryObject<SimpleParticleType> FERMENTATION_BUBBLES = REGISTRY.register("fermentation_bubbles", () -> new SimpleParticleType(false));
}
