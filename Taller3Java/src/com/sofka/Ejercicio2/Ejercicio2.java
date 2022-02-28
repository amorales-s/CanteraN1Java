package com.sofka.Ejercicio2;

public class Ejercicio2 {

    public void Ejercicio2() {
        int altura;
        int a;
        int espacio;
        int asterisco;
        altura = 10;
        a=1;
        limpiaPantalla();
        while(a <= altura){
            for (espacio=1; espacio <= (altura-a); espacio++){
                System.out.print(" ");
            }
            for (asterisco=1; asterisco <= a; asterisco++){
                System.out.print("*");
            }
            System.out.println(" ");
            a=a+1;
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
