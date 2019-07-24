package com.javagda25.wzorce3_Singleton.ex2.Sposob2_Lazy;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MySettings2 {
    public static MySettings2 INSTANCE;

    private int numberOfRounds;
    private int range1;
    private int range2;
    private String signs;

    public MySettings2(int numberOfRounds, int range1, int range2, String signs) {
        this.numberOfRounds = numberOfRounds;
        this.range1 = range1;
        this.range2 = range2;
        this.signs = signs;
    }

    public static MySettings2 getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new MySettings2(10, 100, 90, "+-/*");
        }
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "MySettings2{" +
                "numberOfRounds=" + numberOfRounds +
                ", range1=" + range1 +
                ", range2=" + range2 +
                ", signs='" + signs + '\'' +
                '}';
    }
}
