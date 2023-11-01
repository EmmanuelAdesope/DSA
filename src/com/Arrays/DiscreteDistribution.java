package com.Arrays;
/* This program takes a variable number of integer inputs and prints
 *  the integer i with the probability proportional to the ith command-line
 * arguments
 */

import java.util.Scanner;

public class DiscreteDistribution {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the total number of times the sampling will be done");

        int m = input.nextInt();

        System.out.println("Enter the length of the array");
        int n  = input.nextInt();

        int [] a = new int[n];
        int [] S = new int[n];
        int total = 0;


        for (int i = 0; i<a.length; i++)
        {
            a[i] = input.nextInt();
            total = total + a[i];
            S[i] = total;
        }


        System.out.println(S[a.length-1]);   // prints out the sum

        for(int i = 0; i<m; i++) {

            int r = (int) (Math.random() * (S[a.length-1]));

            for (int j = 0; j < a.length; j++) {

                if (r >= S[j] && r < S[j + 1]) System.out.print((j + 1) + " ");

            }

        }

        }
    }

