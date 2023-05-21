package com.Arrays;
/* This program calculates the following
 * i. The dead end probability
 * ii. The average lengths of paths & dead end probability
 * iii. The area of smallest axis oriented rectangle that encloses the path
  for a self avoiding random walk N * N lattice
*/

import java.util.Scanner;

public class SelfAvoidingWalk {

    public static void main(String[] args) {

        // Do a T random self-avoiding walks in a N-by-N lattice

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension(N) of the lattice");
        int N = input.nextInt();
        System.out.println("Enter the number of Trials T");
        int T = input.nextInt();
        int deadEnds = 0;
        double escapePaths = 0.0;
        double deadEndPaths = 0.0;
        int breadth = 0 , length = 0;

        for (int t = 0; t<T; t++){

            boolean [][] a = new boolean[N][N];
            int x = N/2 , y = N/2;
            int b = Math.min(N/2,N);

            int maxX = b, minX = b , minY = b, maxY = b;


            while (x> 0  && x < N-1 && y > 0 && y < N-1){

              // Check for dead end and make a random move.

                 minX = Math.min(x,minX); //
                 minY = Math.min(y,minY);

               a[x][y] = true;
               if (a[x-1][y] && a[x+1][y] && a[x][y-1] && a[x][y+1])
               {  deadEnds++; deadEndPaths++ ; break;  }
               double r = Math.random();
               if (r<0.25) { if (!a[x+1][y]) x++; escapePaths++; }
               else if (r <0.50){ if (!a[x-1][y]) x--; escapePaths++;}
               else if ( r< 0.75){ if (!a[x][y+1]) y++; escapePaths++;}
               else {  if(!a[x][y-1]) y--; escapePaths++;}

                maxX = Math.max(maxX,x);
                maxY = Math.max(maxY,y);

            }
            breadth = maxX - minX; // Calculates the breadth of the rectangle that encloses the path
            length = maxY - minY;// calculates the length of the rectangle that encloses the path
        }

        System.out.println(100*deadEnds/T + "% dead ends");
        System.out.println(escapePaths/T + " Average escape paths");
        System.out.println(deadEndPaths/T + " Average dead end paths");
        System.out.println("breadth of rectangle enclosing the path " + breadth + " metres ");
        System.out.println("Length of rectangle enclosing the path " + length+ " metres ");
        System.out.println("Area of rectangle enclosing the path " + length * breadth + " square meters");
    }

}
