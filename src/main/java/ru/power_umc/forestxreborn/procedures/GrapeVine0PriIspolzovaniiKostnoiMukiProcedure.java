package ru.power_umc.forestxreborn.procedures;

import ru.power_umc.forestxreborn.init.ForestModBlocks;
import ru.power_umc.forestxreborn.ForestMod;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.tags.BlockTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class GrapeVine0PriIspolzovaniiKostnoiMukiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ForestMod.queueServerWork(1, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestModBlocks.GRAPE_VINE_0.get()) {
				if (Math.random() <= 0.6) {
					if (((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))) && (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(ForestModBlocks.GRAPE_VINE_0.get().defaultBlockState(), (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					} else if (((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).is(BlockTags.create(ResourceLocation.parse("minecraft:logs")))) && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with(ForestModBlocks.GRAPE_VINE_0.get().defaultBlockState(), (new Object() {
							public Direction getDirection(BlockState _bs) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp)
									return _bs.getValue(_dp);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().toArray()[0] instanceof Direction.Axis
										? Direction.fromAxisAndDirection((Direction.Axis) _bs.getValue(_ep), Direction.AxisDirection.POSITIVE)
										: Direction.NORTH;
							}
						}.getDirection((world.getBlockState(BlockPos.containing(x, y, z))))))), 3);
					}
				} else {
					{
						BlockPos _bp = BlockPos.containing(x, y, z);
						BlockState _bs = ForestModBlocks.GRAPE_VINE_1.get().defaultBlockState();
						BlockState _bso = world.getBlockState(_bp);
						for (Property<?> _propertyOld : _bso.getProperties()) {
							Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
							if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
								try {
									_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
								} catch (Exception e) {
								}
						}
						world.setBlock(_bp, _bs, 3);
					}
				}
			}
		});
	}
}
