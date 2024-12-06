package br.com.julianoccm.reinoautoritario.entity.model;// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.15 - 1.16 with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.vertex.IVertexBuilder;
import net.minecraft.client.renderer.model.ModelRenderer;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.entity.Entity;

public class EnzoModel<T extends Entity> extends EntityModel<T> {
	private final ModelRenderer LeftLeg;
	private final ModelRenderer RigthLeg;
	private final ModelRenderer Body;
	private final ModelRenderer LeftArm;
	private final ModelRenderer RigthArm;
	private final ModelRenderer Head;
	private final ModelRenderer Bone;

	public EnzoModel() {
		texWidth = 64;
		texHeight = 64;

		LeftLeg = new ModelRenderer(this);
		LeftLeg.setPos(0.0F, 24.0F, 0.0F);
		LeftLeg.texOffs(44, 0).addBox(2.0F, -11.0F, -1.0F, 5.0F, 11.0F, 4.0F, 0.0F, false);

		RigthLeg = new ModelRenderer(this);
		RigthLeg.setPos(0.0F, 24.0F, 0.0F);
		RigthLeg.texOffs(0, 49).addBox(-3.0F, -11.0F, -1.0F, 5.0F, 11.0F, 4.0F, 0.0F, false);

		Body = new ModelRenderer(this);
		Body.setPos(0.0F, 25.0F, 0.0F);
		Body.texOffs(32, 34).addBox(-3.0F, -24.0F, -1.0F, 10.0F, 12.0F, 4.0F, 0.0F, false);
		Body.texOffs(8, 8).addBox(-3.0F, -23.0F, -5.0F, 10.0F, 10.0F, 4.0F, 0.0F, false);
		Body.texOffs(36, 39).addBox(-2.0F, -22.0F, -7.0F, 8.0F, 8.0F, 2.0F, 0.0F, false);

		LeftArm = new ModelRenderer(this);
		LeftArm.setPos(5.0F, 12.0F, 2.0F);
		LeftArm.texOffs(18, 49).addBox(2.0F, -10.0F, -3.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);

		RigthArm = new ModelRenderer(this);
		RigthArm.setPos(-7.0F, 12.0F, 2.0F);
		RigthArm.texOffs(32, 50).addBox(1.0F, -10.0F, -3.0F, 3.0F, 10.0F, 4.0F, 0.0F, false);

		Head = new ModelRenderer(this);
		Head.setPos(0.0F, 24.0F, 0.0F);
		Head.texOffs(0, 34).addBox(-2.0F, -30.0F, -3.0F, 8.0F, 7.0F, 8.0F, 0.0F, false);

		Bone = new ModelRenderer(this);
		Bone.setPos(0.0F, 20.0F, 0.0F);
		Bone.texOffs(31, 22).addBox(-2.0F, -29.0F, -3.0F, 8.0F, 3.0F, 8.0F, 0.0F, false);
		Bone.texOffs(36, 25).addBox(-1.0F, -27.0F, -8.0F, 6.0F, 1.0F, 5.0F, 0.0F, false);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch){
		//previously the render function, render code was moved to a method below
	}

	@Override
	public void renderToBuffer(MatrixStack matrixStack, IVertexBuilder buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		LeftLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RigthLeg.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		RigthArm.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
		Bone.render(matrixStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.xRot = x;
		modelRenderer.yRot = y;
		modelRenderer.zRot = z;
	}
}