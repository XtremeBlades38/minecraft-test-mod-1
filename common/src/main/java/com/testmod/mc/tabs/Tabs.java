package com.testmod.mc.tabs;

import com.testmod.mc.TestMod;
import dev.architectury.registry.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;

public class Tabs {

    public static final DeferredRegister<CreativeModeTab>TABS=DeferredRegister.create(TestMod.MOD_ID, Registries.CREATIVE_MODE_TAB);
}
