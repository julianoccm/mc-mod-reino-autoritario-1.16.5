package br.com.julianoccm.reinoautoritario.entity.renderer;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import br.com.julianoccm.reinoautoritario.entity.custom.JackSparrowEntity;
import br.com.julianoccm.reinoautoritario.entity.model.NPCModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class JackSparrowRenderer extends MobRenderer<JackSparrowEntity, NPCModel<JackSparrowEntity>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "textures/entity/jack_sparrow.png");

    public JackSparrowRenderer (EntityRendererManager entityRendererManager) {
        super(entityRendererManager, new NPCModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(JackSparrowEntity npcMobEntity) {
        return TEXTURE;
    }
}
    