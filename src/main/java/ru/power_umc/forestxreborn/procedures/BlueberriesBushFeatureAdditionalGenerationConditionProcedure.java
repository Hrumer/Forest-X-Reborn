package ru.power_umc.forestxreborn.procedures;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class BlueberriesBushFeatureAdditionalGenerationConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft:dirt"));
	}
}
