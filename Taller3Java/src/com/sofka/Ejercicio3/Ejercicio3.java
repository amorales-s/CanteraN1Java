package com.sofka.Ejercicio3;

public class Ejercicio3 {

    public void Ejercicio3() {
        int altura;
        int a;
        int espacio;
        int asterisco;
        altura = 10;
        a=0;
        limpiaPantalla();
        while(a <= altura){
            for (espacio=0; espacio <= (altura-a); espacio++){
                System.out.print(" ");
            }
            for (asterisco=0; asterisco <= a; asterisco++){
                System.out.print("* ");
            }
            System.out.println(" ");
            a=a+1;
        }
        base();
    }
    private void base(){
        int ban1;
        int ban2;
        int ban3;
        int ban4;
        int base1;
        boolean bandera;
        String simbolo;
        String espa;
        ban1=0;
        ban2=0;
        ban3=0;
        ban4=0;
        base1=0;
        simbolo="*";
        espa=" ";
        bandera = true;
        while (base1<4){
            while (ban1<9){
                System.out.print(espa);
                ban1=ban1+1;
            }
            while (ban2<3){
                System.out.print(simbolo);
                ban2=ban2+1;
            }
            System.out.println("");
            base1=base1+1;
            ban1=0;
            ban2=0;
            while (ban3<8){
                System.out.print(espa);
                ban3=ban3+1;
            }
            while (ban4<5){
                System.out.print(simbolo);
                ban4=ban4+1;
            }
            System.out.println("");
            base1=base1+1;
            ban3=0;
            ban4=0;
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
