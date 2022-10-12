package com.Conditionals;

import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        //print binary representation of N.
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int v = 1;
        while (v <= N/2) v = 2*v;
        // Now v is the largest power of 2 <=N.

        int n = N;
        while (v>0){
            // Cast out powers of 2 in decreasing order.
            if (n<v){
                System.out.print(0);
            }
            else {
                System.out.print(1);
                n -=v;
            }
            v = v/2;
        }
        System.out.println();
    }
}
