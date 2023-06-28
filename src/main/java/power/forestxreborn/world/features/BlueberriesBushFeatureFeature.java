
package power.forestxreborn.world.features;

import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;


public class BlueberriesBushFeatureFeature extends SimpleBlockFeature {
public BlueberriesBushFeatureFeature() {
super(SimpleBlockConfiguration.CODEC);
}
public boolean place(FeaturePlaceContext<SimpleBlockConfiguration> context) {
WorldGenLevel world = context.level();
int x = context.origin().getX();
int y = context.origin().getY();
int z = context.origin().getZ();
if (!
BlueberriesBushFeatureAdditionalGenerationConditionProcedure.execute(world,x,y,z)
)
return false;
return super.place(context);
}
}