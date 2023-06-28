

package power.forestxreborn.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class LettuceSeedItem extends Item {
public LettuceSeedItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.COMMON)
);
}
@Override public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
return 0F;
}
@Override public InteractionResult useOn(UseOnContext context) {
super.useOn(context);
LettuceSeedPriNazhatiiPravoiKnopkoiMyshiProcedure.execute(
context.getLevel(),context.getClickedPos().getX(),context.getClickedPos().getY(),context.getClickedPos().getZ(),context.getItemInHand()
);
return InteractionResult.SUCCESS;
}
}