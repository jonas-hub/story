package br.DigitalHouse.aula09;

import java.util.HashMap;
import java.util.Map;

public class Principal {
    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();

        mapa.put(4, "fizemos 4 gols contra você");
        mapa.put(1, "fizemos 2 gols contra voce");
        mapa.put(2, "fizemos 2 gols contra você");

        mapa.remove(4);

        String basico = mapa.get(2);

        for (Integer chave :mapa.keySet()){
            String valor = mapa.get(chave);
            System.out.println(valor);
        }
    }
}
