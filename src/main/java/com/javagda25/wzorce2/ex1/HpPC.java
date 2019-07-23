package com.javagda25.wzorce2.ex1;

public class HpPC extends AbstractPC {
    public HpPC(String name, double cpuPower, double gpuPower, boolean isOverclocked) {
        super(name, cpuPower, gpuPower, isOverclocked, ComputerBrand.HP);
    }

    public static AbstractPC createHpCos(){
        return new HpPC("Jakiś Hp", 4, 13, false);
    }
}
