package com.javagda25.wzorce5_Behavioral.ex2.vol1;

import java.util.Observable;

public class ChatRoom extends Observable {
//    private String newsProperty;

    public void sendMessage(String message){
        setChanged();
        notifyObservers(message);
    }
}
