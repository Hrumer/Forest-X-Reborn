
package ru.power_umc.forestxreborn.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class PolishedMarbleStairsBlock extends StairBlock {
	public PolishedMarbleStairsBlock() {
		super(Blocks.AIR.defaultBlockState(), BlockBehaviour.Properties.of().instrument(NoteBlockInstrument.BASEDRUM).sound(SoundType.TUFF).strength(1.35f, 10f).dynamicShape());
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}
}
