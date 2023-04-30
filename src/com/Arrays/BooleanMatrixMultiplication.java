package com.Arrays;

import java.util.Scanner;

/* This program computes the product of two square matrices of boolean values, using the or operation instead
* of + and the and operation instead of *.
* */
public class BooleanMatrixMultiplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value N");
        int N = input.nextInt();


        boolean[][] a = new boolean [N+1][N+1];
        boolean[][] b = new boolean [N+1][N+1];
        boolean[][] c = new boolean [N+1][N+1];
        boolean temp = false;

        for (int i = 0; i<=N ; i++)
            for(int j= 0; j<=N; j++)
            {
             a[i][j]= false ;
             b[i][j]= true ;
            }

        for(int i = 0; i<=N ; i++)
            for(int j = 0; j<=N; j++)
                for(int k = 0; k<=N ;k++)
                {
                temp = a[i][k] && b[k][j];
                c[i][j] = c[i][j] || temp;

                }

        for(int i = 0; i<=N; i++) {
            System.out.println();
            for (int j = 0; j <= N; j++) {
                if (c[i][j]) System.out.print(" * ");
                else System.out.print(" o ");

            }
        }


    }
}
