package br.com.julianoccm.reinoautoritario.entity;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import br.com.julianoccm.reinoautoritario.entity.custom.*;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static final float NPCS_MAX_HEALTH = 20.0f;
    public static final float LOOK_AT_GOAL_DISTANCE = 8.0f;

    private static final float NPCS_SIZED_HEIGTH = 1.0f;
    private static final float NPCS_SIZED_WIDTH = 1.0f;

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, ReinoAutoritarioMod.MOD_ID);

    public static final RegistryObject<EntityType<RemEntity>> REM_ENTITY = ENTITY_TYPES.register("rem_entity",
            () -> EntityType.Builder.of(RemEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "rem_entity").toString()));

    public static final RegistryObject<EntityType<RamEntity>> RAM_ENTITY = ENTITY_TYPES.register("ram_entity",
            () -> EntityType.Builder.of(RamEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "ram_entity").toString()));

    public static final RegistryObject<EntityType<GoblinSlayerEntity>> GOBLIN_SLAYER_ENTITY = ENTITY_TYPES.register("goblin_slayer_entity",
            () -> EntityType.Builder.of(GoblinSlayerEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "goblin_slayer_entity").toString()));

    public static final RegistryObject<EntityType<ElfArcherEntity>> ELF_ACHER_ENTITY = ENTITY_TYPES.register("elf_archer_entity",
            () -> EntityType.Builder.of(ElfArcherEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "elf_archer_entity").toString()));

    public static final RegistryObject<EntityType<GoldEntity>> GOLD_ENTITY = ENTITY_TYPES.register("gold_entity",
            () -> EntityType.Builder.of(GoldEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "gold_entity").toString()));

    public static final RegistryObject<EntityType<RedEntity>> RED_ENTITY = ENTITY_TYPES.register("red_entity",
            () -> EntityType.Builder.of(RedEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "red_entity").toString()));

    public static final RegistryObject<EntityType<MistyEntity>> MISTY_ENTITY = ENTITY_TYPES.register("misty_entity",
            () -> EntityType.Builder.of(MistyEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "misty_entity").toString()));


    public static final RegistryObject<EntityType<RadagonEntity>> RADAGON_ENTITY = ENTITY_TYPES.register("radagon_entity",
            () -> EntityType.Builder.of(RadagonEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "radagon_entity").toString()));

    public static final RegistryObject<EntityType<SaitamaEntity>> SAITAMA_ENTITY = ENTITY_TYPES.register("saitama_entity",
            () -> EntityType.Builder.of(SaitamaEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "saitama_entity").toString()));

    public static final RegistryObject<EntityType<MarikaEntity>> MARIKA_ENTITY = ENTITY_TYPES.register("marika_entity",
            () -> EntityType.Builder.of(MarikaEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "marika_entity").toString()));

    public static final RegistryObject<EntityType<BatmanEntity>> BATMAN_ENTITY = ENTITY_TYPES.register("batman_entity",
            () -> EntityType.Builder.of(BatmanEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "batman_entity").toString()));

    public static final RegistryObject<EntityType<LegolasEntity>> LEGOLAS_ENTITY = ENTITY_TYPES.register("legolas_entity",
            () -> EntityType.Builder.of(LegolasEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "legolas_entity").toString()));

    public static final RegistryObject<EntityType<GokuDripEntity>> GOKU_DRIP_ENTITY = ENTITY_TYPES.register("goku_drip_entity",
            () -> EntityType.Builder.of(GokuDripEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "goku_drip_entity").toString()));

    public static final RegistryObject<EntityType<TeemoEntity>> TEEMO_ENTITY = ENTITY_TYPES.register("teemo_entity",
            () -> EntityType.Builder.of(TeemoEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "teemo_entity").toString()));

    public static final RegistryObject<EntityType<MaleniaEntity>> MALENIA_ENTITY = ENTITY_TYPES.register("malenia_entity",
            () -> EntityType.Builder.of(MaleniaEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "malenia_entity").toString()));

    public static final RegistryObject<EntityType<ChewbaccaEntity>> CHEWBACCA_ENTITY = ENTITY_TYPES.register("chewbacca_entity",
            () -> EntityType.Builder.of(ChewbaccaEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "chewbacca_entity").toString()));

    public static final RegistryObject<EntityType<ZeroTwoEntity>> ZERO_TWO_ENTITY = ENTITY_TYPES.register("zero_two_entity",
            () -> EntityType.Builder.of(ZeroTwoEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "zero_two_entity").toString()));

    public static final RegistryObject<EntityType<AquaHoshinoEntity>> AQUA_HOSHINO_ENTITY = ENTITY_TYPES.register("aqua_hoshino_entity",
            () -> EntityType.Builder.of(AquaHoshinoEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "aqua_hoshino_entity").toString()));

    public static final RegistryObject<EntityType<UmbralmaEntity>> UMBRALMA_ENTITY = ENTITY_TYPES.register("umbralma_entity",
            () -> EntityType.Builder.of(UmbralmaEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "umbralma_entity").toString()));

    public static final RegistryObject<EntityType<AiHoshinoEntity>> AI_HOSHINO_ENTITY = ENTITY_TYPES.register("ai_hoshino_entity",
            () -> EntityType.Builder.of(AiHoshinoEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "ai_hoshino_entity").toString()));

    public static final RegistryObject<EntityType<YorEntity>> YOR_ENTITY = ENTITY_TYPES.register("yor_entity",
            () -> EntityType.Builder.of(YorEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "yor_entity").toString()));

    public static final RegistryObject<EntityType<BanguelaEntity>> BANGUELA_ENTITY = ENTITY_TYPES.register("banguela_entity",
            () -> EntityType.Builder.of(BanguelaEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "banguela_entity").toString()));

    public static final RegistryObject<EntityType<JackEsqueletoEntity>> JACK_ESQUELETO_ENTITY = ENTITY_TYPES.register("jack_esqueleto_entity",
            () -> EntityType.Builder.of(JackEsqueletoEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "jack_esqueleto_entity").toString()));

    public static final RegistryObject<EntityType<KanaArimaEntity>> KANA_ARIMA_ENTITY = ENTITY_TYPES.register("kana_arima_entity",
            () -> EntityType.Builder.of(KanaArimaEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "kana_arima_entity").toString()));

    public static final RegistryObject<EntityType<JinxEntity>> JINX_ENTITY = ENTITY_TYPES.register("jinx_entity",
            () -> EntityType.Builder.of(JinxEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "jinx_entity").toString()));

    public static final RegistryObject<EntityType<DathVaderEntity>> DATH_VADER_ENTITY = ENTITY_TYPES.register("dath_vader_entity",
            () -> EntityType.Builder.of(DathVaderEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "dath_vader_entity").toString()));

    public static final RegistryObject<EntityType<JinnEntity>> JINN_ENTITY = ENTITY_TYPES.register("jinn_entity",
            () -> EntityType.Builder.of(JinnEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "jinn_entity").toString()));

    public static final RegistryObject<EntityType<NarutoEntity>> NARUTO_ENTITY = ENTITY_TYPES.register("naruto_entity",
            () -> EntityType.Builder.of(NarutoEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "naruto_entity").toString()));

    public static final RegistryObject<EntityType<HomemAranhaEntity>> HOMEM_ARANHA_ENTITY = ENTITY_TYPES.register("homem_aranha_entity",
            () -> EntityType.Builder.of(HomemAranhaEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "homem_aranha_entity").toString()));

    public static final RegistryObject<EntityType<StormtrooperEntity>> STORMTROOPER_ENTITY = ENTITY_TYPES.register("stormtrooper_entity",
            () -> EntityType.Builder.of(StormtrooperEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "stormtrooper_entity").toString()));

    public static final RegistryObject<EntityType<MeguminEntity>> MEGUMIN_ENTITY = ENTITY_TYPES.register("megumin_entity",
            () -> EntityType.Builder.of(MeguminEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "megumin_entity").toString()));

    public static final RegistryObject<EntityType<FizzEntity>> FIZZ_ENTITY = ENTITY_TYPES.register("fizz_entity",
            () -> EntityType.Builder.of(FizzEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "fizz_entity").toString()));

    public static final RegistryObject<EntityType<LetMeSoloHerEntity>> LET_ME_SOLO_HER_ENTITY = ENTITY_TYPES.register("let_me_solo_her_entity",
            () -> EntityType.Builder.of(LetMeSoloHerEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "let_me_solo_her_entity").toString()));

    public static final RegistryObject<EntityType<AnjuEntity>> ANJU_ENTITY = ENTITY_TYPES.register("anju_entity",
            () -> EntityType.Builder.of(AnjuEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "anju_entity").toString()));

    public static final RegistryObject<EntityType<ZenitsuEntity>> ZENITSU_ENTITY = ENTITY_TYPES.register("zenitsu_entity",
            () -> EntityType.Builder.of(ZenitsuEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "zenitsu_entity").toString()));

    public static final RegistryObject<EntityType<HomemDeFeroEntity>> HOMEM_DE_FERO_ENTITY = ENTITY_TYPES.register("homem_de_fero_entity",
            () -> EntityType.Builder.of(HomemDeFeroEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "homem_de_fero_entity").toString()));

    public static final RegistryObject<EntityType<LoidEntity>> LOID_ENTITY = ENTITY_TYPES.register("loid_entity",
            () -> EntityType.Builder.of(LoidEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "loid_entity").toString()));

    public static final RegistryObject<EntityType<EzPirataEntity>> EZ_PIRATA_ENTITY = ENTITY_TYPES.register("ez_pirata_entity",
            () -> EntityType.Builder.of(EzPirataEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "ez_pirata_entity").toString()));

    public static final RegistryObject<EntityType<GandalfEntity>> GANDALF_ENTITY = ENTITY_TYPES.register("gandalf_entity",
            () -> EntityType.Builder.of(GandalfEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "gandalf_entity").toString()));

    public static final RegistryObject<EntityType<TwoBEntity>> TWOB_ENTITY = ENTITY_TYPES.register("2b_entity",
            () -> EntityType.Builder.of(TwoBEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "2b_entity").toString()));

    public static final RegistryObject<EntityType<RubyHoshinoEntity>> RUBY_HOSHINO_ENTITY = ENTITY_TYPES.register("ruby_hoshino_entity",
            () -> EntityType.Builder.of(RubyHoshinoEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "ruby_hoshino_entity").toString()));

    public static final RegistryObject<EntityType<NazgulEntity>> NAZGUL_ENTITY = ENTITY_TYPES.register("nazgul_entity",
            () -> EntityType.Builder.of(NazgulEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "nazgul_entity").toString()));

    public static final RegistryObject<EntityType<JackSparrowEntity>> JACK_SPARROW_ENTITY = ENTITY_TYPES.register("jack_sparrow_entity",
            () -> EntityType.Builder.of(JackSparrowEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "jack_sparrow_entity").toString()));

    public static final RegistryObject<EntityType<AnyaEntity>> ANYA_ENTITY = ENTITY_TYPES.register("anya_entity",
            () -> EntityType.Builder.of(AnyaEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "anya_entity").toString()));

    public static final RegistryObject<EntityType<OptimusPrimeEntity>> OPTIMUS_PRIME_ENTITY = ENTITY_TYPES.register("optimus_prime_entity",
            () -> EntityType.Builder.of(OptimusPrimeEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "optimus_prime_entity").toString()));

    public static final RegistryObject<EntityType<TanjiroEntity>> TANJIRO_ENTITY = ENTITY_TYPES.register("tanjiro_entity",
            () -> EntityType.Builder.of(TanjiroEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "tanjiro_entity").toString()));

    public static final RegistryObject<EntityType<GwenEntity>> GWEN_ENTITY = ENTITY_TYPES.register("gwen_entity",
            () -> EntityType.Builder.of(GwenEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "gwen_entity").toString()));

    public static final RegistryObject<EntityType<XayahEntity>> XAYAH_ENTITY = ENTITY_TYPES.register("xayah_entity",
            () -> EntityType.Builder.of(XayahEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "xayah_entity").toString()));

    public static final RegistryObject<EntityType<SasukeEntity>> SASUKE_ENTITY = ENTITY_TYPES.register("sasuke_entity",
            () -> EntityType.Builder.of(SasukeEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "sasuke_entity").toString()));

    public static final RegistryObject<EntityType<BraumEntity>> BRAUM_ENTITY = ENTITY_TYPES.register("braum_entity",
            () -> EntityType.Builder.of(BraumEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "braum_entity").toString()));

    public static final RegistryObject<EntityType<InosukeEntity>> INOSUKE_ENTITY = ENTITY_TYPES.register("inosuke_entity",
            () -> EntityType.Builder.of(InosukeEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "inosuke_entity").toString()));

    public static final RegistryObject<EntityType<MulherDoEightySixEntity>> MULHER_DO_EIGHTY_SIX_ENTITY = ENTITY_TYPES.register("mulher_do_eighty_six_entity",
            () -> EntityType.Builder.of(MulherDoEightySixEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "mulher_do_eighty_six_entity").toString()));

    public static final RegistryObject<EntityType<NeekoEntity>> NEEKO_ENTITY = ENTITY_TYPES.register("neeko_entity",
            () -> EntityType.Builder.of(NeekoEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "neeko_entity").toString()));

    public static final RegistryObject<EntityType<SupergirlEntity>> SUPERGIRL_ENTITY = ENTITY_TYPES.register("supergirl_entity",
            () -> EntityType.Builder.of(SupergirlEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "supergirl_entity").toString()));

    public static final RegistryObject<EntityType<GrootEntity>> GROOT_ENTITY = ENTITY_TYPES.register("groot_entity",
            () -> EntityType.Builder.of(GrootEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "groot_entity").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
