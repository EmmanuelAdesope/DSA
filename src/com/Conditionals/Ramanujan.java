package com.Conditionals;

import java.util.Scanner;

/*  This program takes a command line argument N and prints out all integers
less than or equal to N such that a^3 + b^3 = c^3 + d^3
* */
public class Ramanujan {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value N");
         int N = input.nextInt();

         for (int a = 0 ; a <= N; a++){

             for (int b = 0; b <=N; b++){

                  for(int c =0 ; c<=N ; c++){

                      for(int d = 0; d <= N; d++){

                          if ( Math.pow(a,3)+ Math.pow(b,3)== Math.pow(c,3)+ Math.pow(d,3)){

                              System.out.printf("%d  %d  %d  %d\n",  a,  b,  c, d);
                          }

                      }
                  }
             }
         }


    }
}
