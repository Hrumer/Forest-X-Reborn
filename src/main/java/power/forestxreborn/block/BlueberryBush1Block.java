

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class BlueberryBush1Block extends
Block
{
public BlueberryBush1Block() {
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
@Override
public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
super.use(blockstate, world, pos, entity, hand, hit);
int x = pos.getX();
int y = pos.getY();
int z = pos.getZ();
double hitX = hit.getLocation().x;
double hitY = hit.getLocation().y;
double hitZ = hit.getLocation().z;
Direction direction = hit.getDirection();
BlueberryBush1NaBlokieNazhataPravaiaKnopkaMyshiProcedure.execute(world,x,y,z)
;
return InteractionResult.SUCCESS;
}
}