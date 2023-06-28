

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class LettuceStage3Block extends
Block
{
public LettuceStage3Block() {
super( BlockBehaviour.Properties.of(Material.PLANT)
.sound(SoundType.CROP)
.instabreak()
.noCollission()
.noOcclusion()
.isRedstoneConductor((bs, br, bp) -> false)
);
}
@Override public boolean skipRendering(BlockState state, BlockState adjacentBlockState, Direction side) {
return adjacentBlockState.getBlock() == this ? true : super.skipRendering(state, adjacentBlockState, side);
}
@Override public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
return true;
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 0;
}
@Override public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
return Shapes.empty();
}
@Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
return 1;
}
@Override public ItemStack getCloneItemStack(BlockState state, HitResult target, BlockGetter world, BlockPos pos, Player player) {
return new ItemStack(ForestModItems.LETTUCE_SEED.get());
}
}