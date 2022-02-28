package com.sofka;

import com.sofka.Ejercicio1.Ejercicio1;
import com.sofka.Ejercicio2.Ejercicio2;
import com.sofka.Ejercicio3.Ejercicio3;
import com.sofka.Ejercicio4.Ejercicio4;
import com.sofka.Ejercicio5.Ejercicio5;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    private static boolean salir = true;
    private static int opcion;

    public static void main(String[] args) throws IOException {
	do {
        limpiaPantalla();
        menu();
        opcion = capturarOpcion();
        salir = evaluarOpcion(opcion);
    }while (salir==true);
    }

    private static void menu() {
        System.out.println("--------------- MENU ---------------");
        System.out.println("Escoja el Ejercicio a desarrollar del Taller 1:");
        System.out.println("[1]. Ejercicio 1");
        System.out.println("[2]. Ejercicio 2");
        System.out.println("[3]. Ejercicio 3");
        System.out.println("[4]. Ejercicio 4");
        System.out.println("[5]. Ejercicio 5");
        System.out.println("[0]. Salir del Taller 1");
    }

    private static int capturarOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                Ejercicio1 e1 = new Ejercicio1();
                e1.Ejercicio1();
                return true;
            // break;
            case 2:
                Ejercicio2 e2 = new Ejercicio2();
                e2.Ejercicio2();
                return true;
            // break;
            case 3:
                Ejercicio3 e3 = new Ejercicio3();
                e3.Ejercicio3();
                return true;
            // break;
            case 4:
                Ejercicio4 e4 = new Ejercicio4();
                e4.Ejercicio4();
                return true;
            // break;
            case 5:
                Ejercicio5 e5 = new Ejercicio5();
                e5.Ejercicio5();
                return true;
            // break;
            case 0:
                return false;
            // break;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }

    private static void limpiaPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}

