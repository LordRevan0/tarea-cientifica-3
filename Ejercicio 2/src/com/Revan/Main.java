package com.Revan;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        Random rand = new Random();
        System.out.printf("Ingrese primera palabra: ");
        String palabra1 = lector.nextLine();
        System.out.printf("Ingrese segunda palabra: ");
        String palabra2 = lector.nextLine();
        System.out.println("Procediendo a verficar....");
        if (Cambios.longitud(palabra1, palabra2)) {
            System.out.println("Ambas palabras tienen la misma cantidad de caracteres");
            int contador = palabra1.length();
            System.out.println("Cantidad de caracteres: " + contador);
            int posicionABuscar = rand.nextInt(contador - 1);
            System.out.println("Numero random: " + posicionABuscar);
            Cambios.cambio(palabra1, palabra2, posicionABuscar);
        }else
        {
            System.out.println("Palabras ingresadas con diferentes logitud");

        }

    }
}