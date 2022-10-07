package com.Conditionals;

import java.util.Scanner;

/*
This program prints the values of the powers of 2 less than or equal to  an integer N. The integer N is inputted at the command line
*/
public class PowersOfTwo {

    public static void main(String[] args) {

        // creates new object of scanner class

        System.out.println("This program prints the positive powers of 2 less or equal to an integer N");
        System.out.println("N is provided as input in the command line");

        Scanner input = new Scanner(System.in);
        //prompts user for input

        System.out.println("Enter integer N");

        long N = input.nextLong();

        if (N<=0) {
            System.out.printf("%s\n %s\n","Value cannot be negative or Zero", "Please re-enter value");
            N = input.nextLong();
        }

        int v = 1;

        while (v <= N / 2) {
            v = 2 * v;
            System.out.println(v);
        }

    }

}