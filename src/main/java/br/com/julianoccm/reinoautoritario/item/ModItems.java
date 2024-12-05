package br.com.julianoccm.reinoautoritario.item;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import br.com.julianoccm.reinoautoritario.entity.ModEntityTypes;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, ReinoAutoritarioMod.MOD_ID);

    // Tab Icons
    public static final RegistryObject<Item> CROWN_POKEBALL = ITEMS.register("icons/crown_pokeball",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CROWN_EGG = ITEMS.register("icons/crown_egg",
            () -> new Item(new Item.Properties()));

    // Insignias
    public static final RegistryObject<Item> INSIGNIA_SHINY = ITEMS.register("pixelmon/insignia_shiny",
            () -> new Item(new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_PIXELMON).stacksTo(64)));

    public static final RegistryObject<Item> INSIGNIA_VENENO = ITEMS.register("pixelmon/insignia_veneno",
            () -> new Item(new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_PIXELMON).stacksTo(64)));

    public static final RegistryObject<Item> INSIGNIA_TERRA = ITEMS.register("pixelmon/insignia_terra",
            () -> new Item(new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_PIXELMON).stacksTo(64)));

    public static final RegistryObject<Item> INSIGNIA_AGUA = ITEMS.register("pixelmon/insignia_agua",
            () -> new Item(new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_PIXELMON).stacksTo(64)));

    public static final RegistryObject<Item> INSIGNIA_INSETO = ITEMS.register("pixelmon/insignia_inseto",
            () -> new Item(new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_PIXELMON).stacksTo(64)));

    public static final RegistryObject<Item> INSIGNIA_FANSTASMA = ITEMS.register("pixelmon/insignia_fantasma",
            () -> new Item(new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_PIXELMON).stacksTo(64)));

    // Mobs Eggs
    public static final RegistryObject<ModSpawnEggItem> REM_SPAWN_EGG = ITEMS.register("mobs/rem_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.REM_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> RAM_SPAWN_EGG = ITEMS.register("mobs/ram_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.RAM_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> GOBLIN_SLAYER_SPAWN_EGG = ITEMS.register("mobs/goblin_slayer_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.GOBLIN_SLAYER_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> ELF_ARCHER_SPAWN_EGG = ITEMS.register("mobs/elf_archer_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ELF_ACHER_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> GOLD_SPAWN_EGG = ITEMS.register("mobs/gold_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.GOLD_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> RED_SPAWN_EGG = ITEMS.register("mobs/red_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.RED_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> MISTY_SPAWN_EGG = ITEMS.register("mobs/misty_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.MISTY_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));


    public static final RegistryObject<ModSpawnEggItem> RADAGON_SPAWN_EGG = ITEMS.register("mobs/radagon_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.RADAGON_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> SAITAMA_SPAWN_EGG = ITEMS.register("mobs/saitama_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.SAITAMA_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> MARIKA_SPAWN_EGG = ITEMS.register("mobs/marika_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.MARIKA_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> BATMAN_SPAWN_EGG = ITEMS.register("mobs/batman_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.BATMAN_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> LEGOLAS_SPAWN_EGG = ITEMS.register("mobs/legolas_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.LEGOLAS_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> GOKU_DRIP_SPAWN_EGG = ITEMS.register("mobs/goku_drip_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.GOKU_DRIP_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> TEEMO_SPAWN_EGG = ITEMS.register("mobs/teemo_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.TEEMO_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> MALENIA_SPAWN_EGG = ITEMS.register("mobs/malenia_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.MALENIA_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> CHEWBACCA_SPAWN_EGG = ITEMS.register("mobs/chewbacca_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.CHEWBACCA_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> ZERO_TWO_SPAWN_EGG = ITEMS.register("mobs/zero_two_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ZERO_TWO_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> AQUA_HOSHINO_SPAWN_EGG = ITEMS.register("mobs/aqua_hoshino_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.AQUA_HOSHINO_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> UMBRALMA_SPAWN_EGG = ITEMS.register("mobs/umbralma_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.UMBRALMA_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> AI_HOSHINO_SPAWN_EGG = ITEMS.register("mobs/ai_hoshino_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.AI_HOSHINO_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> YOR_SPAWN_EGG = ITEMS.register("mobs/yor_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.YOR_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> BANGUELA_SPAWN_EGG = ITEMS.register("mobs/banguela_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.BANGUELA_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> JACK_ESQUELETO_SPAWN_EGG = ITEMS.register("mobs/jack_esqueleto_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.JACK_ESQUELETO_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> KANA_ARIMA_SPAWN_EGG = ITEMS.register("mobs/kana_arima_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.KANA_ARIMA_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> JINX_SPAWN_EGG = ITEMS.register("mobs/jinx_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.JINX_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> DATH_VADER_SPAWN_EGG = ITEMS.register("mobs/dath_vader_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.DATH_VADER_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> JINN_SPAWN_EGG = ITEMS.register("mobs/jinn_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.JINN_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> NARUTO_SPAWN_EGG = ITEMS.register("mobs/naruto_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.NARUTO_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> HOMEM_ARANHA_SPAWN_EGG = ITEMS.register("mobs/homem_aranha_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.HOMEM_ARANHA_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> STORMTROOPER_SPAWN_EGG = ITEMS.register("mobs/stormtrooper_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.STORMTROOPER_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> MEGUMIN_SPAWN_EGG = ITEMS.register("mobs/megumin_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.MEGUMIN_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> FIZZ_SPAWN_EGG = ITEMS.register("mobs/fizz_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.FIZZ_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> LET_ME_SOLO_HER_SPAWN_EGG = ITEMS.register("mobs/let_me_solo_her_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.LET_ME_SOLO_HER_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> ANJU_SPAWN_EGG = ITEMS.register("mobs/anju_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ANJU_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> ZENITSU_SPAWN_EGG = ITEMS.register("mobs/zenitsu_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ZENITSU_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> HOMEM_DE_FERO_SPAWN_EGG = ITEMS.register("mobs/homem_de_fero_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.HOMEM_DE_FERO_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> LOID_SPAWN_EGG = ITEMS.register("mobs/loid_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.LOID_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> EZ_PIRATA_SPAWN_EGG = ITEMS.register("mobs/ez_pirata_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.EZ_PIRATA_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> GANDALF_SPAWN_EGG = ITEMS.register("mobs/gandalf_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.GANDALF_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> TWOB_SPAWN_EGG = ITEMS.register("mobs/2b_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.TWOB_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> RUBY_HOSHINO_SPAWN_EGG = ITEMS.register("mobs/ruby_hoshino_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.RUBY_HOSHINO_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> NAZGUL_SPAWN_EGG = ITEMS.register("mobs/nazgul_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.NAZGUL_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> JACK_SPARROW_SPAWN_EGG = ITEMS.register("mobs/jack_sparrow_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.JACK_SPARROW_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> ANYA_SPAWN_EGG = ITEMS.register("mobs/anya_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.ANYA_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> OPTIMUS_PRIME_SPAWN_EGG = ITEMS.register("mobs/optimus_prime_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.OPTIMUS_PRIME_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> TANJIRO_SPAWN_EGG = ITEMS.register("mobs/tanjiro_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.TANJIRO_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> GWEN_SPAWN_EGG = ITEMS.register("mobs/gwen_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.GWEN_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> XAYAH_SPAWN_EGG = ITEMS.register("mobs/xayah_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.XAYAH_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> SASUKE_SPAWN_EGG = ITEMS.register("mobs/sasuke_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.SASUKE_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> BRAUM_SPAWN_EGG = ITEMS.register("mobs/braum_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.BRAUM_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> INOSUKE_SPAWN_EGG = ITEMS.register("mobs/inosuke_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.INOSUKE_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> MULHER_DO_EIGHTY_SIX_SPAWN_EGG = ITEMS.register("mobs/mulher_do_eighty_six_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.MULHER_DO_EIGHTY_SIX_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> NEEKO_SPAWN_EGG = ITEMS.register("mobs/neeko_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.NEEKO_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> SUPERGIRL_SPAWN_EGG = ITEMS.register("mobs/supergirl_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.SUPERGIRL_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static final RegistryObject<ModSpawnEggItem> GROOT_SPAWN_EGG = ITEMS.register("mobs/groot_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.GROOT_ENTITY, new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_MOBS)
                    .stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
