package com.kerbybit.shrug;

import com.kerbybit.shrug.Commands.excuse;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileHandler {
    private static List<String> loadFile(String dirpath, String filepath, String type) {
        try {
            Scanner s = new Scanner(new File(dirpath + filepath));
            ArrayList<String> list = new ArrayList<String>();
            while (s.hasNextLine()) {
                list.add(s.nextLine());
            }
            s.close();

            return list;
        } catch (FileNotFoundException exception0) {
            ArrayList<String> list = new ArrayList<String>();

            if (type.equals("excuse")) {
                list.add("I dropped my <item>");
                list.add("I forgot to turn off my <item>");
                list.add("I forgot to turn on my <item>");
                list.add("I was cooking <food>");
                list.add("I was eating <food>");
                list.add("I was <activity>");
                list.add("I was <activity> but then I forgot that I had to turn off my <item>");
                list.add("My <food> started on fire");
                list.add("My <item> started on fire");
                list.add("My <pet> was <activity>");
                list.add("I had to feed my <pet>");
            } else if (type.equals("item")) {
                list.add("toaster");
                list.add("ping");
                list.add("shoe");
                list.add("door");
                list.add("gaming socks");
                list.add("chair");
                list.add("router");
            } else if (type.equals("food")) {
                list.add("beans");
                list.add("potatoes");
                list.add("lasagna");
                list.add("cotton candy");
                list.add("schnitzel");
            } else if (type.equals("activity")) {
                list.add("putting on my socks");
                list.add("taking off my socks");
                list.add("restarting my computer");
                list.add("doing sports");
                list.add("finishing my calc homework");
                list.add("texting");
                list.add("playing another game");
                list.add("calling my mom");
                list.add("getting yelled at by my mom");
            } else if (type.equals("pet")) {
                list.add("cat");
                list.add("kitten");
                list.add("dog");
                list.add("gold fish");
                list.add("parrot");
                list.add("pet cockroach");
                list.add("horse");
            }

            setupNewFile(dirpath, filepath, list);

            return list;
        }
    }

    private static void setupNewFile(String dirpath, String filepath, List<String> list) {
        try {
            File file = new File(dirpath + filepath);
            File dir = new File(dirpath);
            if (dir.mkdir()) {
                System.out.println("Created directory " + dirpath);
            }
            if (file.createNewFile()) {
                System.out.println("Created file " + dirpath + filepath);
                PrintWriter writer = new PrintWriter(file);
                for (String value : list) {
                    writer.println(value);
                }
                writer.close();
            }
        } catch (IOException exception1) {
            System.out.println("Could not set up file at " + dirpath + filepath);
        }
    }

    public static void loadFiles() {
        excuse.excuses = loadFile("./mods/shrug/", "excuses.txt", "excuse");
        excuse.items = loadFile("./mods/shrug/", "items.txt", "item");
        excuse.foods = loadFile("./mods/shrug/", "foods.txt", "food");
        excuse.activities = loadFile("./mods/shrug/", "activities.txt", "activity");
        excuse.pets = loadFile("./mods/shrug/", "pets.txt", "pet");
    }
}
