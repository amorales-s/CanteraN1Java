package com.sofka.Ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {
    private String nombre;
    private String apellidos;
    private int edad;
    private double estatura;
    private Scanner dato;

    public void Ejercicio2(){
        dato = new Scanner(System.in);
        solicitarNombre();
        nombre = capturarDatoString();

        solicitarApellidos();
        apellidos = capturarDatoString();

        solicitarEdad();
        edad = capturarDatoInt();

        solicitarEstatura();
        estatura = capturarDatoDouble();
    }

    private void solicitarNombre(){
        System.out.println("Digite el Nombre: ");
    }

    private void solicitarApellidos(){
        System.out.println("Digite los Apellidos: ");
    }

    private void solicitarEdad(){
        System.out.println("Digite la Edad: ");
    }

    private void solicitarEstatura(){
        System.out.println("Digite la Estatura: ");
    }

    private String capturarDatoString(){
        return dato.nextLine();
    }

    private int capturarDatoInt(){
        return dato.nextInt();
    }

    private double capturarDatoDouble(){
        return dato.nextDouble();
    }
}