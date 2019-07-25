package com.javagda25.wzorce5_Behavioral.example.vol2;

public class Main {
    public static void main(String[] args) {
        NewsStation station = new NewsStation();
        station.addWatcher(new Watcher(10, "Marian"));
        station.addWatcher(new Watcher(8, "Adam"));
        station.addWatcher(new Watcher(6, "Gosia"));
        station.addWatcher(new Watcher(4, "Filip"));
        station.addWatcher(new Watcher(2, "Genowefa"));
        station.addWatcher(new KGB());

        station.newNews(new News("Koniec cukru w sklepie", 3));
        station.newNews(new News("Promocja w biedronce się skończyła", 5));
        station.newNews(new News("W niedzielę sklepy otwarte!", 10));
        station.newNews(new News("World trade center - atak terrorystyczny", 9));
    }
}
