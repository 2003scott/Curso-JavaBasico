package org.example;

public class FoorLoop {
    public static void main(String[] args) {
        // inicio    parada    paso
        for (int i = 0;i <=10; i++){

            if (i ==6)
                continue;
            System.out.println(i +"Hola mundo");
        }
        System.out.println("fin");

    }

}
