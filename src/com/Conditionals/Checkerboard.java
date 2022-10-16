package com.Conditionals;

import java.util.Scanner;

/*  This program takes one command-line argument N and prints out a two-dimensional N-by-N checkerboard pattern
with alternating spaces and asterisks
* */
public class Checkerboard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value N");

        long N = input.nextLong(); // Inputs Value for N

        for (long i = 1; i <= N; i++) {

            for (long j = 1; j <= N; j++) {

                if (j%2 ==0) System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }

    }
}
