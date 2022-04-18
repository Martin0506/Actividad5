package com.actividad5;

public class Loro extends Animal implements Volar,Caminar{
    public Loro(String nombre){
        super(nombre);
        this.sonido = "grito";
        this.alimentacion = "frutas";
        this.habitat = "regiones con clima calido";
        this.nombreCientifico = "Poicephalus";    }
    @Override
    public String caminar() {
        return "El Loro camina";
    }

    @Override
    public String volar() {
        return "El Loro vuela";
    }
}
