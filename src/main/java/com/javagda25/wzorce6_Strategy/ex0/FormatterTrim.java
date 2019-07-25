package com.javagda25.wzorce6_Strategy.ex0;

public class FormatterTrim implements IFormatterCzcionki {

    @Override
    public String zamienTekst(String tekstDoZamiany) {
        return tekstDoZamiany.trim();
    }
}
