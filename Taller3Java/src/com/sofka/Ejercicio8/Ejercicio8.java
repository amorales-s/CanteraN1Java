package com.sofka.Ejercicio8;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio8 {
    private static Scanner dato;
    private int bandera=0;
    private int bandera2=0;
    private static boolean salir = true;
    private static int opcion;
    private static int contador;
    private static int contadorGeneral=1;
    private static int contadorUnico=8;
    private String[] nombreCompleto = new String[8];
    private Boolean[] presentacionCurso = new Boolean[8];
    private Boolean[] aprobacionCurso = new Boolean[8];
    private static String validarNombre;


    public void Ejercicio8() throws IOException {
        dato = new Scanner(System.in);
        System.out.println("--------------- ESCUELA AUTOMOVILISTICA EL MAESTRO ---------------");
        do {
            limpiaPantalla();
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (salir == true);
    }

    private static void menu() {
        System.out.println("\n--- Menú del Usuario ---");
        System.out.println("[1]. Registrar Cliente");
        System.out.println("[2]. Consultar Clientes con Curso Presentado");
        System.out.println("[3]. Salir ");
    }

    private static int capturarOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    private boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                registrarCliente();
                return true;
            // break;
            case 2:
                consultarCliente();
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
    private static void solicitarDatos(String estado) {
        System.out.println("Ingrese " + estado + ": ");
    }

    private int capturarDatoInteger() { return dato.nextInt(); }

    private static String capturarDatoString() {
        return dato.nextLine();
    }

    private static Boolean capturarDatoBoolean() { return dato.nextBoolean(); }

    private void registrarCliente() {
        solicitarDatos("cuantos Vehículos desea Ingresar (máximo 8), quedan " + (contadorUnico) + "): ");
        contador = capturarDatoInteger();
        dato.nextLine();
        if (contador <= 8 && contadorGeneral <= 8 && contadorUnico <= 8) {
            //System.out.println(contadorGeneral + " " + contadorUnico);
            if (contador == 1) {
                if (contadorUnico > 0 && contadorUnico <= 8) {
                    llenarArray(1);
                    contadorUnico = contadorUnico - 1;
                }
            } else if (contador == 2) {
                if (contadorUnico > 1 && contadorUnico <= 8) {
                    llenarArray(2);
                    contadorUnico = contadorUnico - 2;
                }
            } else if (contador == 3) {
                if (contadorUnico > 2 && contadorUnico <= 8) {
                    llenarArray(3);
                    contadorUnico = contadorUnico - 3;
                }
            } else if (contador == 4) {
                if (contadorUnico > 3 && contadorUnico <= 8) {
                    llenarArray(4);
                    contadorUnico = contadorUnico - 4;
                }
            } else if (contador == 5) {
                if (contadorUnico > 4 && contadorUnico <= 8) {
                    llenarArray(5);
                    contadorUnico = contadorUnico - 5;
                }
            } else if (contador == 6) {
                if (contadorUnico > 5 && contadorUnico <= 8) {
                    llenarArray(6);
                    contadorUnico = contadorUnico - 6;
                }
            }else if (contador == 7) {
                if (contadorUnico > 6 && contadorUnico <= 8) {
                    llenarArray(7);
                    contadorUnico = contadorUnico - 7;
                }
            }else if (contador == 8) {
                if (contadorUnico > 7) {
                    llenarArray(8);
                    contadorUnico = contadorUnico - 8;
                }
            } else {
                System.out.println("Intente nuevamente. Máximo ocho (8) Clientes.");
                //System.out.println(contadorGeneral + " " + contadorUnico);
            }
        }
    }

    private void llenarArray ( int contador1) {
         for (int i = 0; i < contador1; i++) {
                solicitarDatos("el nombre completo del cliente " + (i + 1));
                 nombreCompleto[i] = capturarDatoString();
                solicitarDatos("False (Falso) o True (Verdadero). ¿ El Cliente presentó el Curso ?");
                presentacionCurso[i] = capturarDatoBoolean();
                solicitarDatos("False (Falso) o True (Verdadero). ¿ El Cliente aprobó el Curso ?");
                aprobacionCurso[i] =capturarDatoBoolean();
                dato.nextLine();
                contadorGeneral++;
         }
    }

    private void consultarCliente () {

        for (int i = 0; i < nombreCompleto.length; i++) {
            if (nombreCompleto[i] != null) {
                if (presentacionCurso[i] == Boolean.TRUE) {
                    System.out.println("El Usuario: " + nombreCompleto[i] + " Presento Curso y el resultado de aprobación es: " + aprobacionCurso[i] );
                    bandera = 1;
                }
            }
        }
        if (bandera != 1) {
            System.out.println("Nombre de Cliente no existe");
        }
        esperar(4);
    }

    private static void limpiaPantalla () {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void esperar ( int segundos){
        try {
            Thread.sleep(segundos * 1000);
        } catch (Exception e) {
            // Mensaje en caso de que falle
        }
    }
}



