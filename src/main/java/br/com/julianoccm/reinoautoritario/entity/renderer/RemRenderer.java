package br.com.julianoccm.reinoautoritario.entity.renderer;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import br.com.julianoccm.reinoautoritario.entity.custom.NPCMobEntity;
import br.com.julianoccm.reinoautoritario.entity.model.NPCModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class RemRenderer extends MobRenderer<NPCMobEntity, NPCModel<NPCMobEntity>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "textures/entity/rem.png");

    public RemRenderer(EntityRendererManager entityRendererManager) {
        super(entityRendererManager, new NPCModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(NPCMobEntity NPCMobEntity) {
        return TEXTURE;
    }
}
