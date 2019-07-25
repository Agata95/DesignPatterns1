package com.javagda25.wzorce4_Decorator.example;

public class HeroOnAHorse /*implements IHero */{
    private final Hero hero;

    public HeroOnAHorse(Hero hero) {
        this.hero = hero;
        this.additionalHealthPoints = 50;
        this.additionalAttackPoints = 50;
        this.additionalDefencePoints = 50;
    }

    private String horseColor;

    private int additionalAttackPoints;
    private int additionalDefencePoints;
    private int additionalHealthPoints;

    public int getAttackPoints() {
        return hero.getAttackPoints() + additionalAttackPoints;
    }

    public int getDefencePoints() {
        return hero.getDefencePoints() + additionalDefencePoints;
    }

    public int getHealthPoints() {
        return hero.getHealthPoints() + additionalHealthPoints;
    }

    public void attack(int points) throws Hero{
        int ileZyciaOdjac = points / getDefencePoints();

        additionalHealthPoints -= ileZyciaOdjac;
        if (additionalHealthPoints <= 0) {
            System.err.println("Horse died");
            throw hero;
        }
    }
}
