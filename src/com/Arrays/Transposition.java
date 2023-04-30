package com.Arrays;
/* This program transposes any array a[M][N] to b[N][M]
* */
public class Transposition {

    public static void main(String[] args) {

        int[][] a = {{99, 95, 98},{98, 57, 78}, {92, 77, 76}, {94,32,11}, {99, 34, 22}, {90,46,54} ,{76,59,88}, {92,66,89},{97,71,24},{89,29,38}};
        int [][] b = new int[10][10];
        for (int i = 0; i< a.length; i++)
            for (int j = 0; j < a[i].length; j++) {
                b[j][i] = a[i][j];
            }

        for (int i = 0; i<b.length ; i++)
            for(int j = 0; j<b[i].length;j++ )
        System.out.print(b[i][j] + "  ");

    }

}
