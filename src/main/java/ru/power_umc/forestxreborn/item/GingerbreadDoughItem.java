
package ru.power_umc.forestxreborn.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class GingerbreadDoughItem extends Item {
	public GingerbreadDoughItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(1).saturationModifier(0.1f).build()));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}
}
