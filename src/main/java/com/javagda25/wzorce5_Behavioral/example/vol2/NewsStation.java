package com.javagda25.wzorce5_Behavioral.example.vol2;

import java.util.Observable;
import java.util.Vector;

public class NewsStation extends Observable {
    // lista obiektów zainteresowanych zmianą.
    private Vector<IWatcher> watchers = new Vector<>();

    public News currentNews;

    public void addWatcher(IWatcher w){
        watchers.add(w);
    }

    // concurrentmodificationexception
    public void removeWatcher(IWatcher w){
        watchers.remove(w);
    }

    public void newNews(final News news){
        this.currentNews = news;

//        rozgłoszenie wiadomości do watchersów.
        watchers.forEach(w -> w.update(news));
    }
}