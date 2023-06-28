
package power.forestxreborn.item;

import power.forestxreborn.procedures.SilverEnchantProcedure;
import power.forestxreborn.init.ForestModItems;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.entity.player.Player;

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
				return 0f;
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

	@Override
	public void onCraftedBy(ItemStack itemstack, Level world, Player entity) {
		super.onCraftedBy(itemstack, world, entity);
		SilverEnchantProcedure.execute(itemstack);
	}
}
