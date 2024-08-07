
package ru.power_umc.forestxreborn.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GrapeItem extends Item {
	public GrapeItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.3f).build()));
	}
}
