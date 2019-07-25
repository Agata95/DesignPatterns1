package com.javagda25.wzorce6_Strategy.ex0;

public class FormatterInverter implements IFormatterCzcionki {
    @Override
    public String zamienTekst(String tekstDoZamiany) {
        StringBuilder builder = new StringBuilder();
        char[] tableOfChars = tekstDoZamiany.toCharArray();
        for (int i = 0; i < tableOfChars.length; i++) {
            if (Character.isUpperCase(tableOfChars[i])) {
                builder.append(Character.toLowerCase(tableOfChars[i]));
            } else {
                builder.append(Character.toUpperCase(tableOfChars[i]));
            }
        }
        return builder.toString();
    }
}
