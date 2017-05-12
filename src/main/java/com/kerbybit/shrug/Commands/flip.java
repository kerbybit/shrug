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
            StringBuilder flipped = new StringBuilder();
            for (String value : args) {
                flipped.append(value).append(" ");
            }
            flip += flipString(flipped.toString());
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

    private String flipString(String flip) {
        StringBuilder flipped = new StringBuilder();
        char[] chars = flip.toCharArray();
        for (char value : chars) {
            switch (value) {
                case ('A'):
                    flipped = flipped.append('\u2200');
                    break;
                case ('B'):
                case ('b'):
                    flipped = flipped.append('q');
                    break;
                case ('C'):
                    flipped = flipped.append('\u0186');
                    break;
                case ('D'):
                case ('d'):
                    flipped = flipped.append('p');
                    break;
                case ('E'):
                    flipped = flipped.append('\u018E');
                    break;
                case ('F'):
                    flipped = flipped.append('\u2132');
                    break;
                case ('G'):
                    flipped = flipped.append('\u05E4');
                    break;
                case ('J'):
                    flipped = flipped.append('\u017F');
                    break;
                case ('K'):
                case ('k'):
                    flipped = flipped.append('\u029E');
                    break;
                case ('L'):
                    flipped = flipped.append('\u02E5');
                    break;
                case ('M'):
                    flipped = flipped.append('W');
                    break;
                case ('P'):
                    flipped = flipped.append('\u0500');
                    break;
                case ('R'):
                    flipped = flipped.append('\u1D1A');
                    break;
                case ('T'):
                    flipped = flipped.append('\u22A5');
                    break;
                case ('U'):
                    flipped = flipped.append('\u2229');
                    break;
                case ('V'):
                    flipped = flipped.append('\u039B');
                    break;
                case ('W'):
                    flipped = flipped.append('M');
                    break;
                case ('Y'):
                    flipped = flipped.append('\u2144');
                    break;

                case ('a'):
                    flipped = flipped.append('\u0250');
                    break;
                case ('c'):
                    flipped = flipped.append('\u0254');
                    break;
                case ('e'):
                    flipped = flipped.append('\u01DD');
                    break;
                case ('f'):
                    flipped = flipped.append('\u025F');
                    break;
                case ('g'):
                    flipped = flipped.append('\u0183');
                    break;
                case ('h'):
                    flipped = flipped.append('\u0265');
                    break;
                case ('i'):
                    flipped = flipped.append('\u1d09');
                    break;
                case ('j'):
                    flipped = flipped.append('\u027E');
                    break;
                case ('m'):
                    flipped = flipped.append('\u026F');
                    break;
                case ('n'):
                    flipped = flipped.append('u');
                    break;
                case ('p'):
                    flipped = flipped.append('d');
                    break;
                case ('q'):
                    flipped = flipped.append('b');
                    break;
                case ('r'):
                    flipped = flipped.append('\u0279');
                    break;
                case ('t'):
                    flipped = flipped.append('\u0287');
                    break;
                case ('u'):
                    flipped = flipped.append('n');
                    break;
                case ('v'):
                    flipped = flipped.append('\u028C');
                    break;
                case ('w'):
                    flipped = flipped.append('\u028D');
                    break;
                case ('y'):
                    flipped = flipped.append('\u028E');
                    break;

                case ('1'):
                    flipped = flipped.append('\u0196');
                    break;
                case ('2'):
                    flipped = flipped.append('\u1105');
                    break;
                case ('3'):
                    flipped = flipped.append('\u0190');
                    break;
                case ('4'):
                    flipped = flipped.append('\u3123');
                    break;
                case ('5'):
                    flipped = flipped.append('\u03DB');
                    break;
                case ('6'):
                    flipped = flipped.append('9');
                    break;
                case ('7'):
                    flipped = flipped.append('\u3125');
                    break;
                case ('9'):
                    flipped = flipped.append('6');
                    break;

                case ('.'):
                    flipped = flipped.append('\u02D9');
                    break;
                case (','):
                    flipped = flipped.append('\'');
                    break;
                case ('\''):
                    flipped = flipped.append(',');
                    break;
                case ('`'):
                    flipped = flipped.append(',');
                    break;
                case ('&'):
                    flipped = flipped.append('\u214B');
                    break;
                case ('_'):
                    flipped = flipped.append('\u203E');
                    break;
                case ('?'):
                    flipped = flipped.append('\u00BF');
                    break;
                case ('!'):
                    flipped = flipped.append('\u00A1');
                    break;

                default:
                    flipped = flipped.append(value);
                    break;
            }
        }
        return flipped.reverse().toString();
    }
}
