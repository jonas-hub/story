package br.DigitalHouse.aula09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Diciionario {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(0, "Ovos");
        mapa.put(1, "Agua");
        mapa.put(2, "Escopeta");
        mapa.put(3, "Cavalo");
        mapa.put(4, "Dentista");
        mapa.put(5, "fogo");

        for (Integer chave :mapa.keySet()) {
            String valor = mapa.get(chave);
            System.out.println(valor);


        }
    }
}
