

package power.forestxreborn.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class DesertRoseBlock extends FlowerBlock
{
public DesertRoseBlock() {
super(() -> MobEffects.CONFUSION, 100,
BlockBehaviour.Properties.of(Material.PLANT)
.sound(SoundType.GRASS)
.instabreak()
.noCollission()
);
}
@Override public int getEffectDuration() {
return 100;
}
@Override public boolean canBeReplaced(BlockState state, BlockPlaceContext useContext) {
return useContext.getItemInHand().getItem() != this.asItem();
}
@Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
return 100;
}
@Override public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
return 60;
}
@Override public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
List<ItemStack> dropsOriginal = super.getDrops(state, builder);
if(!dropsOriginal.isEmpty())
return dropsOriginal;
return Collections.singletonList(new ItemStack(this));
}
@Override public boolean mayPlaceOn(BlockState groundState, BlockGetter worldIn, BlockPos pos) {
return
groundState.is(Blocks.SAND)||
groundState.is(Blocks.RED_SAND)||
groundState.is(Blocks.GRASS_BLOCK)||
groundState.is(Blocks.DIRT)
;
}
@Override public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
BlockPos blockpos = pos.below();
BlockState groundState = worldIn.getBlockState(blockpos);
return this.mayPlaceOn(groundState, worldIn, blockpos)
;
}
@Override public PlantType getPlantType(BlockGetter world, BlockPos pos) {
return PlantType.DESERT;
}
}