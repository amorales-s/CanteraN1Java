package com.sofka.Ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
    private String nombre;
    private String apellidos;


    public void Ejercicio1(){

        solicitarNombre();
        nombre = capturarDato();

        solicitarApellidos();
        apellidos = capturarDato();
    }
    private void solicitarNombre(){
        System.out.println("Digite el Nombre: ");
    }
    private void solicitarApellidos(){
        System.out.println("Digite los Apellidos: ");
    }
    private String capturarDato(){
        Scanner dato = new Scanner(System.in);
        return dato.nextLine();
    }
}

