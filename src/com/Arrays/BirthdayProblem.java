package com.Arrays;

import java.util.Scanner;

/* This program calculates the number of people that needs to enter the  room before
*  there's a match between the  birthdays of two people.
* */
public class BirthdayProblem {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of trials t");

        int trials = input.nextInt();

        System.out.println("Enter the maximum birthday range n");
        
        int n = input.nextInt();

        int a[] = new int[n+1];


        for (int t = 0; t < trials; t++) { // simulate experiment for trail times

            int person = 0;

            boolean[] birthdayMatch = new boolean[n];   //creates a boolean array for the birthday

            int day;

            while (true) {
                day = (int) (Math.random() *(n-1) + 1);
                person++;
                if (birthdayMatch[day]) {
                    a[person]++ ;
                break;
                }
                birthdayMatch[day] = true;
            }



        }

        long cummulativeSum = 0;
        
        for(int i = 1; i<=n; i++){

           cummulativeSum = cummulativeSum+ a[i];   //calculates the sum of number of times each person stops the loop

          double  fraction = (double)cummulativeSum/(double) trials;  // calculates the percentage

            System.out.println( i +" "+ a[i] +" "+  fraction);

            if (fraction>=0.50) break;

        }


    }
}