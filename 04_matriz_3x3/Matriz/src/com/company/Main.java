package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] array = new int[3][3];
        int contador = 0;
        System.out.println("Introduce 9 números para rellenar el array.");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                contador += 1;
                System.out.print("N"+contador+": ");
                array[i][j] = Integer.parseInt(br.readLine());
            }
        }

        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
            System.out.println("");
        }
    }
}
