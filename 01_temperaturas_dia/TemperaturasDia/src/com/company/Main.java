package com.company;

<<<<<<< Updated upstream
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        final int nHoras = 24;
        double[] temperaturas = new double[nHoras];
        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        System.out.println("Escribe la temperatura de cada hora del día.");

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.format("%d:00h: ",i);
            temperaturas[i] = Double.parseDouble(br.readLine());
            total =+ temperaturas[i];
            if (temperaturas[i] > max){
                max = temperaturas[i];
            }
            if (temperaturas[i] < min){
                min = temperaturas[i];
            }
        }

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.format("%d  ",i);
            for (int j = 1; j <= temperaturas[i]; j++) {
                System.out.format("*");
            }
            System.out.format("  %.2f",temperaturas[i]);
            if (temperaturas[i] == max ){
                System.out.print(" <-- MAXIMA");
            }
            if (temperaturas[i] == min ){
                System.out.print(" <-- MINIMA");
            }
            System.out.println();
        }

        System.out.format("Media: %.2f", total/temperaturas.length);
=======
public class Main {

    public static void main(String[] args) {
	// write your code here


>>>>>>> Stashed changes
    }
}
