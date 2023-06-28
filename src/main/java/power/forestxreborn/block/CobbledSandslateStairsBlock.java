

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class CobbledSandslateStairsBlock extends
StairBlock
{
public CobbledSandslateStairsBlock() {
super(() -> Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
.sound(SoundType.DEEPSLATE)
.strength(2f, 10f)
.requiresCorrectToolForDrops()
.dynamicShape()
);
}
@Override public float getExplosionResistance() {
return 10f;
}
@Override public boolean isRandomlyTicking(BlockState state) {
return false;
}
@Override public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
if(player.getInventory().getSelected().getItem() instanceof
PickaxeItem
tieredItem)
return tieredItem.getTier().getLevel() >= 0;
return false;
}
@Override public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
List<ItemStack> dropsOriginal = super.getDrops(state, builder);
if(!dropsOriginal.isEmpty())
return dropsOriginal;
return Collections.singletonList(new ItemStack(this, 1));
}
}