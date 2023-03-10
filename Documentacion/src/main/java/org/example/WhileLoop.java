package org.example;

public class WhileLoop {
    public static void main(String[] args) {

        int count = 0;
        while (count<10){
            count++; //condicion
            if (count==6)
                break; // rompe el bucle o flujo de ejecucion
                //continue; salta el valor y continua con la siente iteracion

            System.out.println("Hola mundo num "+count);
        }
        System.out.println("Fin del bucle");

    }
}
