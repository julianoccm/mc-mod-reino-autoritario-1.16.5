package br.com.julianoccm.reinoautoritario.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.world.World;

public class LoidEntity extends NPCMobEntity {
    public LoidEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
    }
}
