package com.Revan;

public class Cambios {
    private String palabra1;
    private String palabra2;
    public static boolean longitud(String palabra1, String palabra2){
        if (palabra1.length()==palabra2.length()){
            return true;
        }
        return false;
    }

    public static boolean cambio(String palabra1, String palabra2, int posicion){
        String letra1= palabra1.substring(posicion);
        String letra2= palabra2.substring(posicion);
        char letra11= letra1.charAt(0);
        char letra22= letra2.charAt(0);
        StringBuilder cadenaModi1 = new StringBuilder(palabra1);
        cadenaModi1.setCharAt(posicion, letra22);
        palabra1= cadenaModi1.toString();
        StringBuilder cadenaModi2 = new StringBuilder(palabra2);
        cadenaModi2.setCharAt(posicion, letra11);
        palabra2= cadenaModi2.toString();
        System.out.println(palabra1);
        System.out.println(palabra2);
        return true;
    }
}