package com.javagda25.wzorce4_Decorator.ex5;

public class Main {
    public static void main(String[] args) {
        SimpleChristmasTree tree = SimpleChristmasTree.createTree(9);
        System.out.println(tree);

        DecoratedChristmasTree newTree = new DecoratedChristmasTree(tree);
        System.out.println(newTree);
    }
}
