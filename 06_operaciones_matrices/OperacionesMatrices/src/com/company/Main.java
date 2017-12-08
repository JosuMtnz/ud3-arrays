package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matriz1 = new int[4][4];
        int[][] matriz2 = new int[4][4];
        int[][] resultado = new int[4][4];

        // Generar matriz 1
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {
                Random r = new Random();
                matriz1[i][j] = r.nextInt(20);
            }
        }

        // Generar matriz 2
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length; j++) {
                Random r = new Random();
                matriz2[i][j] = r.nextInt(20);
            }
        }

        int opcion;
        do {
            // Mostrar matrices + menu de opciones
            System.out.println("\n  MATRIZ 1       MATRIZ 2");
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz1[0].length; j++) {
                    if (matriz1[i][j] < 10) {
                        System.out.print(" " + matriz1[i][j] + " ");
                    } else {
                        System.out.print(matriz1[i][j] + " ");
                    }
                }

                System.out.print("   ");

                for (int j = 0; j < matriz2[0].length; j++) {
                    if (matriz2[i][j] < 10) {
                        System.out.print(" " + matriz2[i][j] + " ");
                    } else {
                        System.out.print(matriz2[i][j] + " ");
                    }
                }

                System.out.println();
            }

            System.out.print("\nMENU:" +
                    "\n1. Sumar matrices" +
                    "\n2. Producto de Matriz 1 por un escalar" +
                    "\n3. Producto de Matriz 1 por Matriz 2" +
                    "\n4. Traspuesta de Matriz 2" +
                    "\nOPCION (1-4): ");
            opcion = Integer.parseInt(br.readLine());
        } while (opcion <= 0 || opcion >= 5);

        // Llamar a la funcion seleccionada en el menu.
        switch (opcion) {
            case 1:
                System.out.println("Sumar matrices");
                break;
            case 2:
                System.out.println("Producto Matriz 1 por escalar");
                break;
            case 3:
                System.out.println("Producto de Matriz 1 por Matriz 2");
                break;
            case 4:
                System.out.println("Traspuesta de Matriz 2");
                break;
        }
    }
}
