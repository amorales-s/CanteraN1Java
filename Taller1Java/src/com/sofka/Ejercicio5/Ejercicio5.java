package com.sofka.Ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {
    private String nombreMascota;
    private int edadMascota;
    private String tipoMascota;
    private String nombreCompletoDueno;
    private Scanner dato;

    public void Ejercicio5(){
        dato = new Scanner(System.in);

        solicitarNombreMascota();
        nombreMascota = capturarDatoString();

        solicitarEdadMascota();
        edadMascota = capturarDatoInt();
        dato.nextLine();

        solicitarTipoMascota();
        tipoMascota = capturarDatoString();

        solicitarNombreCompletoDueno();
        nombreCompletoDueno = capturarDatoString();



        imprimir();
    }
    private void solicitarNombreMascota(){
        System.out.println("Digite el Nombre de la Mascota: ");
    }

    private void solicitarEdadMascota(){
        System.out.println("Digite la Edad de la Mascota: ");
    }

    private void solicitarTipoMascota(){
        System.out.println("Digite el Tipo de Mascota: ");
    }

    private void solicitarNombreCompletoDueno(){
        System.out.println("Digite Nombre completo del dueño de la Mascota: ");
    }

    private String capturarDatoString(){
        return dato.nextLine();
    }

    private int capturarDatoInt(){
        return dato.nextInt();
    }

    private void imprimir(){
        System.out.println(nombreMascota + " es un(a) " + tipoMascota + " el cual, tiene " + edadMascota + " años de edad y " + nombreCompletoDueno + " es actualmente su dueño(a)");
        esperar(5);
    }

    public void esperar (int segundos) {
        try {
            Thread.sleep (segundos*1000);
        } catch (Exception e) {
            // Mensaje en caso de que falle
        }
    }

}
