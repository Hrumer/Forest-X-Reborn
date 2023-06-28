

package power.forestxreborn.item;

import net.minecraft.world.entity.ai.attributes.Attributes;
import javax.annotation.Nullable;

public class BlueberryItem extends Item {
public BlueberryItem() {
super(new Item.Properties()
.stacksTo(64)
.rarity(Rarity.COMMON)
.food((new FoodProperties.Builder())
.nutrition(1)
.saturationMod(0.15f)
.build())
);
}
@Override public InteractionResult useOn(UseOnContext context) {
super.useOn(context);
BlueberryPriShchielchkiePravoiKnopkoiMyshiNaBlokieProcedure.execute(
context.getLevel(),context.getClickedPos().getX(),context.getClickedPos().getY(),context.getClickedPos().getZ()
);
return InteractionResult.SUCCESS;
}
}