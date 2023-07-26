package com.Arrays;
/* This program builds a two dimension ragged array of the binomial coefficients of an integer n
* */
import java.util.Scanner;

public class Binomial {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //creates scanner class

        System.out.println("Enter value n, ");

        int n = input.nextInt();

        double [] [] a = new double[n+1][n+1]; //creates the array

        a[1][1]= 1;  //initialize first row and column

        for (int i = 2; i<n+1; i++)  //calculates the binomial coefficients
            for(int j = 1; j<=i; j++){

                a[i][j] = 0.5 * (a[i-1][j]+ a[i-1][j-1]);
            }


        for(int i = 1; i<n+1; i++){ //prints the ragged array
            System.out.println();
            for(int j = 1; j<=i; j++){

                System.out.print(a[i][j]+" ");

            }
        }

    }
}
