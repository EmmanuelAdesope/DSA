package com.Arrays;
/* This program scans through an array of elements and checks for duplicate
 * The array is consists of random numbers from 1 - N
* */

import java.util.Scanner;

public class Duplicate {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); //creates a scanner class
        System.out.println("Enter the length of array");

        int N = input.nextInt();

        int a [] = new int[N];

        for(int i = 0; i<N ; i++){
           //creates an array of 1 to  N random numbers
            a[i] = 1+(int)(Math.random()*N);

            System.out.print(a[i]+" ");
        }

        System.out.println();

        for(int i = 0; i<N; i++) {  // scans through the array for duplicate
                for (int j=0; j < N; j++) {
                    if (i != j && a[i] == a[j]) {
                        System.out.println(a[i] + " is a duplicate.");
                        break;
                    }

                }

          }

    }
}
