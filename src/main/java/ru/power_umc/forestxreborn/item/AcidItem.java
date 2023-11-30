
package ru.power_umc.forestxreborn.item;

import ru.power_umc.forestxreborn.init.ForestModFluids;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

public class AcidItem extends BucketItem {
	public AcidItem() {
		super(ForestModFluids.ACID, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.COMMON));
	}
}
