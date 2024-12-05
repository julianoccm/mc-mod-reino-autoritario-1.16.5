package br.com.julianoccm.reinoautoritario.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.world.World;

public class NazgulEntity extends NPCMobEntity {
    public NazgulEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
    }
}
