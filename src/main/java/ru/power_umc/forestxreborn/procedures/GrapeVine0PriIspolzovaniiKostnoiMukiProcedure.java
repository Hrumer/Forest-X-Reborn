package ru.power_umc.forestxreborn.procedures;

import ru.power_umc.forestxreborn.init.ForestModBlocks;
import ru.power_umc.forestxreborn.ForestMod;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
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
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestModBlocks.GRAPE_VINE.get()) {
				if (Math.random() <= 0.6) {
					if (((world.getBlockState(BlockPos.containing(x + 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x, y - 1, z - 1))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x - 1, y - 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x, y - 1, z + 1))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) && (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x, y - 1, z), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with((new Object() {
							public BlockState with(BlockState _bs, String _property, int _newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
								return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
							}
						}.with(ForestModBlocks.GRAPE_VINE.get().defaultBlockState(), "blockstate", 0)), (new Object() {
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
					} else if (((world.getBlockState(BlockPos.containing(x + 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x, y + 1, z - 1))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x - 1, y + 1, z))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))
							|| (world.getBlockState(BlockPos.containing(x, y + 1, z + 1))).is(BlockTags.create(new ResourceLocation("minecraft:logs")))) && (world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.AIR) {
						world.setBlock(BlockPos.containing(x, y + 1, z), (new Object() {
							public BlockState with(BlockState _bs, Direction newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty("facing");
								if (_prop instanceof DirectionProperty _dp && _dp.getPossibleValues().contains(newValue))
									return _bs.setValue(_dp, newValue);
								_prop = _bs.getBlock().getStateDefinition().getProperty("axis");
								return _prop instanceof EnumProperty _ep && _ep.getPossibleValues().contains(newValue.getAxis()) ? _bs.setValue(_ep, newValue.getAxis()) : _bs;
							}
						}.with((new Object() {
							public BlockState with(BlockState _bs, String _property, int _newValue) {
								Property<?> _prop = _bs.getBlock().getStateDefinition().getProperty(_property);
								return _prop instanceof IntegerProperty _ip && _prop.getPossibleValues().contains(_newValue) ? _bs.setValue(_ip, _newValue) : _bs;
							}
						}.with(ForestModBlocks.GRAPE_VINE.get().defaultBlockState(), "blockstate", 0)), (new Object() {
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
						int _value = 1;
						BlockPos _pos = BlockPos.containing(x, y, z);
						BlockState _bs = world.getBlockState(_pos);
						if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
							world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
					}
				}
			}
		});
	}
}
