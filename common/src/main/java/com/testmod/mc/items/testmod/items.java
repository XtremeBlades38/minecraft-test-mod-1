package com.testmod.mc.items.testmod;

import com.testmod.mc.TestMod;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;


import java.util.function.Supplier;

import static com.testmod.mc.TestMod.MOD_ID;


    public class items {
        public static final DeferredRegister<Item> ITEMS =
                DeferredRegister.create(TestMod.MOD_ID, Registries.ITEM);



        public static void init() {
            ITEMS.register();
        }
    }

