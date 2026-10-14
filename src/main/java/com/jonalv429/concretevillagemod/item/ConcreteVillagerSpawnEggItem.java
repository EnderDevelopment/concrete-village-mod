package com.jonalv429.concretevillagemod.item;

import net.minecraft.entity.EntityType;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;

public class ConcreteVillagerSpawnEggItem extends SpawnEggItem {
    public ConcreteVillagerSpawnEggItem(EntityType<?> type, int primaryColor, int secondaryColor, Settings settings) {
        super(type, primaryColor, secondaryColor, settings);
    }
}
