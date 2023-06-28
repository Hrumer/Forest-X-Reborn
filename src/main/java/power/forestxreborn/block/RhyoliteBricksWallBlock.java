

package power.forestxreborn.block;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.material.Material;

public class RhyoliteBricksWallBlock extends
WallBlock
{
public RhyoliteBricksWallBlock() {
super( BlockBehaviour.Properties.of(Material.STONE)
.sound(SoundType.STONE)
.strength(2f, 100f)
.dynamicShape()
);
}
@Override public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
List<ItemStack> dropsOriginal = super.getDrops(state, builder);
if(!dropsOriginal.isEmpty())
return dropsOriginal;
return Collections.singletonList(new ItemStack(this, 1));
}
}