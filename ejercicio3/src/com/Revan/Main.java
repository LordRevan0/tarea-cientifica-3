package com.Revan;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList();
        Scanner lector = new Scanner(System.in);
        System.out.println("********");
        System.out.println("\tBenvenido");
        System.out.println("********");

        boolean continuar = true;
        while (continuar) {
            System.out.println("1. Ford");
            System.out.println("2. Toyota");
            System.out.println("3. Honda");
            System.out.println("4. Nissan");
            System.out.println("5. Mostrar Vehiculos");
            System.out.println("6. Salir");
            int opcion = lector.nextInt();
            switch (opcion){
                case 1:
                    Ford cFord = new Ford();
                    System.out.println("Ford");
                    System.out.print("Ingrese el modelo: ");
                    String modeloFord = lector.next();
                    cFord.modelo= modeloFord;
                    System.out.print("Ingrese el color del vehiculo: ");
                    String colorFord = lector.next();
                    cFord.color= colorFord;
                    System.out.print("Ingrese el año: ");
                    int yearFord= lector.nextInt();
                    cFord.year=yearFord;
                    System.out.print("Ingrese el precio: ");
                    double precioFord= lector.nextDouble();
                    cFord.precio= precioFord;
                    vehiculos.add(cFord);
                    break;
                case 2:
                    Toyota cToyota= new Toyota();
                    System.out.println("Toyota");
                    System.out.print("Ingrese el modelo: ");
                    String modeloToyota = lector.next();
                    cToyota.modelo=modeloToyota;
                    System.out.print("Ingrese el color del vehiculo: ");
                    String colorToyota = lector.next();
                    cToyota.color= colorToyota;
                    System.out.print("Ingrese el año: ");
                    int yearToyota= lector.nextInt();
                    cToyota.year=yearToyota;
                    System.out.print("Ingrese el precio: ");
                    double precioToyota= lector.nextDouble();
                    cToyota.precio= precioToyota;
                    vehiculos.add(cToyota);
                    break;
                case 3:
                    Honda cHonda = new Honda();
                    System.out.println("Honda");
                    System.out.print("Ingrese el modelo: ");
                    String modeloHonda = lector.next();
                    System.out.print("Ingrese el color del vehiculo: ");
                    String colorHonda = lector.next();
                    cHonda.color= colorHonda;
                    System.out.print("Ingrese el año: ");
                    int yearHonda= lector.nextInt();
                    cHonda.year=yearHonda;
                    System.out.print("Ingrese el precio: ");
                    double precioHonda= lector.nextDouble();
                    cHonda.precio= precioHonda;
                    vehiculos.add(cHonda);
                    break;
                case 4:
                    Nissan cNissan = new Nissan();
                    System.out.println("Nissan");
                    System.out.print("Ingrese el modelo: ");
                    String modeloNissan= lector.next();
                    cNissan.modelo= modeloNissan;
                    System.out.print("Ingrese el color del vehiculo: ");
                    String colorNissan = lector.next();
                    cNissan.color= colorNissan;
                    System.out.print("Ingrese el año: ");
                    int yearNissan = lector.nextInt();
                    cNissan.year= yearNissan;
                    System.out.print("Ingrese el precio: ");
                    double precioNissan = lector.nextDouble();
                    cNissan.precio= precioNissan;
                    vehiculos.add(cNissan);
                    break;
                case 5:
                    if (vehiculos.isEmpty()){
                        System.out.println("No hay vehiculos registrados");
                    } else
                    {
                        System.out.println("Mostrando los vehiculos de Toyota y Nissan");
                    }
                    for (Vehiculo c:vehiculos) {
                        String marca = "";
                        if(c instanceof Toyota){
                            marca= "Toyota";
                            System.out.println("el modelo de: "  + marca + "-"+ c.modelo);
                            System.out.println("el color de: " + marca + "-" +c.color);
                            System.out.println("el año de: "  + marca + "-" + c.year);
                            System.out.println("el precio de: " + marca + "-" +c.precio );
                        }

                        else if (c instanceof Nissan){
                            marca= "Nissan";
                            System.out.println("el modelo de " + marca + "-" + c.modelo);
                            System.out.println("el color de: " + marca  + "-" +c.color );
                            System.out.println("el año de: " + marca + "-" +c.year );
                            System.out.println("el precio de: " + marca + "-" +c.precio);
                        }
                    }
                    break;
                case 6:
                    continuar =false;
                    System.out.println("Adios");
                    break;
                default:
                    System.out.println("Opción no valida:");
                    break;
            }
        }
    }
}