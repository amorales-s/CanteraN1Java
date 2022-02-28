package com.sofka.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    private int[] vector = new int[20];
    private int[] par = new int[20];
    private int[] impar = new int[20];

    public void Ejercicio2() {
        limpiaPantalla();
        System.out.println("NUMEROS PARES E IMPARES, ALEATORIOS 1-100\n");
        creaVector();
        imprimePares(vector);
        imprimeImpares(vector);
    }

    private void creaVector(){
        System.out.println("--- Vector con números aleatorios de 1 - 100 ---");
        for (int i=0; i< vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
            System.out.print(" "+vector[i]);
        }
    }

    private void imprimePares(int[] vectorP) {
        System.out.println("\n\n--- Números PARES en el Vector ---");
        for (int i = 0; i < vectorP.length; i++) {
            if(vectorP[i] % 2 == 0){
                System.out.print(" " + vectorP[i] + ",");
            }
        }
    }

    private void imprimeImpares(int[] vectorI) {
        System.out.println("\n\n--- Números IMPARES en el Vector ---");
        for (int i = 0; i < vectorI.length; i++) {
            if(vectorI[i] % 2 != 0){
                System.out.print(" " + vectorI[i] + ",");
            }
        }
        esperar(4);
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
