package com.Conditionals;

import java.util.Scanner;

/* This program takes in a number from command line and prints out the number of primes less than or equal to 10 million
* */
public class CountingPrimes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        long N = input.nextLong();     //User inputs N. A integer value of the long data Type

        long count = 4;               //Variable declaration and initialization
        long notneeded = 0;
        boolean notprime, notprime2, notprime3, notprime4 ;    // variable declaration
        long i;

        for (i = 10; i<=N; i++) {

            boolean b = (i % 2 == 0) || (i % 3 == 0) || (i % 5 == 0) || (i % 7 == 0);
            boolean c = (i%11 == 0)|| (i%13 ==0)|| (i%19==0) ||(i%17==0);
            boolean d = (i%23 == 0) || (i%31 == 0)|| (i%29==0)||(i%37==0)||(i%41==0) || (i%47==0);
            if (i<=20){

                if (b) notneeded++ ;
                else count++;
            }

            if (i > 20 && i <=200) {

                notprime = b;
                notprime2 = c;
                notprime3 = notprime || notprime2 ;

                if (notprime3) notneeded++;
                else count++;
            }

            if(i>200 && i <= 2000){
                notprime = b;
                notprime2= c;
                notprime3 =d;
                notprime4 = notprime || notprime2 || notprime3;

                if (notprime4) notneeded++;
                else count++;

            }
        }
        System.out.printf("%s %d","The number of primes is", count);
    }

}
