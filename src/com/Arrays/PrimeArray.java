package com.Arrays;

import java.util.Scanner;

/* This program takes an integer N from the command line and creates a N-by-N boolean array[][]
 * such that a[i][j] is true if i divides j or j divides i(i.e i(mod)j = 0 or j(mod)i = 0) and false otherwise
 */
public class PrimeArray {

    public static void main(String[] args) {

        // creates new instance of the scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value N");

        int N = input.nextInt();


        boolean[][] a = new boolean[N+1][N+1];

        for (int i = 2 ; i<=N ; i++)
            for(int j = 2 ; j<=N ; j++){
              a[i][j] = true;
            }

        for(int i = 2; i<=N ; i++)
            for (int j = 1; j<=N/i; j++){

                a[i][i*j] = false;
                a[i*j][i] = false;

            }

        for (int i = 1; i<N ; i++){
            System.out.println();
            for (int j = 1; j<N ; j++){
                if (a[i][j]) System.out.print(i +","+ j + "*  ");
                else System.out.print(i +","+ j + "   ");
            }
        }


    }
}
