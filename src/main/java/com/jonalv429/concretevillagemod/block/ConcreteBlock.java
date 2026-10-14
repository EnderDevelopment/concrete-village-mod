package com.jonalv429.concretevillagemod.block;

import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;

public class ConcreteBlock extends Block {
    public ConcreteBlock() {
        super(Settings.of(Material.STONE)
                .strength(2.0f, 6.0f)
                .sounds(BlockSoundGroup.STONE));
    }
}
