package com.Arrays;

import java.util.Scanner;

public class BooleanProduct {

    public static void main(String[] args) {

        System.out.println("Enter the value of N");

        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        boolean [] [] a = new boolean[N][N];
        boolean [] [] b = new boolean[N][N];
        boolean [] [] c = new boolean[N][N];

        for(int i = 0; i < N ; i++){
            for (int j = 0; j < N ; j++){
                a[i][j] = true;
                b[i][j]= true;
            }
        }

        for (int i = 0; i< N; i++){
            for (int j = 0; j< N; j++){
                for(int k = 0; k < N; k++){
                    c[i][j] = c[i][j] || (a[i][k] && b[k][j]);
                }
            }
        }

        for (int i = 0; i < N; i++){
            System.out.println();
            for (int j = 0; j<N ; j++){
                System.out.print(c[i][j] + " ");
            }
        }



    }
}
