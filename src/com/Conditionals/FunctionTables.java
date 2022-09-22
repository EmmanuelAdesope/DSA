package com.Conditionals;
/* This program prints the function
* */

import java.util.Scanner;

public class FunctionTables {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // prompts user for input
        System.out.println("Enter value");

        int N = input.nextInt();

        for (int i = 0; i <=N ; i++) {
            System.out.println(i + " " + 2* Math.PI*i/N);
        }

    }

}
