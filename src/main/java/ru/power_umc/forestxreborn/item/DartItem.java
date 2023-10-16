
package ru.power_umc.forestxreborn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class DartItem extends Item {
	public DartItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
