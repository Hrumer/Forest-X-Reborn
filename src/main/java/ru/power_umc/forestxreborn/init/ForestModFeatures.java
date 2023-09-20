
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import ru.power_umc.forestxreborn.world.features.plants.WildflowerFeature;
import ru.power_umc.forestxreborn.world.features.plants.WhiteRoseBushFeature;
import ru.power_umc.forestxreborn.world.features.plants.PinkRoseBushFeature;
import ru.power_umc.forestxreborn.world.features.plants.LavanderFeature;
import ru.power_umc.forestxreborn.world.features.plants.DesertRoseFeature;
import ru.power_umc.forestxreborn.world.features.plants.CattailFeature;
import ru.power_umc.forestxreborn.world.features.plants.BurningblossomFeature;
import ru.power_umc.forestxreborn.world.features.plants.BlueRoseFeature;
import ru.power_umc.forestxreborn.world.features.ores.SilverOreFeature;
import ru.power_umc.forestxreborn.world.features.ores.SandslateFeature;
import ru.power_umc.forestxreborn.world.features.ores.RhyoliteFeature;
import ru.power_umc.forestxreborn.world.features.ores.DeepslateSilverOreFeature;
import ru.power_umc.forestxreborn.world.features.WhiteMulberryTreeFeature;
import ru.power_umc.forestxreborn.world.features.SunshroomsFeatureFeature;
import ru.power_umc.forestxreborn.world.features.StoneVolcanoDeltaFeature;
import ru.power_umc.forestxreborn.world.features.StonePatchFeature;
import ru.power_umc.forestxreborn.world.features.SemidesertPatchFeature;
import ru.power_umc.forestxreborn.world.features.RedMushroomsFeatureFeature;
import ru.power_umc.forestxreborn.world.features.RaspberriesBushFeatureFeature;
import ru.power_umc.forestxreborn.world.features.PumicePatchFeature;
import ru.power_umc.forestxreborn.world.features.PeatbogLakesFeature;
import ru.power_umc.forestxreborn.world.features.ObsidianPatchFeature;
import ru.power_umc.forestxreborn.world.features.MoonshroomsFeatureFeature;
import ru.power_umc.forestxreborn.world.features.MixedForestTreesFeature;
import ru.power_umc.forestxreborn.world.features.LavaPatchFeature;
import ru.power_umc.forestxreborn.world.features.GrapevineLogFeature;
import ru.power_umc.forestxreborn.world.features.EucalyptusTreeFeature;
import ru.power_umc.forestxreborn.world.features.CobblestonePatchFeature;
import ru.power_umc.forestxreborn.world.features.BrownMushroomsFeatureFeature;
import ru.power_umc.forestxreborn.world.features.BlueberriesBushFeatureFeature;
import ru.power_umc.forestxreborn.world.features.BlackMulberryTreeFeature;
import ru.power_umc.forestxreborn.world.features.BigRedMushroomsFeatureFeature;
import ru.power_umc.forestxreborn.world.features.BigBrownMushroomsFeatureFeature;
import ru.power_umc.forestxreborn.ForestMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

