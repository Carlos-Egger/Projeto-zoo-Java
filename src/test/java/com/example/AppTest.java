package com.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testeConstrutorAnimalComMetodoDaHeranca() {

        Carnivoro tigre = new Carnivoro("Tigre", 190.0, 1.80, "Listrado");

        tigre.andar(tigre.getPeso());

        assertEquals(tigre.andar(tigre.getPeso()), 13.9, 5);

        assertEquals(tigre.comer(tigre.getPeso()), 19.0, 7);
        assertNotSame(tigre.getCor(), "Azul");


        Herbivoro coelho = new Herbivoro("Coelho", 5, 0.30, "Branco");

        coelho.andar(coelho.getPeso());

        assertEquals(coelho.andar(coelho.getPeso()), 20.5, 3);

        Assert.assertNotNull(coelho);
        assertEquals(coelho.correr(coelho.getPeso()), 40.5, 7);

        Assert.assertNotSame(coelho.comer(coelho.getPeso()), 15);



    }


}
