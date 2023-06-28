
package power.forestxreborn.world.features.ores;

public class SilverOreFeature extends OreFeature {

	private final Set<ResourceKey<Level>> generate_dimensions = Set.of(
				Level.OVERWORLD
	);

	public SilverOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		if (!generate_dimensions.contains(world.getLevel().dimension()))
			return false;


		return super.place(context);
	}

}

