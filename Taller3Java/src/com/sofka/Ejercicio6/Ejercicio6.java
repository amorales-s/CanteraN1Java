package com.sofka.Ejercicio6;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio6 {
    private static Scanner dato;
    private int bandera=0;
    private int bandera2=0;
    private static String nombreBuscar;
    private static boolean salir = true;
    private static int opcion;
    private static int contador;
    private static int contadorGeneral=1;
    private static int contadorUnico=3;
    private String[] nombres = new String[3];
    private String[] organizacion = new String[3];
    private int[] numContacto = new int[3];
    private static int validarContacto;


    public void Ejercicio6() throws IOException {
        dato = new Scanner(System.in);
        System.out.println("--------------- CONTACTOS TELEFONICOS ---------------");
        do {
            limpiaPantalla();
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (salir == true);
    }

    private static void menu() {
        System.out.println("\n--- Menú del Usuario ---");
        System.out.println("[1]. Agregar Contactos");
        System.out.println("[2]. Buscar Contactos");
        System.out.println("[3]. Eliminar Contactos");
        System.out.println("[4]. Salir ");
    }

    private static int capturarOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    private boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                agregarContacto();
                return true;
            // break;
            case 2:
                buscarContacto();
                return true;
            // break;
            case 3:
                eliminarContacto();
                return true;
            // break;
            case 4:
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

    private void agregarContacto(){
        solicitarDatos("cuantos Contactos desea agregar (máximo 3), quedan " + (contadorUnico) + "): ");
        contador=capturarDatoInteger();
        dato.nextLine();

        if (contador <= 3 && contadorGeneral<=3 && contadorUnico<=3){
            //System.out.println(contadorGeneral + " " + contadorUnico);
            if (contador==1){
                if (contadorUnico >0 && contadorUnico<=3){
                    llenarArray(1);
                    contadorUnico = contadorUnico - 1;
                }
            }else if(contador==2){
                if (contadorUnico >1 && contadorUnico<=3){
                    llenarArray(2);
                    contadorUnico = contadorUnico - 2;
                }
            }else if(contador==3){
                if (contadorUnico >2){
                    llenarArray(3);
                    contadorUnico = contadorUnico - 3;
                }
            }
        }else {
            System.out.println("Intente nuevamente. Máximo tres (3) Contactos.");
            //System.out.println(contadorGeneral + " " + contadorUnico);
        }
    }

    private void llenarArray(int contador1){
        for(int i=0; i<contador1; i++){
            solicitarDatos("el nombre completo del contacto " + (i+1));
            nombres[i]= capturarDatoString();
            solicitarDatos("el número de contacto");
            validarContacto = capturarDatoInteger();
            dato.nextLine();
            numContacto[i]= validarContacto(validarContacto);
            solicitarDatos("la organización a la que pertenece");
            organizacion[i]= capturarDatoString();
            contadorGeneral++;
           /* System.out.println(contadorGeneral);
            System.out.println(contadorUnico);*/
        }
    }

    private int validarContacto(int numContactoValidar){
        if (numContactoValidar == numContacto[0] || numContactoValidar == numContacto[1] || numContactoValidar == numContacto[2]){
            System.out.println("El número de contacto " + numContactoValidar + " ya está registrado. Digite otro por favor:");
            numContactoValidar = capturarDatoInteger();
            dato.nextLine();
            validarContacto(numContactoValidar);
        }
        return numContactoValidar;
    }

    private void buscarContacto() throws IOException{

        solicitarDatos("el nombre del contacto a buscar");
        nombreBuscar= capturarDatoString();
        for (int i=0; i< nombres.length; i++){
            if ( nombres[i] != null){
                if (nombres[i].equals(nombreBuscar)){
                    System.out.println("Nombre: " + nombres[i] + " Número de Contacto: " + numContacto[i] + " Organización: " + organizacion[i]);
                    bandera=1;
                }
            }
        }
        if (bandera !=1){
            System.out.println("Nombre de Contacto no existe");
        }
        esperar(3);
    }

    private void eliminarContacto() throws IOException{
        solicitarDatos("el nombre del contacto a buscar");
        nombreBuscar= capturarDatoString();
        for (int i=0; i< nombres.length; i++){
            if ( nombres[i] != null){
                if (nombres[i].equals(nombreBuscar)){
                    nombres[i]="";
                    numContacto[i]=0;
                    organizacion[i]="";
                    System.out.println("Contacto Eliminado");
                    System.out.println("Nombre: " + nombres[i] + " Número de Contacto: " + numContacto[i] + " Organización: " + organizacion[i]);
                    bandera2=1;
                }
            }
        }
        if (bandera2 !=1){
            System.out.println("Nombre de Contacto no existe");
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
