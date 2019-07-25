package com.javagda25.wzorce5_Behavioral.example.vol1;

import java.util.Observable;
import java.util.Observer;

public class Watcher{
    private int poziomZainteresowania;
    private String imie;

    public Watcher(int poziomZainteresowania, String imie) {
        this.poziomZainteresowania = poziomZainteresowania;
        this.imie = imie;
    }

    public void notifyAboutNews(News news) {
        if(news.getPoziomWiadomosci() > poziomZainteresowania){
            System.err.println(imie + ": OMG! O nie!  " + news.getWiadomosc());
        }else{
            System.out.println(imie + ": Etam, wiadomosci: " + news.getWiadomosc());
        }
    }
}
