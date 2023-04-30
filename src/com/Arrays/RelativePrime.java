package com.Arrays;

import java.util.Scanner;
/* This program takes one command-line argument N and prints out a square boolean array[][] table such that
there is an * in row i and column j if the gcd of i and j is 1(i and j are relatively prime)
* */
public class RelativePrime {

    public static void main(String[] args) {

        //Generates new instance of the Scanner class

        Scanner input = new Scanner(System.in);

        // prints message for user input
        System.out.println("Enter value for N");

        int N = input.nextInt();
        int x, y, rem;
        boolean[][] a = new boolean[N][N];

        for (int i = 0 ; i< N ; i++){
            for(int j = 0 ; j< N; j++) a[i][j] = true;
        }

        for (int i = 2; i < N; i++) {
            for (int j = 2; j < N; j++) {
                rem = i % j;
                if (rem == 0) a[i][j] = false;
                else {
                    while (rem != 0) {
                        if (rem == 1) {
                            a[i][j] = true;
                            break;
                        }
                        y = j;
                        x = rem;
                        rem = y % x;
                    }
                    if (rem == 0) a[i][j] = false;
                }
            }
        }

        for (int i = 2; i<N ; i++){
            System.out.println();
            for (int j = 2; j<N ; j++){
                if (a[i][j]) System.out.print(i +","+ j + "*  ");
                else System.out.print(i +","+ j + "   ");
            }
        }
    }
}
