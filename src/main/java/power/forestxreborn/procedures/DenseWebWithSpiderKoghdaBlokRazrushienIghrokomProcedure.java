package power.forestxreborn.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;


public class DenseWebWithSpiderKoghdaBlokRazrushienIghrokomProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
if (world instanceof ServerLevel _level) {
Entity entityToSpawn = new CaveSpider(EntityType.CAVE_SPIDER, _level);
entityToSpawn.moveTo(x, y, z, world.getRandom().nextFloat() * 360F, 0);
if (entityToSpawn instanceof Mob _mobToSpawn)
_mobToSpawn.finalizeSpawn(_level, _level.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null);
_level.addFreshEntity(entityToSpawn);
}
}
}
