package br.com.julianoccm.reinoautoritario.entity.custom;

import br.com.julianoccm.reinoautoritario.entity.ModEntityTypes;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.MobEntity;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.entity.ai.goal.LookAtGoal;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.world.World;

public class NPCMobEntity extends MobEntity{
    public NPCMobEntity(EntityType<? extends MobEntity> type, World world) {
        super(type, world);
    }

    public static AttributeModifierMap.MutableAttribute setAttributes() {
        return MobEntity.createMobAttributes().add(Attributes.MAX_HEALTH, ModEntityTypes.NPCS_MAX_HEALTH);
    }

    @Override
    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(0, new LookAtGoal(this, PlayerEntity.class, ModEntityTypes.LOOK_AT_GOAL_DISTANCE));
    }
}