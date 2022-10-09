package com.Conditionals;

import java.util.Scanner;

/* This program takes integer input k and N and calculates the kth root of N, using Newton-Raphson Method
* */
public class Root {
    public static void main(String[] args) {

        System.out.println("This program calculates the kth root of an integer N");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the integer N, the number which kth root you want to solve");
        int N = input.nextInt();
        System.out.println("Enter the kth root of the Number");
        int k = input.nextInt();

        double x = 1;
        double y;
        double dY;

        do {
            y = Math.pow(x, k) - N;
            dY = k * Math.pow(x, k - 1);

            x = (x - y / dY);
        }
        while ( Math.abs(x- y/dY) !=  x);

        System.out.println(x);
    }
}
