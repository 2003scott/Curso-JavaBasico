package com.example.Funciones;

/**
 * Crear una funcion que reciba un precio y devuelva el precio con el IVA incluido
 */
public class Funciones {

    public static void main(String[] args) {

        // opcion 1: funcion sin parametros y sin tipo de retorno

        //showMenu();

        // opcion 2: funcion sin parametros y con tipo de retorno

//        String menu = getMenu();
//        System.out.println(menu);
//
//        double price = getPrice();
//        System.out.println(price);

        // opcion 3: funcion con parametros y sin tipo de retorno

//       imprimirSaludo("Scott dev java");

        // opcion 4: funcion con parametros y con tipo de retorno
//        String nombre = "Scott";
//        String apellido = "Angeles";
//        String saludo = obtenerSaludo(nombre, apellido);
//        System.out.println(saludo);

    }
    static String obtenerSaludo(String nombre, String apellido) {
        return "Buenas tarde "+ nombre+" "+apellido;
    }

    static void imprimirSaludo(String msg){
        System.out.println("Buenos dias " + msg);
    }

    static double getPrice(){
        return 100.99;
    }

    static void showMenu(){
        System.out.println("Bienvenidos al E-comerce de zapatillas");
        System.out.println("1- Ver zapatillas");
        System.out.println("2- Comprar zapatillas");
        System.out.println("3- Salir");
    }

    static String getMenu(){
        return "Bienvenidos al E-comerce de zapatillas : \n  1- Ver zapatillas \n 2- Comprar Zapatillas ";
    }
}
