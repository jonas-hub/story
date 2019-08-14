package br.DigitalHouse.HerançaExem;

public abstract class Pessoa {

    private String nome;
    private String sobreNome;
    private String cpf;
    private String sexo;

    public  Pessoa(String novoNome, String novoSexo){
        nome = novoNome;
        sexo = novoSexo;
    }

    public abstract void respirar(String nome);

    public void cadstroPessoa(String nome, String sobreNome) {
        System.out.println("dados da pessoa" + nome + " " + sobreNome);
    }
    public void cadastroPessoa(String nome, String sobreNome, String sexo) {
        System.out.println("dados atualizados: " + nome + " e " + sexo);
    }
public boolean estudar(boolean status){
        return false;
}
    public String getNome(){
        return nome;
    }
    public String getSobreNome(){
        return sobreNome;
    }
    public String getCpf(){
        return cpf;
    }
    public String getSexo(){
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }
}
