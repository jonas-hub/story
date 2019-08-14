package br.DigitalHouse.HerançaExem;

public class Crianca extends Pessoa {
    public Crianca(String novoNome, String novoSexo){
        super(novoNome, novoSexo);
    }

    @Override
    public void respirar(String nome) {

    }


    @Override
public boolean estudar(boolean status){
        if (status){
            System.out.println("A criança esta estudando! =)");
            return true;
        }else{
            System.out.println("Não tem nimguem estudando! =(");
            return false;
        }
}
}
