package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] array = new int[10][10];
        final int MAX_RANDOM = 100;
        int contador = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                Random r = new Random();
                array[i][j] = r.nextInt(MAX_RANDOM);
            }
        }

        System.out.println("");

        for (int i = 0; i < array.length; i++) {
            contador = 0;
            for (int j = 0; j < array[i].length; j++) {
                contador += 1;
                if (contador < array[i].length) {
                    if (array[i][j] < 10) {
                        System.out.print(" " + array[i][j] + "  ");
                    } else {
                        System.out.print(array[i][j] + "  ");
                    }
                } else {
                    if (array[i][j] < 10) {
                        System.out.print(" " + array[i][j]);
                    } else {
                        System.out.print(array[i][j]);
                    }
                }
            }
            System.out.println("");
        }
    }
}
