

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class SakuraTrapdoorBlock extends
TrapDoorBlock
{
public SakuraTrapdoorBlock() {
super( BlockBehaviour.Properties.of(Material.WOOD)
.sound(SoundType.WOOD)
.strength(2f, 3f)
.noOcclusion()
.isRedstoneConductor((bs, br, bp) -> false)
.dynamicShape()
, BlockSetType.OAK);
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