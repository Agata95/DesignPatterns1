package com.javagda25.wzorce6_Strategy.ex0;

public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.setiFormatterCzcionki(new FormatterInverter());
        printer.formatuj("DUZE male DUZE male.");
        printer.setiFormatterCzcionki(new FormatterLower());
        printer.formatuj("COS COS COS");
        printer.setiFormatterCzcionki(new FormatterUpper());
        printer.formatuj("male litery");
        printer.setiFormatterCzcionki(new FormatterTrim());
        printer.formatuj("   Mmmmmm bvhsi vndso    ");
        printer.setiFormatterCzcionki(new FormatterSplitter());
        printer.formatuj("Dodaj wszędzie SPACJE!");
    }
}
