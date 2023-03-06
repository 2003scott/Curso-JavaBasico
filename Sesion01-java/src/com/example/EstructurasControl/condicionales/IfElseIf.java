package com.example.EstructurasControl.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "Lunes";

        // ejemplos comparar
        boolean resultadoComprarNuns= 5 == 5;
        boolean resultado = dia.equals("Lunes");

        if(dia.equals("Martes")){
            System.out.println("Es dia Martes mi rey");
        }else if(dia.equals("Lunes")){
            System.out.println("Es dia Lunes dia de incio de semana");
        }
    }
}
