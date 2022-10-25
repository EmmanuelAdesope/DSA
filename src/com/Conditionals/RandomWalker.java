package com.Conditionals;

import java.util.Scanner;
/* This program simulates the behaviour of a particle moving in a grid of points. It takes input N from user and calculates
how long it will take  for random walker to hit the boundary of a 2N-by-2N square starting at the origin(0,0)
* */

public class RandomWalker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double x = 0.0;
        double y = 0.0;

        System.out.println("Enter Length of Square N");
        long N = input.nextLong();
        double random;

       long startTime = System.nanoTime();
        while ( Math.abs(x) != N && Math.abs(y)!=N){  // loop stops if one particle touches either of the boundaries
              random = Math.random();

            // Each step of the particle must be in a probability of 1/4
              if(random<0.25)  x++;
            else if(random<0.50)  x--;
            else if (random<0.75) y++;
            else if (random<1) y--;

            System.out.printf(" %s %.2f %s %s %.2f %s\n", "(", x ,")", "(", y ,")");  // gives an output trace of the points

        }

       long endTime = System.nanoTime();

       long timeTaken = endTime - startTime;
        System.out.printf("%s %.3f","Time Taken for random walk in seconds is  ", timeTaken/1e9);
    }
}
