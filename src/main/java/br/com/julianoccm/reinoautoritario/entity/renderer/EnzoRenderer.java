package br.com.julianoccm.reinoautoritario.entity.renderer;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import br.com.julianoccm.reinoautoritario.entity.custom.AiHoshinoEntity;
import br.com.julianoccm.reinoautoritario.entity.custom.EnzoEntity;
import br.com.julianoccm.reinoautoritario.entity.model.EnzoModel;
import br.com.julianoccm.reinoautoritario.entity.model.NPCModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class EnzoRenderer extends MobRenderer<EnzoEntity, EnzoModel<EnzoEntity>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "textures/entity/enzo.png");

    public EnzoRenderer(EntityRendererManager entityRendererManager) {
        super(entityRendererManager, new EnzoModel(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(EnzoEntity npcMobEntity) {
        return TEXTURE;
    }
}
    