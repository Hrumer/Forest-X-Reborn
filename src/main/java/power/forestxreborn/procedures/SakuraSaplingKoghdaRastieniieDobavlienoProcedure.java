package power.forestxreborn.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;


public class SakuraSaplingKoghdaRastieniieDobavlienoProcedure {
public static void execute(
LevelAccessor world,
double x,
double y,
double z
) {
if ((world.getBlockState(BlockPos.containing(x,y,z))).getBlock() == ForestModBlocks.SAKURA_SAPLING.get()) {if (world instanceof ServerLevel _serverworld) {
StructureTemplate template = _serverworld.getStructureManager().getOrCreate(new ResourceLocation("forest", "sakura_tree1"));
if (template != null) {
template.placeInWorld(_serverworld,
BlockPos.containing(x-4,y,z-4),
BlockPos.containing(x-4,y,z-4),
new StructurePlaceSettings()
.setRotation(Rotation.NONE)
.setMirror(Mirror.NONE)
.setIgnoreEntities(false), _serverworld.random, 3);
}
}
}
}
}
