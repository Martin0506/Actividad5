package com.actividad5;


import java.util.ArrayList;
import java.util.List;

public abstract class APP {
    private static Object mostrarAnimal;

    public static void main(String[] args) {

        List<Animal> misaninmales= new ArrayList<>();
        Gato gato = new Gato("miau","carne","selva","Felis silvestris catus");
        misaninmales.add(gato);
        
        mostrarAnimal;
    }
}