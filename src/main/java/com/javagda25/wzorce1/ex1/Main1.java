package com.javagda25.wzorce1.ex1;

import java.util.HashSet;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        Set<GameCharacter> gameCharacterHashSet = new HashSet<>();
        GameCharacter.Builder builder = new GameCharacter.Builder();
        GameCharacter gameCharacter = new GameCharacter.Builder()
                .setName("Tosia")
                .setNumberOfPoints(20)
                .setHealth(100)
                .setMana(80).createGameCharacter();

        GameCharacter gameCharacter2 = new GameCharacter.Builder()
                .setName("Antek")
                .setNumberOfPoints(60)
                .setHealth(10)
                .setMana(70).createGameCharacter();

        gameCharacterHashSet.add(gameCharacter);
        gameCharacterHashSet.add(gameCharacter2);

        builder.setName("Ziomek")
                .setNumberOfPoints(110)
                .setHealth(84)
                .setMana(30).createGameCharacter();

        gameCharacterHashSet.add(builder.createGameCharacter());
        gameCharacterHashSet.add(builder.createGameCharacter());
        gameCharacterHashSet.add(builder.createGameCharacter());

        for (GameCharacter character : gameCharacterHashSet) {
            System.out.println(character);
        }

    }
}
