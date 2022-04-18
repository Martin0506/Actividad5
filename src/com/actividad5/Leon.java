package com.actividad5;

public class Leon extends Animal implements Caminar, Nadar{
    public Leon(String nombre){
        super(nombre);
        this.sonido = "rugido";
        this.alimentacion = "carnivora";
        this.habitat = "pradera";
        this.nombreCientifico = "Panthera leo";

    }

    @Override
    public String caminar() {
        return "El Leon camina";
    }

    @Override
    public String nadar() {
        return "El Leon nada";
    }
}
