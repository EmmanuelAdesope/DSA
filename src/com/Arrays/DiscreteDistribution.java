package com.Arrays;
/* This program takes a variable number of integer inputs and prints
 *  the integer i with the probability proportional to the ith command-line
 * arguments
 */

import java.util.Scanner;

public class DiscreteDistribution {

    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of integers you want to input at command line");

        int n = input.nextInt();

        int [] a = new int[n];

        for(int i = 0; i<n ; i++) {

            System.out.println("Enter integer for position "+i);
             a[i] = input.nextInt();
        }


        for(int i = 1; i<n; i++){
            System.out.println();
            for(int j = 0 ; j<i; j++){
                System.out.print(a[i]+" ");

            }
        }
    }
}
