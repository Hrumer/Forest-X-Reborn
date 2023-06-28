

package power.forestxreborn.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class GingerbreadFormCockItem extends Item {
public GingerbreadFormCockItem() {
super(new Item.Properties()
.stacksTo(1)
.rarity(Rarity.COMMON)
);
}
@Override public boolean hasCraftingRemainingItem() {
return true;
}
@Override public ItemStack getCraftingRemainingItem(ItemStack itemstack) {
return new ItemStack(this);
}
@Override public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
return 0F;
}
@Override public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
super.appendHoverText(itemstack, world, list, flag);
list.add(Component.literal("Cock"));
}
}