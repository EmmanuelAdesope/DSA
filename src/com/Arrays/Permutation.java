package com.Arrays;
/* The program takes a command line argument n and prints a random permutation
of the integers 0 through N-1.
* */

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of n");

        int n = input.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = i;
        }

        for (int j = 0; j < n; j++) {

            int r = j + (int) (Math.random() * (n - j));

            int temp = a[r];
            a[r] = a[j];
            a[j] = temp;

            System.out.print(a[j] + " ");
        }


        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < n; j++) {
                if (a[j] == i) System.out.print("* "+" ");
                else System.out.print(". "+" ");

            }
        }

    }
}
