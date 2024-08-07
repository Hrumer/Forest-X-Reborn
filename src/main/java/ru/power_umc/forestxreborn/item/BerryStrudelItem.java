
package ru.power_umc.forestxreborn.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BerryStrudelItem extends Item {
	public BerryStrudelItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(1f).build()));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 0f;
	}
}
