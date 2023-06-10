package com.Arrays;
/* This program takes command-line arguments M and N and does N shuffles of an array of size M
The array is initialized with a[i] = i before each shuffle and prints an M-by-M table such that i gives the number
of times i wound up in position j for all j.
* */

import java.util.Scanner;

public class ShuffleTest {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //creates scanner class

        System.out.println("Enter the value of the dimension of the array M");

        int M = input.nextInt();  // Reads the dimension from command line

        System.out.println("Enter the number of times N, the array will be shuffled");

        int N = input.nextInt();            // Reads the Number of times N, the array will be shuffled

        int [] a = new int [M];            //Create a one dimension array of length N

        int [][] b = new int [M][M];      //Create two dimension array of length N-by-N

        for( int j = 0; j<=N;j++) {      // does N shuffles of the array

            for (int i = 0; i < M; i++) {         // Initializes the array for every shuffle done
                a[i] = i;
            }

            for (int k = 0; k<M;k++){                    // shuffles the array

                int r = k + (int)(Math.random()*(M-k));
                int t = a[k];
                a[k]= a[r];
                a[r] = t ;
            }



          for (int i = 0 ; i<M ; i++){                  // edits the array with the corresponding entries

              b[a[i]][i] += 1 ;
           }


        }
                 for(int i = 0 ; i < M ; i++){
                     System.out.println();
                  for(int j = 0; j<M ; j++){
                  System.out.print(b[i][j]+ " ");
                     }
                 }

    }

}
