package com.Arrays;

import java.util.Scanner;

public class Minesweepertwo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number of mines");

        int k = input.nextInt();

        System.out.println("Enter the horizontal dimension of the grid");

        int m = input.nextInt();

        System.out.println("Enter the vertical dimension of the grid");

        int n = input.nextInt();



        boolean mine[][] = new boolean[m+2][n+2];

        int count = 0;


        while(count<k){

            int r = 1 +  (int) (Math.random()*(m));
            int p = 1 + (int)(Math.random()*(n));

            if(!mine[r][p]){
                mine[r][p] = true;
                count++;
            }

        }


        System.out.println("total number of mines is"+ count);

        for(int u = 1; u<=m ; u++) {
            System.out.println();
            for (int v = 1; v <= n; v++) {

                if (mine[u][v]) System.out.print("@" + " ");
                else System.out.print("-" + " ");
            }
        }

        int [][] F = new int[m+2][n+2];

        for(int f = 1; f<=m ; f++)
            for(int  g = 1; g<=n; g++){      //replaces each safe square with
                // the number of neighbouring bombs
                if(!mine[f][g]) {
                    if (mine[f - 1][g]) F[f][g] += 1;
                    if (mine[f + 1][g]) F[f][g] += 1;
                    if (mine[f][g + 1]) F[f][g] += 1;
                    if (mine[f][g - 1]) F[f][g] += 1;
                    if (mine[f - 1][g - 1]) F[f][g] += 1;
                    if (mine[f + 1][g - 1]) F[f][g] += 1;
                    if (mine[f - 1][g + 1]) F[f][g] += 1;
                    if (mine[f + 1][g + 1]) F[f][g] += 1;
                }
            }

        System.out.println();
        for (int q = 1; q<=m; q++) {
            System.out.println();
            for (int s = 1; s <=n; s++) {
                if(mine[q][s]) System.out.print("*"+ " ");
                else System.out.print(F[q][s]+ " ");
            }
        }





    }
}
