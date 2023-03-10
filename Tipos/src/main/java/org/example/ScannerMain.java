package org.example;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un nombre :");
        String nombre = scanner.nextLine();
        System.out.println("El nombre introducido es: "+nombre);
        System.out.println("Ingresa tu Edad :");
        int edad = scanner.nextInt();
        System.out.println("Tu edad Es : "+edad);
    }
}
