package com.javagda25.wzorce4_Decorator.example;

public interface IHero {
    int getAttackPoints();

    int getDefencePoints();

    int getHealthPoints();

    void attack(int points) throws Hero;
}
