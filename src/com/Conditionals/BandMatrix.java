package com.Conditionals;

import java.util.Scanner;

public class BandMatrix {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter size N of the NxN matrix ");
        int N = input.nextInt();

        System.out.println("Enter width ");

        int w = input.nextInt();

        for (int i = 0 ; i < N ; i++){

            for(int j = 0; j<N ; j++){

                if (Math.abs(i -j)>w ) System.out.print("0  ");
                else System.out.print("*  ");

            }

            System.out.println();

        }

    }
}
