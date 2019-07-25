package com.javagda25.wzorce5_Behavioral.example.vol1;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

public class NewsStation{
    // lista obiektów zainteresowanych zmianą.
    private List<Watcher> watchers = new ArrayList<Watcher>();

    public News currentNews;

    public void addWatcher(Watcher w){
        watchers.add(w);
    }

    public void removeWatcher(Watcher w){
        watchers.remove(w);
    }

    public void newNews(final News news){
        this.currentNews = news;

//        rozgłoszenie wiadomości do watchersów.
        watchers.forEach(w -> w.notifyAboutNews(news));
    }
}
