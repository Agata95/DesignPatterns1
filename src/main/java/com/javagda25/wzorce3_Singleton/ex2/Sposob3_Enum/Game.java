package com.javagda25.wzorce3_Singleton.ex2.Sposob3_Enum;

import com.javagda25.wzorce3_Singleton.ex2.Sposob2_Lazy.MySettings2;

public class Game {
    private int gamesCounter = 0;
    private int score = 0;

    private Round round;

    /**
     * Zwraca true / false w zaleznosci od tego czy userResult jest rowne
     * poprawnemu wynikowi.
     *
     * @param userResult
     */
    public boolean validate(int userResult) {
        boolean result = round.validate(userResult);

        if (result) {
            score++;
        }
        return result;
    }

    /**
     * Metoda ktora przechodzi do nastepnej rundy i generuje dwie kolejne liczby.
     */
    public void nextRound() {
        // kolejna runda zwiększa licznik
        gamesCounter++;

        // generuje liczby
        round = new Round();
        System.out.println(round);
    }

    /**
     * Czy gra sie skonczyla.
     */
    public boolean hasEnded() {
        return gamesCounter >= MySettings2.INSTANCE.getNumberOfRounds();
//        return gamesCounter >= MySettings3.INSTANCE.getNumberOfRounds();
    }
}
