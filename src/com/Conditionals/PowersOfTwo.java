package com.Conditionals;

import java.util.Scanner;

/*
This program prints the values of the powers of 2 less than an integer N. The integer N is inputted at the command line
*/
public class PowersOfTwo {

    public static void main(String[] args) {

        // creates new object of scanner class

        Scanner input = new Scanner(System.in);
        //prompts user for input
        System.out.println("Enter integer");

        int N = input.nextInt();

        int v = 1;

        while (v <= N / 2) {
            v = 2 * v;
            System.out.println(v);
        }

    }

}