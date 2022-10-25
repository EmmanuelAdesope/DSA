package com.Conditionals;
/* This program calculates the total number of  steps taken for a random walk to Manhattan distance r from the origin (0,0). Each step
is random  and could be either of the  direction ( East, West, North, South) in the probability of 1/4.
* */


import java.util.Scanner;

public class RandomWalkerTwo {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Please Enter Manhattan Distance r");
        int r = input.nextInt();

        int steps =0;
        int x = 0;
        int y = 0;
        double probability;

        System.out.println("(" +0 + ", " + 0 + ")") ;
        while ( Math.abs(x) + Math.abs(y) != r){

            probability = Math.random();

            if (probability< 0.25) x--;
            else if (probability< 0.50) x++;
            else if (probability< 0.75)y--;
            else if (probability<1)y++;

            System.out.println("(" + x + ", " + y + ")");

            steps++;

        }

        System.out.println("steps = "+ steps);


    }

}
