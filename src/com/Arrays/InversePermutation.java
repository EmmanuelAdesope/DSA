package com.Arrays;
/* This program reads in a permutation of integers 0 to N-1 from N command-line arguments
* and prints the inverse permutation.
* */
import java.util.Scanner;

public class InversePermutation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of array size N");

        int N = input.nextInt();

        int a [] = new int[N];
        int b [] = new int[N];

        for (int i = 0; i< N; i++){

                 System.out.println("Enter any integer from 0 to "+ N +" from the command line ");
                 a[i]= input.nextInt();
             }

        for(int i = 0; i<N ; i++){

            b[a[i]] = i;
        }

        for(int i = 0; i<N ; i++){

            a[b[i]] = b[a[i]];
        }

        for(int i = 0; i<N ; i++){

            System.out.print(b[i]+ " ");
        }

        System.out.println();

        for(int i = 0; i<N ; i++){

            System.out.print(a[i]+ " ");
        }


    }








}
