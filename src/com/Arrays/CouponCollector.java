package com.Arrays;

import java.util.Scanner;

public class CouponCollector {

    public static void main(String[] args) {
        // Generate random values in (0..N] until finding each one.

        Scanner input = new Scanner(System.in); // Generates new instance of Scanner class

        System.out.println("Enter the range of values you wish to examine");
        int N = input.nextInt(); // range

        boolean [] found = new boolean[N];

        int cardcnt = 0 , valcnt = 0;

        while (valcnt<N) {
            // Generate another value.

            int val = (int) (Math.random() * N);
            cardcnt++;

            if (!found[val]){
                valcnt++;
                found[val] = true;
            }

        } // N different values found.
        System.out.println(cardcnt);
    }
}
