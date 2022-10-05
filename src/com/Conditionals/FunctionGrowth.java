package com.Conditionals;

public class FunctionGrowth {
    public static void main(String[] args) {

        System.out.println("This program prints growth function LogN, N, NLogN, N^2 , N^3 and 2^N");
        System.out.println("for values of N = 16, 32, 64..., 2048");
        int N = 16;
         while(N<=2048){

             System.out.printf("%.2f\t  %d\t %.2f\t %d\t %d\t %.2f\t\n", Math.log(N), N , N*Math.log(N) , N*N , N*N*N , Math.pow(2.0,N));

            N *=2;

         }
    }
}
