package Desafio;

public class Funcionario extends Pessoa {
    protected String cargo;
    protected double salario;

    public Funcionario(String nome, String cpf, String rg, int idade, String cargo, double salario) {
        super(nome, cpf, rg, idade);
        this.cargo = cargo;
        this.salario = salario;
    }
}
