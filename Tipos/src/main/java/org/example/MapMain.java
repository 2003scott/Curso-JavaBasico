package org.example;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("74125478","Nombre apellido 1");
        personas.put("74125479","Nombre apellido 2");
        personas.put("74125480","Nombre apellido 3");

        System.out.println(personas);

        // nos saca solo el mapa

        for(String value:personas.values()){
            System.out.println(value);
        }

        // obtemos la clave y el valor

        for(Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey()+" "+pair.getValue());
        }
    }
}
