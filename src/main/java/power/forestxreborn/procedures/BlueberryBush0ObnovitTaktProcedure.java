package power.forestxreborn.procedures;

import power.forestxreborn.init.ForestModBlocks;
import power.forestxreborn.ForestMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class BlueberryBush0ObnovitTaktProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ForestMod.queueServerWork(2, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestModBlocks.BLUEBERRY_BUSH_0.get()) {
				world.setBlock(BlockPos.containing(x, y, z), ForestModBlocks.BLUEBERRY_BUSH_1.get().defaultBlockState(), 3);
			}
		});
	}
}
