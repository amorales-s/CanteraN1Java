package com.sofka.Ejercicio5;
import java.util.Scanner;

public class Ejercicio5 {
    private static Scanner dato;
    private String[][] matriz = new String[10][10];
    private int[][] matrizCalculada = new int[10][10];

    public void Ejercicio5() {
        dato = new Scanner(System.in);
        limpiaPantalla();
        System.out.println("--- IMPRIME MATRIZ 10x10 - MOSTRAR RESULTADO CALDULADO ---\n");
        imprimirMatriz();
    }

    private void imprimirMatriz(){
        int f1,c1, opcion;
        String palabra, f2, c2;
        opcion=0;
        do{
            for (int i = 0; i <= 9; i++) {
                System.out.print("    " + i);
            }
            System.out.println(" ");
            for (int i = 0; i <= 9 ; i++) {
                System.out.print(i + "  ");
                for (int j = 0; j <= 9; j++) {
                    f1=i+1;
                    c1=j+1;
                    f2=String.valueOf(f1);
                    c2=String.valueOf(c1);
                    palabra = f2+"x";
                    palabra = palabra + c2;
                    matriz[i][j]=palabra;
                    System.out.print(matriz[i][j] +"  ");
                }
                System.out.println(" ");
            }
            calcularMatriz();
            System.out.println(" ");
            esperar(3);
        }while(opcion==4);
    }

    private static void solicitarDatos(String estado) {
        System.out.println("Digite la " + estado + ": ");
    }

    private int capturarDatoInteger() { return dato.nextInt(); }

    private void calcularMatriz(){
        for (int i = 0; i <= 9 ; i++) {
            for (int j = 0; j <= 9; j++) {
                matrizCalculada[i][j]=(i+1)*(j+1);
            }
        }
        imprimirMatrizCalculada();
    }

    private void imprimirMatrizCalculada(){
        int fila, columna;

        solicitarDatos("Fila");
        fila=capturarDatoInteger();
        solicitarDatos("Columna");
        columna=capturarDatoInteger();
        if(fila>=0 && fila<=9 && columna>=0 && columna<=9){
            System.out.println("El resultado en la matriz [" + fila + "," + columna + "] es: " + matrizCalculada[fila][columna]);
        }else {
            System.out.println("ERROR ... Los valores para fila y columna deben estar entre 0 - 9");
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
