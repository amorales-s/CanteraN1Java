package com.sofka.Ejercicio1;

public class Ejercicio1 {

    public void Ejercicio1() {
        int altura;
        int a;
        int b;
        altura = 10;

        for (a = 1; a <= altura; a++) {
            for (b = 1; b <= a; b++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
