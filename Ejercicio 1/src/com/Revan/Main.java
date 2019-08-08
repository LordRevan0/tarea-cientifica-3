package com.Revan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {

            System.out.println("Bienvenido al sistema de matematicas");
            System.out.println("1.Elevar un numero");
            System.out.println("2.Calcular la raiz cuadrada");
            System.out.println("3.Determinar si el numero es primo");
            System.out.println("4.Salir");
            int opcion = Lector.solicitarentero("Por favor seleccione una opcion");

            switch (opcion) {
                case 1: {
                    System.out.println("***** Elevar Numero *****");
                    double numero = Lector.solicitardouble("Ingrese el numero a elevar");
                    int numero2 = Lector.solicitarentero("ingrese el exponente (Debe ser entero)");
                    System.out.println("el resultado de elevar " + numero + "a la potencia de " +numero2+" Da el resultado de " + Matematicas.elevarnumero(numero, numero2));
                    break;
                }
                case 2: {
                    System.out.println("***** CALCULAR RAIZ CUADRADA *****");
                    double numero = Lector.solicitardouble("Ingrese el numero");
                    System.out.println("la raiz cuadrada de " + numero + " es " + Matematicas.raizcuadrada(numero));
                    break;
                }
                case 3:{
                    System.out.println("***** Revisando si un numero es primo *****");
                    int numero=Lector.solicitarentero("Ingrese un numero entero ");
                    System.out.println("el numero " + numero+ Matematicas.primo(numero));
                    break;
                }
                case 4: {
                    System.out.println("Adios");
                    break;
                }
            }
                if (opcion==4){
                    break;
            }
        }
    }
}

