package com.Conditionals;

import java.util.Scanner;

/*
This program takes an integer from the command line and computes a finite sum (1+2+3+..+N)
 */
public class FiniteSum {

    public static void main(String[] args){
         // creates new object of scanner class

        Scanner input = new Scanner(System.in);
        //prompts user for input
        System.out.println("Enter integer");

        int N = input.nextInt();
        int sum = 0;

        for (int i = 1 ; i<=N ; i++){
            sum += i;
            System.out.println(sum);

        }

    }
}
