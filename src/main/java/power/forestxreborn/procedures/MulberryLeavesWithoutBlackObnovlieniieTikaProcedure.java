package power.forestxreborn.procedures;

import power.forestxreborn.init.ForestModBlocks;
import power.forestxreborn.ForestMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class MulberryLeavesWithoutBlackObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ForestMod.queueServerWork(2, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestModBlocks.MULBERRY_LEAVES_WITHOUT_BLACK.get()) {
				world.setBlock(BlockPos.containing(x, y, z), ForestModBlocks.MULBERRY_LEAVES_WITH_BLACK.get().defaultBlockState(), 3);
			}
		});
	}
}
