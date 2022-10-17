package com.Conditionals;
/* This program calculates the greatest common divisor(gcd) of two integers using the Euclid algorithm
* */

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {

        System.out.println("This program calculates the greatest common divisor gcd(x,y) of two integers x and y");
        Scanner input = new Scanner(System.in);

        System.out.println("Input Integer x");
        int x = input.nextInt();

        System.out.println("Input Integer y");
        int y = input.nextInt();

        if ( x > y){

            int t = x;
            x = y;
            y = t;

        }
            int rem = y % x;

           if (rem == 0) System.out.printf("%s %d %s %d %s %d", "The gcd of", x, "and", y, "is", x);
           else {
                while (rem != 0) {
                    y = x;
                    x = rem;
                    rem = y % x;
                }
                System.out.println("The gcd of the two integers is " + x);
            }


    }
}
