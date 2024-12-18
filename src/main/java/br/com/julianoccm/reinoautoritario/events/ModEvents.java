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
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.RADAGON_ENTITY.get(), RadagonRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SAITAMA_ENTITY.get(), SaitamaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MARIKA_ENTITY.get(), MarikaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BATMAN_ENTITY.get(), BatmanRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LEGOLAS_ENTITY.get(), LegolasRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GOKU_DRIP_ENTITY.get(), GokuDripRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TEEMO_ENTITY.get(), TeemoRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MALENIA_ENTITY.get(), MaleniaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.CHEWBACCA_ENTITY.get(), ChewbaccaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ZERO_TWO_ENTITY.get(), ZeroTwoRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.AQUA_HOSHINO_ENTITY.get(), AquaHoshinoRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.UMBRALMA_ENTITY.get(), UmbralmaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.AI_HOSHINO_ENTITY.get(), AiHoshinoRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.YOR_ENTITY.get(), YorRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BANGUELA_ENTITY.get(), BanguelaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.JACK_ESQUELETO_ENTITY.get(), JackEsqueletoRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.KANA_ARIMA_ENTITY.get(), KanaArimaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.JINX_ENTITY.get(), JinxRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.DATH_VADER_ENTITY.get(), DathVaderRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.JINN_ENTITY.get(), JinnRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NARUTO_ENTITY.get(), NarutoRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.HOMEM_ARANHA_ENTITY.get(), HomemAranhaRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.STORMTROOPER_ENTITY.get(), StormtrooperRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MEGUMIN_ENTITY.get(), MeguminRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.FIZZ_ENTITY.get(), FizzRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LET_ME_SOLO_HER_ENTITY.get(), LetMeSoloHerRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ANJU_ENTITY.get(), AnjuRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ZENITSU_ENTITY.get(), ZenitsuRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.HOMEM_DE_FERO_ENTITY.get(), HomemDeFeroRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.LOID_ENTITY.get(), LoidRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.EZ_PIRATA_ENTITY.get(), EzPirataRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GANDALF_ENTITY.get(), GandalfRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TWOB_ENTITY.get(), TwoBRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.RUBY_HOSHINO_ENTITY.get(), RubyHoshinoRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NAZGUL_ENTITY.get(), NazgulRenderer::new);
//        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.JACK_SPARROW_ENTITY.get(), JackSparrowRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ANYA_ENTITY.get(), AnyaRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.OPTIMUS_PRIME_ENTITY.get(), OptimusPrimeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.TANJIRO_ENTITY.get(), TanjiroRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GWEN_ENTITY.get(), GwenRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.XAYAH_ENTITY.get(), XayahRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SASUKE_ENTITY.get(), SasukeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.BRAUM_ENTITY.get(), BraumRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.INOSUKE_ENTITY.get(), InosukeRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.MULHER_DO_EIGHTY_SIX_ENTITY.get(), MulherDoEightySixRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.NEEKO_ENTITY.get(), NeekoRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.SUPERGIRL_ENTITY.get(), SupergirlRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.GROOT_ENTITY.get(), GrootRenderer::new);
        RenderingRegistry.registerEntityRenderingHandler(ModEntityTypes.ENZO_ENTITY.get(), EnzoRenderer::new);

    }

    @SubscribeEvent
    public static void onRegisterEntities(RegistryEvent.Register<EntityType<?>> event) {
        ModSpawnEggItem.initSpawnEggs();
    }
}
