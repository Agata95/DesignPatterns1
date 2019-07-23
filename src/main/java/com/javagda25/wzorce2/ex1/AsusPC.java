package com.javagda25.wzorce2.ex1;


public class AsusPC extends AbstractPC {
    public AsusPC(String name, double cpuPower, double gpuPower, boolean isOverclocked) {
        super(name, cpuPower, gpuPower, isOverclocked, ComputerBrand.ASUS);
    }

    public static AbstractPC createAsusN53(){
        return new AsusPC("Jakiś Asus", 10, 3, true);
    }
}
