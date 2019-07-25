package com.javagda25.wzorce5_Behavioral.example.vol3;

import java.util.Observable;

public class NewsStation extends Observable {
    // lista obiektów zainteresowanych zmianą.
    public News currentNews;

    public void newNews(final News news){
        this.currentNews = news;

//        rozgłoszenie wiadomości do watchersów.
        setChanged();       // zaznacz w polu - "wprowadzono zmiany" (oznacz obiekt jako zmieniony)
        notifyObservers(news);  // roześlij informację o zmianie
    }

    public void newNews(final Object news){
//        rozgłoszenie wiadomości do watchersów.
        setChanged();       // zaznacz w polu - "wprowadzono zmiany" (oznacz obiekt jako zmieniony)
        notifyObservers(news);  // roześlij informację o zmianie
    }
}
