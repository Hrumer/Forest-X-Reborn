
package ru.power_umc.forestxreborn.item;

import ru.power_umc.forestxreborn.init.ForestModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;

public class SilverHoeItem extends HoeItem {
	public SilverHoeItem() {
		super(new Tier() {
			public int getUses() {
				return 72;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 22;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ForestModItems.SILVER_INGOT.get()));
			}
		}, 0, -1f, new Item.Properties());
	}
}
