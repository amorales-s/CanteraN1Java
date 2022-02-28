package com.sofka.Ejercicio7;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio7 {
    private static Scanner dato;
    private static String nombre;
    private static String apellidos;
    private static double peso;
    private static double estatura;
    private static double imc;
    private static boolean salir = true;
    private static String opcion;

    public void Ejercicio7(){
        dato = new Scanner(System.in);
        System.out.println("--------------- CALCULAR IMC ---------------");

        do {
            solicitarNombre();
            nombre = capturarDatoString();
            solicitarApellidos();
            apellidos = capturarDatoString();
            limpiaPantalla();
            pedirDatos();
            calcularIMC();
            imprimirIMC();

        } while (salir == true);
    }

    private static void pedirDatos() {
        solicitarDatos("Peso (en Kg.): ");
        peso = capturarDatoDouble();
        solicitarDatos("Estatura (en Mts): ");
        estatura = capturarDatoDouble();
        dato.nextLine();
    }

    private static void calcularIMC() {
        imc = peso/(estatura * estatura);
        System.out.println(nombre + " " + apellidos + " Su IMC es de: " + imc);
    }


    private static void imprimirIMC() {
        if (imc < 18.5) {
            System.out.println("Peso Bajo, inferior al Normal");
        }else{
            if (imc >= 18.5 && imc <= 24.9) {
                System.out.println("Peso Normal");
            }else {
                if (imc >=25.0 && imc<=30){
                    System.out.println("SobrePeso, Peso Superior al Normal");
                } else {
                    System.out.println("Obesidad");
                }
            }
        }
        esperar(4);
        salir=false;
    }

    private static void solicitarNombre() {
        System.out.println("Digite su Nombre: ");
    }

    private static void solicitarApellidos() {
        System.out.println("Digite sus Apellidos: ");
    }

    private static void solicitarDatos(String estado) {
        System.out.println("Ingrese su " + estado + ": ");
    }


    private static String capturarDatoString() {
        return dato.nextLine();
    }

    private static double capturarDatoDouble() {
        return dato.nextDouble();
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



