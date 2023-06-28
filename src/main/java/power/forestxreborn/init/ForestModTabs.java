
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

		if (tabData.getTab() == CreativeModeTabs.COMBAT) {
			tabData.accept(ForestModItems.SILVER_SWORD.get());
		}

		if (tabData.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(ForestModItems.RACOON_SPAWN_EGG.get());
			tabData.accept(ForestModItems.SNAIL_SPAWN_EGG.get());
			tabData.accept(ForestModItems.BROWN_BEAR_SPAWN_EGG.get());
			tabData.accept(ForestModItems.FENNEC_SPAWN_EGG.get());
		}

		if (tabData.getTab() == CreativeModeTabs.TOOLS_AND_UTILITIES) {
			tabData.accept(ForestModItems.SILVER_AXE.get());
			tabData.accept(ForestModItems.SILVER_PICKAXE.get());
			tabData.accept(ForestModItems.SILVER_SHOVEL.get());
			tabData.accept(ForestModItems.SILVER_HOE.get());
		}
	}

	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("forest", "trees"),
				builder -> builder.title(Component.translatable("item_group.forest.trees")).icon(() -> new ItemStack(ForestModBlocks.SAKURA_SAPLING.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModBlocks.SAKURA_SAPLING.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_LEAVES.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_WOOD.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_LOG.get().asItem());
					tabData.accept(ForestModBlocks.STRIPPED_SAKURA_LOG.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_PLANKS.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_STAIRS.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_SLAB.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_DOOR.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_TRAPDOOR.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_FENCE.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_FENCE_GATE.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_PRESSURE_PLATE.get().asItem());
					tabData.accept(ForestModBlocks.SAKURA_BUTTON.get().asItem());
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
					tabData.accept(ForestModBlocks.SAKURA_PARQUET.get().asItem());
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
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "plants"),
				builder -> builder.title(Component.translatable("item_group.forest.plants")).icon(() -> new ItemStack(ForestModBlocks.LAVANDER.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModBlocks.WILDFLOWER.get().asItem());
					tabData.accept(ForestModBlocks.BURNING_BLOSSOM.get().asItem());
					tabData.accept(ForestModBlocks.LAVANDER.get().asItem());
					tabData.accept(ForestModBlocks.DESERT_ROSE.get().asItem());
					tabData.accept(ForestModBlocks.BLUE_ROSE.get().asItem());
					tabData.accept(ForestModBlocks.SUNSHROOM.get().asItem());
					tabData.accept(ForestModBlocks.MOONSHROOM.get().asItem());
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
			tabData.accept(ForestModItems.RAW_BARBECUE.get());
			tabData.accept(ForestModItems.BARBECUE.get());
			tabData.accept(ForestModItems.MEAT_LOAF.get());
			tabData.accept(ForestModItems.LARD.get());
			tabData.accept(ForestModItems.BREADWITHLARD.get());
			tabData.accept(ForestModItems.BERRY_STRUDEL.get());
			tabData.accept(ForestModItems.GINGERBREAD_MAN.get());
			tabData.accept(ForestModItems.GLAZED_GINGERBREAD_MEN.get());
			tabData.accept(ForestModItems.GINGERBREAD_HEART.get());
			tabData.accept(ForestModItems.GINGERBREAD_BRICK.get());
			tabData.accept(ForestModItems.GINGERBREAD_ROUND.get());
			tabData.accept(ForestModItems.GINGERBREAD_PINE.get());
			tabData.accept(ForestModItems.GLAZED_GINGERBREAD_PINE.get());
		})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "misc"),
				builder -> builder.title(Component.translatable("item_group.forest.misc")).icon(() -> new ItemStack(ForestModItems.PEAT_PIECE.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModItems.GINGERBREAD_DOUGH.get());
					tabData.accept(ForestModItems.RAW_GINGERBREAD_MAN.get());
					tabData.accept(ForestModItems.RAW_GINGERBREAD_HEART.get());
					tabData.accept(ForestModItems.RAW_GINGERBREAD_BRICK.get());
					tabData.accept(ForestModItems.RAW_GINGERBREAD_PINE.get());
					tabData.accept(ForestModItems.PEAT_PIECE.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "harvest"),
				builder -> builder.title(Component.translatable("item_group.forest.harvest")).icon(() -> new ItemStack(ForestModItems.BLUEBERRY.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModItems.BLUEBERRY.get());
					tabData.accept(ForestModItems.LETTUCE.get());
					tabData.accept(ForestModItems.LETTUCE_SEED.get());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "interaction_blocks"),
				builder -> builder.title(Component.translatable("item_group.forest.interaction_blocks")).icon(() -> new ItemStack(ForestModBlocks.CLAY_OVEN.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModBlocks.CLAY_OVEN.get().asItem());
				})

		);
		event.registerCreativeModeTab(new ResourceLocation("forest", "gingerbread_forms"),
				builder -> builder.title(Component.translatable("item_group.forest.gingerbread_forms")).icon(() -> new ItemStack(ForestModItems.GINGERBREAD_FORM_MAN.get())).displayItems((parameters, tabData) -> {
					tabData.accept(ForestModItems.GINGERBREAD_FORM_MAN.get());
					tabData.accept(ForestModItems.GINGERBREAD_FORM_HEART.get());
					tabData.accept(ForestModItems.GINGERBREAD_FORM_BRICK.get());
					tabData.accept(ForestModItems.GINGERBREAD_FORM_PINE.get());
				})

		);
	}
}
