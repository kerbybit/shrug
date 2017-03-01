package com.kerbybit.shrug.Commands;

import net.minecraft.client.Minecraft;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class excuse extends CommandBase {
    public static List<String> excuses = new ArrayList<String>();
    public static List<String> items = new ArrayList<String>();
    public static List<String> foods = new ArrayList<String>();
    public static List<String> activities = new ArrayList<String>();
    public static List<String> pets = new ArrayList<String>();

    public void processCommand(ICommandSender sender, String[] args) {
        Random random = new Random();
        String excuse = excuses.get(random.nextInt(excuses.size()));
        String item_string = "<item>";
        String food_string = "<food>";
        String activity_string = "<activity>";
        String pet_string = "<pet>";

        while (excuse.contains(item_string)) {
            excuse = excuse.replaceFirst(item_string, items.get(random.nextInt(items.size())));
        }
        while (excuse.contains(food_string)) {
            excuse = excuse.replaceFirst(food_string, foods.get(random.nextInt(foods.size())));
        }
        while (excuse.contains(activity_string)) {
            excuse = excuse.replaceFirst(activity_string, activities.get(random.nextInt(activities.size())));
        }
        while (excuse.contains(pet_string)) {
            excuse = excuse.replaceFirst(pet_string, pets.get(random.nextInt(pets.size())));
        }

        Minecraft.getMinecraft().thePlayer.sendChatMessage(excuse);
    }

    public String getCommandUsage(ICommandSender sender) {
        return "/excuse";
    }

    public String getCommandName() {
        return "excuse";
    }

    public int getRequiredPermissionLevel() {
        return 0;
    }
}
