
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package power.forestxreborn.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class ForestModTabs {
	@SubscribeEvent
	public static void buildTabContentsVanilla(CreativeModeTabEvent.BuildContents tabData) {

		if (tabData.getTab() == CreativeModeTabs.REDSTONE_BLOCKS) {
			tabData.accept(ForestModBlocks.MULBERRY_FENCE_GATE.get().asItem());
		}

		if (tabData.getTab() == CreativeModeTabs.NATURAL_BLOCKS) {
			tabData.accept(ForestModBlocks.MULBERRY_FENCE.get().asItem());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("forest", "trees"),
				builder -> builder.title(Component.translatable("item_group.forest.trees")).icon(() -> new ItemStack(ForestModBlocks.MULBERRY_SAPLING.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModBlocks.MULBERRY_SAPLING.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_LEAVES_WITHOUT_WHITE.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_LEAVES_WITHOUT_BLACK.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_LEAVES_WITH_WHITE.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_LEAVES_WITH_BLACK.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_WOOD.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_LOG.get().asItem());
					tabData.accept(ForestModBlocks.STRIPPED_MULBERRY_WOOD.get().asItem());
					tabData.accept(ForestModBlocks.STRIPPED_MULBERRY_LOG.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_PRESSURE_PLATE.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_BUTTON.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_DOOR.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_TRAPDOOR.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "decorative_blocks"),
				builder -> builder.title(Component.translatable("item_group.forest.decorative_blocks")).icon(() -> new ItemStack(ForestModBlocks.SANDSLATE_FACETED_BRICKS.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModBlocks.SNAIL_SHELL.get().asItem());
					tabData.accept(ForestModBlocks.PEAT.get().asItem());
					tabData.accept(ForestModBlocks.CRUSHED_SANDSTONE.get().asItem());
					tabData.accept(ForestModBlocks.CRUSHED_SANDSTONE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.CRUSHED_SANDSTONE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.CRUSHED_SANDSTONE_WALL.get().asItem());
					tabData.accept(ForestModBlocks.RED_CRUSHED_SANDSTONE.get().asItem());
					tabData.accept(ForestModBlocks.RED_CRUSHED_SANDSTONE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.RED_CRUSHED_SANDSTONE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.RED_CRUSHED_SANDSTONE_WALL.get().asItem());
					tabData.accept(ForestModBlocks.OAK_PARQUET.get().asItem());
					tabData.accept(ForestModBlocks.BIRCH_PARQUET.get().asItem());
					tabData.accept(ForestModBlocks.DARK_OAK_PARQUET.get().asItem());
					tabData.accept(ForestModBlocks.SPRUCE_PARQUET.get().asItem());
					tabData.accept(ForestModBlocks.ACACIA_PARQUET.get().asItem());
					tabData.accept(ForestModBlocks.TROPICAL_PARQUET.get().asItem());
					tabData.accept(ForestModBlocks.CRIMSON_PARQUET.get().asItem());
					tabData.accept(ForestModBlocks.WARPED_PARQUET.get().asItem());
					tabData.accept(ForestModBlocks.MANGROVE_PARQUET.get().asItem());
					tabData.accept(ForestModBlocks.CHERRY_PARQUET.get().asItem());
					tabData.accept(ForestModBlocks.MULBERRY_PARQUET.get().asItem());
					tabData.accept(ForestModBlocks.MARBLE.get().asItem());
					tabData.accept(ForestModBlocks.MARBLE_BRICKS.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_MARBLE.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_MARBLE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.MARBLE_BRICKS_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_MARBLE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.MARBLE_BRICKS_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_MARBLE_WALL.get().asItem());
					tabData.accept(ForestModBlocks.MARBLE_BRICKS_WALL.get().asItem());
					tabData.accept(ForestModBlocks.RHYOLITE.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_RHYOLITE.get().asItem());
					tabData.accept(ForestModBlocks.RHYOLITE_BRICKS.get().asItem());
					tabData.accept(ForestModBlocks.CHISELED_RHYOLITE.get().asItem());
					tabData.accept(ForestModBlocks.RHYOLITE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_RHYOLITE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.RHYOLITE_BRICKS_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.RHYOLITE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_RHYOLITE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.RHYOLITE_BRICKS_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.RHYOLITE_WALL.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_RHYOLITE_WALL.get().asItem());
					tabData.accept(ForestModBlocks.RHYOLITE_BRICKS_WALL.get().asItem());
					tabData.accept(ForestModBlocks.ASH_COVER.get().asItem());
					tabData.accept(ForestModBlocks.ASH_BLOCK.get().asItem());
					tabData.accept(ForestModBlocks.PUMICE.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_PUMICE.get().asItem());
					tabData.accept(ForestModBlocks.PUMICE_BRICKS.get().asItem());
					tabData.accept(ForestModBlocks.TRUNCATED_PUMICE.get().asItem());
					tabData.accept(ForestModBlocks.TRUNCATED_CARVED_PUMICE.get().asItem());
					tabData.accept(ForestModBlocks.PUMICE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_PUMICE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.PUMICE_BRICKS_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.TRUNCATED_PUMICE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.PUMICE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_PUMICE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.PUMICE_BRICKS_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.TRUNCATED_PUMICE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.PUMICE_WALL.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_PUMICE_WALL.get().asItem());
					tabData.accept(ForestModBlocks.PUMICE_BRICKS_WALL.get().asItem());
					tabData.accept(ForestModBlocks.TRUNCATED_PUMICE_WALL.get().asItem());
					tabData.accept(ForestModBlocks.SANDSLATE.get().asItem());
					tabData.accept(ForestModBlocks.COBBLED_SANDSLATE.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_SANDSLATE.get().asItem());
					tabData.accept(ForestModBlocks.SANDSLATE_BRICKS.get().asItem());
					tabData.accept(ForestModBlocks.SANDSLATE_FACETED_BRICKS.get().asItem());
					tabData.accept(ForestModBlocks.COBBLED_SANDSLATE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_SANDSLATE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.SANDSLATE_BRICKS_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.COBBLED_SANDSLATE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_SANDSLATE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.SANDSLATE_BRICKS_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.COBBLED_SANDSLATE_WALL.get().asItem());
					tabData.accept(ForestModBlocks.POLISHED_SANDSLATE_WALL.get().asItem());
					tabData.accept(ForestModBlocks.SANDSLATE_BRICKS_WALL.get().asItem());
					tabData.accept(ForestModBlocks.RAW_GINGERBREAD_BLOCK.get().asItem());
					tabData.accept(ForestModBlocks.GINGERBREAD_BLOCK.get().asItem());
					tabData.accept(ForestModBlocks.GINGERBREAD_BRICKS.get().asItem());
					tabData.accept(ForestModBlocks.WHITE_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.LIGHT_GRAY_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.GRAY_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.BLACK_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.BROWN_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.RED_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.ORANGE_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.YELLOW_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.LIME_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.GREEN_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.CYAN_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.LIGHT_BLUE_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.BLUE_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.PURPLE_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.MAGENTA_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.PINK_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.WHITE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.LIGHT_GRAY_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.GRAY_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.BLACK_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.BROWN_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.RED_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.ORANGE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.YELLOW_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.LIME_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.GREEN_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.CYAN_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.LIGHT_BLUE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.BLUE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.PURPLE_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.MAGENTA_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.PINK_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.WHITE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.LIGHT_GRAY_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.GRAY_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.BLACK_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.BROWN_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.RED_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.ORANGE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.YELLOW_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.LIME_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.GREEN_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.CYAN_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.LIGHT_BLUE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.BLUE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.PURPLE_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.MAGENTA_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.PINK_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.WHITE_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.LIGHT_GRAY_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.GRAY_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.BLACK_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.BROWN_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.RED_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.ORANGE_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.YELLOW_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.LIME_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.GREEN_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.CYAN_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.LIGHT_BLUE_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.BLUE_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.PURPLE_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.MAGENTA_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.PINK_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.WHITE_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.LIGHT_GRAY_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.GRAY_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.BLACK_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.BROWN_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.RED_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.ORANGE_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.YELLOW_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.LIME_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.GREEN_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.CYAN_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.LIGHT_BLUE_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.BLUE_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.PURPLE_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.MAGENTA_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.PINK_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.BROWN_BEAR_CARPET.get().asItem());
					tabData.accept(ForestModBlocks.POLAR_BEAR_CARPET.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "plants"),
				builder -> builder.title(Component.translatable("item_group.forest.plants")).icon(() -> new ItemStack(ForestModBlocks.LAVANDER.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModItems.LETTUCE_SEED.get());
					tabData.accept(ForestModBlocks.WILDFLOWER.get().asItem());
					tabData.accept(ForestModBlocks.BURNING_BLOSSOM.get().asItem());
					tabData.accept(ForestModBlocks.LAVANDER.get().asItem());
					tabData.accept(ForestModBlocks.DESERT_ROSE.get().asItem());
					tabData.accept(ForestModBlocks.BLUE_ROSE.get().asItem());
					tabData.accept(ForestModBlocks.SUNSHROOM.get().asItem());
					tabData.accept(ForestModBlocks.MOONSHROOM.get().asItem());
					tabData.accept(ForestModBlocks.GRAPE_VINE_0.get().asItem());
					tabData.accept(ForestModBlocks.WHITE_ROSE_BUSH.get().asItem());
					tabData.accept(ForestModBlocks.PINK_ROSE_BUSH.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "ores"),
				builder -> builder.title(Component.translatable("item_group.forest.ores")).icon(() -> new ItemStack(ForestModBlocks.DEEPSLATE_SILVER_ORE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModBlocks.SILVER_ORE.get().asItem());
					tabData.accept(ForestModBlocks.DEEPSLATE_SILVER_ORE.get().asItem());
					tabData.accept(ForestModBlocks.RAW_SILVER_BLOCK.get().asItem());
					tabData.accept(ForestModBlocks.SILVER_BLOCK.get().asItem());
					tabData.accept(ForestModItems.RAW_SILVER.get());
					tabData.accept(ForestModItems.SILVER_INGOT.get());
					tabData.accept(ForestModItems.SILVER_NUGGET.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "food"), builder -> builder.title(Component.translatable("item_group.forest.food")).icon(() -> new ItemStack(ForestModItems.MEAT_LOAF.get())).displayItems((parameters, tabData) -> {
			tabData.accept(ForestModItems.GRAPE.get());
			tabData.accept(ForestModItems.BLUEBERRY.get());
			tabData.accept(ForestModItems.LETTUCE.get());
			tabData.accept(ForestModItems.RAW_BARBECUE.get());
			tabData.accept(ForestModItems.BARBECUE.get());
			tabData.accept(ForestModItems.MEAT_LOAF.get());
			tabData.accept(ForestModItems.LARD.get());
			tabData.accept(ForestModItems.BREADWITHLARD.get());
			tabData.accept(ForestModItems.BERRY_STRUDEL.get());
			tabData.accept(ForestModItems.GINGERBREAD_DOUGH.get());
			tabData.accept(ForestModItems.RAW_GINGERBREAD_MAN.get());
			tabData.accept(ForestModItems.RAW_GINGERBREAD_HEART.get());
			tabData.accept(ForestModItems.RAW_GINGERBREAD_BRICK.get());
			tabData.accept(ForestModItems.RAW_GINGERBREAD_PINE.get());
			tabData.accept(ForestModItems.GINGERBREAD_MAN.get());
			tabData.accept(ForestModItems.GLAZED_GINGERBREAD_MEN.get());
			tabData.accept(ForestModItems.GINGERBREAD_HEART.get());
			tabData.accept(ForestModItems.GINGERBREAD_BRICK.get());
			tabData.accept(ForestModItems.GINGERBREAD_ROUND.get());
			tabData.accept(ForestModItems.GINGERBREAD_PINE.get());
			tabData.accept(ForestModItems.GLAZED_GINGERBREAD_PINE.get());
			tabData.accept(ForestModItems.WINE.get());
			tabData.accept(ForestModItems.BLACK_MULBERRY.get());
			tabData.accept(ForestModItems.WHITE_MULBERRY.get());
			tabData.accept(ForestModItems.RASPBERRY.get());
		})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "misc"),
				builder -> builder.title(Component.translatable("item_group.forest.misc")).icon(() -> new ItemStack(ForestModItems.PEAT_PIECE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModItems.PEAT_PIECE.get());
					tabData.accept(ForestModItems.GINGERBREAD_FORM_MAN.get());
					tabData.accept(ForestModItems.GINGERBREAD_FORM_HEART.get());
					tabData.accept(ForestModItems.GINGERBREAD_FORM_BRICK.get());
					tabData.accept(ForestModItems.GINGERBREAD_FORM_PINE.get());
					tabData.accept(ForestModItems.BROWN_BEAR_PELT.get());
					tabData.accept(ForestModItems.POLAR_BEAR_PELT.get());
					tabData.accept(ForestModItems.CALIBRI_FEATHER.get());
					tabData.accept(ForestModItems.DART.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "interaction_blocks"),
				builder -> builder.title(Component.translatable("item_group.forest.interaction_blocks")).icon(() -> new ItemStack(ForestModBlocks.FERMENTATION_BARREL.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModBlocks.FERMENTATION_BARREL.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "tools_and_armor"),
				builder -> builder.title(Component.translatable("item_group.forest.tools_and_armor")).icon(() -> new ItemStack(ForestModItems.SILVER_AXE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModItems.SILVER_AXE.get());
					tabData.accept(ForestModItems.SILVER_PICKAXE.get());
					tabData.accept(ForestModItems.SILVER_SHOVEL.get());
					tabData.accept(ForestModItems.SILVER_HOE.get());
					tabData.accept(ForestModItems.SILVER_SWORD.get());
					tabData.accept(ForestModItems.SILVER_ARMOR_HELMET.get());
					tabData.accept(ForestModItems.SILVER_ARMOR_CHESTPLATE.get());
					tabData.accept(ForestModItems.SILVER_ARMOR_LEGGINGS.get());
					tabData.accept(ForestModItems.SILVER_ARMOR_BOOTS.get());
					tabData.accept(ForestModItems.QUIVER.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "music_discs"),
				builder -> builder.title(Component.translatable("item_group.forest.music_discs")).icon(() -> new ItemStack(ForestModItems.MUSIC_DISC_STROFA.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModItems.MUSIC_DISC_STROFA.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "mobs"),
				builder -> builder.title(Component.translatable("item_group.forest.mobs")).icon(() -> new ItemStack(ForestModItems.RACOON_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModItems.RACOON_SPAWN_EGG.get());
					tabData.accept(ForestModItems.BROWN_BEAR_SPAWN_EGG.get());
					tabData.accept(ForestModItems.SNAIL_SPAWN_EGG.get());
					tabData.accept(ForestModItems.FENNEC_SPAWN_EGG.get());
					tabData.accept(ForestModItems.FIRE_SALAMANDER_SPAWN_EGG.get());
					tabData.accept(ForestModItems.ORANGE_BUTTERFLY_SPAWN_EGG.get());
					tabData.accept(ForestModItems.PINK_BUTTERFLY_SPAWN_EGG.get());
					tabData.accept(ForestModItems.BLUE_BUTTERFLY_SPAWN_EGG.get());
					tabData.accept(ForestModItems.GREEN_BUTTERFLY_SPAWN_EGG.get());
					tabData.accept(ForestModItems.PURPLE_BUTTERFLY_SPAWN_EGG.get());
					tabData.accept(ForestModItems.CALIBRI_SPAWN_EGG.get());
					tabData.accept(ForestModItems.VULTURE_SPAWN_EGG.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "clothes"),
				builder -> builder.title(Component.translatable("item_group.forest.clothes")).icon(() -> new ItemStack(ForestModItems.BROWN_BEAR_ARMOR_HELMET.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModItems.BROWN_BEAR_ARMOR_HELMET.get());
					tabData.accept(ForestModItems.BROWN_BEAR_ARMOR_CHESTPLATE.get());
					tabData.accept(ForestModItems.BROWN_BEAR_ARMOR_LEGGINGS.get());
					tabData.accept(ForestModItems.BROWN_BEAR_ARMOR_BOOTS.get());
					tabData.accept(ForestModItems.POLAR_BEAR_ARMOR_HELMET.get());
					tabData.accept(ForestModItems.POLAR_BEAR_ARMOR_CHESTPLATE.get());
					tabData.accept(ForestModItems.POLAR_BEAR_ARMOR_LEGGINGS.get());
					tabData.accept(ForestModItems.POLAR_BEAR_ARMOR_BOOTS.get());
				})

		);
	}
}
