package com.br;

public class Triangulo extends Forma {
    public int altura;
    public int largura;

    public Triangulo(int altura, int largura) {
        this.altura = altura;
        this.largura = largura;
    }

    @Override
    public void calcularArea() {
        System.out.println("A area do Triangulo é de: " + altura * largura);
    }

}
