package power.forestxreborn.client.gui;

import power.forestxreborn.world.inventory.FermentationBarrelMenuMenu;
import power.forestxreborn.procedures.FBProgress9Procedure;
import power.forestxreborn.procedures.FBProgress8Procedure;
import power.forestxreborn.procedures.FBProgress7Procedure;
import power.forestxreborn.procedures.FBProgress6Procedure;
import power.forestxreborn.procedures.FBProgress5Procedure;
import power.forestxreborn.procedures.FBProgress4Procedure;
import power.forestxreborn.procedures.FBProgress3Procedure;
import power.forestxreborn.procedures.FBProgress2Procedure;
import power.forestxreborn.procedures.FBProgress1Procedure;
import power.forestxreborn.procedures.FBProgress0Procedure;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.GuiGraphics;

import java.util.HashMap;

import com.mojang.blaze3d.systems.RenderSystem;

public class FermentationBarrelMenuScreen extends AbstractContainerScreen<FermentationBarrelMenuMenu> {
	private final static HashMap<String, Object> guistate = FermentationBarrelMenuMenu.guistate;
	private final Level world;
	private final int x, y, z;
	private final Player entity;

	public FermentationBarrelMenuScreen(FermentationBarrelMenuMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 210;
		this.imageHeight = 166;
	}

	private static final ResourceLocation texture = new ResourceLocation("forest:textures/screens/fermentation_barrel_menu.png");

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		this.renderBackground(guiGraphics);
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int gx, int gy) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(texture, this.leftPos, this.topPos, 0, 0, this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

		guiGraphics.blit(new ResourceLocation("forest:textures/screens/fb_progress_bar_empty.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);

		if (FBProgress0Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("forest:textures/screens/fb_progress_bar_filled_0.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress1Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("forest:textures/screens/fb_progress_bar_filled_1.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress2Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("forest:textures/screens/fb_progress_bar_filled_2.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress3Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("forest:textures/screens/fb_progress_bar_filled_3.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress4Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("forest:textures/screens/fb_progress_bar_filled_4.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress5Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("forest:textures/screens/fb_progress_bar_filled_5.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress6Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("forest:textures/screens/fb_progress_bar_filled_6.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress7Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("forest:textures/screens/fb_progress_bar_filled_7.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress8Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("forest:textures/screens/fb_progress_bar_filled_8.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}
		if (FBProgress9Procedure.execute(world, x, y, z)) {
			guiGraphics.blit(new ResourceLocation("forest:textures/screens/fb_progress_bar_filled_9.png"), this.leftPos + 93, this.topPos + 41, 0, 0, 54, 10, 54, 10);
		}

		guiGraphics.blit(new ResourceLocation("forest:textures/screens/bottle_icon.png"), this.leftPos + 69, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		guiGraphics.blit(new ResourceLocation("forest:textures/screens/alcohol_ingridient_icon.png"), this.leftPos + 33, this.topPos + 35, 0, 0, 16, 16, 16, 16);

		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	public void containerTick() {
		super.containerTick();
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void onClose() {
		super.onClose();
	}

	@Override
	public void init() {
		super.init();
	}
}
