package br.com.mbelo.entidade;

public class Pessoa
{

    private String nome;
    private int idade;
    private char sexo;
    private double altura;
    private double pesoIdeal;

    public Pessoa()
    {

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }    

    public void setSexo(char sexo) {
       this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public String mostrarSaudacao() {
        return "Ola " + nome;
    }

    public double calcularPesoIdeal () {
        return (72.7 * altura) - 58;
    }

}

