package com.Conditionals;
/* This program takes an integer k as input from the command line and prints
all the positive powers of K in the java long data type.
* */

import java.util.Scanner;

public class PowersOfK {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);  //creates a new scanner class
        System.out.println("Enter value for k");

        long k = input.nextLong();  //User inputs values which powers you want to calculate

        if (k>=Long.MAX_VALUE) {            // check if input exceeds the largest integer for the long data type
            System.out.println("Arithmetic Overflow");

            System.out.println("Re-Enter value of K");

            k = input.nextLong();
        }

        long p = 1;
        int i;

        System.out.printf("%s %d %s","The powers of ", k, " are as follows:\n");

        for( i = 0; i <= 1000; i++){

            if (p<0){
                System.out.println("Arithmetic Overflow");
                break;
            }

            System.out.println(p);

              p = k * p;

        }
    }

}
