

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class CrimsonParquetBlock extends
Block
{
public CrimsonParquetBlock() {
super( BlockBehaviour.Properties.of(Material.WOOD)
.sound(SoundType.WOOD)
.strength(2f, 3f)
);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 15;
}
@Override public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
return 5;
}
@Override public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
List<ItemStack> dropsOriginal = super.getDrops(state, builder);
if(!dropsOriginal.isEmpty())
return dropsOriginal;
return Collections.singletonList(new ItemStack(this, 1));
}
}