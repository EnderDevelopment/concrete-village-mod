package com.jonalv429.concretevillagemod.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.world.World;

public class ConcreteVillagerEntity extends VillagerEntity {
    public ConcreteVillagerEntity(EntityType<? extends VillagerEntity> entityType, World world) {
        super(entityType, world);
    }
}
