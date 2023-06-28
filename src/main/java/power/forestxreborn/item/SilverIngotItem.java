

package power.forestxreborn.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class SilverIngotItem extends Item {
public SilverIngotItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.COMMON)
);
}
@Override public UseAnim getUseAnimation(ItemStack itemstack) {
return UseAnim.EAT;
}
}