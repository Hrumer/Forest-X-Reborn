

package power.forestxreborn.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class GlazedGingerbreadMenItem extends Item {
public GlazedGingerbreadMenItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.COMMON)
.food((new FoodProperties.Builder())
.nutrition(1)
.saturationMod(0.5f)
.build())
);
}
@Override public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
return 0F;
}
@Override public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
super.appendHoverText(itemstack, world, list, flag);
list.add(Component.literal("Man"));
}
}