@Mod.EventBusSubscriber
public class ForestModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, ForestMod.MODID);
	public static final RegistryObject<Feature<?>> RHYOLITE = REGISTRY.register("rhyolite", RhyoliteFeature::new);
	public static final RegistryObject<Feature<?>> SANDSLATE = REGISTRY.register("sandslate", SandslateFeature::new);
	public static final RegistryObject<Feature<?>> WILDFLOWER = REGISTRY.register("wildflower", WildflowerFeature::new);
	public static final RegistryObject<Feature<?>> BURNING_BLOSSOM = REGISTRY.register("burning_blossom", BurningblossomFeature::new);
	public static final RegistryObject<Feature<?>> LAVANDER = REGISTRY.register("lavander", LavanderFeature::new);
	public static final RegistryObject<Feature<?>> DESERT_ROSE = REGISTRY.register("desert_rose", DesertRoseFeature::new);
	public static final RegistryObject<Feature<?>> BLUE_ROSE = REGISTRY.register("blue_rose", BlueRoseFeature::new);
	public static final RegistryObject<Feature<?>> WHITE_ROSE_BUSH = REGISTRY.register("white_rose_bush", WhiteRoseBushFeature::new);
	public static final RegistryObject<Feature<?>> PINK_ROSE_BUSH = REGISTRY.register("pink_rose_bush", PinkRoseBushFeature::new);
	public static final RegistryObject<Feature<?>> CATTAIL = REGISTRY.register("cattail", CattailFeature::new);
	public static final RegistryObject<Feature<?>> SILVER_ORE = REGISTRY.register("silver_ore", SilverOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_SILVER_ORE = REGISTRY.register("deepslate_silver_ore", DeepslateSilverOreFeature::new);
	public static final RegistryObject<Feature<?>> PEATBOG_LAKES = REGISTRY.register("peatbog_lakes", PeatbogLakesFeature::new);
	public static final RegistryObject<Feature<?>> BLUEBERRIES_BUSH_FEATURE = REGISTRY.register("blueberries_bush_feature", BlueberriesBushFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SEMIDESERT_PATCH = REGISTRY.register("semidesert_patch", SemidesertPatchFeature::new);
	public static final RegistryObject<Feature<?>> BROWN_MUSHROOMS_FEATURE = REGISTRY.register("brown_mushrooms_feature", BrownMushroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> RED_MUSHROOMS_FEATURE = REGISTRY.register("red_mushrooms_feature", RedMushroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> MOONSHROOMS_FEATURE = REGISTRY.register("moonshrooms_feature", MoonshroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SUNSHROOMS_FEATURE = REGISTRY.register("sunshrooms_feature", SunshroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> BIG_BROWN_MUSHROOMS_FEATURE = REGISTRY.register("big_brown_mushrooms_feature", BigBrownMushroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> BIG_RED_MUSHROOMS_FEATURE = REGISTRY.register("big_red_mushrooms_feature", BigRedMushroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> OBSIDIAN_PATCH = REGISTRY.register("obsidian_patch", ObsidianPatchFeature::new);
	public static final RegistryObject<Feature<?>> PUMICE_PATCH = REGISTRY.register("pumice_patch", PumicePatchFeature::new);
	public static final RegistryObject<Feature<?>> STONE_PATCH = REGISTRY.register("stone_patch", StonePatchFeature::new);
	public static final RegistryObject<Feature<?>> COBBLESTONE_PATCH = REGISTRY.register("cobblestone_patch", CobblestonePatchFeature::new);
	public static final RegistryObject<Feature<?>> LAVA_PATCH = REGISTRY.register("lava_patch", LavaPatchFeature::new);
	public static final RegistryObject<Feature<?>> STONE_VOLCANO_DELTA = REGISTRY.register("stone_volcano_delta", StoneVolcanoDeltaFeature::new);
	public static final RegistryObject<Feature<?>> GRAPEVINE_LOG = REGISTRY.register("grapevine_log", GrapevineLogFeature::new);
	public static final RegistryObject<Feature<?>> WHITE_MULBERRY_TREE = REGISTRY.register("white_mulberry_tree", WhiteMulberryTreeFeature::new);
	public static final RegistryObject<Feature<?>> BLACK_MULBERRY_TREE = REGISTRY.register("black_mulberry_tree", BlackMulberryTreeFeature::new);
	public static final RegistryObject<Feature<?>> RASPBERRIES_BUSH_FEATURE = REGISTRY.register("raspberries_bush_feature", RaspberriesBushFeatureFeature::new);
	public static final RegistryObject<Feature<?>> EUCALYPTUS_TREE = REGISTRY.register("eucalyptus_tree", EucalyptusTreeFeature::new);
	public static final RegistryObject<Feature<?>> MIXED_FOREST_TREES = REGISTRY.register("mixed_forest_trees", MixedForestTreesFeature::new);
}
