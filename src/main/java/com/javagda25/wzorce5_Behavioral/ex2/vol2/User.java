package com.javagda25.wzorce5_Behavioral.ex2.vol2;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import java.util.Observable;
import java.util.Observer;

public class User implements ChangeListener<String> {
    private String imie;

    public User(String imie) {
        this.imie = imie;
    }


    @Override
    public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
        System.out.println(imie + ": " + newValue);
    }
}
