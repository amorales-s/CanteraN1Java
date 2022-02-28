package com.sofka.Ejercicio9;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio9 {
    private static Scanner dato;
    private static double alto;
    private static double largo;
    private static double ancho;
    private static double total1;
    private static double total2;
    private static double total3;
    private static double base1;
    private static double base2;
    private static boolean salir = true;
    private static int opcion;

    public void Ejercicio9() throws IOException {
        dato = new Scanner(System.in);
        do {
            limpiaPantalla();
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (salir == true);
    }

    private void menu() {
        System.out.println("\n--------------- CALCULAR AREAS ---------------");
        System.out.println("\nSeleccione la figura a la cual desea calcular el área:\n ");
        System.out.println("[1]. Rectángulo");
        System.out.println("[2]. Triángulo");
        System.out.println("[3]. Trapecio");
        System.out.println("[4]. Salir ");
    }

    private int capturarOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    private void solicitarDato(String forma) {
        System.out.println("Ingrese " + forma + ": ");
    }

    private double capturarDatoDouble() {
        return dato.nextDouble();
    }

    private boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                rectangulo();
                return true;
            // break;
            case 2:
                triangulo();
                return true;
            // break;
            case 3:
                trapecio();
                return true;
            // break;
            case 4:
                System.out.println("Ha sido un gusto atenderlo. Hasta pronto...\n\n");
                esperar(4);
                return false;
            // break;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }

    private void rectangulo(){
        System.out.println("\nVamos a calcular el área del Rectángulo. (Multiplicamos el largo por ancho)");
        solicitarDato("el Largo");
        largo = capturarDatoDouble();
        solicitarDato("el ancho");
        ancho = capturarDatoDouble();
        total1=calcular(largo,ancho,0,1);
        System.out.println("El resultado es: " + total1);
        esperar(4);
    }

    private void triangulo(){
        System.out.println("\nVamos a calcular el área o superficie del Triángulo. (Multiplicamos base por altura y dividimos por dos)");
        solicitarDato("la base");
        base1 = capturarDatoDouble();
        solicitarDato("la altura");
        alto = capturarDatoDouble();
        total2=calcular(base1, alto,0,2);
        System.out.println("El resultado es: " + total2);
        esperar(4);
    }

    private void trapecio(){
        System.out.println("\nVamos a calcular el área del Trapecio. (Multiplicamos la altura por el promedio de las dos bases");
        solicitarDato("la base 1");
        base1 = capturarDatoDouble();
        solicitarDato("la base 2");
        base2 = capturarDatoDouble();
        solicitarDato("la altura");
        alto = capturarDatoDouble();
        total3=calcular(base1, base2,alto,3);
        System.out.println("El resultado es: " + total3);
        esperar(4);
    }

    private double calcular(double num1, double num2, double num3, int f){
        double formula=0.0;
        if (f==1){
            formula = num1 * num2;
        }else if(f==2){
            formula = (num1 * num2)/2;
        }else if(f==3){
            formula = (num1 + num2)/2*num3;
        }
        return formula;
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
