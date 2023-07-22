
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
	public static final RegistryObject<SoundEvent> LIZARD_AMBIENT = REGISTRY.register("lizard.ambient", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "lizard.ambient")));
	public static final RegistryObject<SoundEvent> LIZARD_HURT = REGISTRY.register("lizard.hurt", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "lizard.hurt")));
	public static final RegistryObject<SoundEvent> RECORD_STROFA = REGISTRY.register("record.strofa", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("forest", "record.strofa")));
}
