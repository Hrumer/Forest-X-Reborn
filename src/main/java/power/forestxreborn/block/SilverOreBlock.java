

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class SilverOreBlock extends
Block
{
public SilverOreBlock() {
super( BlockBehaviour.Properties.of(Material.STONE)
.sound(SoundType.STONE)
.strength(4.5f, 6.9158093361f)
.requiresCorrectToolForDrops()
);
}
@Override public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
return 15;
}
@Override public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
if(player.getInventory().getSelected().getItem() instanceof
PickaxeItem
tieredItem)
return tieredItem.getTier().getLevel() >= 2;
return false;
}
}