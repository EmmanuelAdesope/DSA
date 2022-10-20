package com.Conditionals;

import java.util.Scanner;

public class FactorsTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number N");
        long N = input.nextLong();  // User inputs Integer

        long startTime = System.nanoTime();
        for (long i = 2; i<=N/i; i++)
        { // Test whether i is a factor.
            while(N %i ==0){
                N /=i ;
                System.out.print(i+ " ");
            }
        }
        if (N>1) System.out.print(N);
        System.out.println();

     long endTime = System.nanoTime();

        long timeElapsed = endTime - startTime;

       System.out.println("Execution time in seconds: " + timeElapsed/1e9);
    }
}
