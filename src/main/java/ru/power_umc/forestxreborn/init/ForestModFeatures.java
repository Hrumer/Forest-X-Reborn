
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.world.features.WhiteMulberryTreeFeature;
import ru.power_umc.forestxreborn.world.features.RaspberriesBushFeatureFeature;
import ru.power_umc.forestxreborn.world.features.MixedForestTreesFeature;
import ru.power_umc.forestxreborn.world.features.GrapevineLogFeature;
import ru.power_umc.forestxreborn.world.features.EucalyptusTreeFeature;
import ru.power_umc.forestxreborn.world.features.BlueberriesBushFeatureFeature;
import ru.power_umc.forestxreborn.world.features.BlackMulberryTreeFeature;
import ru.power_umc.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class ForestModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ForestMod.MODID);
	public static final RegistryObject<Feature<?>> BLUEBERRIES_BUSH_FEATURE = REGISTRY.register("blueberries_bush_feature", BlueberriesBushFeatureFeature::new);
	public static final RegistryObject<Feature<?>> GRAPEVINE_LOG = REGISTRY.register("grapevine_log", GrapevineLogFeature::new);
	public static final RegistryObject<Feature<?>> WHITE_MULBERRY_TREE = REGISTRY.register("white_mulberry_tree", WhiteMulberryTreeFeature::new);
	public static final RegistryObject<Feature<?>> BLACK_MULBERRY_TREE = REGISTRY.register("black_mulberry_tree", BlackMulberryTreeFeature::new);
	public static final RegistryObject<Feature<?>> RASPBERRIES_BUSH_FEATURE = REGISTRY.register("raspberries_bush_feature", RaspberriesBushFeatureFeature::new);
	public static final RegistryObject<Feature<?>> EUCALYPTUS_TREE = REGISTRY.register("eucalyptus_tree", EucalyptusTreeFeature::new);
	public static final RegistryObject<Feature<?>> MIXED_FOREST_TREES = REGISTRY.register("mixed_forest_trees", MixedForestTreesFeature::new);
}
