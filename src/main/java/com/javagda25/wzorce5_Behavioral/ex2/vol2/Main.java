package com.javagda25.wzorce5_Behavioral.ex2.vol2;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();

        chatRoom.addUser(new User("Zuzia"));
        chatRoom.addUser(new User("Anka"));
        chatRoom.addUser(new User("Ziomal"));

        chatRoom.sendMessage("nowa wiadomość");
        chatRoom.sendMessage("Co się stało?");
        chatRoom.sendMessage("Jaka śliczna sukienka!");
    }
}
