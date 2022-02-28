package com.sofka.Ejercicio4;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class Ejercicio4 {
    private static Scanner dato;

    public void Ejercicio4() {
        dato = new Scanner(System.in);
        int contador;
        int num;
        num=0;
        limpiaPantalla();
        System.out.println("\n------------------------  TABLAS DE MULTIPLICAR  ---------------------");
        System.out.println("\nIngrese un número del 1-10 (para generar la tabla de multiplicar): ");
        num = capturarDatoInteger();
        for(contador=1; contador<=10; contador++){
            System.out.println(contador + " X " + num + " = " + (contador*num));
        }
        esperar(4);
    }

    private int capturarDatoInteger() {
        return dato.nextInt();
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
