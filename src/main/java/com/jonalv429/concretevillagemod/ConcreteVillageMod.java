package com.jonalv429.concretevillagemod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConcreteVillageMod implements ModInitializer {
    public static final String MOD_ID = "concretevillagemod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing ConcreteVillageMod");
        Registry.register(Registry.BLOCK, new Identifier(MOD_ID, "concrete_block"), new ConcreteBlock());
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "concrete_block"), new BlockItem(Registry.BLOCK.get(new Identifier(MOD_ID, "concrete_block")), new Item.Settings()));
        Registry.register(Registry.ENTITY_TYPE, new Identifier(MOD_ID, "concrete_villager"), FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, ConcreteVillagerEntity::new).dimensions(EntityDimensions.fixed(0.6f, 1.95f)).build());
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "concrete_villager_spawn_egg"), new ConcreteVillagerSpawnEggItem(Registry.ENTITY_TYPE.get(new Identifier(MOD_ID, "concrete_villager")), 0x808080, 0xC0C0C0, new Item.Settings().group(ItemGroup.MISC)));
    }
}
