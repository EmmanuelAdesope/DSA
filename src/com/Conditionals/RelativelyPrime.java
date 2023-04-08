package com.Conditionals;

import java.util.Scanner;

/* This program takes one command-line argument N and prints out an N-by-N table such that
there is an * in row i and column j if the gcd of i and j is 1(i and j are relatively prime)
* */
public class RelativelyPrime {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value N");
        long N = input.nextLong();
        long x , y, rem ;
        for (long i = 1; i<=N; i++){

            for (long j = 1; j<=N; j++){

                  rem= i % j ;
                  if (rem == 0) System.out.print("   ");
                  if( rem == 0 && j ==1) System.out.print("  * ");
                  else{
                while( rem !=0){
                    if (rem  == 1){
                        System.out.print(" * ");
                        break;
                    }
                     y = j;
                     x = rem;
                    rem = y % x ;
                }
                if (rem == 0) System.out.print("   ");
              }
            }
            System.out.println();
        }


    }
}
