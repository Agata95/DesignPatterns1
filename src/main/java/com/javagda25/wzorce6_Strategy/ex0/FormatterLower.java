package com.javagda25.wzorce6_Strategy.ex0;

public class FormatterLower implements IFormatterCzcionki {

    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.toLowerCase();
    }
}
