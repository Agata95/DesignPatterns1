package com.javagda25.wzorce5_Behavioral.example.vol4;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

public class KGB implements ChangeListener<News> {

    @Override
    public void changed(ObservableValue<? extends News> observable, News oldValue, News newValue) {
        System.out.println("KGB: " + newValue);
    }
}
