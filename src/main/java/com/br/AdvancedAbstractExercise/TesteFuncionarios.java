package com.br.AdvancedAbstractExercise;

public class TesteFuncionarios {
    public static void main(String[] args) {
        Funcionario func1 = new Gerente(5000.0);
        Funcionario func2 = new Vendedor(3000.0);
        System.out.println("Salário total do Gerente: " + func1.calcularBonus()); // 5000 + 1000
        System.out.println("Salário total do Vendedor: " + func2.calcularBonus()); // 3000 + 300
    }

}
