package com.kerbybit.shrug.Commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class shrug extends CommandBase {
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
