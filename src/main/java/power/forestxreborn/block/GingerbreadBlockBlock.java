

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class GingerbreadBlockBlock extends
Block
{
public GingerbreadBlockBlock() {
super( BlockBehaviour.Properties.of(Material.STONE)
.sound(SoundType.WOOL)
.strength(2f, 5f)
);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 15;
}
@Override public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
List<ItemStack> dropsOriginal = super.getDrops(state, builder);
if(!dropsOriginal.isEmpty())
return dropsOriginal;
return Collections.singletonList(new ItemStack(ForestModItems.GINGERBREAD_ROUND.get(),9));
}
}