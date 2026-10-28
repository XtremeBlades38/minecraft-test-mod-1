package com.testmod.mc;


import com.testmod.mc.blocks.blocks;
import com.testmod.mc.items.testmod.items;
import com.testmod.mc.tabs.Tabs;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class TestMod {
    public static final String MOD_ID = "testmods";

    public static final Logger LOGGER= LoggerFactory.getLogger(MOD_ID);


    public static void init() {
        // Write common init code here.

        LOGGER.info("Initializing TestMod");
        Tabs.TABS.register();
        blocks.init();
        items.init();
    }
}
