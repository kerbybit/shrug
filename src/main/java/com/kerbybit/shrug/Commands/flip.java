package com.kerbybit.shrug.Commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

public class flip extends CommandBase {
    public void processCommand(ICommandSender sender, String[] args) {
        String flip = "(\u256F\u00B0\u25A1\u00B0)\u256F\uFE35 ";
        if (args.length == 0) {
            flip += "\u253B\u2501\u253B";
        } else {
            String flipped = "";
            for (String value : args) {
                flipped += value + " ";
            }
            flipped = flip(flipped);
            flip += flipped;
        }
        Minecraft.getMinecraft().thePlayer.sendChatMessage(flip.trim());
    }

    public String getCommandUsage(ICommandSender sender) {
        return "/flip";
    }

    public String getCommandName() {
        return "flip";
    }

    public int getRequiredPermissionLevel() {
        return 0;
    }

    private String flip(String flip) {
        String flipped = "";
        char[] chars = flip.toCharArray();
        for (char value : chars) {
            switch (value) {
                case ('A'):
                    flipped = '\u2200' + flipped;
                    break;
                case ('B'):
                case ('b'):
                    flipped = 'q' + flipped;
                    break;
                case ('C'):
                    flipped = '\u0186' + flipped;
                    break;
                case ('D'):
                case ('d'):
                    flipped = 'p' + flipped;
                    break;
                case ('E'):
                    flipped = '\u018E' + flipped;
                    break;
                case ('F'):
                    flipped = '\u2132' + flipped;
                    break;
                case ('G'):
                    flipped = '\u05E4' + flipped;
                    break;
                case ('J'):
                    flipped = '\u017F' + flipped;
                    break;
                case ('K'):
                case ('k'):
                    flipped = '\u029E' + flipped;
                    break;
                case ('L'):
                    flipped = '\u02E5' + flipped;
                    break;
                case ('M'):
                    flipped = 'W' + flipped;
                    break;
                case ('P'):
                    flipped = '\u0500' + flipped;
                    break;
                case ('R'):
                    flipped = '\u1D1A' + flipped;
                    break;
                case ('T'):
                    flipped = '\u22A5' + flipped;
                    break;
                case ('U'):
                    flipped = '\u2229' + flipped;
                    break;
                case ('V'):
                    flipped = '\u039B' + flipped;
                    break;
                case ('W'):
                    flipped = 'M' + flipped;
                    break;
                case ('Y'):
                    flipped = '\u2144' + flipped;
                    break;

                case ('a'):
                    flipped = '\u0250' + flipped;
                    break;
                case ('c'):
                    flipped = '\u0254' + flipped;
                    break;
                case ('e'):
                    flipped = '\u01DD' + flipped;
                    break;
                case ('f'):
                    flipped = '\u025F' + flipped;
                    break;
                case ('g'):
                    flipped = '\u0183' + flipped;
                    break;
                case ('h'):
                    flipped = '\u0265' + flipped;
                    break;
                case ('i'):
                    flipped = '\u1d09' + flipped;
                    break;
                case ('j'):
                    flipped = '\u027E' + flipped;
                    break;
                case ('m'):
                    flipped = '\u026F' + flipped;
                    break;
                case ('n'):
                    flipped = 'u' + flipped;
                    break;
                case ('p'):
                    flipped = 'd' + flipped;
                    break;
                case ('q'):
                    flipped = 'b' + flipped;
                    break;
                case ('r'):
                    flipped = '\u0279' + flipped;
                    break;
                case ('t'):
                    flipped = '\u0287' + flipped;
                    break;
                case ('u'):
                    flipped = 'n' + flipped;
                    break;
                case ('v'):
                    flipped = '\u028C' + flipped;
                    break;
                case ('w'):
                    flipped = '\u028D' + flipped;
                    break;
                case ('y'):
                    flipped = '\u028E' + flipped;
                    break;

                case ('1'):
                    flipped = '\u0196' + flipped;
                    break;
                case ('2'):
                    flipped = '\u1105' + flipped;
                    break;
                case ('3'):
                    flipped = '\u0190' + flipped;
                    break;
                case ('4'):
                    flipped = '\u3123' + flipped;
                    break;
                case ('5'):
                    flipped = '\u03DB' + flipped;
                    break;
                case ('6'):
                    flipped = '9' + flipped;
                    break;
                case ('7'):
                    flipped = '\u3125' + flipped;
                    break;
                case ('9'):
                    flipped = '6' + flipped;
                    break;

                case ('.'):
                    flipped = '\u02D9' + flipped;
                    break;
                case (','):
                    flipped = '\'' + flipped;
                    break;
                case ('\''):
                    flipped = ',' + flipped;
                    break;
                case ('`'):
                    flipped = ',' + flipped;
                    break;
                case ('&'):
                    flipped = '\u214B' + flipped;
                    break;
                case ('_'):
                    flipped = '\u203E' + flipped;
                    break;
                case ('?'):
                    flipped = '\u00BF' + flipped;
                    break;
                case ('!'):
                    flipped = '\u00A1' + flipped;
                    break;

                default:
                    flipped = value + flipped;
                    break;
            }
        }
        return flipped;
    }
}
