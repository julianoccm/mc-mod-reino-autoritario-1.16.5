package br.com.julianoccm.reinoautoritario.events;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import br.com.julianoccm.reinoautoritario.entity.ModEntityTypes;
import br.com.julianoccm.reinoautoritario.entity.model.renderer.RemRenderer;
import br.com.julianoccm.reinoautoritario.item.ModSpawnEggItem;
import net.minecraft.entity.EntityType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(modid = ReinoAutoritarioMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEvents {

    @SubscribeEvent
    public static void clientSetup(FMLClientSetupEvent event) {
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.REM_ENTITY.get(), RemRenderer::new);
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
