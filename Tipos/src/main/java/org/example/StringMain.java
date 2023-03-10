package org.example;

public class StringMain {

    public static void main(String[] args) {

        // la clase String

        /*
            length()
            startWith("")
            indexof("")
            subString(1,5)
            trin()
            equals()
            compareTo
        * */

        String mensaje = "  Hola mundo  ";

        System.out.println(mensaje.length());
        String mensajeMay = mensaje.toUpperCase();
        System.out.println(mensajeMay);
        System.out.println(mensajeMay.trim());
        mensajeMay = mensajeMay.trim();

        String otro = "HoLA MUNDO";
        if (mensajeMay.equals(otro)){
            System.out.println("Verdadero");
        }else{
            System.out.println("No coinciden");
        }
    }
}
