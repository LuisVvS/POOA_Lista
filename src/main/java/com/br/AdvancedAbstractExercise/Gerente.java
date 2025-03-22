package com.br.AdvancedAbstractExercise;

public class Gerente extends Funcionario {

    public Gerente(double salario) {
        super(salario);
    }

    @Override
    public double calcularBonus() {
        return 20.0/100 * this.salario;
    }

}
