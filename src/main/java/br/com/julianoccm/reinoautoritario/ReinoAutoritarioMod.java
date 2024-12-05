package br.com.julianoccm.reinoautoritario;

import br.com.julianoccm.reinoautoritario.entity.custom.*;
import br.com.julianoccm.reinoautoritario.entity.ModEntityTypes;
import br.com.julianoccm.reinoautoritario.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.entity.ai.attributes.GlobalEntityTypeAttributes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(ReinoAutoritarioMod.MOD_ID)
public class ReinoAutoritarioMod {

    public static final String MOD_ID = "reinoautoritario";

    private static final Logger LOGGER = LogManager.getLogger();

    public ReinoAutoritarioMod() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModEntityTypes.register(eventBus);


        eventBus.addListener(this::setup);
        eventBus.addListener(this::enqueueIMC);
        eventBus.addListener(this::processIMC);
        eventBus.addListener(this::doClientStuff);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        LOGGER.info("PREINIT: REINO AUTORITARIO");

        DeferredWorkQueue.runLater(() -> {
            GlobalEntityTypeAttributes.put(ModEntityTypes.REM_ENTITY.get(), RemEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.RAM_ENTITY.get(), RamEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.GOBLIN_SLAYER_ENTITY.get(), GoblinSlayerEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.ELF_ACHER_ENTITY.get(), ElfArcherEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.GOLD_ENTITY.get(), GoldEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.RED_ENTITY.get(), RedEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.MISTY_ENTITY.get(), MistyEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.RADAGON_ENTITY.get(), RadagonEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.SAITAMA_ENTITY.get(), SaitamaEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.MARIKA_ENTITY.get(), MarikaEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.BATMAN_ENTITY.get(), BatmanEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.LEGOLAS_ENTITY.get(), LegolasEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.GOKU_DRIP_ENTITY.get(), GokuDripEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.TEEMO_ENTITY.get(), TeemoEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.MALENIA_ENTITY.get(), MaleniaEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.CHEWBACCA_ENTITY.get(), ChewbaccaEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.ZERO_TWO_ENTITY.get(), ZeroTwoEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.AQUA_HOSHINO_ENTITY.get(), AquaHoshinoEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.UMBRALMA_ENTITY.get(), UmbralmaEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.AI_HOSHINO_ENTITY.get(), AiHoshinoEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.YOR_ENTITY.get(), YorEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.BANGUELA_ENTITY.get(), BanguelaEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.JACK_ESQUELETO_ENTITY.get(), JackEsqueletoEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.KANA_ARIMA_ENTITY.get(), KanaArimaEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.JINX_ENTITY.get(), JinxEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.DATH_VADER_ENTITY.get(), DathVaderEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.JINN_ENTITY.get(), JinnEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.NARUTO_ENTITY.get(), NarutoEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.HOMEM_ARANHA_ENTITY.get(), HomemAranhaEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.STORMTROOPER_ENTITY.get(), StormtrooperEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.MEGUMIN_ENTITY.get(), MeguminEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.FIZZ_ENTITY.get(), FizzEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.LET_ME_SOLO_HER_ENTITY.get(), LetMeSoloHerEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.ANJU_ENTITY.get(), AnjuEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.ZENITSU_ENTITY.get(), ZenitsuEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.HOMEM_DE_FERO_ENTITY.get(), HomemDeFeroEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.LOID_ENTITY.get(), LoidEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.EZ_PIRATA_ENTITY.get(), EzPirataEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.GANDALF_ENTITY.get(), GandalfEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.TWOB_ENTITY.get(), TwoBEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.RUBY_HOSHINO_ENTITY.get(), RubyHoshinoEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.NAZGUL_ENTITY.get(), NazgulEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.JACK_SPARROW_ENTITY.get(), JackSparrowEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.ANYA_ENTITY.get(), AnyaEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.OPTIMUS_PRIME_ENTITY.get(), OptimusPrimeEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.TANJIRO_ENTITY.get(), TanjiroEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.GWEN_ENTITY.get(), GwenEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.XAYAH_ENTITY.get(), XayahEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.SASUKE_ENTITY.get(), SasukeEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.BRAUM_ENTITY.get(), BraumEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.INOSUKE_ENTITY.get(), InosukeEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.MULHER_DO_EIGHTY_SIX_ENTITY.get(), MulherDoEightySixEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.NEEKO_ENTITY.get(), NeekoEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.SUPERGIRL_ENTITY.get(), SupergirlEntity.setAttributes().build());
            GlobalEntityTypeAttributes.put(ModEntityTypes.GROOT_ENTITY.get(), GrootEntity.setAttributes().build());

        });
    }

    private void doClientStuff(final FMLClientSetupEvent event) {}

    private void enqueueIMC(final InterModEnqueueEvent event) {}

    private void processIMC(final InterModProcessEvent event) {}

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {}

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents {
        @SubscribeEvent
        public static void onBlocksRegistry(final RegistryEvent.Register<Block> blockRegistryEvent) {}
    }
}
