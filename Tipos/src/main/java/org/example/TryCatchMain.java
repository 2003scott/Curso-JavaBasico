package org.example;

public class TryCatchMain {

    public static void main(String[] args) {

        try {
            int result = 5 / 5;
        }catch (ArithmeticException e) {
            // esto registra el fallo log
            e.printStackTrace();
        }finally {
            //Este codigo se registra si o si
            System.out.println("Cierre de recursos");
        }

        System.out.println("Fin");
    }
}
