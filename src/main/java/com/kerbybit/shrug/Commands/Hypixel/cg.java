package com.kerbybit.shrug.Commands.Hypixel;

import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

import static com.kerbybit.shrug.Commands.Hypixel.Util.CheckServer.isHypixel;

public class cg extends CommandBase {
    public void processCommand(ICommandSender sender, String[] args) {
        if (isHypixel()) {
            Minecraft.getMinecraft().thePlayer.sendChatMessage("/chat g");
        } else {
            Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(ChatFormatting.RED + "This command is only available on Hypixel"));
        }
    }

    public String getCommandUsage(ICommandSender sender) {
        return "/cg";
    }

    public String getCommandName() {
        return "cg";
    }

    public int getRequiredPermissionLevel() {
        return 0;
    }
}
