
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import power.forestxreborn.world.features.plants.WildflowerFeature;
import power.forestxreborn.world.features.plants.LavanderFeature;
import power.forestxreborn.world.features.plants.DesertRoseFeature;
import power.forestxreborn.world.features.plants.BurningblossomFeature;
import power.forestxreborn.world.features.plants.BlueRoseFeature;
import power.forestxreborn.world.features.ores.SilverOreFeature;
import power.forestxreborn.world.features.ores.SandslateFeature;
import power.forestxreborn.world.features.ores.RhyoliteFeature;
import power.forestxreborn.world.features.ores.DeepslateSilverOreFeature;
import power.forestxreborn.world.features.VolcanoLavaLakesFeature;
import power.forestxreborn.world.features.SakuraTreeFeature;
import power.forestxreborn.world.features.PeatbogLakesFeature;
import power.forestxreborn.world.features.BlueberriesBushFeatureFeature;
import power.forestxreborn.ForestMod;

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
	public static final RegistryObject<Feature<?>> SILVER_ORE = REGISTRY.register("silver_ore", SilverOreFeature::new);
	public static final RegistryObject<Feature<?>> DEEPSLATE_SILVER_ORE = REGISTRY.register("deepslate_silver_ore", DeepslateSilverOreFeature::new);
	public static final RegistryObject<Feature<?>> VOLCANO_LAVA_LAKES = REGISTRY.register("volcano_lava_lakes", VolcanoLavaLakesFeature::new);
	public static final RegistryObject<Feature<?>> SAKURA_TREE = REGISTRY.register("sakura_tree", SakuraTreeFeature::new);
	public static final RegistryObject<Feature<?>> PEATBOG_LAKES = REGISTRY.register("peatbog_lakes", PeatbogLakesFeature::new);
	public static final RegistryObject<Feature<?>> BLUEBERRIES_BUSH_FEATURE = REGISTRY.register("blueberries_bush_feature", BlueberriesBushFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SEMIDESERT_PATCH = REGISTRY.register("semidesert_patch", SemidesertPatchFeature::new);
	public static final RegistryObject<Feature<?>> BROWN_MUSHROOMS_FEATURE = REGISTRY.register("brown_mushrooms_feature", BrownMushroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> RED_MUSHROOMS_FEATURE = REGISTRY.register("red_mushrooms_feature", RedMushroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> MOONSHROOMS_FEATURE = REGISTRY.register("moonshrooms_feature", MoonshroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> SUNSHROOMS_FEATURE = REGISTRY.register("sunshrooms_feature", SunshroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> BIG_BROWN_MUSHROOMS_FEATURE = REGISTRY.register("big_brown_mushrooms_feature", BigBrownMushroomsFeatureFeature::new);
	public static final RegistryObject<Feature<?>> BIG_RED_MUSHROOMS_FEATURE = REGISTRY.register("big_red_mushrooms_feature", BigRedMushroomsFeatureFeature::new);
}
