package com.javagda25.wzorce5_Behavioral.example.vol2;

public class Watcher implements IWatcher {
    private int poziomZainteresowania;
    private String imie;

    public Watcher(int poziomZainteresowania, String imie) {
        this.poziomZainteresowania = poziomZainteresowania;
        this.imie = imie;
    }

    @Override
    public void update(News news) {
        if(news.getPoziomWiadomosci() > poziomZainteresowania){
            System.err.println(imie + ": OMG! O nie!  " + news.getWiadomosc());
        }else{
            System.out.println(imie + ": Etam, wiadomosci: " + news.getWiadomosc());
        }
    }
}
