package com.example;

import javax.swing.*;

public class App {
    public static void main(String[] args) throws Exception {

        AmbienteCarnivoro ambCar = new AmbienteCarnivoro();
        AmbienteHerbivoro ambHerb = new AmbienteHerbivoro();

        StringBuilder mensagem = new StringBuilder();

        int menu = 0;

        ambCar.setDefault();
        ambHerb.setDefault();

        while (menu != 5) {

            menu = Integer.parseInt(JOptionPane.showInputDialog("##### Menu Zoologico ##### \nEscolha uma das opções:\n" +
                    "1 - Adicione um animal ao seu ambiente na reserva \n2 - Altere as informações de um animal da reserva\n" +
                    "3 - Remova um animal da reserva\n4 - Liste os animais de um ambiente da reserva\n5 - Sair do Zoo"));

            switch (menu) {

                case 1:
                    int tipo_animal = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de animal deseja cadastrar" +
                            " 1 - Carnivoro ou 2 - Herbivoro"));

                    if (tipo_animal == 1) {
                        String nome = JOptionPane.showInputDialog("Cadastro de Carnivoros \nDigite o nome do Animal");
                        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do Animal"));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Animal"));
                        String cor = JOptionPane.showInputDialog("Digite a cor do Animal");

                        Carnivoro carn = new Carnivoro(nome, peso, altura, cor);
                        ambCar.adicionarAnimal(carn);

                    } else {
                        String nome = JOptionPane.showInputDialog("Cadastro de Herbivoro \nDigite o nome do Animal");
                        double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do Animal"));
                        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do animal"));
                        String cor = JOptionPane.showInputDialog("Digite a cor do Animal");

                        Herbivoro herb = new Herbivoro(nome, peso, altura, cor);
                        ambHerb.adicionarAnimal(herb);
                    }

                    break;
                case 2:
                    tipo_animal = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de animal deseja editar" +
                            " 1 - Carnivoro ou 2 - Herbivoro"));

                    String nomeE = JOptionPane.showInputDialog("Editar um Carnivoro \nDigite o nome do Animal a ser editado");

                    if (tipo_animal == 1) {
                        String nomeEditar = JOptionPane.showInputDialog("Digite o nome do Animal");
                        double pesoEditar = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do Animal"));
                        double alturaEditar = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Animal"));
                        String corEditar = JOptionPane.showInputDialog("Digite a cor do animal");

                        Carnivoro carnEditar = new Carnivoro(nomeEditar, pesoEditar, alturaEditar, corEditar);

                        ambCar.editarAnimal(nomeE, carnEditar);
                    } else {;
                        String nomeEditar = JOptionPane.showInputDialog("Digite o nome do Animal");
                        double pesoEditar = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso do Animal"));
                        double alturaEditar = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do Animal"));
                        String corEditar = JOptionPane.showInputDialog("Digite a cor do Animal");

                        Herbivoro herbEditar = new Herbivoro(nomeEditar, pesoEditar, alturaEditar, corEditar);

                        ambHerb.editarAnimal(nomeE, herbEditar);
                    }
                    break;
                case 3:
                    tipo_animal = Integer.parseInt(JOptionPane.showInputDialog("Qual tipo de animal deseja" +
                            " remover 1 - Carnivoro ou 2 - Herbivoro"));
                    if (tipo_animal == 1) {
                        String nomeR = JOptionPane.showInputDialog("Remova um animal do Ambiente Carnivoro\n" +
                                "Digite o nome do Animal a ser removido");
                        ambCar.removerAnimal(nomeR);
                    } else {
                        String nomeR = JOptionPane.showInputDialog("Remova um animal do Ambiente Herbivoro\n" +
                                "Digite o nome do Animal a ser removido");
                        ambHerb.removerAnimal(nomeR);
                    }
                    break;
                case 4:
                    tipo_animal = Integer.parseInt(JOptionPane.showInputDialog("Qual ambiente voce deseja consultar" +
                            " 1 - Carnivoro ou 2 - Herbivoro"));
                    if (tipo_animal == 1) {
                        System.out.println(ambCar.listarAnimalCarnivoro());
                        System.out.println();
                    } else {
                        System.out.println(ambHerb.listarAnimalHerbivoro());
                    }
                    break;
                case 5:
                    mensagem.append("Obrigado por vir ao ZOO Argo!!");
                    JOptionPane.showMessageDialog(null, mensagem);
                    break;
                default:
                    System.out.println("Opção Inválida");

                    break;
            }

        }
    }

}
