package com.example;

import java.util.ArrayList;

public class Ambiente {

    ArrayList<Animal> animal = new ArrayList<>();

    public void adicionarAnimal(Animal cont) {
        animal.add(cont);
    }

    public void removerAnimal(String nome) {
        for (int i = 0; i < animal.size(); i++) {
            if (animal.get(i).getNome().equals(nome)) {
                animal.remove(i);
            }
        }
    }

    public void editarAnimal(String nome, Animal cont) {
        for (int i = 0; i < animal.size(); i++) {
            if (animal.get(i).getNome().equals(nome)) {
                animal.set(i, cont);
            }
        }
    }

}
