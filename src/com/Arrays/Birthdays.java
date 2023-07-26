package com.Arrays;
/* This program repeats an experiment  n number of trials to determine the
average how many people need to enter an empty room until a pair of people share
a birthday
* */
import java.util.Scanner;

public class Birthdays {

    public static void main(String[] args) {


        int count = 0;

        Scanner input = new Scanner(System.in);  // creates a scanner class

        System.out.println("Enter the number of Trials n");

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {

            boolean[] match = new boolean[365];

            while (true) { // while loop

                int r = (int) (Math.random() * 365);

                if (!match[r]) {
                    count++;
                    match[r] = true;
                } else break;
            }

        }
        System.out.println("The average value  is "+ count/n);
    }
}