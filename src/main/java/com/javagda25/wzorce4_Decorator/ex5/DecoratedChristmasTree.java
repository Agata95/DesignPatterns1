package com.javagda25.wzorce4_Decorator.ex5;

import java.util.Random;

public class DecoratedChristmasTree {
    private final SimpleChristmasTree tree;

    public DecoratedChristmasTree(SimpleChristmasTree tree) {
        this.tree = tree;
    }

    public String printTreeBranch(int i) {
        char[] charTable = tree.printTreeBranch(i).toCharArray();
        Random random = new Random();

        for (int j = 0; j < charTable.length; j++) {
            if (charTable[j] == '*') {
                if (random.nextInt(10) > 6) {
                    charTable[j]='O';
                }
            }
        }
        return new String(charTable);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < tree.getHigh(); i++) {
            builder.append(printTreeBranch(i)).append("\n");
        }
        return builder.toString();
    }
}
