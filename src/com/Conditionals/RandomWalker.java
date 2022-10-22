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

         double b = 0.0;
         long startTime = System.nanoTime();
        while ( Math.abs(x)!=N && Math.abs(y)!=N){  // loop stops if one particle touches either of the boundaries

            if(Math.random()<0.25){    // Each step of the particle must be in a probability of 1/4
            x = Math.round(2* N * Math.random() - N);
            y = Math.round(2 * N * Math.random() -N);
           }
            System.out.printf("%.2f %.2f\n", x , y);  // gives an output trace of the points
            b = Math.sqrt(( x*x + y*y));
        }

        long endTime = System.nanoTime();

        System.out.printf("%s %.2f\n","The distance of the point to the starting point is ", b);  // prints the output for b (the distance)

        long timeTaken = endTime - startTime;

        System.out.printf("%s %.3f","Time Taken for random walk in seconds is  ", timeTaken/1e9);
    }
}
