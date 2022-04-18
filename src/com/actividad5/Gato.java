package com.actividad5;

public class Gato extends Animal implements Caminar, Nadar {

    public Gato(String nombre) {
        super(nombre);
        this.sonido = "maullido";
        this.alimentacion = "carne";
        this.habitat = "selva";
        this.nombreCientifico = " Felis silvestris catuss";
    }

    @Override
    public String caminar() {
        return "El Gato camina";
    }

    @Override
    public String nadar() {
        return "El Gato nada";
    }
}
