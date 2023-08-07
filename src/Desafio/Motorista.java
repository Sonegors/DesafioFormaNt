package Desafio;

public class Motorista extends Funcionario {
    protected String cnh;
    protected String placaCarro;

    public Motorista(String nome, String cpf, String rg, int idade, String cargo, double salario, String cnh, String placaCarro) {
        super(nome, cpf, rg, idade, cargo, salario);
        this.cnh = cnh;
        this.placaCarro = placaCarro;
    }
}
