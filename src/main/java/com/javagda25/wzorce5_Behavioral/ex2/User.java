package com.javagda25.wzorce5_Behavioral.ex2;

import java.util.Observable;
import java.util.Observer;

public class User implements Observer {
    private String imie;

    public User(String imie) {
        this.imie = imie;
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println(imie + ": " + arg);
    }
}
