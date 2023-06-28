package power.forestxreborn.procedures;

import net.minecraftforge.eventbus.api.Event;

import javax.annotation.Nullable;


@Mod.EventBusSubscriber public class SakuraLogNaBlokieNazhataPravaiaKnopkaMyshiProcedure {
@SubscribeEvent public static void onRightClickBlock(PlayerInteractEvent.RightClickBlock event) {
if (event.getHand() != event.getEntity().getUsedItemHand())
return;
execute(event,event.getLevel(),event.getPos().getX(),event.getPos().getY(),event.getPos().getZ(),event.getEntity());
}
public static void execute(
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
execute(null,world,x,y,z,entity);
}
private static void execute(
@Nullable Event event,
LevelAccessor world,
double x,
double y,
double z,
Entity entity
) {
if(
entity == null
) return ;
if ((entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY).getItem() instanceof AxeItem&&ForestModBlocks.SAKURA_LOG.get() == (world.getBlockState(BlockPos.containing(x,y,z))).getBlock()) {if (!(entity instanceof Player _plr ? _plr.getAbilities().instabuild:false)) {{
ItemStack _ist = (entity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem():ItemStack.EMPTY);
if(_ist.hurt(1, RandomSource.create(), null)) {
_ist.shrink(1);
_ist.setDamageValue(0);
}
}}if (world instanceof Level _level) {
if (!_level.isClientSide()) {
_level.playSound(null, BlockPos.containing(x,y,z),
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
SoundSource.NEUTRAL, 1, 1);
} else {
_level.playLocalSound(x, y, z,
ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.axe.strip")),
SoundSource.NEUTRAL, 1, 1, false);
}
}
{
BlockPos _bp = BlockPos.containing(x,y,z);
BlockState _bs = ForestModBlocks.STRIPPED_SAKURA_LOG.get().defaultBlockState();
BlockState _bso = world.getBlockState(_bp);
for(Map.Entry<Property<?>, Comparable<?>> entry : _bso.getValues().entrySet()) {
Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
if (_property != null && _bs.getValue(_property) != null)
try {
_bs = _bs.setValue(_property, (Comparable) entry.getValue());
} catch (Exception e) {}
}
BlockEntity _be = world.getBlockEntity(_bp);
CompoundTag _bnbt = null;
if(_be != null) {
_bnbt = _be.saveWithFullMetadata();
_be.setRemoved();
}
world.setBlock(_bp, _bs, 3);
if(_bnbt != null) {
_be = world.getBlockEntity(_bp);
if(_be != null) {
try {
_be.load(_bnbt);
} catch(Exception ignored) {}
}
}
}
}else{if(world instanceof Level _level)
_level.updateNeighborsAt(BlockPos.containing(x,y,z),
_level.getBlockState(BlockPos.containing(x,y,z)).getBlock());}
}
}
