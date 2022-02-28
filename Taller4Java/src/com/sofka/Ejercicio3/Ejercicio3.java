package com.sofka.Ejercicio3;

public class Ejercicio3 {

    public void Ejercicio3() {
        limpiaPantalla();
        System.out.println("IMPRIME NUMEROS PRIMOS DE 1 A 1000\n");
        generarPrimos();
    }

    private void generarPrimos(){
        int contador1;
        int contador2;
        int numeros = 1000;
        int i=1;
        while(i <= numeros){
            contador1=1;
            contador2=0;
            while(contador1<=i){
                if((i % contador1) == 0){
                    contador2 = contador2 + 1;
                }
                contador1 = contador1 + 1;
            }
            imprimirPrimos(contador2,i);
            i = i+1;
        }
        System.out.println("\n");
        esperar(4);
    }

    private void imprimirPrimos(int contador, int numeroP){
        if(contador == 2){
            System.out.print(numeroP + " ");
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
