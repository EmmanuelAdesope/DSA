package com.Conditionals;

import java.util.Scanner;

/*
 This program takes an integer N from the command line and calculates the Finite Product N!
 (1 X 2 X 3 X ...N)
 * */
public class FiniteProduct {
    public static void main(String[] args) {

        System.out.println("This program calculates the factorial of an integer (N! = 1 X 2 X 3 X...N)");
        //creates a new object of scanner class

        Scanner input = new Scanner(System.in);
        //prompts user for input
        System.out.println("Enter value");
          long N = input.nextLong();
          long product = 1;
          for (int i = 1; i<=N; i++){
              product *=i;

              System.out.println(product);

          }

    }
}
