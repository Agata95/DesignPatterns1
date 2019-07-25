package com.javagda25.wzorce5_Behavioral.example.vol4;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class News {
    private String wiadomosc;

    // 0 niski priorytet (małe zainteresowanie)
    // 10 wysoki priorytet
    private int poziomWiadomosci;
}
