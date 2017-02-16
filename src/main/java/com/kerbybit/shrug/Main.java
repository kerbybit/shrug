package com.kerbybit.shrug;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "shrug", name="\u203E\\_(\u30C4)_/\u203E", version="1.2")
public class Main {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance().bus().register(this);
        ClientCommandHandler.instance.registerCommand(new shrug());
        ClientCommandHandler.instance.registerCommand(new flip());
    }


}
