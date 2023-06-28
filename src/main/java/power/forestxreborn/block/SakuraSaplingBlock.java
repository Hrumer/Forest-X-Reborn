

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class SakuraSaplingBlock extends
Block
implements BonemealableBlock
{
public SakuraSaplingBlock() {
super( BlockBehaviour.Properties.of(Material.PLANT)
.sound(SoundType.GRASS)
.strength(1f, 0f)
.noCollission()
.noOcclusion()
.isRedstoneConductor((bs, br, bp) -> false)
);
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
@Override public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
List<ItemStack> dropsOriginal = super.getDrops(state, builder);
if(!dropsOriginal.isEmpty())
return dropsOriginal;
return Collections.singletonList(new ItemStack(this, 1));
}
@Override public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
super.onPlace(blockstate, world, pos, oldState, moving);
world.scheduleTick(pos, this, 1400);
}
@Override public void tick
(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
super.tick(blockstate, world, pos, random);
int x = pos.getX();
int y = pos.getY();
int z = pos.getZ();
SakuraSaplingKoghdaRastieniieDobavlienoProcedure.execute(world,x,y,z)
;
world.scheduleTick(pos, this, 1400);
}
@Override public boolean isValidBonemealTarget(LevelReader worldIn, BlockPos pos, BlockState blockstate, boolean clientSide) {
return true;
}
@Override public boolean isBonemealSuccess(Level world, RandomSource random, BlockPos pos, BlockState blockstate) {
return true;
}
@Override public void performBonemeal(ServerLevel world, RandomSource random, BlockPos pos, BlockState blockstate) {
SakuraSaplingPriNazhatiiPravoiKnopkiMyshiNaRastieniiProcedure.execute(
world,pos.getX(),pos.getY(),pos.getZ()
);
}
}