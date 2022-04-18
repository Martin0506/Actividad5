package com.actividad5;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Clasificacion extends Animal {

    public void mostrarAnimal(ArrayList<Animal> arreglo) {
        if (arreglo == null) {
            System.out.println("No hay animales");

        } else {
            for (Animal animal : arreglo) {
                System.out.println("nombre: "+ animal.getNombre());
                System.out.println("sonido: "+animal.getSonido());
                System.out.println("alimentacion: "+animal.getAlimentacion());
                System.out.println("habitat: "+animal.getHabitat());
                System.out.println("nombre cientifico: "+ animal.getNombreCientifico());
                System.out.println("\t");
            }
        }
    }
}

