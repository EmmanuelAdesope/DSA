package com.Arrays;
/* The program determines whether or not a permutation corresponds to a placement of queens
on a n-by-n chessboard
* */

import java.util.Scanner;

public class QueensChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //creates a new Scanner class

    int n = input.nextInt();

    int [] q = new int[n];

    for(int i = 0; i<n; i++){      //initializes the array with values 0 to n-1
        q[i] = i ;
    }

    for(int i = 0; i<n; i++){     // shuffle the array

      int r = (int) (Math.random()*(i+1));

        int swap = q[r];
        q[r] = q[i];
        q[i] = swap;
    }

    for(int j = 0; j<n ; j++){      //print the shuffled array

        System.out.print(q[j]+" ");
    }



        for (int i = 0; i < n; i++) {     // prints out the permutation
            for (int j = 0; j < n; j++) {
                if (q[j] == i) System.out.print("* " + " ");
                else System.out.print(". " + " ");

            }
            System.out.println();
        }




    for(int j = 0 ; j<n; j++) {   // checks if the permutation corresponds to Queens
        for (int i = 0; i < j; i++) {

            if (q[i] == q[j]) {
                System.out.println("Two queens are placed in the same row");

            }
            if (Math.abs((q[i] - q[j])) == j - i) {
                System.out.println("Two queens are on the same major diagonal");

            }
            if (Math.abs((q[j] - q[i])) == j -i) {
                System.out.println("Two queens are on the same minor diagonal");

            }

        }
    }

    }

}
