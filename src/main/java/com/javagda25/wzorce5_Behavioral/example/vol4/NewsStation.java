package com.javagda25.wzorce5_Behavioral.example.vol4;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;

import java.util.Observable;

public class NewsStation{
    // lista obiektów zainteresowanych zmianą.
    public SimpleObjectProperty<News> currentNews = new SimpleObjectProperty<>();

    public void dodajWatchera(ChangeListener<News> watcher){
        currentNews.addListener(watcher);
    }

    public void usunWatchera(ChangeListener<News> watcher){
        currentNews.removeListener(watcher);
    }

    public void newNews(final News news){
        // roześlij informację o zmianie
        //
        currentNews.setValue(news);
        //
        // ZAMIAST:
        // setChanged()
        // notifyObservers()
    }
}
