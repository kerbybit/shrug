package com.kerbybit.shrug.Commands;

import com.kerbybit.shrug.FileHandler;
import com.mojang.realmsclient.gui.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.util.ChatComponentText;

public class excuses extends CommandBase {
    public void processCommand(ICommandSender sender, String[] args) {
        EntityPlayerSP player = Minecraft.getMinecraft().thePlayer;
        if (args.length == 0) {
            player.addChatMessage(new ChatComponentText(ChatFormatting.GREEN + "Excuses"));
            for (String value : excuse.excuses) {
                player.addChatMessage(new ChatComponentText("  " + value));
            }
            player.addChatMessage(new ChatComponentText(ChatFormatting.GREEN + "Items"));
            for (String value : excuse.items) {
                player.addChatMessage(new ChatComponentText("  " + value));
            }
            player.addChatMessage(new ChatComponentText(ChatFormatting.GREEN + "Foods"));
            for (String value : excuse.foods) {
                player.addChatMessage(new ChatComponentText("  " + value));
            }
            player.addChatMessage(new ChatComponentText(ChatFormatting.GREEN + "Activities"));
            for (String value : excuse.activities) {
                player.addChatMessage(new ChatComponentText("  " + value));
            }
        } else {
            if (args[0].equals("reload")) {
                FileHandler.loadFiles();
                player.addChatMessage(new ChatComponentText(ChatFormatting.GREEN + "Reloaded excuses"));
            }
        }
    }

    public String getCommandUsage(ICommandSender sender) {
        return "/excuses";
    }

    public String getCommandName() {
        return "excuses";
    }

    public int getRequiredPermissionLevel() {
        return 0;
    }
}
