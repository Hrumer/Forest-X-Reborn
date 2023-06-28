package power.forestxreborn.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.ItemStack;

public class SilverEnchantProcedure {
	public static void execute(ItemStack itemstack) {
		itemstack.enchant(Enchantments.SMITE, 3);
	}
}
