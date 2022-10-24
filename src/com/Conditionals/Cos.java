package com.Conditionals;

/* This program calculates the sin of a value x. The inputted value x is in degrees.  It also prints a trace of the
values for each of the variables used.
* */

import java.util.Scanner;

public class Cos {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value of x in degrees");
        int x = input.nextInt();

        double a = x * Math.PI / 180 ;  // converts x(in degrees) to radians

        System.out.println("a is " + a); // Output of the conversion

        double term = 1.0;
        double sum = term;

        for (int n = 1; sum != sum + term ; n++){

            term *= (-1.0)* a/n ;
            System.out.println( "term is " + term);   // Trace of the value of term for each iteration

            if(n%2==0){
                term*= -1.0;
                sum += term;
                System.out.println("Sum is" + sum); // Trace of the value of sum for each iteration
            }

        }

        System.out.printf("%s %d %s %.4f"," cos ", x , " = " , sum ); //prints out final value

    }
}
