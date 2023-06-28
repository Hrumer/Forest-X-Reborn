package power.forestxreborn.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;


public class BlueberriesBushFeatureAdditionalGenerationConditionProcedure {
public static boolean execute(
LevelAccessor world,
double x,
double y,
double z
) {
return
(world.getBlockState(BlockPos.containing(x,y-1,z))) == Blocks.GRASS_BLOCK.defaultBlockState();
}
}
