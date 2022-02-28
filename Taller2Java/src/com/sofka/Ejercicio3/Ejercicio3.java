package com.sofka.Ejercicio3;

import java.util.Scanner;

public class Ejercicio3 {
    private String nombre;
    private String apellidos;
    private int edad;
    private Scanner dato;

    public void Ejercicio3(){
        dato = new Scanner(System.in);
        solicitarNombre();
        nombre = capturarDatoString();

        solicitarApellidos();
        apellidos = capturarDatoString();

        solicitarEdad();
        edad = capturarDatoInt();

        imprimir();
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

    private String capturarDatoString(){
        return dato.nextLine();
    }

    private int capturarDatoInt(){
        return dato.nextInt();
    }

    private void imprimir(){
        if (edad >= 18) {
            System.out.println(nombre + " " + apellidos + " usted es mayor de edad, por lo tanto puede entrar a la fiesta");
        }else{
            System.out.println(nombre + " " + apellidos + " usted es menor de edad, por lo tanto, no puede entrar a la fiesta, por favor devuélvase a su casa");
        }
        esperar(4);
    }

    public void esperar (int segundos) {
        try {
            Thread.sleep (segundos*1000);
        } catch (Exception e) {
            // Mensaje en caso de que falle
        }
    }


}
