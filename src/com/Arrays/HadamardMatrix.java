package com.Arrays;

import java.util.Scanner;

public class HadamardMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value of N which must be in the power of 2");

        int N = input.nextInt();

        boolean H[][] = new boolean[N][N];
        H[0][0] = true;

        for(int n = 1; n<N; n += n){

            for(int i = 0; i<n; i++) {
                for(int j = 0; j<n; j++){

                    H[i+n][j] = H[i][j];
                    H[i][j+n] = H[i][j];
                    H[i+n][j+n] = !H[i][j];
                }
            }
        }

        for(int i = 0 ; i<N ; i++){
            System.out.println();
            for(int j = 0; j< N; j++){
                if(H[i][j]) System.out.print("T ");
                else System.out.print("F ");
            }
        }

    }

}
