package com.Conditionals;
/* This program calculates the average of N random numbers. The number of random numbers N is gotten from the command line input
* */
import java.util.Scanner;

public class AveCalc {
    public static void main(String[] args) {
        // creates new scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of Random Numbers you want generated");
        int N = input.nextInt();
        double sum = 0;
        for (int i= 1; i<=N; i++){

            double r = Math.random();
            if (i==1) System.out.printf("%s %d %s %f\n", "The ", i,"st random number is",r);
            else if (i==2) System.out.printf("%s %d %s %f\n", "The ", i, "nd random number is",r);
            else if (i==3) System.out.printf("%s %d %s %f\n", "The ", i, "rd random number is",r);
            else if (i>3) System.out.printf("%s %d %s %f\n", "The ", i,"th random number is",r);

              sum = sum + r;
        }
        System.out.printf("%s %d %s %f\n", "The sum of the ", N , " random numbers is ", sum );
       double average = sum/N;
        System.out.printf("%s %d %s %f","The average of the", N , "random numbers is", average );
    }
}
