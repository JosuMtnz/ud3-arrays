package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] listaAlumnos = new String[20];
        String alumno = null;
        int contador = 0;

        System.out.println("Escribe el nombre y apellidos de tus compañeros de clase.\nTermina con FIN.");

        do {
            System.out.print("Nombre y apellidos: ");
            alumno = br.readLine();
            if (!alumno.equalsIgnoreCase("FIN")){
                listaAlumnos[contador] = alumno;
                contador++;
            }
        } while (!alumno.equalsIgnoreCase("FIN"));

        String busqueda;
        char busquedaChar;

        do {
            System.out.print("\nIntroduce la primera letra para buscar alumnos: ");
            busqueda = br.readLine();
            busquedaChar = busqueda.toLowerCase().charAt(0);

            for (int i = 0; i < contador; i++) {
                if (listaAlumnos[i].toLowerCase().charAt(0) == busquedaChar){
                    System.out.format("%s\n", listaAlumnos[i]);
                }
            }
        } while (!busqueda.equalsIgnoreCase("FIN"));
    }
}
