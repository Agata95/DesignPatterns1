package com.javagda25.wzorce6_Strategy.ex0;

public class Printer {
    private IFormatterCzcionki iFormatterCzcionki;
//
//    public Printer(IFormatterCzcionki iFormatterCzcionki) {
//        this.iFormatterCzcionki = iFormatterCzcionki;
//    }

    public void setiFormatterCzcionki(IFormatterCzcionki iFormatterCzcionki) {
        this.iFormatterCzcionki = iFormatterCzcionki;
    }

    public void formatuj(String tekst){
        System.out.println(iFormatterCzcionki.zamienTekst(tekst));
    }
}
