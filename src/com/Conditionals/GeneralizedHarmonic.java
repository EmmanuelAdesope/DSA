package com.Conditionals;

import java.util.Scanner;

public class GeneralizedHarmonic {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter value r ");
        int r = input.nextInt();

        System.out.println("Enter value N ");
        int n = input.nextInt();

        double sum = 0.0;

        for ( int i = 1 ; i<=n ; i++){

            sum += 1 /Math.pow(i,r);
        }

        System.out.println("Harmonic sum is "+ sum);

    }
}
