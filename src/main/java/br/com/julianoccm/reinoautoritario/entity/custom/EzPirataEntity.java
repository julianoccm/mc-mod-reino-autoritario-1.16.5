package br.com.julianoccm.reinoautoritario.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.world.World;

public class EzPirataEntity extends NPCMobEntity {
    public EzPirataEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
    }
}
