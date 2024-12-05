package br.com.julianoccm.reinoautoritario.entity.renderer;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import br.com.julianoccm.reinoautoritario.entity.custom.MaleniaEntity;
import br.com.julianoccm.reinoautoritario.entity.model.NPCModel;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class MaleniaRenderer extends MobRenderer<MaleniaEntity, NPCModel<MaleniaEntity>> {

    public static final ResourceLocation TEXTURE = new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "textures/entity/malenia.png");

    public MaleniaRenderer (EntityRendererManager entityRendererManager) {
        super(entityRendererManager, new NPCModel<>(), 0.7f);
    }

    @Override
    public ResourceLocation getTextureLocation(MaleniaEntity npcMobEntity) {
        return TEXTURE;
    }
}
    