package com.example;

public class AmbienteHerbivoro extends Ambiente {

    Herbivoro herb = new Herbivoro("", 0, 0, "");

    public AmbienteHerbivoro() {
        super();
    }

    public void setDefault() {
        Herbivoro antilope = new Herbivoro("Antílope", 53, 0.9, "Alaranjado");
        Herbivoro zebra = new Herbivoro("Zebra", 235, 2.0, "Preto e Branco");
        Herbivoro bufalo = new Herbivoro("Búfalo", 860, 1.7, "Preto");
        adicionarAnimal(antilope);
        adicionarAnimal(zebra);
        adicionarAnimal(bufalo);
    }

    public String listarAnimalHerbivoro() {
        String saida = "";

        for (Animal cont : animal) {
            saida += cont.Imprimir() + "\nO animal anda a " + herb.andar(cont.getPeso())
                    + " quilometros por hora\nEle corre " + herb.correr(cont.getPeso())
                    + " quilometros por hora\nEle come "
                    + herb.comer(cont.getPeso()) + " quilos de vegetais ao dia.\n\n";
        }
        return saida;

    }

}
