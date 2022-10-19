package com.Conditionals;

import java.util.Scanner;

/* This program calculates the checksum digit corresponding to nine other digits entered at command line and prints the ISBN
* */
public class Checksum {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // creates new instance of the scanner class

        System.out.println("Enter the 9 digit integer values");

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int e = input.nextInt();
        int f = input.nextInt();
        int g = input.nextInt();
        int h = input.nextInt();
        int i = input.nextInt();

        for ( int x = 0; x <=10; x++){

            if((10*a + 9*b + 8*c + 7*d + 6*e + 5*f + 4*g + 3*h + 2*i + x)%11 ==0) {
                System.out.println("Checksum digit is " + x);
                System.out.println("ISBN =  "+ a + b + c + d+ e+ f + g+ h+ i+ x);

                break;
            }
        }

    }
}
