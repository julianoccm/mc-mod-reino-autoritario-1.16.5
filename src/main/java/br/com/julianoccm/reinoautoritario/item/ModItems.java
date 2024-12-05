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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
