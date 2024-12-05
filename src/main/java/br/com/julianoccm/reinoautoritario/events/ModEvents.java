package br.com.julianoccm.reinoautoritario.events;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import br.com.julianoccm.reinoautoritario.entity.ModEntityTypes;
import br.com.julianoccm.reinoautoritario.entity.renderer.*;
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
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.RAM_ENTITY.get(), RamRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOBLIN_SLAYER_ENTITY.get(), GoblinSlayerRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ELF_ACHER_ENTITY.get(), ElfArcherRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOLD_ENTITY.get(), GoldRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.RED_ENTITY.get(), RedRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MISTY_ENTITY.get(), MistyRenderer::new);
    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
