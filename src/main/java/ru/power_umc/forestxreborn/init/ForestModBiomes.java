
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package ru.power_umc.forestxreborn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.server.ServerAboutToStartEvent;

import net.minecraft.world.level.levelgen.placement.CaveSurface;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.NoiseGeneratorSettings;
import net.minecraft.world.level.levelgen.NoiseBasedChunkGenerator;
import net.minecraft.world.level.dimension.LevelStem;
import net.minecraft.world.level.dimension.DimensionType;
import net.minecraft.world.level.dimension.BuiltinDimensionTypes;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.biome.MultiNoiseBiomeSource;
import net.minecraft.world.level.biome.FeatureSorter;
import net.minecraft.world.level.biome.Climate;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.server.MinecraftServer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.Registry;
import net.minecraft.core.Holder;

import java.util.List;
import java.util.ArrayList;

import com.mojang.datafixers.util.Pair;

import com.google.common.base.Suppliers;

@Mod.EventBusSubscriber
public class ForestModBiomes {
	@SubscribeEvent
	public static void onServerAboutToStart(ServerAboutToStartEvent event) {
		MinecraftServer server = event.getServer();
		Registry<DimensionType> dimensionTypeRegistry = server.registryAccess().registryOrThrow(Registries.DIMENSION_TYPE);
		Registry<LevelStem> levelStemTypeRegistry = server.registryAccess().registryOrThrow(Registries.LEVEL_STEM);
		Registry<Biome> biomeRegistry = server.registryAccess().registryOrThrow(Registries.BIOME);
		for (LevelStem levelStem : levelStemTypeRegistry.stream().toList()) {
			DimensionType dimensionType = levelStem.type().value();
			if (dimensionType == dimensionTypeRegistry.getOrThrow(BuiltinDimensionTypes.OVERWORLD)) {
				ChunkGenerator chunkGenerator = levelStem.generator();
				// Inject biomes to biome source
				if (chunkGenerator.getBiomeSource() instanceof MultiNoiseBiomeSource noiseSource) {
					List<Pair<Climate.ParameterPoint, Holder<Biome>>> parameters = new ArrayList<>(noiseSource.parameters().values());
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.45f, 0.2f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.55f, 1f), Climate.Parameter.point(0.0f),
							Climate.Parameter.span(-0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "peatbog")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.45f, 0.2f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.55f, 1f), Climate.Parameter.point(1.0f),
							Climate.Parameter.span(-0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "peatbog")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1f), Climate.Parameter.span(-1f, -0.35f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.05f, 0.55f), Climate.Parameter.point(0.0f),
							Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "semidesert")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1f), Climate.Parameter.span(-1f, -0.35f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.05f, 0.55f), Climate.Parameter.point(1.0f),
							Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "semidesert")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.2f, 0.55f), Climate.Parameter.span(-0.35f, -0.01f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.375f, 0.05f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "dry_thorn_forest")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.2f, 0.55f), Climate.Parameter.span(-0.35f, -0.01f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.375f, 0.05f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "dry_thorn_forest")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.2f, 0.55f), Climate.Parameter.span(0.1f, 0.3f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.point(0.0f),
							Climate.Parameter.span(0.2666f, 0.4f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "eucalyptus_forest")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.2f, 0.55f), Climate.Parameter.span(0.1f, 0.3f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.point(1.0f),
							Climate.Parameter.span(0.2666f, 0.4f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "eucalyptus_forest")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, -0.45f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.5499f, 1f), Climate.Parameter.point(0.0f),
							Climate.Parameter.span(-0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "frozen_swamp")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, -0.45f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.11f, 1f), Climate.Parameter.span(0.5499f, 1f), Climate.Parameter.point(1.0f),
							Climate.Parameter.span(-0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "frozen_swamp")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, -0.45f), Climate.Parameter.span(-1f, -0.35f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.2225f, 0.55f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "ice_desert")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, -0.45f), Climate.Parameter.span(-1f, -0.35f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.2225f, 0.55f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "ice_desert")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.15f, 0.2f), Climate.Parameter.span(-0.1f, 0.3f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.375f, 0.55f),
							Climate.Parameter.point(0.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "old_growth_oak_forest")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.15f, 0.2f), Climate.Parameter.span(-0.1f, 0.3f), Climate.Parameter.span(0.03f, 1f), Climate.Parameter.span(-0.375f, 0.55f),
							Climate.Parameter.point(1.0f), Climate.Parameter.span(0.05f, 0.2666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "old_growth_oak_forest")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.19f, 1f), Climate.Parameter.span(-1f, -0.7799f), Climate.Parameter.point(0.0f),
							Climate.Parameter.span(-0.7666f, -0.5666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "volcanic_peaks")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-0.19f, 1f), Climate.Parameter.span(-1f, -0.7799f), Climate.Parameter.point(1.0f),
							Climate.Parameter.span(-0.7666f, -0.5666f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "volcanic_peaks")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(-0.33f, 0.5f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(0.45f, 1f), Climate.Parameter.span(0.2f, 0.9f),
							Climate.Parameter.span(-0.1f, 0.1f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "marble_caves")))));
					parameters.add(new Pair<>(new Climate.ParameterPoint(Climate.Parameter.span(0.5f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(-1f, 1f), Climate.Parameter.span(0.45f, 1f), Climate.Parameter.span(0.2f, 0.9f),
							Climate.Parameter.span(-0.1f, 0.1f), 0), biomeRegistry.getHolderOrThrow(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "mushrooms_caves")))));
					chunkGenerator.biomeSource = MultiNoiseBiomeSource.createFromList(new Climate.ParameterList<>(parameters));
					chunkGenerator.featuresPerStep = Suppliers
							.memoize(() -> FeatureSorter.buildFeaturesPerStep(List.copyOf(chunkGenerator.biomeSource.possibleBiomes()), biome -> chunkGenerator.generationSettingsGetter.apply(biome).features(), true));
				}
				// Inject surface rules
				if (chunkGenerator instanceof NoiseBasedChunkGenerator noiseGenerator) {
					NoiseGeneratorSettings noiseGeneratorSettings = noiseGenerator.settings.value();
					SurfaceRules.RuleSource currentRuleSource = noiseGeneratorSettings.surfaceRule();
					if (currentRuleSource instanceof SurfaceRules.SequenceRuleSource sequenceRuleSource) {
						List<SurfaceRules.RuleSource> surfaceRules = new ArrayList<>(sequenceRuleSource.sequence());
						surfaceRules.add(1, anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "marble_caves")), ForestModBlocks.MARBLE.get().defaultBlockState(), ForestModBlocks.MARBLE.get().defaultBlockState(),
								ForestModBlocks.MARBLE.get().defaultBlockState()));
						surfaceRules.add(1,
								anySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "mushrooms_caves")), Blocks.MYCELIUM.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.DIRT.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "peatbog")), ForestModBlocks.PEAT.get().defaultBlockState(), Blocks.COARSE_DIRT.defaultBlockState(),
								ForestModBlocks.PEAT.get().defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "semidesert")), Blocks.SAND.defaultBlockState(), Blocks.SAND.defaultBlockState(), Blocks.SAND.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "dry_thorn_forest")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(),
								Blocks.DIRT.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "eucalyptus_forest")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(),
								Blocks.DIRT.defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "frozen_swamp")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(), Blocks.CLAY.defaultBlockState()));
						surfaceRules.add(1,
								preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "ice_desert")), Blocks.SAND.defaultBlockState(), Blocks.SANDSTONE.defaultBlockState(), Blocks.SAND.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "old_growth_oak_forest")), Blocks.GRASS_BLOCK.defaultBlockState(), Blocks.DIRT.defaultBlockState(),
								Blocks.DIRT.defaultBlockState()));
						surfaceRules.add(1, preliminarySurfaceRule(ResourceKey.create(Registries.BIOME, new ResourceLocation("forest", "volcanic_peaks")), ForestModBlocks.ASH_BLOCK.get().defaultBlockState(),
								ForestModBlocks.ASH_BLOCK.get().defaultBlockState(), Blocks.BASALT.defaultBlockState()));
						NoiseGeneratorSettings moddedNoiseGeneratorSettings = new NoiseGeneratorSettings(noiseGeneratorSettings.noiseSettings(), noiseGeneratorSettings.defaultBlock(), noiseGeneratorSettings.defaultFluid(),
								noiseGeneratorSettings.noiseRouter(), SurfaceRules.sequence(surfaceRules.toArray(SurfaceRules.RuleSource[]::new)), noiseGeneratorSettings.spawnTarget(), noiseGeneratorSettings.seaLevel(),
								noiseGeneratorSettings.disableMobGeneration(), noiseGeneratorSettings.aquifersEnabled(), noiseGeneratorSettings.oreVeinsEnabled(), noiseGeneratorSettings.useLegacyRandomSource());
						noiseGenerator.settings = new Holder.Direct<>(moddedNoiseGeneratorSettings);
					}
				}
			}
		}
	}

	private static SurfaceRules.RuleSource preliminarySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.ifTrue(SurfaceRules.abovePreliminarySurface(),
						SurfaceRules.sequence(
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
										SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
								SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock)))));
	}

	private static SurfaceRules.RuleSource anySurfaceRule(ResourceKey<Biome> biomeKey, BlockState groundBlock, BlockState undergroundBlock, BlockState underwaterBlock) {
		return SurfaceRules.ifTrue(SurfaceRules.isBiome(biomeKey),
				SurfaceRules.sequence(
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, false, 0, CaveSurface.FLOOR),
								SurfaceRules.sequence(SurfaceRules.ifTrue(SurfaceRules.waterBlockCheck(-1, 0), SurfaceRules.state(groundBlock)), SurfaceRules.state(underwaterBlock))),
						SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(undergroundBlock))));
	}
}
