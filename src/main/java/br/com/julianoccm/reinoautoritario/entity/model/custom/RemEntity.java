package br.com.julianoccm.reinoautoritario.entity.model.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;

public class RemEntity extends MobEntity {
    public RemEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute setAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, 5.0f);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
    }
}
