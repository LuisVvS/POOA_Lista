package com.br;

public class Cachorro extends Animal{

    public Cachorro(String nome){
        super(nome);

    }

   public void latir(){
    System.out.println(nome + " esta latindo");
   }

}