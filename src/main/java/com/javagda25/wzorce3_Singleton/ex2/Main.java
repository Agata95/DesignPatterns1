package com.javagda25.wzorce3_Singleton.ex2;

import com.javagda25.wzorce3_Singleton.ex2.Sposob2_Lazy.MySettings2;
import com.javagda25.wzorce3_Singleton.ex2.Sposob3_Enum.Game;
import com.javagda25.wzorce3_Singleton.ex2.Sposob3_Enum.SettingsReader3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MySettings2.getInstance();
        SettingsReader3 reader = new SettingsReader3();
        reader.readSettingsFromFile();

        Game game = new Game();

        Scanner scanner = new Scanner(System.in);
        while (!game.hasEnded()) {
            game.nextRound();  // losowanie liczb i znaku
            // pytanie do użytkownika (podanie liczb i znaku)
            int userResult = scanner.nextInt();     // pobieram wynik
            if (game.validate(userResult)) {             // weryfikacja czy podana
                // liczba jest poprawnym wynikiem
                System.out.println("OK!");
            } else {
                System.out.println("NOT OK!");
            }
        }
    }
}
