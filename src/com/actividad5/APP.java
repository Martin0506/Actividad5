package com.actividad5;


import java.util.ArrayList;
import java.util.List;

public  class APP {
    static Clasificacion miclasificacion = new Clasificacion();
    public static void main(String[] args) {

        List<Animal> misaninmales= new ArrayList<>();
        Gato gato = new Gato("Gato");
        misaninmales.add(gato);
        Avestruz avestruz = new Avestruz("Avestruz");
        misaninmales.add(avestruz);
        Leon leon = new Leon("leon");
        misaninmales.add(leon);
        Loro loro = new Loro("Loro");
        misaninmales.add(loro);
        Murcielago murcielago = new Murcielago("Murcielago");
        misaninmales.add(murcielago);
        Perro perro = new Perro("Perro");
        misaninmales.add(perro);

        miclasificacion.mostrarAnimal((ArrayList<Animal>) misaninmales);

        System.out.println("Perro: ");
        System.out.println(perro.caminar());
        System.out.println(perro.nadar());
        System.out.println("\t");
        System.out.println("Avestruz: ");
        System.out.println(avestruz.caminar());
        System.out.println("\t");
        System.out.println("Gato: ");
        System.out.println(gato.caminar());
        System.out.println(gato.nadar());
        System.out.println("\t");
        System.out.println("Leon: ");
        System.out.println(leon.caminar());
        System.out.println(leon.nadar());
        System.out.println("\t");
        System.out.println("Loro: ");
        System.out.println(loro.caminar());
        System.out.println(loro.volar());
        System.out.println("\t");
        System.out.println("Murcielago: ");
        System.out.println(murcielago.caminar());
        System.out.println(murcielago.volar());

    }

}