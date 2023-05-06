package com.Arrays;
/* This program calculates the weighted average of scores in a
 *  spreadsheet.
 */

public class Spreadsheet {

    public static void main(String[] args) {


        int [][] a = {{99,85,98,0,0},{98,57,78,0,0},{92,77,76,0,0},{94,32,11,0,0},{99,34,22,0,0},{90,46,54,0,0},{76,59,88,0,0},{92,66,89,0,0},{97,71,24,0,0},{89,29,38,0,0}};
        int [] b = new int[a.length];
        double[] weights = {0.4, 0.3, 0.3, 0, 0};


        for(int i = 0; i<a.length; i++) {
            int sum = 0 ;

            for (int j = 0; j < a[i].length; j++) {

                sum += (int) a[i][j]*weights[j];
            }
            a[i][a[i].length-2] = sum ;
            a[i][a[i].length-1]  = (int) sum/(a[i].length-2);

        }
        for (int[] ints : a) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + "  ");

            }
        }

    }
}
