package com.javagda25.wzorce5_Behavioral.ex2.vol1;

public class Main {
    public static void main(String[] args) {
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.addObserver(new User("Asia"));
        chatRoom.addObserver(new User("Tosia"));
        chatRoom.addObserver(new User("Gosia"));
        chatRoom.addObserver(new User("Ziomek"));

        chatRoom.sendMessage("nowa wiadomość");
        chatRoom.sendMessage("Co się stało?");
        chatRoom.sendMessage("Jaka śliczna sukienka!");
    }
}
