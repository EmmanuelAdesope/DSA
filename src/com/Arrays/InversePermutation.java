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

        System.out.println("You are required to enter  " + N +" integer(s) from the command line");
        int a [] = new int[N];
        int b [] = new int[N];
        boolean [] exist = new boolean[N];
        int j = 1;


        for (int i = 0; i< N; i++, j++){

            System.out.println("Enter integer number "+ j  + " to be chosen from  0  to "+ (N-1) +" from the command line ");

            a[i]= input.nextInt();

            if(a[i]<0 || a[i] >=N  || exist[a[i]]){ //checks if it's a valid permutation

                System.out.println("This is not a valid permutation, Re-enter value");
                a[i] = input.nextInt();
                 }

                 exist[a[i]] = true;

             }

        for(int i = 0; i<N ; i++){

            b[a[i]] = i;
        }


        for(int i = 0; i<N ; i++){

            System.out.print(b[i]+ " ");
        }



    }








}
