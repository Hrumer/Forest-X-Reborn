
package ru.power_umc.forestxreborn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class RyeSeedsItem extends Item {
	public RyeSeedsItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
