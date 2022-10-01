package com.Conditionals;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // prompts user to  input value of temperature
        System.out.println("Enter value for temperature in Fahrenheit");
        double temp = input.nextDouble();
        if ( Math.abs(temp) > 50) {
            //Throws exception message and prompts user for input
            System.out.print("Valid range of temperature must be less than 50 in absolute values\n Enter value for temperature in Fahrenheit\n");

         temp = input.nextDouble();
        }
        // prompts user to input value of wind speed
        System.out.println("Enter value for wind speed");
        double v = input.nextDouble();
        if (v < 3 || v > 120) {
            // throws exception message and prompts user to re-enter value for wind speed
            System.out.print("Acceptable values for wind speed: 3<v<120\n Please Enter Value\n");
            v = input.nextDouble();
        }

        double w = 35.74 + 0.6215*temp + (0.4275*temp - 35.75)* Math.pow(v,0.16);

        System.out.println("Wind Chill is " + w);



    }
}
