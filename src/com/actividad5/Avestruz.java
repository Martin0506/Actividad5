package com.actividad5;

public class Avestruz extends Animal implements Caminar{
    public Avestruz(String nombre) {
        super(nombre);
        this.sonido = " bravura";
        this.alimentacion = "flores y frutos";
        this.habitat = "llanuras africanas";
        this.nombreCientifico = "Struthio camelus";

    }

    @Override
    public String caminar() {
        return "El Avestruz camina";
    }
}
