package br.com.julianoccm.reinoautoritario.entity.custom;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.world.World;

public class JinxEntity extends NPCMobEntity {
    public JinxEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
    }
}
