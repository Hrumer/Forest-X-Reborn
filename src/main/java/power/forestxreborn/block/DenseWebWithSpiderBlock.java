

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class DenseWebWithSpiderBlock extends
Block
{
public DenseWebWithSpiderBlock() {
super( BlockBehaviour.Properties.of(Material.WOOL)
.sound(SoundType.WOOL)
.strength(2f, 100f)
.speedFactor(0.1f)
.jumpFactor(0.1f)
);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 15;
}
@Override public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
List<ItemStack> dropsOriginal = super.getDrops(state, builder);
if(!dropsOriginal.isEmpty())
return dropsOriginal;
return Collections.singletonList(new ItemStack(Items.STRING,3));
}
@Override public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
DenseWebWithSpiderKoghdaBlokRazrushienIghrokomProcedure.execute(
world,pos.getX(),pos.getY(),pos.getZ()
);
return retval;
}
}