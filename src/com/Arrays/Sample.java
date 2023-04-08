package com.Arrays;
/* This program prints a random sample of M integers from 0 ... N-1(no duplicates).
*
* */

import java.util.Scanner;

public class Sample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the size of sample array M");
        int M = input.nextInt();

        System.out.println("Enter size of Array you are getting the sample from");
        int N = input.nextInt();

        int[] perm = new int[N];   // create an array of integers(perm) of size N

        for (int j = 0; j < N; j++) perm[j] = j;  // Initialize perm[]

        //Take sample.
        for (int i = 0; i< M; i++){
            // Exchanged perm[i] with a random element to its right.
            int r = i + (int) (Math.random() * (N-i));
            int t = perm[r];
            perm[r] = perm [i];
            perm[i]= t;
        }

        // Print sample
        for(int i = 0; i<M; i++) System.out.print(perm[i]+ " ");
        System.out.println();

    }
}
