package com.Revan;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lector {
    public static float solicitarreal(String mensaje){
        Scanner leerreal =new Scanner(System.in);
        System.out.println(mensaje);
        try{
            float numero = leerreal.nextFloat();
            return numero;
        }
        catch (InputMismatchException e){
            System.out.println("Debe ingresar un numero real");
            return solicitarreal(mensaje);
        }

    }
       public static int solicitarentero(String mensaje){
        Scanner leerentero=new Scanner(System.in);
        System.out.println(mensaje);
        try{
            int numero = leerentero.nextInt();
            return numero;
        }
        catch (InputMismatchException e){
            System.out.println("Debe ingresar un numero entero");
            return solicitarentero(mensaje);
        }

    }

    public static double solicitardouble(String mensaje){
        Scanner leerdouble=new Scanner(System.in);
        System.out.println(mensaje);
        try{
           double numero = leerdouble.nextInt();
            return numero;
        }
        catch (InputMismatchException e){
            System.out.println("Debe ingresar un numero valido");
            return solicitarentero(mensaje);
        }

    }
}
