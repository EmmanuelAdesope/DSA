package com.Conditionals;
/*  The programs calculates  the average number of steps for some trials for a random walk to a distance r.

* */

import java.util.Scanner;

public class RandomWalkers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Manhattan Distance r");
        int r = input.nextInt();

        System.out.println("Please Enter number of trials");
        long trials = input.nextLong();
        int steps =0;
        int x = 0;
        int y = 0;
        int sum = 0;
        double probability;

        System.out.println("(" +0 + ", " + 0 + ")") ;
        for (int t = 0; t <= trials ; t++) {

            while (Math.abs(x) + Math.abs(y) != r) {

                probability = Math.random();

                if (probability < 0.25) x--;
                else if (probability < 0.50) x++;
                else if (probability < 0.75) y--;
                else if (probability < 1) y++;

                System.out.println("(" + x + ", " + y + ")");

                steps++;

            }

            sum += steps;
        }

        System.out.println("Average steps taken = " + sum/trials);


    }
}
