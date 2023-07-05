
package power.forestxreborn.item;

import power.forestxreborn.init.ForestModItems;

import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class SilverSwordItem extends SwordItem {
	public SilverSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 72;
			}

			public float getSpeed() {
				return 12f;
			}

			public float getAttackDamageBonus() {
				return 2f;
			}

			public int getLevel() {
				return 2;
			}

			public int getEnchantmentValue() {
				return 40;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(ForestModItems.SILVER_INGOT.get()));
			}
		}, 3, -2.4f, new Item.Properties());
	}
}
