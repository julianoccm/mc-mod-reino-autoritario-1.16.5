package br.com.julianoccm.reinoautoritario.entity.renderer;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import br.com.julianoccm.reinoautoritario.entity.custom.UmbralmaEntity;
import br.com.julianoccm.reinoautoritario.entity.model.NPCModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class UmbralmaRenderer extends MobRenderer<UmbralmaEntity, NPCModel<UmbralmaEntity>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "textures/entity/umbralma.png");

    public UmbralmaRenderer (EntityRendererManager entityRendererManager) {
        super(entityRendererManager, new NPCModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(UmbralmaEntity npcMobEntity) {
        return TEXTURE;
    }
}
    