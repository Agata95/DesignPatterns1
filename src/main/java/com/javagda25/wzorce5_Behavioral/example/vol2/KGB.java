package com.javagda25.wzorce5_Behavioral.example.vol2;

public class KGB implements IWatcher {
    @Override
    public void update(News n) {
        System.out.println("KGB: " + n);
    }
}
