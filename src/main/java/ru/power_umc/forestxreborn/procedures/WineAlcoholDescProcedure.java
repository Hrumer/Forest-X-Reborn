package ru.power_umc.forestxreborn.procedures;

import net.minecraft.network.chat.Component;

public class WineAlcoholDescProcedure {
	public static String execute() {
		return "\u00A7c+0.3 " + Component.translatable("tooltip.translation.intoxication").getString();
	}
}
