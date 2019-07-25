package com.javagda25.wzorce5_Behavioral.example.vol3;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements Observer {
    private int poziomZainteresowania;
    private String imie;

    public Watcher(int poziomZainteresowania, String imie) {
        this.poziomZainteresowania = poziomZainteresowania;
        this.imie = imie;
    }

    @Override
    public void update(Observable o, Object arg) {
        if (arg instanceof News) {
            News news = (News) arg;
            if (news.getPoziomWiadomosci() > poziomZainteresowania) {
                System.err.println(imie + ": OMG! O nie!  " + news.getWiadomosc());
            } else {
                System.out.println(imie + ": Etam, wiadomosci: " + news.getWiadomosc());
            }
        } else {
            System.out.println("Nie kumam, co to jest:" + arg);
        }
    }
}
