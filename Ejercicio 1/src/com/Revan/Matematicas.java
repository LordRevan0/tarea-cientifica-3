package com.Revan;


public class Matematicas {

    public static double elevarnumero(double base, double exponente) {
        double total = Math.pow(base, exponente);

        return total;
    }

    public static double raizcuadrada(double numero) {
        double total = Math.sqrt(numero);
        return total;
    }

    public static String primo(int numero) {
        String mensaje = "";
        int numero2 = numero - 1;
        while ((numero % numero2) != 0) {
            numero2--;
        }
        if (numero2 == 1) {
            mensaje = " Es primo";

        } else {
            mensaje = " No es primo";
        }
        return mensaje;
    }

}




