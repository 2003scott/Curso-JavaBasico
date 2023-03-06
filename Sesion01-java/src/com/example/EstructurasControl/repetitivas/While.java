package com.example.EstructurasControl.repetitivas;

/**
 * Crear un blucle que permita concatenar textos y imprimir el resultado final por consola
 * Concatenar nombres
 */
public class While {

    public static void main(String[] args) {

        int contador = 0;

        while (contador <10){
            String nombre = "Scott";
            contador ++;
            if (contador == 5){
                //break;
                continue;
            }
            System.out.println("valor del contador" + contador);
        }

        //la variable esta fuera del ambito del que la creeo
        //System.out.println(nombre);
    }
}
