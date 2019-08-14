package br.DigitalHouse.HerançaExem;

public class Principal {

    public static void main(String[] args) {

        Crianca bebe = new Crianca ( "maria", "feminino");

        System.out.println(bebe.getNome() + "\n" + bebe.getSexo() );

        bebe.estudar( true);

        bebe.respirar("Jonas");


    }
}
