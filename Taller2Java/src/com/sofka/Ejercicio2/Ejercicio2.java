package com.sofka.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    private int edad;
    private Scanner dato;

    public void Ejercicio2(){
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
        if (edad < 18) {
            System.out.println("Usted aún es un niño(a)");
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
