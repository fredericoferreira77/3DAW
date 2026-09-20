package br.com.clube;

public class Cliente {

    private String nome;
    private int idade;
    private int matricula;

    private Dependente[] dependentes = new Dependente[3];
    private int qtdeDependentes = 0;

    public Cliente(String nome, int idade) {

        if (nome == null || nome.isEmpty()) {
            this.nome = "(sem nome)";
        } else {
            this.nome = nome;
        }

        if (idade < 0) {
            this.idade = 66;
        } else {
            this.idade = idade;
        }
    
        this.matricula = 1;

    }
    
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getQtdeDependentes() {
        return qtdeDependentes;
    }

    public boolean adicionarDependente(Dependente dep) {

        if (qtdeDependentes >= 3) {
            return false;
        }

        for (int i = 0; i < qtdeDependentes; i++) {
            if (dependentes[i].getNome().equals(dep.getNome())) {
                return false;
            }
        }

        dependentes[qtdeDependentes] = dep;
        qtdeDependentes++;

        return true;
    }
    
    public double getValorMensalidade() {

        double valor;

        if (idade <= 30) {
            valor = 500.00;
        } else if (idade <= 40) {
            valor = 600.00;
        } else if (idade <= 65) {
           valor = 700.00;
        } else {
           valor = 1500.00;
        }

        for (int i = 0; i < qtdeDependentes; i++) {

            if (dependentes[i].getIdade() <= 30) {
                valor += 250.00;
            } else {
                valor += 350.00;
            }
        }
        
        return valor;
    }
}