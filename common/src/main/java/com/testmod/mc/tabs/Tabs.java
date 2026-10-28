package com.testmod.mc.tabs;

import com.testmod.mc.TestMod;
import com.testmod.mc.blocks.blocks;
import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class Tabs {

    public static final DeferredRegister<CreativeModeTab>TABS=DeferredRegister.create(TestMod.MOD_ID, Registries.CREATIVE_MODE_TAB);

    public static final RegistrySupplier<CreativeModeTab>MODTABS=TABS.register("test_tabs",
            () -> CreativeTabRegistry.create(
                    Component.translatable("itemGroup.testmods.test_tabs"),
                    ()-> new ItemStack(blocks.MUDDY_DIRT_BLOCK.get())
            ));
}
