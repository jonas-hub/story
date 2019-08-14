package br.DigitalHouse.aula09;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class MapLista {

    public static void main(String[] args) {

        List<String> lista = new ArrayList<>();

        lista.add("Corinthians");
        lista.add("Saopaulo");
        lista.add("Palmeiras");
        lista.add("santos");
        lista.add("atletico");
        lista.add("flamengo");

        lista.remove(1);

        for (String Valor : lista) {
            System.out.println(Valor);
        }
    }
}