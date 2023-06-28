package power.forestxreborn.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;


public class LettuceStage2ObnovitTaktProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
ForestMod.queueServerWork(2, () -> {
if ((world.getBlockState(BlockPos.containing(x,y,z))).getBlock() == ForestModBlocks.LETTUCE_STAGE_2.get()) {world.setBlock(BlockPos.containing(x,y,z), ForestModBlocks.LETTUCE_STAGE_3.get().defaultBlockState(),3);}
});
}
}
