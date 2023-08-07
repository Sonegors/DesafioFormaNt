package Desafio;


public class Main {
    public static void main(String[] args) {
        Motorista motorista1 = new Motorista("Juliano", "814.643.630-72", "1084916806", 43, "Motorista", 2500.0, "12345678", "ENT7J19");
        Motorista motorista2 = new Motorista("Valdir", "999.888.777-66", "123456789", 18, "Motorista", 2800.0, "87654321", "ENT7666");

        System.out.println("Motorista 1:");
        System.out.println("Nome: " + motorista1.nome);
        System.out.println("Cargo: " + motorista1.cargo);
        System.out.println("Placa do Carro: " + motorista1.placaCarro);
        System.out.println();

        System.out.println("Motorista 2:");
        System.out.println("Nome: " + motorista2.nome);
        System.out.println("Cargo: " + motorista2.cargo);
        System.out.println("Placa do Carro: " + motorista2.placaCarro);
    }
}
