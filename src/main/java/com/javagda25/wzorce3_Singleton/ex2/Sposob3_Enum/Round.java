package com.javagda25.wzorce3_Singleton.ex2.Sposob3_Enum;

import com.javagda25.wzorce3_Singleton.ex2.Sposob2_Lazy.MySettings2;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@Getter
@Setter
public class Round {
    private int number1;
    private int number2;
    private char sign;

    public Round() {
        number1 = new Random().nextInt(MySettings2.INSTANCE.getRange1());
//        number1 = new Random().nextInt(MySettings3.INSTANCE.getRange1());
        number2 = new Random().nextInt(MySettings2.INSTANCE.getRange2());
//        number2 = new Random().nextInt(MySettings3.INSTANCE.getRange2());
        int singnsSize = MySettings2.INSTANCE.getSigns().length();
//        int singnsSize = MySettings3.INSTANCE.getSigns().length();
        sign = MySettings2.INSTANCE.getSigns().charAt(new Random().nextInt(singnsSize));
//        sign = MySettings3.INSTANCE.getSigns().charAt(new Random().nextInt(singnsSize));
    }

    public boolean validate(int userResult) {
        if (sign == '+') {
            return (number1 + number2) == userResult;
        } else if (sign == '-') {
            return (number1 - number2) == userResult;
        } else if (sign == '*') {
            return (number1 * number2) == userResult;
        } else if (sign == '/') {
            return (number1 / number2) == userResult;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Round{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", sign=" + sign +
                '}';
    }
}
