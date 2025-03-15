package com.br.BasicAbstractExercise;
import java.lang.Math;

public class Circulo extends Forma{
    protected double raio;

    public Circulo(double raio){
        this.raio= raio;
    }

    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;

    }
}
