
package com.ThreeSort;

/* This program takes three integers from the command line and
sorts them in ascending order using only Math.min() and Math.max()
 */
import java.util.Scanner;   // imports the scanner utility

public class ThreeSort {
    public static void main(String[] args) {

        Scanner input =  new Scanner(System.in);  // new scanner object created.

        System.out.println("Enter your first Integer"); //prompts user for input
        int   number1 = input.nextInt();  // variable declarations and user input

        System.out.println("Enter your second Integer"); //prompts user for input
        int   number2 = input.nextInt();

        System.out.println("Enter your third Integer"); //Prompts user for input
        int  number3 = input.nextInt();

         // To determine of the minimum of the three integers

          int minA = Math.min(number1,number2), // minimum of number1 and number2
           minB = Math.min(minA,number3); // minimum of minA and number 3

        // To determine the maximum of the three integers

           int     maxA = Math.max(number1,number2), // maximum of number1 and number2
                   maxB = Math.max(maxA,number3); // maximum of maxA and number3

           // to determine the median of the three numbers

           int minC = Math.min(maxA,number3), // minimum of MaxA and number3
             median = Math.max(minA,minC); //maximum of MinA and MinC

        // prints output
        System.out.println(minB + "," + median + "," + maxB);


    }
}
