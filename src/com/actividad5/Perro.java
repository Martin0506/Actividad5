package com.actividad5;

public class Perro extends Animal implements Caminar,Nadar{
    public Perro(String nombre){
        super(nombre);
        this.sonido = "ladrido";
        this.alimentacion = "carnivora";
        this.habitat = "domestico";
        this.nombreCientifico = "Canis lupus familiaris";

    }

    @Override
    public String caminar() {
        return "El Perro camina";
    }

    @Override
    public String nadar() {
        return "El Perro nada";
    }
}
