package com.Conditionals;
/* This program calculates the  number of primes from 1 to N. N is an input provided by user from the command line
* */
import java.util.Scanner;

public class CountingPrimesTwo {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter number N");
        long N = input.nextLong();

        long count;      //Variable declaration
       long prime = 0;   // Variable Declaration and initialization
       long n, i;        // Variable declaration


          for (n = 2 ; n<=N; n++) {
              count = 0;
              for (i = 2; i <= n / i; i++) {
                  if (n % i == 0) count++;
              }
              if (n > 1) count++;

              if (count < 2) prime++;

              System.out.printf("%d %d\n",count, prime); // Trace of the variables count and prime
          }

        System.out.printf("%s %d","The number of primes is", prime );

    }
}
