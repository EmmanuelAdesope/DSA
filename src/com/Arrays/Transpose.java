package com.Arrays;
/* This program transposes a square array of size N (i.e a[N][N]) without creating any new array
* */
public class Transpose {
    public static void main(String[] args) {

        int temp = 0;
        int[][] a = {{2, 1, 7}, {4, 3, 9}, {6, 5, 6}};



        for (int i = 0; i < a.length;  i++) {
            for(int j = i+1; j< a.length; j++ ) {
                temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }

        }

        for (int p = 0; p < a.length; p++) {
            System.out.println();
            for (int q = 0; q < a[p].length; q++) {
                System.out.print(a[p][q] + " ");
            }

        }
    }
}
