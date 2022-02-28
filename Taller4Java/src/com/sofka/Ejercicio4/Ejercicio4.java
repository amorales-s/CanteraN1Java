package com.sofka.Ejercicio4;

public class Ejercicio4 {
    private int[][] matriz = new int[4][5];


    public void Ejercicio4() {
        limpiaPantalla();
        System.out.println("--- IMPRIME MATRIZ BIDIMENSIONAL - EN FORMA CULEBRA ---\n");
        llenaMatriz();
        imprimeMatriz();
        esperar(4);
    }

    private void llenaMatriz(){
        matriz[0][0] = 1;
        matriz[0][1] = 2;
        matriz[0][2] = 3;
        matriz[0][3] = 4;
        matriz[0][4] = 5;
        matriz[1][0] = 6;
        matriz[1][1] = 7;
        matriz[1][2] = 8;
        matriz[1][3] = 9;
        matriz[1][4] = 10;
        matriz[2][0] = 11;
        matriz[2][1] = 12;
        matriz[2][2] = 13;
        matriz[2][3] = 14;
        matriz[2][4] = 15;
        matriz[3][0] = 16;
        matriz[3][1] = 17;
        matriz[3][2] = 18;
        matriz[3][3] = 19;
        matriz[3][4] = 20;
    }

    private void imprimeMatriz(){
        for (int i=0; i<= 3; i++) {
            izqDer(i);
            derIzq(i);
            System.out.println(" ");
        }
    }

    private void izqDer(int fila){
        if((fila % 2) == 0){
            for (int j=0; j<=4; j++) {
                System.out.print(matriz[fila][j] + " ");
            }
        }
    }

    private void derIzq(int fila){
        if(fila % 2 !=0){
            for (int j=4; j>=0; j--) {
                System.out.print(matriz[fila][j] + " ");
            }
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
