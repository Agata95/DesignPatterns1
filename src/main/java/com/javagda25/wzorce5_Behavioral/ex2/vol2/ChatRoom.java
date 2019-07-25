package com.javagda25.wzorce5_Behavioral.ex2.vol2;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;


public class ChatRoom{
    // newsProperty ma możliwość powiadamiania innych o nowych wiadomościach
    public SimpleObjectProperty<String> newsProperty = new SimpleObjectProperty<>();

    public void addUser(ChangeListener<String> user){
        newsProperty.addListener(user);
    }

    public void removeUser(ChangeListener<String> user){
        newsProperty.removeListener(user);
    }

    public void sendMessage(String newMessage){
        newsProperty.setValue(newMessage);
    }
}
