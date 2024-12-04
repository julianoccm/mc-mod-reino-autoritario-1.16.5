package br.com.julianoccm.reinoautoritario.item;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import net.minecraft.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS
            = DeferredRegister.create(ForgeRegistries.ITEMS, ReinoAutoritarioMod.MOD_ID);

    // Tab Icons
    public static final RegistryObject<Item> CROWN_POKEBALL = ITEMS.register("crown_pokeball",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CROWN = ITEMS.register("crown",
            () -> new Item(new Item.Properties()));

    // Insignias
    public static final RegistryObject<Item> INSIGNIA_SHINY = ITEMS.register("insignia_shiny",
        () -> new Item(new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_PIXELMON).stacksTo(64)));

    public static final RegistryObject<Item> INSIGNIA_VENENO = ITEMS.register("insignia_veneno",
        () -> new Item(new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_PIXELMON).stacksTo(64)));

    public static final RegistryObject<Item> INSIGNIA_TERRA = ITEMS.register("insignia_terra",
        () -> new Item(new Item.Properties().tab(ModItemGroup.REINO_AUTORITARIO_PIXELMON).stacksTo(64)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
