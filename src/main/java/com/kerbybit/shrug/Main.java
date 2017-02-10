package com.kerbybit.shrug;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = "shrug", name="\u203E\\_(\u30C4)_/\u203E", version="1.1")
public class Main extends CommandBase {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance().bus().register(this);
        ClientCommandHandler.instance.registerCommand(new Main());
    }

    public void processCommand(ICommandSender sender, String[] args) {
        String shrug = "";
        for (String arg : args) {
            shrug += " " + arg;
        }
        shrug += " \u203E\\_(\u30C4)_/\u203E";
        Minecraft.getMinecraft().thePlayer.sendChatMessage(shrug.trim());
    }

    public String getCommandUsage(ICommandSender sender) {
        return "/shrug";
    }

    public String getCommandName() {
        return "shrug";
    }

    public int getRequiredPermissionLevel() {
        return 0;
    }
}
