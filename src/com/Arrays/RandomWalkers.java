package com.Arrays;
/* This program calculates the number of steps taken by N random walkers starting in the centre
of an N-by-N grid before all cells are touched
* */

import java.util.Scanner;

public class RandomWalkers {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); //creates new scanner class

        System.out.println("Enter the dimension N of the grid");

        int N = input.nextInt();  // reads in dimension of the grid from command line

        int [] X = new int [N];  // creates an array of X to depict the X dimension of the random walkers

        int [] Y = new int [N];  // creates an array of Y to depict the Y dimension of the random walkers

        int steps = 0;

        int visitedCells = N*N;

        double r;

        boolean [][] visited = new boolean[N][N];

        for(int i = 0 ; i<N; i++){ //initializes all random walkers to the origin

            X[i] = N/2;
            Y[i] = N/2;

        }
        visited[N/2][N/2] = true;
        visitedCells--;


        while(visitedCells>0){ //repeat until cells have been repeated

            steps++;

            for(int i = 0; i<N ; i++){

                r = Math.random();


                if(r<=0.25) Y[i]++;
                else if(r<=0.50)Y[i]--;
                else if(r<=0.75)X[i]++;
                else if (r<=1.00) X[i]--;


                //check X[i],Y[i] is inside boundary and has been visited

                if(X[i]>=0 && X[i]<N && Y[i]>=0 && Y[i]<N && !visited[X[i]][Y[i]]){
                    visitedCells--;
                    visited[X[i]][Y[i]]= true;

                }

            }

        }

        System.out.println("number of steps "+ steps);



    }
}
