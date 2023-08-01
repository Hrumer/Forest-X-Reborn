package power.forestxreborn.procedures;

import power.forestxreborn.init.ForestModBlocks;
import power.forestxreborn.ForestMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RaspberryBush2PriIspolzovaniiKostnoiMukiProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ForestMod.queueServerWork(2, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestModBlocks.RASPBERRY_BUSH_2.get()) {
				world.setBlock(BlockPos.containing(x, y, z), ForestModBlocks.RASPBERRY_BUSH_3.get().defaultBlockState(), 3);
			}
		});
	}
}
