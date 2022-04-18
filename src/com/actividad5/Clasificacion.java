package com.actividad5;

import java.util.ArrayList;

public class Clasificacion {
    private ArrayList<Animal> listaAnimales;

    public ArrayList<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(ArrayList<Animal> listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public void mostrarAnimal() {
        if (listaAnimales == null) {
            System.out.println("No hay animales");

        } else {
            for (Animal animal : listaAnimales) {
                System.out.println(listaAnimales);
            }
        }
    }
}

