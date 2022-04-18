package com.actividad5;


import java.util.ArrayList;
import java.util.List;

public  class APP {

    public static void main(String[] args) {

        List<Animal> misaninmales= new ArrayList<>();
        Gato gato = new Gato("Gato","maullido","carne","selva","Felis silvestris catus");
        misaninmales.add(gato);
        Avestruz avestruz = new Avestruz("Avestruz","bravura","bravura","llanuras africanas","Struthio camelus");
        misaninmales.add(avestruz);
        Leon leon = new Leon("leon", "rugido","carnívora","pradera","Panthera leo");
        misaninmales.add(leon);
        Loro loro = new Loro("Loro","grito","frutas","regiones con clima cálido","Poicephalus");
        misaninmales.add(loro);
        Murcielago murcielago = new Murcielago("Murcielago","ultrasónicos","insectos","bosques tropicales y templados","Craseonycteris Thonglongyai");
        misaninmales.add(murcielago);
        Perro perro = new Perro("Perro","ladrido","carnívora","doméstico","Canis lupus familiaris");
        misaninmales.add(perro);

        mostrarAnimal;

    }
}