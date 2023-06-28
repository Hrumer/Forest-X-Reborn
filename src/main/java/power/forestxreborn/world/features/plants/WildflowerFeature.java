
package power.forestxreborn.world.features.plants;

import com.mojang.serialization.Codec;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;

public class WildflowerFeature extends RandomPatchFeature {
private final Set<ResourceKey<Level>> generate_dimensions = Set.of(
Level.OVERWORLD
);
public WildflowerFeature() {
super(RandomPatchConfiguration.CODEC);
}
public boolean place(FeaturePlaceContext<RandomPatchConfiguration> context) {
WorldGenLevel world = context.level();
if (!generate_dimensions.contains(world.getLevel().dimension()))
return false;
return super.place(context);
}
}
