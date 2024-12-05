package br.com.julianoccm.reinoautoritario.entity;

import br.com.julianoccm.reinoautoritario.ReinoAutoritarioMod;
import br.com.julianoccm.reinoautoritario.entity.model.custom.RemEntity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModEntityTypes {

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES
            = DeferredRegister.create(ForgeRegistries.ENTITIES, ReinoAutoritarioMod.MOD_ID);

    public static final RegistryObject<EntityType<RemEntity>> REM_ENTITY = ENTITY_TYPES.register("rem_entity",
            () -> EntityType.Builder.of(RemEntity::new, EntityClassification.MONSTER).sized(1.0f, 2.0f)
                    .build(new ResourceLocation(ReinoAutoritarioMod.MOD_ID, "rem_entity").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
