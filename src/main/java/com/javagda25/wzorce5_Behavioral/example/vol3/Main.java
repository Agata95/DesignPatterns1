package com.javagda25.wzorce5_Behavioral.example.vol3;

public class Main {
    public static void main(String[] args) {
        NewsStation station = new NewsStation();
        station.addObserver(new Watcher(10, "Marian"));
        station.addObserver(new Watcher(8, "Adam"));
        station.addObserver(new Watcher(6, "Gosia"));
        station.addObserver(new Watcher(4, "Filip"));
        station.addObserver(new Watcher(2, "Genowefa"));
        station.addObserver(new KGB());

        station.newNews(new News("Koniec cukru w sklepie", 3));
        station.newNews(new News("Promocja w biedronce się skończyła", 5));
        station.newNews(new News("W niedzielę sklepy otwarte!", 10));
        station.newNews(new News("World trade center - atak terrorystyczny", 9));

        station.newNews(new Potato());
    }

}
