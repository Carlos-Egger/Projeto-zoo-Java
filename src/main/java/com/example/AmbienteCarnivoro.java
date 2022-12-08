package com.example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class AmbienteCarnivoro extends Ambiente {

    JSONObject jsonObject;
    // Cria o parse de tratamento
    JSONParser parser = new JSONParser();
    // Variaveis que irao armazenar os dados do arquivo JSON
    Carnivoro carn = new Carnivoro("", 0, 0, "");

    public AmbienteCarnivoro() {
        super();
    }

    public void setDefault() throws FileNotFoundException, IOException, ParseException {

        JSONArray animalArquivo = (JSONArray) parser
                .parse(new InputStreamReader(new FileInputStream("animal_carnivoro.json"), "UTF-8"));
        for (Object o : animalArquivo) {
            JSONObject ani_ = (JSONObject) o;
            // Salva nas variaveis os dados retirados do arquivo
            String nome = ani_.get("nome").toString();
            Double peso = Double.parseDouble(ani_.get("peso").toString());
            Double altura = Double.parseDouble(ani_.get("altura").toString());
            String cor = ani_.get("cor").toString();

            Animal animal = new Carnivoro(nome, peso, altura, cor);
            adicionarAnimal(animal);
        }

    }

    public String listarAnimalCarnivoro() {
        String saida = "";
        for (Animal cont : animal) {
            saida += cont.Imprimir() + "\nO animal anda a " + carn.andar(cont.getPeso())
                    + " quilometros por hora\nEle corre a " + carn.correr(cont.getPeso())
                    + " quilometros por hora\nEle come "
                    + carn.comer(cont.getPeso()) + " quilos de carne ao dia.\n\n";
        }
        return saida;
    }

}
