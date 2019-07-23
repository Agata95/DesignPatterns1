package com.javagda25.wzorce2.ex1;

public class SamsungPC extends AbstractPC {
    public SamsungPC(String name, double cpuPower, double gpuPower, boolean isOverclocked) {
        super(name, cpuPower, gpuPower, isOverclocked, ComputerBrand.SAMSUNG);
    }

    public static AbstractPC createSamsungCos(){
        return new SamsungPC("Jakiś Samsung", 2, 15, true);
    }
}
