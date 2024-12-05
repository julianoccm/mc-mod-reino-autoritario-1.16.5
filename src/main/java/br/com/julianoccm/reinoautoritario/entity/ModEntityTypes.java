package br.com.julianoccm.reinoautoritario.entity;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import br.com.julianoccm.reinoautoritario.entity.custom.NPCMobEntity;
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

    public static final RegistryObject<EntityType<NPCMobEntity>> REM_ENTITY = ENTITY_TYPES.register("rem_entity",
            () -> EntityType.Builder.of(NPCMobEntity::new, EntityClassification.MONSTER).sized(NPCS_SIZED_HEIGTH, NPCS_SIZED_WIDTH)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "rem_entity").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
