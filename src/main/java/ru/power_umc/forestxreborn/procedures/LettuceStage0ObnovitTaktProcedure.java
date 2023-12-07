package ru.power_umc.forestxreborn.procedures;

import ru.power_umc.forestxreborn.init.ForestModBlocks;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class LettuceStage0ObnovitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestModBlocks.LETTUCE_STAGE_0.get()) {
			world.setBlock(BlockPos.containing(x, y, z), ForestModBlocks.LETTUCE_STAGE_1.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestModBlocks.LETTUCE_STAGE_1.get()) {
			world.setBlock(BlockPos.containing(x, y, z), ForestModBlocks.LETTUCE_STAGE_2.get().defaultBlockState(), 3);
		} else if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestModBlocks.LETTUCE_STAGE_2.get()) {
			world.setBlock(BlockPos.containing(x, y, z), ForestModBlocks.LETTUCE_STAGE_3.get().defaultBlockState(), 3);
		}
	}
}
