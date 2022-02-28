package com.sofka.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    private static Scanner dato;
    private int[] vector = new int[5];

    public void Ejercicio1() {
        dato = new Scanner(System.in);
        limpiaPantalla();
        System.out.println("LLENAR VECTOR DE 5 E IMPRIMIRLO\n");
        creaVector();
        imprimeVector();
        esperar(4);
        limpiaPantalla();
    }

    private static void solicitarDato(int dato) {
        System.out.println("Digite un número ( "+ dato + " ): ");
    }

    private int capturarDatoInteger() {
        return dato.nextInt();
    }

    private void creaVector(){
        for (int i=0; i< vector.length; i++) {
            solicitarDato((i+1));
            vector[i] = capturarDatoInteger();
        }
    }
    private void imprimeVector(){
        for (int i=0; i< vector.length; i++) {
            System.out.println("Posición [ " + i + " ] = " + vector[i]);
        }
    }

    private static void limpiaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void esperar(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            // Mensaje en caso de que falle
        }
    }
}
