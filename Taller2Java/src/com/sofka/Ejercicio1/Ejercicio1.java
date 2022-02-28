package com.sofka.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

    private int edad;
    private Scanner dato;

    public void Ejercicio1(){
        dato = new Scanner(System.in);
        solicitarEdad();
        edad = capturarDatoInt();
        imprimir();
    }

    private void solicitarEdad(){
        System.out.println("Digite la Edad en años: ");
    }

    private int capturarDatoInt(){
        return dato.nextInt();
    }

    private void imprimir(){
        if (edad >= 18) {
            System.out.println("Usted es mayor de edad");
        }
        esperar(3);

    }

    public void esperar (int segundos) {
        try {
            Thread.sleep (segundos*1000);
        } catch (Exception e) {
            // Mensaje en caso de que falle
        }
    }

}
