package com.company;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by student16 on 28.05.2017.
 */
public class HomeBook {
    private static HomeBook instance;
    private String fileName = "HomeBook.txt";

    static {
        instance = new HomeBook();
    }

    public static HomeBook getInstance() {
        return instance;
    }

    public void saveHuman(String name) {
        saveElement(name, -1);
    }

    public void saveHumanAndAddress(String name, double area) {
        saveElement(name, area);
    }

    private void saveElement(String name, double area) {
        try {
            ArrayList<String> roomers = new ArrayList<>();

            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            while (reader.ready()) {
                roomers.add(reader.readLine());
            }

            reader.close();

            BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));

            for (String s : roomers) {
                writer.write(s);
                writer.newLine();
            }

            if (area > -1) {
                writer.write(name + ", " + area);
            } else {
                writer.write(name);
            }

            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
