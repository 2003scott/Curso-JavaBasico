package com.example.EstructurasControl.repetitivas;

public class For {

    public static void main(String[] args) {

        for (int i = 0 ;i<=8; i++){
            System.out.println("Soy scott usando un for"+i);
        }

        String[] nombres = {"pepe","Juanito","Ruperta"};

        for (int i = 0 ;i < nombres.length ;i++){
            System.out.println(nombres[i]);
        }

        int suma=0;

        int[] numeros = {6,5,2};
        for (int i = 0 ;i < numeros.length ;i++){
            suma+=numeros[i];
        }
        System.out.println(suma);

    }
}
