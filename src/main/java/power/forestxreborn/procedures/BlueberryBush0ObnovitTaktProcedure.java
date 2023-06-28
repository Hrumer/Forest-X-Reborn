package power.forestxreborn.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;


public class BlueberryBush0ObnovitTaktProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
ForestMod.queueServerWork(2, () -> {
if ((world.getBlockState(BlockPos.containing(x,y,z))).getBlock() == ForestModBlocks.BLUEBERRY_BUSH_0.get()) {world.setBlock(BlockPos.containing(x,y,z), ForestModBlocks.BLUEBERRY_BUSH_1.get().defaultBlockState(),3);}
});
}
}
