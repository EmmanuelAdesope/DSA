package com.Conditionals;

import java.util.Scanner;

/*  This program calculates the prime factors of an integer N. The value of N is inputted at command line
        */
public class Factors {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number N");
        long N = input.nextLong();
       // long n = N;
        for (long i = 2; i<=N/i; i++)
        { // Test whether i is a factor.
            if (N % i == 0)System.out.print(i+" ");
            while(N %i ==0){
                N /=i ;
            }

        }
        if (N>1) System.out.print(N);
        System.out.println();
    }
}
