package power.forestxreborn.procedures;

import power.forestxreborn.network.ForestModVariables;

import net.minecraft.world.entity.Entity;

public class DebugAlcoProcedure {
	public static String execute(Entity entity) {
		if (entity == null)
			return "";
		return ("alcohol_parameter: ").toUpperCase() + "" + new java.text.DecimalFormat("##.##").format((entity.getCapability(ForestModVariables.PLAYER_VARIABLES_CAPABILITY, null).orElse(new ForestModVariables.PlayerVariables())).alcohol);
	}
}
