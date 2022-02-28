package com.sofka.Ejercicio5;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio5 {

    private static Scanner dato;
    private static String nombreC;
    private static boolean salir = true;
    private static int opcion;

    public void Ejercicio5() throws IOException {
        dato = new Scanner(System.in);
        System.out.println("--------------- CICLO INFINITO - HASTA QUE ---------------");
        do {
            limpiaPantalla();
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (salir == true);
    }

    private static void menu() {
        System.out.println("\n--- Menú del Usuario ---");
        System.out.println("[1]. Captura Nombre");
        System.out.println("[2]. Saludar Persona");
        System.out.println("[3]. Salir ");
    }

    private static int capturarOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    private static void solicitarNombre() {
        System.out.println("Escriba su Nombre completo: ");
    }

    private static String capturarDatoString() {
        return dato.nextLine();
    }

    private boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                capturarNombre();
                return true;
            // break;
            case 2:
                imprimirSaludo();
                return true;
            // break;
            case 3:
                System.out.println("Hasta pronto, gracias por utilizar nuestro Menú.\n\n");
                esperar(4);
                return false;
            // break;
            default:
                System.out.println("Opción incorrecta");
                System.in.read();
        }
        return true;
    }

    private void capturarNombre(){
        solicitarNombre();
        nombreC = capturarDatoString();
        esperar(3);
    }

    private void imprimirSaludo(){
        if (nombreC==""){
            System.out.println("Escoja la opción [1] del nenú para ingresar el Nombre Completo");
        }else {
            System.out.println("Hola, cordial saludo " +nombreC);
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
