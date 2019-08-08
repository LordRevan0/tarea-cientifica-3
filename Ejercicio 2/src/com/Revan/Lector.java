package com.Revan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lector {

    public static String solicitarcadena( String mensaje) {
        Scanner lector = new Scanner(System.in);
        System.out.print(mensaje);
        try {
            String cadena = lector.nextLine();
            return cadena;
        } catch (InputMismatchException e) {
            System.out.println("el dato ingresado no es valido");
            return solicitarcadena(mensaje);
        }
    }

}


