package com.Arrays;

import java.util.Scanner;

public class PrimeSieve {
     // Print the number of primes <=N
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter range N");
        int N = input.nextInt();

        boolean[] isPrime = new boolean[N+1];
        for (int i = 2; i<=N; i++) isPrime[i] = true;

        for ( int i = 2; i<= N/i; i++){
            if (isPrime[i]){
                // Mark multiples of i as nonprime.
                for(int j = i ; j<= N/i; j++) isPrime[i * j] = false;
            }
        }

        int primes = 0;
        for (int i =2; i<=N; i++) if (isPrime[i]) primes++;
        System.out.println(primes);
    }
}
