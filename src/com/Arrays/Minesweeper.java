package com.Arrays;

/* This program takes in 3 command line arguments M, N and P and produces an M-by-N boolean array
where each entry is occupied by a probability p.
* */

import java.util.Scanner;

public class Minesweeper {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);  //creates new scanner class

        System.out.println("Enter the row of the M by N array");

        int M = input.nextInt();

        System.out.println("Enter the column of the M by N array");

        int N = input.nextInt();

        System.out.println("Enter the probability p in one decimal point");

        double p = input.nextDouble();

        boolean[][] mine = new boolean[M+2][N+2];   //This initializes the array to false

        for (int i =1; i<=M; i++)
            for(int j = 1; j<=N; j++){

                if (Math.random()<p)mine[i][j]=true;
                else mine[i][j]=false;
            }

        for(int i= 1; i<=M; i++){     //prints the array of minesweeper
            System.out.println();
            for(int j = 1; j<=N; j++){
                if(mine[i][j]) System.out.print(" * " + "  ");
                else System.out.print(" . " + "  ");

            }
        }

        int [][] F = new int[M+2][N+2];

        for(int i = 1; i<=M ; i++)
            for(int j = 1; j<=N; j++){      //replaces each safe square with
                                            // the number of neighbouring bombs
                if(!mine[i][j]) {
                    if (mine[i - 1][j]) F[i][j] += 1;
                    if (mine[i + 1][j]) F[i][j] += 1;
                    if (mine[i][j + 1]) F[i][j] += 1;
                    if (mine[i][j - 1]) F[i][j] += 1;
                    if (mine[i - 1][j - 1]) F[i][j] += 1;
                    if (mine[i + 1][j - 1]) F[i][j] += 1;
                    if (mine[i - 1][j + 1]) F[i][j] += 1;
                    if (mine[i + 1][j + 1]) F[i][j] += 1;
                }
            }

        for (int i = 1; i<=M; i++) {
            System.out.println();
            for (int j = 1; j <= N; j++) {

                System.out.print(F[i][j]+ " ");
            }
        }


    }
}
