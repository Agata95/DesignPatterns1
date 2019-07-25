package com.javagda25.wzorce6_Strategy.ex0;

public class FormatterSplitter implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        StringBuilder builder = new StringBuilder();
        char[] tableOfChars = tekstDoZamiany.toCharArray();
        for (int i = 0; i < tableOfChars.length; i++) {
            builder.append(tableOfChars[i]+ " ");
        }
        return builder.toString();
    }
}
