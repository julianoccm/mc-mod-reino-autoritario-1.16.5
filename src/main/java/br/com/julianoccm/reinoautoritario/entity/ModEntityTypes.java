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

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
