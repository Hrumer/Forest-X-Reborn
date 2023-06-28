

package power.forestxreborn.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class PeatPieceItem extends Item {
public PeatPieceItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.COMMON)
);
}
@Override public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
return 0F;
}
}