package com.javagda25.wzorce2.ex1;

public class AppleMac extends AbstractPC {
    public AppleMac(String name, double cpuPower, double gpuPower, boolean isOverclocked) {
        super(name, cpuPower, gpuPower, isOverclocked, ComputerBrand.APPLE);
    }

    public static AppleMac createAppleMacCos(){
        return new AppleMac("Jakis Apple", 4, 3.54, true);
    }

    public static AbstractPC createAppleMac2(){
        return new AppleMac("Jakis Apple2", 4, 3.54, true);
    }
}
