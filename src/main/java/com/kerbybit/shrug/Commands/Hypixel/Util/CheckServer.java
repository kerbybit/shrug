package com.kerbybit.shrug.Commands.Hypixel.Util;

import net.minecraft.client.Minecraft;

public class CheckServer {
    public static Boolean isHypixel() {
        if (!Minecraft.getMinecraft().isSingleplayer()) {
            if (Minecraft.getMinecraft().getCurrentServerData().serverMOTD.toUpperCase().contains("HYPIXEL")) {
                return true;
            }
        }
        return false;
    }
}
