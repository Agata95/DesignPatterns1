package com.javagda25.wzorce5_Behavioral.ex2.vol2;

import java.util.List;

public class PortalInternetowy {

    private List<ChatRoom> chatRoomList;

    public void addRoom(ChatRoom chatRoom){
        chatRoomList.add(chatRoom);
    }

    public void removeRoom(ChatRoom chatRoom){
        chatRoomList.remove(chatRoom);
    }

    public void listowanie(){
        chatRoomList.forEach(System.out::println);
    }
}
