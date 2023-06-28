package power.forestxreborn.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;


public class LettuceSeedPriNazhatiiPravoiKnopkoiMyshiProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
ItemStack itemstack
) {
if ((world.getBlockState(BlockPos.containing(x,y,z))).getBlock() == Blocks.FARMLAND) {world.setBlock(BlockPos.containing(x,y+1,z), ForestModBlocks.LETTUCE_STAGE_0.get().defaultBlockState(),3);if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.crop.plant")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
itemstack.shrink(1);}
}
}
