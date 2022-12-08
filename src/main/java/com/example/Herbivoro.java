package com.example;

public class Herbivoro extends Animal {

    public Herbivoro(String nome, double peso, double altura, String cor) {
        super(nome, peso, altura, cor);

    }

    public double andar(double peso) {
        return 20 + (peso * 0.01);
    }

    public double correr(double peso) {
        return 40 + (peso * 0.01);

    }

    public double comer(double peso) {
        return peso * 0.05;
    }

}
