package com.javagda25.wzorce5_Behavioral.example.vol3;

import java.util.Observable;
import java.util.Observer;

public class KGB implements Observer {
    @Override
    public void update(Observable newsStation, Object arg) {
        System.out.println("KGB: " + arg);
    }
}
