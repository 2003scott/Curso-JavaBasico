package com.example.TipoDatos;

public class Operadores {
    public static void main(String[] args) {

        // aritmetica

        int numero1 = 10;
        int numero2 = 20;

        int suma = numero1 + numero2;

        System.out.println(suma);
        System.out.println(numero1+numero2+5.77);

        int resultadoResta = numero1 - numero2;

        System.out.println(resultadoResta);

        // compracion
        /*
        > mayor que
        < menor que
        >= mayor o igual que
        <= menor o igual que
        * */

        boolean bool1 = numero1 > numero2; // false
        System.out.println(bool1);

        boolean bool2 = numero1 < numero2; // true
        System.out.println(bool2);

        /*
        Logicos
        and &&
        or ||
        */

        boolean resultado3 = numero1 > 5 && numero1 < 30;

        int edad = 17;

        boolean carnetJover = edad > 15 && edad < 26;

    }
}
