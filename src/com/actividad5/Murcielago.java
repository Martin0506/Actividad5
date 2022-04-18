package com.actividad5;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Murcielago extends Animal implements Volar,Caminar{
    public Murcielago(String nombre){
        super(nombre);
        this.sonido = "ultrasonido";
        this.alimentacion = "insectos";
        this.habitat = "bosques tropicales y templados";
        this.nombreCientifico = "Craseonycteris Thonglongyai";

    }

    @Override
    public String caminar() {
        return "El Murcielago camina";
    }

    @Override
    public String volar() {
        return "El Murcielago vuela";
    }
}
