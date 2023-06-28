

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class BlueberryBush0Block extends
Block
implements BonemealableBlock
{
public BlueberryBush0Block() {
super( BlockBehaviour.Properties.of(Material.PLANT)
.sound(SoundType.SWEET_BERRY_BUSH)
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
return new ItemStack(ForestModItems.BLUEBERRY.get());
}
@Override public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
List<ItemStack> dropsOriginal = super.getDrops(state, builder);
if(!dropsOriginal.isEmpty())
return dropsOriginal;
return Collections.singletonList(new ItemStack(Blocks.AIR));
}
@Override public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
super.onPlace(blockstate, world, pos, oldState, moving);
world.scheduleTick(pos, this, 600);
}
@Override public void tick
(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
super.tick(blockstate, world, pos, random);
int x = pos.getX();
int y = pos.getY();
int z = pos.getZ();
BlueberryBush0ObnovitTaktProcedure.execute(world,x,y,z)
;
world.scheduleTick(pos, this, 600);
}
@Override public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate, boolean clientSide) {
return true;
}
@Override public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
return true;
}
@Override public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
BlueberryBush0ObnovitTaktProcedure.execute(
world,pos.getX(),pos.getY(),pos.getZ()
);
}
}