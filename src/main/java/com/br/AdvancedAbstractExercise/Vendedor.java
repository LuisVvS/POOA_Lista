package com.br.AdvancedAbstractExercise;

public class Vendedor extends Funcionario {

    public Vendedor(double salario) {
        super(salario);
    }

    @Override
    public double calcularBonus() {
        return (10.0 / 100) * this.salario;
    }

}
