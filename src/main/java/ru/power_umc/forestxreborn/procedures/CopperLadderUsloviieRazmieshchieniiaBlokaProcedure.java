package ru.power_umc.forestxreborn.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

public class CopperLadderUsloviieRazmieshchieniiaBlokaProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return world.getBlockState(BlockPos.containing(x + 1, y, z)).canOcclude() || world.getBlockState(BlockPos.containing(x, y, z - 1)).canOcclude() || world.getBlockState(BlockPos.containing(x - 1, y, z)).canOcclude()
				|| world.getBlockState(BlockPos.containing(x, y, z + 1)).canOcclude();
	}
}
