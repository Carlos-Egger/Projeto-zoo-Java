package com.example;

public class Carnivoro extends Animal {

    public Carnivoro(String nome, double peso, double altura, String cor) {
        super(nome, peso, altura, cor);

    }

    public double andar(double peso) {
        return 12 + (peso * 0.01);
    }

    public double correr(double peso) {
        return 60 + (peso * 0.01);

    }

    public double comer(double peso) {
        return peso * 0.1;
    }

}
