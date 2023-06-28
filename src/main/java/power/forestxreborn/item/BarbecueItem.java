

package power.forestxreborn.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class BarbecueItem extends Item {
public BarbecueItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.COMMON)
.food((new FoodProperties.Builder())
.nutrition(4)
.saturationMod(0.2f)
.meat()
.build())
);
}
@Override public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
return 0F;
}
@Override public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
ItemStack retval =
new ItemStack(Items.STICK);
super.finishUsingItem(itemstack, world, entity);
if (itemstack.isEmpty()) {
return retval;
} else {
if (entity instanceof Player player && !player.getAbilities().instabuild) {
if (!player.getInventory().add(retval))
player.drop(retval, false);
}
return itemstack;
}
}
}