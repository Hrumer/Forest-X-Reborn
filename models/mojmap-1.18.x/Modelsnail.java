// Made with Blockbench 4.3.1
// Exported for Minecraft version 1.17 - 1.18 with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelsnail<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "snail"), "main");
	private final ModelPart bb_main;

	public Modelsnail(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-3.0F, -3.0F, -6.0F, 6.0F, 3.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition bb_main_r1 = bb_main.addOrReplaceChild("bb_main_r1",
				CubeListBuilder.create().texOffs(2, 0).addBox(0.0F, -4.0F, 0.0F, 1.0F, 4.0F, 0.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(1.0F, -3.0F, -6.0F, 0.6981F, 0.0F, 0.0F));

		PartDefinition bb_main_r2 = bb_main
				.addOrReplaceChild("bb_main_r2",
						CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -5.0F, 0.0F, 1.0F, 5.0F, 0.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(-1.0F, -3.0F, -6.0F, 0.48F, 0.0F, 0.0F));

		PartDefinition bb_main_r3 = bb_main.addOrReplaceChild("bb_main_r3",
				CubeListBuilder.create().texOffs(0, 15).addBox(-3.5F, -9.0F, 0.0F, 7.0F, 9.0F, 9.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, -2.0F, -0.0873F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}