
package ru.power_umc.forestxreborn.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class MusicDiscStrofaItem extends RecordItem {
	public MusicDiscStrofaItem() {
		super(13, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("forest:record.strofa")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 3520);
	}
}
