package com.sofka.Ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {
    private String nombreCiudad;
    private String nombrePais;
    private Scanner dato;

    public void Ejercicio4() {
        dato = new Scanner(System.in);

        solicitarCiudad();
        nombreCiudad = capturarDatoString();

        solicitarPais();
        nombrePais = capturarDatoString();

        imprimir();

    }
    private void solicitarCiudad(){
        System.out.println("Digite el Nombre de una ciudad Capital: ");
    }

    private void solicitarPais(){
        System.out.println("Digite el País al que pertenece la ciudad anterior: ");
    }
    private String capturarDatoString(){
        return dato.nextLine();
    }
    private void imprimir(){
        System.out.println("La ciudad " + nombreCiudad + " es la capital del país " + nombrePais);
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
