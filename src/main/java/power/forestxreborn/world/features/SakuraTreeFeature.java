
package power.forestxreborn.world.features;

public class SakuraTreeFeature extends Feature<NoneFeatureConfiguration> {
private final Set<ResourceKey<Level>> generate_dimensions = Set.of(
Level.OVERWORLD
);
private final List<Block> base_blocks;
private StructureTemplate template = null;
public SakuraTreeFeature() {
super(NoneFeatureConfiguration.CODEC);
base_blocks = List.of(
Blocks.GRASS_BLOCK );
}
@Override public boolean place(FeaturePlaceContext<NoneFeatureConfiguration> context) {
if (!generate_dimensions.contains(context.level().getLevel().dimension()))
return false;
if (template == null)
template = context.level().getLevel().getStructureManager()
.getOrCreate(new ResourceLocation("forest", "sakura_tree1"));
if (template == null)
return false;
boolean anyPlaced = false;
if ((context.random().nextInt(1000000) + 1) <= 50000) {
int count = context.random().nextInt(1) + 1;
for (int a = 0; a < count; a++) {
int i = context.origin().getX() + context.random().nextInt(16);
int k = context.origin().getZ() + context.random().nextInt(16);
int j = context.level().getHeight(
Heightmap.Types.OCEAN_FLOOR_WG, i, k
) - 1;
if (!base_blocks.contains(context.level().getBlockState(new BlockPos(i, j, k)).getBlock()))
continue;
BlockPos spawnTo = new BlockPos(i + -4, j + 0, k + -4);
if (template.placeInWorld(context.level(), spawnTo, spawnTo, new StructurePlaceSettings()
.setMirror(Mirror.NONE)
.setRotation(Rotation.NONE)
.setRandom(context.random())
.addProcessor(BlockIgnoreProcessor.STRUCTURE_AND_AIR)
.setIgnoreEntities(false), context.random(), 2)) {
anyPlaced = true;
}
}
}
return anyPlaced;
}
}