package com.javagda25.wzorce4_Decorator.example;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Hero extends Throwable {
    private String name;
    private int attackPoints;
    private int defencePoints;
    private int healthPoints;

    public static Hero createHero(String name) {
        return new Hero(name, 100, 200, 100);
    }

    public void attack(int points) {
        int ileZyciaOdjac = points / getDefencePoints();

        healthPoints -= ileZyciaOdjac;
    }
}
