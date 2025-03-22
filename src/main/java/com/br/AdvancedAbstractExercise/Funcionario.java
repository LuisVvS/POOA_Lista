package com.br.AdvancedAbstractExercise;

public abstract class Funcionario {
    protected double salario;

    public Funcionario(double salario) {
        this.salario=salario;
    }

    public abstract double calcularBonus();

    public double calcularSalarioTotal(){
        return this.salario + calcularBonus();
    }

    public double mostra(){
        return this.salario;
    }
    
}
