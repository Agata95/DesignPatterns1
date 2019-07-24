package com.javagda25.wzorce4_Decorator.ex5;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public final class SimpleChristmasTree {
    private int high;

    public static SimpleChristmasTree createTree(int high) {
        return new SimpleChristmasTree(high);
    }

    public String printTreeBranch(int branch) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < high - branch; i++) {
            stringBuilder.append(" ");
        }
        for (int i = 0; i < branch * 2; i++) {
            stringBuilder.append("*");
        }
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < high; i++) {
            builder.append(printTreeBranch(i)).append("\n");
        }
        return builder.toString();
    }
}
