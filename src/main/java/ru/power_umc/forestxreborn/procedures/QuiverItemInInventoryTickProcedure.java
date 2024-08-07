package ru.power_umc.forestxreborn.procedures;

import net.neoforged.neoforge.items.IItemHandlerModifiable;
import net.neoforged.neoforge.items.IItemHandler;
import net.neoforged.neoforge.capabilities.Capabilities;

import net.minecraft.world.item.component.CustomData;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.component.DataComponents;

public class QuiverItemInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		double quiverSlot = 0;
		double playerSlot = 0;
		quiverSlot = 0;
		for (int index0 = 0; index0 < 9; index0++) {
			if ((new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) quiverSlot, itemstack)).getItem() == Items.ARROW && !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains((new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) quiverSlot, itemstack))) : false)) {
				playerSlot = 0;
				for (int index1 = 0; index1 < 36; index1++) {
					if ((new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
								return _modHandler.getStackInSlot(sltid).copy();
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) playerSlot, entity)).getCount() == 0) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
							ItemStack _setstack = (new Object() {
								public ItemStack getItemStack(int sltid, ItemStack _isc) {
									IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
									if (_itemHandler != null)
										return _itemHandler.getStackInSlot(sltid).copy();
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) quiverSlot, itemstack)).copy();
							_setstack.setCount(1);
							_modHandler.setStackInSlot((int) playerSlot, _setstack);
						}
						if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
							ItemStack _setstack = (new Object() {
								public ItemStack getItemStack(int sltid, ItemStack _isc) {
									IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
									if (_itemHandler != null)
										return _itemHandler.getStackInSlot(sltid).copy();
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) quiverSlot, itemstack)).copy();
							_setstack.setCount((int) ((new Object() {
								public ItemStack getItemStack(int sltid, ItemStack _isc) {
									IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
									if (_itemHandler != null)
										return _itemHandler.getStackInSlot(sltid).copy();
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) quiverSlot, itemstack)).getCount() - 1));
							_modHandlerItemSetSlot.setStackInSlot((int) quiverSlot, _setstack);
						}
						break;
					}
					playerSlot = playerSlot + 1;
				}
			} else if ((new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) quiverSlot, itemstack)).getItem() == Items.SPECTRAL_ARROW && !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains((new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) quiverSlot, itemstack))) : false)) {
				playerSlot = 0;
				for (int index2 = 0; index2 < 36; index2++) {
					if ((new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
								return _modHandler.getStackInSlot(sltid).copy();
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) playerSlot, entity)).getCount() == 0) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
							ItemStack _setstack = (new Object() {
								public ItemStack getItemStack(int sltid, ItemStack _isc) {
									IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
									if (_itemHandler != null)
										return _itemHandler.getStackInSlot(sltid).copy();
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) quiverSlot, itemstack)).copy();
							_setstack.setCount(1);
							_modHandler.setStackInSlot((int) playerSlot, _setstack);
						}
						if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
							ItemStack _setstack = (new Object() {
								public ItemStack getItemStack(int sltid, ItemStack _isc) {
									IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
									if (_itemHandler != null)
										return _itemHandler.getStackInSlot(sltid).copy();
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) quiverSlot, itemstack)).copy();
							_setstack.setCount((int) ((new Object() {
								public ItemStack getItemStack(int sltid, ItemStack _isc) {
									IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
									if (_itemHandler != null)
										return _itemHandler.getStackInSlot(sltid).copy();
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) quiverSlot, itemstack)).getCount() - 1));
							_modHandlerItemSetSlot.setStackInSlot((int) quiverSlot, _setstack);
						}
						break;
					}
					playerSlot = playerSlot + 1;
				}
			} else if ((new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) quiverSlot, itemstack)).getItem() == Items.TIPPED_ARROW && !(entity instanceof Player _playerHasItem ? _playerHasItem.getInventory().contains((new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack((int) quiverSlot, itemstack))) : false)) {
				playerSlot = 0;
				for (int index3 = 0; index3 < 36; index3++) {
					if ((new Object() {
						public ItemStack getItemStack(int sltid, Entity entity) {
							if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
								return _modHandler.getStackInSlot(sltid).copy();
							}
							return ItemStack.EMPTY;
						}
					}.getItemStack((int) playerSlot, entity)).getCount() == 0) {
						if (entity.getCapability(Capabilities.ItemHandler.ENTITY, null) instanceof IItemHandlerModifiable _modHandler) {
							ItemStack _setstack = (new Object() {
								public ItemStack getItemStack(int sltid, ItemStack _isc) {
									IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
									if (_itemHandler != null)
										return _itemHandler.getStackInSlot(sltid).copy();
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) quiverSlot, itemstack)).copy();
							_setstack.setCount(1);
							_modHandler.setStackInSlot((int) playerSlot, _setstack);
						}
						if (itemstack.getCapability(Capabilities.ItemHandler.ITEM, null) instanceof IItemHandlerModifiable _modHandlerItemSetSlot) {
							ItemStack _setstack = (new Object() {
								public ItemStack getItemStack(int sltid, ItemStack _isc) {
									IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
									if (_itemHandler != null)
										return _itemHandler.getStackInSlot(sltid).copy();
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) quiverSlot, itemstack)).copy();
							_setstack.setCount((int) ((new Object() {
								public ItemStack getItemStack(int sltid, ItemStack _isc) {
									IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
									if (_itemHandler != null)
										return _itemHandler.getStackInSlot(sltid).copy();
									return ItemStack.EMPTY;
								}
							}.getItemStack((int) quiverSlot, itemstack)).getCount() - 1));
							_modHandlerItemSetSlot.setStackInSlot((int) quiverSlot, _setstack);
						}
						break;
					}
					playerSlot = playerSlot + 1;
				}
			}
			quiverSlot = quiverSlot + 1;
		}
		{
			final String _tagName = "arrowCount";
			final double _tagValue = ((new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(0, itemstack)).getCount() + (new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(1, itemstack)).getCount() + (new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(2, itemstack)).getCount() + (new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(3, itemstack)).getCount() + (new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(4, itemstack)).getCount() + (new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(5, itemstack)).getCount() + (new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(6, itemstack)).getCount() + (new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(7, itemstack)).getCount() + (new Object() {
				public ItemStack getItemStack(int sltid, ItemStack _isc) {
					IItemHandler _itemHandler = _isc.getCapability(Capabilities.ItemHandler.ITEM, null);
					if (_itemHandler != null)
						return _itemHandler.getStackInSlot(sltid).copy();
					return ItemStack.EMPTY;
				}
			}.getItemStack(8, itemstack)).getCount());
			CustomData.update(DataComponents.CUSTOM_DATA, itemstack, tag -> tag.putDouble(_tagName, _tagValue));
		}
	}
}
