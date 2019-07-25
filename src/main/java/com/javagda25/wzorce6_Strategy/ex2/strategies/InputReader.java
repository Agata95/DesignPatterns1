package com.javagda25.wzorce6_Strategy.ex2.strategies;

import com.javagda25.wzorce6_Strategy.ex2.IInputStrategy;

public class InputReader {
    private IInputStrategy strategy;

    public int requestInt(){
        return strategy.getInt();
    }
    public String requestString(){
        return strategy.getString();
    }
    public double requestDouble(){
        return strategy.getDouble();
    }

    public void setStrategy(IInputStrategy strategy) {
        this.strategy = strategy;
    }
}
