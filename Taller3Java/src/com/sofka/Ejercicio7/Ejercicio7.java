package com.sofka.Ejercicio7;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio7 {
    private static Scanner dato;
    private int bandera=0;
    private int bandera2=0;
    private static String nombreBuscar;
    private static boolean salir = true;
    private static int opcion;
    private static int contador;
    private static int contadorGeneral=1;
    private static int contadorUnico=5;
    private String[] placa = new String[5];
    private String[] marca = new String[5];
    private String[] nombreCompleto = new String[5];
    private int[] numContacto = new int[5];
    private static String validarPlaca;


    public void Ejercicio7() throws IOException {
        dato = new Scanner(System.in);
        System.out.println("--------------- PARQUEADERO EL GUARDIAN ---------------");
        do {
            limpiaPantalla();
            menu();
            opcion = capturarOpcion();
            salir = evaluarOpcion(opcion);
        } while (salir == true);
    }

    private static void menu() {
        System.out.println("\n--- Menú del Usuario ---");
        System.out.println("[1]. Agregar Vehículo");
        System.out.println("[2]. Consultar Vehículo en Parqueadero");
        System.out.println("[3]. Retirar Vehículo del Parqueadero");
        System.out.println("[4]. Salir ");
    }

    private static int capturarOpcion() {
        Scanner entrada = new Scanner(System.in);
        return entrada.nextInt();
    }

    private boolean evaluarOpcion(int opcion) throws IOException {
        switch (opcion) {
            case 1:
                agregarVehiculo();
                return true;
            // break;
            case 2:
                consultarVehiculo();
                return true;
            // break;
            case 3:
                retirarVehiculo();
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

    private void agregarVehiculo(){
        solicitarDatos("cuantos Vehículos desea Ingresar (máximo 5), quedan " + (contadorUnico) + "): ");
        contador=capturarDatoInteger();
        dato.nextLine();
        if (contador <= 5 && contadorGeneral<=5 && contadorUnico<=5){
            //System.out.println(contadorGeneral + " " + contadorUnico);
            if (contador==1){
                if (contadorUnico >0 && contadorUnico<=5){
                    llenarArray(1);
                    contadorUnico = contadorUnico - 1;
                }
            }else if(contador==2){
                if (contadorUnico >1 && contadorUnico<=5){
                    llenarArray(2);
                    contadorUnico = contadorUnico - 2;
                }
            }else if(contador==3){
                if (contadorUnico >2 && contadorUnico<=5){
                    llenarArray(3);
                    contadorUnico = contadorUnico - 3;
                }
            }else if(contador==4){
                if (contadorUnico >3 && contadorUnico<=5){
                    llenarArray(4);
                    contadorUnico = contadorUnico - 4;
                }
            }else if(contador==5){
                if (contadorUnico >4){
                    llenarArray(5);
                    contadorUnico = contadorUnico - 5;
                }
            }
        }else {
            System.out.println("Intente nuevamente. Máximo cinco (5) Vehículos.");
            //System.out.println(contadorGeneral + " " + contadorUnico);
        }
    }

    private void llenarArray(int contador1){
        for(int i=0; i<contador1; i++){
            solicitarDatos("la placa del Vehículo " + (i+1));
            validarPlaca = capturarDatoString();
            placa[i]= validarPlaca(validarPlaca);

            solicitarDatos("la marca del Vehículo");
            marca[i]= capturarDatoString();
            solicitarDatos("el nombre completo del propietario del Vehículo");
            nombreCompleto[i]= capturarDatoString();
            solicitarDatos("el número de contacto del Vehículo");
            numContacto[i]= capturarDatoInteger();
            dato.nextLine();
            contadorGeneral++;
           /* System.out.println(contadorGeneral);
            System.out.println(contadorUnico);*/
        }
    }

    private String validarPlaca(String nomPlacaValidar){
        if (nomPlacaValidar == placa[0] || nomPlacaValidar == placa[1] || nomPlacaValidar == placa[2] || nomPlacaValidar == placa[3] || nomPlacaValidar == placa[4]){
            System.out.println("El Vehículo con Placa " + nomPlacaValidar + " ya está registrado. Digite otra por favor:");
            nomPlacaValidar = capturarDatoString();
            validarPlaca(nomPlacaValidar);
        }
        return nomPlacaValidar;
    }

    private void consultarVehiculo() throws IOException{

        solicitarDatos("la placa del Vehículo a consultar");
        nombreBuscar= capturarDatoString();
        for (int i=0; i< placa.length; i++){
            if ( placa[i] != null){
                if (placa[i].equals(nombreBuscar)){
                    System.out.println("Placa Vehículo: " + placa[i] + " Marca Vehículo: " + marca[i] + " Nombre Propietario: " + nombreCompleto[i]
                    + " Número de Contacto: " + numContacto[i] + " Posición en el Parqueadero: " + (i+1));
                    bandera=1;
                }
            }
        }
        if (bandera !=1){
            System.out.println("Placa de Vehículo no existe");
        }
        esperar(3);
    }

    private void retirarVehiculo() throws IOException{
        solicitarDatos("la placa del Vehículo a consultar");
        nombreBuscar= capturarDatoString();
        for (int i=0; i< placa.length; i++){
            if ( placa[i] != null){
                if (placa[i].equals(nombreBuscar)){
                    System.out.println("Vehículo de Placa: " + placa[i] + " Retirado con Exito");
                    placa[i]="";
                    marca[i]="";
                    nombreCompleto[i]="";
                    numContacto[i]=0;
                    bandera2=1;
                }
            }
        }
        if (bandera2 !=1){
            System.out.println("Placa de Vehículo no existe en el Parqueadero");
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
