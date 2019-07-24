package com.javagda25.wzorce3_Singleton.ex2.Sposob3_Enum;

import com.javagda25.wzorce3_Singleton.ex2.Sposob2_Lazy.MySettings2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SettingsReader3 {
    public void readSettingsFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader("condfig.txt"))) {

            String line1 = reader.readLine();
            String line2 = reader.readLine();
            String line3 = reader.readLine();
            String line4 = reader.readLine();

            String value1 = line1.split("=")[1];
            String value2 = line2.split("=")[1];
            String value3 = line3.split("=")[1];        // działania
            String value4 = line4.split("=")[1];

            // punkt 1
            int range1= Integer.parseInt(value1);   // zakres 1
            int range2= Integer.parseInt(value2);  // zakres 2
            int rounds = Integer.parseInt(value4); // ilosc rund

            // punkt 4
            MySettings2.INSTANCE.setRange1(range1);
//            MySettings3.INSTANCE.setRange1(range1);
            MySettings2.INSTANCE.setRange2(range2);
//            MySettings3.INSTANCE.setRange2(range2);
            MySettings2.INSTANCE.setNumberOfRounds(rounds);
//            MySettings3.INSTANCE.setNumberOfRounds(rounds);
            MySettings2.INSTANCE.setSigns(value3);
//            MySettings3.INSTANCE.setSigns(value3);

        } catch (IOException ioe) {
            System.err.println("brak pliku");
        }
    }
}
