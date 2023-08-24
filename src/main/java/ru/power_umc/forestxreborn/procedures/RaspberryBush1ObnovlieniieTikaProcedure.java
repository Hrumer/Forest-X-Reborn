package ru.power_umc.forestxreborn.procedures;

import ru.power_umc.forestxreborn.init.ForestModBlocks;
import ru.power_umc.forestxreborn.ForestMod;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class RaspberryBush1ObnovlieniieTikaProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		ForestMod.queueServerWork(2, () -> {
			if ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock() == ForestModBlocks.RASPBERRY_BUSH_1.get()) {
				world.setBlock(BlockPos.containing(x, y, z), ForestModBlocks.RASPBERRY_BUSH_2.get().defaultBlockState(), 3);
			}
		});
	}
}
