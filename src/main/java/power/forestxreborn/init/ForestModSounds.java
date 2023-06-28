
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class ForestModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ForestMod.MODID);
	public static final RegistryObject<SoundEvent> DUCKBILL_AMBIENT = REGISTRY.register("duckbill.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "duckbill.ambient")));
	public static final RegistryObject<SoundEvent> DUCKBILL_DEATH = REGISTRY.register("duckbill.death", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "duckbill.death")));
	public static final RegistryObject<SoundEvent> DUCKBILL_HURT = REGISTRY.register("duckbill.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "duckbill.hurt")));
}
