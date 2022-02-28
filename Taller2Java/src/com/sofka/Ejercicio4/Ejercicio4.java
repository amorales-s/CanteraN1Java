package com.sofka.Ejercicio4;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    private static Scanner dato;
    private static String nombre;
    private static String apellidos;
    private static String nombrePeli;
    private static String novedad;
    private static String novedadDevolucion;
    private static String peli1 = "Los Picapiedra";
    private static String peli2 = "Rápido y Furioso";
    private static String peli3 = "Parásitos";
    private static String peli4 = "Minions";

    private static boolean salir = true;
    private static int opcion;

    public void Ejercicio4() throws IOException {
        dato = new Scanner(System.in);
        System.out.println("--------------- ALQUILER EL PORVENIR ---------------");
        solicitarNombre();
        nombre = capturarDatoString();
        solicitarApellidos();
        apellidos = capturarDatoString();
        do {
            limpiaPantalla();
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (salir == true);
    }

    private static void menu() {
        System.out.println("\nElija una opción:");
        System.out.println("[1]. Alquilar Película");
        System.out.println("[2]. Consultar Películas Disponibles");
        System.out.println("[3]. Devolver Película");
        System.out.println("[4]. Salir ");
    }

    private static int capturarOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    private static void solicitarNombre() {
        System.out.println("Digite su Nombre: ");
    }

    private static void solicitarApellidos() {
        System.out.println("Digite sus Apellidos: ");
    }

    private static void solicitarNombrePelicula() {
        System.out.println("Escriba el nombre de la Película: ");
    }

    private static void solicitarNovedad() {
        System.out.println("Registre algún daño u otra novedad sobre la Película: ");
    }

    private static String capturarDatoString() {
        return dato.nextLine();
    }

    private static boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                alquiler();
                return true;
            // break;
            case 2:
                consultar();
                return true;
            // break;
            case 3:
                devolver();
                return true;
            // break;
            case 4:
                System.out.println("Ha sido un gusto atenderlo " + nombre + " " + apellidos + ". Hasta pronto...\n\n");
                esperar(4);
                return false;
            // break;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }

    private static void alquiler() {
        solicitarNombrePelicula();
        nombrePeli = capturarDatoString();
        solicitarNovedad();
        novedad = capturarDatoString();
        if (nombrePeli.equals(peli1)) {
            imprimirPeli(peli1);
        } else if (nombrePeli.equals(peli2)) {
            imprimirPeli(peli2);
        } else if (nombrePeli.equals(peli3)) {
            imprimirPeli(peli3);
        } else if (nombrePeli.equals(peli4)) {
            imprimirPeli(peli4);
        } else if ((nombrePeli.compareTo(peli1) != 0) && (nombrePeli.compareTo(peli2) != 0) && (nombrePeli.compareTo(peli3) != 0) && (nombrePeli.compareTo(peli4) != 0)) {
            System.out.println("\nPelícula no disponible para alquiler!");
        }
        esperar(4);
    }

    private static void consultar() {
        imprimir(1,peli1);
        imprimir(2,peli2);
        imprimir(3,peli3);
        imprimir(4,peli4);
        esperar(4);
    }

    private static void devolver() {
        solicitarNombrePelicula();
        nombrePeli = capturarDatoString();
        solicitarNovedad();
        novedadDevolucion = capturarDatoString();
        if (nombrePeli.equals(peli1)) {
            imprimirPeliDevuelta(peli1);
        } else if (nombrePeli.equals(peli2)) {
            imprimirPeliDevuelta(peli2);
        } else if (nombrePeli.equals(peli3)) {
            imprimirPeliDevuelta(peli3);
        } else if (nombrePeli.equals(peli4)) {
            imprimirPeliDevuelta(peli4);
        } else if ((nombrePeli.compareTo(peli1) != 0) && (nombrePeli.compareTo(peli2) != 0) && (nombrePeli.compareTo(peli3) != 0) && (nombrePeli.compareTo(peli4) != 0)) {
            System.out.println("\nPelícula no disponible para alquiler!");
        }
        esperar(4);
    }

    private static void imprimir(int n, String peli){
        System.out.println("Película" + n + ": " + peli);
    }

    private static void imprimirPeli(String peli){
        System.out.println(nombre + " " + apellidos + " se ha registrado la película " + peli + " a su nombre");
    }

    private static void imprimirPeliDevuelta(String peli){
        System.out.println(nombre + " " + apellidos + " La película " + peli + " ha sido devuelta ");
        System.out.println("Registra Novedad: " + novedadDevolucion);
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
