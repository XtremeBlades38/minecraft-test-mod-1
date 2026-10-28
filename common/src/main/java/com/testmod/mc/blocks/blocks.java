package com.testmod.mc.blocks;

import com.testmod.mc.TestMod;
import com.testmod.mc.tabs.Tabs;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import org.slf4j.LoggerFactory;

import java.util.function.Supplier;

public class blocks {
public static final DeferredRegister<Block>BLOCKS=
        DeferredRegister.create(TestMod.MOD_ID, Registries.BLOCK);

public static final DeferredRegister<Item> BLOCK_ITEMS=
        DeferredRegister.create(TestMod.MOD_ID,Registries.ITEM);

    // 1. The helper goes ABOVE the blocks, right after the two registers
    private static RegistrySupplier<Block> registerBlock(String name, Supplier<Block> block) {
        RegistrySupplier<Block> toReturn = BLOCKS.register(name, block);
        BLOCK_ITEMS.register(name, () -> new BlockItem(toReturn.get(),
                new Item.Properties().arch$tab(Tabs.MODTABS)));
        return toReturn;
    }

public static final RegistrySupplier<Block> MUDDY_DIRT_BLOCK=registerBlock("muddy_dirt_block",
        ()-> new Block(BlockBehaviour.Properties.of()
        .strength(1.0F)
        .requiresCorrectToolForDrops()
        .sound(SoundType.SLIME_BLOCK)));

    public static void init() {
        BLOCKS.register();
        BLOCK_ITEMS.register();
    }

}
