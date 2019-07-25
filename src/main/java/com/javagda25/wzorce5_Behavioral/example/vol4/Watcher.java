package com.javagda25.wzorce5_Behavioral.example.vol4;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.Observable;
import java.util.Observer;

public class Watcher implements ChangeListener<News> {
    private int poziomZainteresowania;
    private String imie;

    public Watcher(int poziomZainteresowania, String imie) {
        this.poziomZainteresowania = poziomZainteresowania;
        this.imie = imie;
    }

    @Override
    public void changed(ObservableValue<? extends News> observable, News oldValue, News newValueNews) {
        if (newValueNews.getPoziomWiadomosci() > poziomZainteresowania) {
            System.err.println(imie + ": OMG! O nie!  " + newValueNews.getWiadomosc());
        } else {
            System.out.println(imie + ": Etam, wiadomosci: " + newValueNews.getWiadomosc());
        }
    }

//    @Override
//    public void changed(ObservableValue<? extends Potato> observable, Potato oldValue, Potato newValueNews) {
//        System.out.println("otrzymałem potejto");
//    }
}
