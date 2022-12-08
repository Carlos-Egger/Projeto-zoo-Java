package com.example;

public abstract class Animal {

    private String nome;
    private double peso;
    private double altura;
    private String cor;

    public Animal(String nome, double peso, double altura, String cor) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }


    public String Imprimir() {
        return "\nO animal é " + getNome() + "\nSeu peso é " + getPeso() + "\nSua altura é "
                + getAltura() + "\nSua cor é " + getCor() + ".";
    }

}
