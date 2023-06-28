

package power.forestxreborn.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class LardItem extends Item {
public LardItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.COMMON)
.food((new FoodProperties.Builder())
.nutrition(2)
.saturationMod(3f)
.meat()
.build())
);
}
@Override public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
return 0F;
}
}