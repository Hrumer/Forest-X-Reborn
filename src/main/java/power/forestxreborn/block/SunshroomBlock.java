

package power.forestxreborn.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;

public class SunshroomBlock extends FlowerBlock
{
public SunshroomBlock() {
super(() -> MobEffects.INVISIBILITY, 200,
BlockBehaviour.Properties.of(Material.PLANT)
.sound(SoundType.FUNGUS)
.instabreak()
.lightLevel(s -> 10)
.noCollission()
);
}
@Override public int getEffectDuration() {
return 200;
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
groundState.is(Blocks.STONE)||
groundState.is(Blocks.GRANITE)||
groundState.is(Blocks.DIORITE)||
groundState.is(Blocks.ANDESITE)||
groundState.is(ForestModBlocks.RHYOLITE.get())||
groundState.is(Blocks.DEEPSLATE)||
groundState.is(Blocks.MYCELIUM)
;
}
@Override public boolean canSurvive(BlockState blockstate, LevelReader worldIn, BlockPos pos) {
BlockPos blockpos = pos.below();
BlockState groundState = worldIn.getBlockState(blockpos);
return this.mayPlaceOn(groundState, worldIn, blockpos)
;
}
}