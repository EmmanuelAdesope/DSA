package com.Conditionals;
/* This program calculates the sin of a value x. The inputted value x is in degrees.  It also prints a trace of the
values for each of the variables used.
* */

import java.util.Scanner;

public class Sin {
    public static void main(String[] args) {

        System.out.println("This program calculates the sin x using tailor series");

        Scanner input = new Scanner(System.in);  // new instance of the class is created

        System.out.println("Enter value for x:");
        int x = input.nextInt();

        double a = x * Math.PI / 180 ;  // converts x(in degrees) to radians

        System.out.println("a is " + a); // Output of the conversion

        double sum = a;

        double term = a;

        for(int n = 2 ; sum != sum + term; n++){

            term *= (-1.0)* a/n ;
            System.out.println( "term is " + term);   // Trace of the value of term for each iteration
            if(n%2!=0){
                term*= -1.0;
                sum += term;
                System.out.println("Sum is" + sum); // Trace of the value of sum for each iteration
            }
        }
        System.out.printf("%s %d %s %.4f"," sin ", x , " = " , sum ); //prints out final value
    }
}
